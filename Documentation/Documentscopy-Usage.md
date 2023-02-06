# Documentoscopia

Guia de uso e integração da Documentoscopia para Android.

### Iniciando a Documentoscopia

1. Instancie um Intent para a classe `DocumentscopyActivity`, com os seguintes extras:

```kotlin
val intent = Intent(this, DocumentscopyActivity::class.java).apply {
    putExtra(DocumentscopyActivity.PARAM_ENDPOINT, ENDPOINT)
    putExtra(DocumentscopyActivity.PARAM_APP_KEY, APP_KEY)
    putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) 
    putExtra(DocumentscopyActivity.PARAM_SHOW_FEEDBACK, true)
    putExtra(DocumentscopyActivity.PARAM_CUSTOM_HOME_FRAGMENT, R.layout.fragment_home_custom)
    putExtra(DocumentscopyActivity.PARAM_CUSTOM_CAMERA_FRAGMENT, R.layout.fragment_camera_custom)
    putExtra(DocumentscopyActivity.PARAM_CUSTOM_FEEDBACK_FRAGMENT, R.layout.fragment_doc_feedback_custom)
}
```

2. Chame `startActivityForResult`:
```kotlin
startActivityForResult(intent, DOCUMENTSCOPY_RESULT_REQUEST)
```
### Descrição dos parâmetros

##### Obs: Os parâmetros obrigatórios estão em negrito.

| **Indice** | **Elemento** | **Descrição** |
|:-----------|:-------------|:--------------|
| (**1**) | **`PARAM_ENDPOINT`** |  **BaseUrl que será utilizado pelo SDK (Ambiente desejado).**|
| (**2**) | **`PARAM_APP_KEY`** | **Chave necessária para iniciar o fluxo do SDK (gerada anteriormente).** |
| (**3**) | `PARAM_DEBUG_ON` | Exibe os logs em tela caso true, usado apenas durante o Desenvolvimento. |
| (**4**) | `PARAM_SHOW_FEEDBACK` | Define se as telas de Feedback serão exibidas ao final do processamento. |
| (**5**) | `PARAM_CUSTOM_HOME_FRAGMENT` | Caso queira customizar a tela inicial, deve-se enviar um XML nesse parâmetro. |
| (**6**) | `PARAM_CUSTOM_CAMERA_FRAGMENT` | Caso queira customizar a tela de captura das imagens, deve-se enviar um XML nesse parâmetro. |
| (**7**) | `PARAM_CUSTOM_FEEDBACK_FRAGMENT` | Caso queira customizar a tela de feedback, deve-se enviar um XML nesse parâmetro. |

### Customização

Além de poder usar o SDK em sua forma padrão de exibição, é possível customizar o seu visual.

Detalhes de como implementar a view customizada são encontrados [neste link](Documentscopy-CustomView.md).

### Tratando o retorno

1. Para receber o resultado da Documentoscopia, implemente o método `onActivityResult`. No caso de envio de documento concluído, o resultCode será `RESULT_OK`, e no caso de algum erro, o resultCode será `RESULT_CANCELED`.
```kotlin
override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
    super.onActivityResult(requestCode, resultCode, data)

    if (requestCode == DOCUMENTSCOPY_RESULT_REQUEST) {
        when (resultCode) {
            Activity.RESULT_OK -> onDocumentscopyResultSuccess()
            Activity.RESULT_CANCELED -> onDocumentscopyCancelled(data)
        }
    }
}
```

2. Para tratar o caso de erro, os seguintes parâmetros podem ser avaliados:
- *DocumentscopyActivity.PARAM_RESULT_ERROR*: String que contém uma mensagem explicativa sobre o erro.
- *DocumentscopyActivity.PARAM_RESULT_ERROR_CODE*: Enum do tipo `DocumentscopyErrorCode`, que indica qual erro ocorreu.
```kotlin
private fun onDocumentscopyCancelled(data: Intent?) {
    val errorMessage = data?.getStringExtra(DocumentscopyActivity.PARAM_RESULT_ERROR)
    val errorCode = data?.getSerializableExtra(DocumentscopyActivity.PARAM_RESULT_ERROR_CODE) as? DocumentscopyActivity
    // Handle error…
}
```

`DocumentscopyErrorCode` pode assumir os seguintes valores:
```kotlin
enum class DocumentscopyErrorCode {
    // Parâmetros inválidos
    INVALID_BUNDLE_PARAMS,
    // App Key inválido.
    INVALID_APP_KEY,
    // Certiface offline.
    CERTIFACE_OFF,
    // Aparelho não possui câmera traseira
    NO_BACK_CAMERA,
    // Não foi concedida permissão de acesso à câmera do aparelho.
    NO_CAMERA_PERMISSION,
    // Sem conexão à Internet.
    NO_INTERNET_CONNECTION,
    // Erro na requisição.
    REQUEST_ERROR,
    // Memória do aparelho está baixa
    LOW_MEMORY,
    // Erro ao configurar câmera
    ERROR_CAMERA_SETUP,
    // Erro ao capturar foto
    ERROR_CAPTURE_PICTURE
    // XML fornecido para a view customizada do home fragment é inválido
    INVALID_CUSTOM_HOME_FRAGMENT,
    // XML fornecido para a view customizada do camera fragment é inválido
    INVALID_CUSTOM_CAMERA_FRAGMENT,
    // XML fornecido para a view customizada do confirmation fragment é inválido
    INVALID_CUSTOM_CONFIRMATION_FRAGMENT
    // FaceCaptcha não foi realizada
    FACECAPTCHA_NOT_EXECUTED
}
```
