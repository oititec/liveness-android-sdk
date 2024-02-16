> 🚧 Este é um repositório legado. Como parte de nossos esforços, reorganizamos nossos recursos técnicos. 
**Para acessar as informações mais recentes visite o [novo repositório](https://github.com/oititec/android-oiti-versions).** 
Este repositório permancerá ativo, mas não receberá atualizações.

# Liveness - Prova de Vida

Guia de uso e integração do Liveness para Android.

### Iniciando o Liveness

1. Crie um objeto do tipo `UserData`, passando uma appKey (recebida previamente). Deve ser diferente para cada vez que for apresentar o Liveness.
```kotlin
val userData = UserData(appKey = APP_KEY)
```

2. Instancie um Intent para a classe `FaceCaptchaActivity`, com os seguintes extras:
- *FaceCaptchaActivity.PARAM_ENDPOINT*: URL apontando para o ambiente desejado.
- *FaceCaptchaActivity.PARAM_USER_DATA*: objeto do tipo `UserData`, criado no passo anterior.
- *FaceCaptchaActivity.PARAM_DEBUG_ON (opcional)*: booleano para ajudar a depurar. Faz com que mensagens de log sejam exibidas na tela através de `Toasts`.
```kotlin
val intent = Intent(this, FaceCaptchaActivity::class.java).apply {
    putExtra(FaceCaptchaActivity.PARAM_ENDPOINT, ENDPOINT)
    putExtra(FaceCaptchaActivity.PARAM_USER_DATA, userData)
    putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) // Passar true para mostrar logs na tela
}
```

3. Chame `startActivityForResult`:
```kotlin
startActivityForResult(intent, CAPTCHA_RESULT_REQUEST)
```

### Customização

Além de poder usar o SDK em sua forma padrão de exibição, são fornecidas duas formas de customização:

1. Imagem de fundo customizada:
Para exibir uma imagem de fundo (overlay da câmera) customizada, basta passar resource id da imagem desejada para o Intent da `FaceCaptchaActivity`, através da chave `PARAM_OVERLAY_IMAGE`. Exemplo:
```kotlin
val intent = Intent(this, FaceCaptchaActivity::class.java).apply {
    putExtra(FaceCaptchaActivity.PARAM_ENDPOINT, ENDPOINT)
    putExtra(FaceCaptchaActivity.PARAM_USER_DATA, userData)
    putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) // Passar true para mostrar logs na tela
    putExtra(FaceCaptchaActivity.PARAM_OVERLAY_IMAGE, R.drawable.custom_overlay)
}
```

2. Visual completamente customizado:
É possível configurar completamente o visual exibido pelo Liveness. Para isso, é necessário criar um layout que será utilizado pelo fragment do SDK, e passá-lo para o Intent da `FaceCaptchaActivity`, através da chave `PARAM_CUSTOM_FRAGMENT`. Exemplo:
```kotlin
val intent = Intent(this, FaceCaptchaActivity::class.java).apply {
    putExtra(FaceCaptchaActivity.PARAM_ENDPOINT, ENDPOINT)
    putExtra(FaceCaptchaActivity.PARAM_USER_DATA, userData)
    putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) // Passar true para mostrar logs na tela
    putExtra(FaceCaptchaActivity.PARAM_CUSTOM_FRAGMENT, R.layout.fragment_custom)
}
```
Detalhes de como implementar a view customizada são encontrados [neste link](Liveness-CustomView.md).

### Tratando o retorno

1. Para receber o resultado do Liveness, implemente o método `onActivityResult`. No caso de desafio concluído, o resultCode será `RESULT_OK`, e no caso de algum erro, o resultCode será `RESULT_CANCELED`.
```kotlin
override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)

    if (requestCode == CAPTCHA_RESULT_REQUEST) {
        when (resultCode) {
            Activity.RESULT_OK -> onFaceCaptchaResultSuccess(data)
            Activity.RESULT_CANCELED -> onFaceCaptchaResultCancelled(data)
        }
    }
}
```

2. Para tratar o caso de desafio concluído, dois parâmetros podem ser avaliados:
- *FaceCaptchaActivity.PARAM_RESULT*: Booleano que indica se a prova de vida foi válida ou não.
- *FaceCaptchaActivity.PARAM_RESULT_CAUSE*: String que indica a causa da falha.
- *FaceCaptchaActivity.PARAM_RESULT_COD_ID*: Double com o código de retorno.
```kotlin
private fun onFaceCaptchaResultSuccess(data: Intent?) {
    val result = data?.getBooleanExtra(FaceCaptchaActivity.PARAM_RESULT, false)
    val cause = data?.getStringExtra(FaceCaptchaActivity.PARAM_RESULT_CAUSE)
    val codID = data?.getDoubleExtra(FaceCaptchaActivity.PARAM_RESULT_COD_ID, 0.0)
    // Handle returned values…
}
```

3. Para tratar o caso de erro, os seguintes parâmetros podem ser avaliados:
- *FaceCaptchaActivity.PARAM_RESULT_ERROR*: String que contém uma mensagem explicativa sobre o erro.
- *FaceCaptchaActivity.PARAM_RESULT_ERROR_CODE*: Enum do tipo `FaceCaptchaErrorCode`, que indica qual erro ocorreu.
```kotlin
private fun onFaceCaptchaResultCancelled(data: Intent?) {
    val errorMessage = data?.getStringExtra(FaceCaptchaActivity.PARAM_RESULT_ERROR)
    val errorCode = data?.getSerializableExtra(FaceCaptchaActivity.PARAM_RESULT_ERROR_CODE) as? FaceCaptchaErrorCode
    // Handle error…
}
```

`FaceCaptchaErrorCode` pode assumir os seguintes valores:
```kotlin
enum class FaceCaptchaErrorCode {
    // Parâmetros inválidos
    INVALID_BUNDLE_PARAMS,
    // App Key inválido.
    INVALID_APP_KEY,
    // Certiface offline.
    CERTIFACE_OFF,
    // Aparelho não possui câmera frontal
    NO_FRONT_CAMERA,
    // Não foi concedida permissão de acesso à câmera do aparelho.
    NO_CAMERA_PERMISSION,
    // Sem conexão à Internet.
    NO_INTERNET_CONNECTION,
    // Chamada telefônica em andamento. Não é possível iniciar o desafio durante uma chamada telefônica.
    PHONE_CALL_IN_PROGRESS,
    // Erro na requisição.
    REQUEST_ERROR,
    // App foi minimizado durante o uso do FaceCaptcha, isso faz com que o desafio seja encerrado.
    CHALLENGE_INTERRUPTED,
    // Memória do aparelho está baixa
    LOW_MEMORY,
    // Erro ao configurar câmera
    ERROR_CAMERA_SETUP,
    // Erro ao capturar foto
    ERROR_CAPTURE_PICTURE
    // XML fornecido para a view customizada é inválido
    INVALID_CUSTOM_FRAGMENT
}
```
