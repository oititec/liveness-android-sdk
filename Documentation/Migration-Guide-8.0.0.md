> 🚧 Este é um repositório legado. Como parte de nossos esforços, reorganizamos nossos recursos técnicos. 
**Para acessar as informações mais recentes visite o [novo repositório](https://github.com/oititec/android-oiti-versions).** 
Este repositório permancerá ativo, mas não receberá atualizações.

# Liveness 8.0.0 - Guia de migração

#### Guia de migração para a versão 8.0.0 do SDK Liveness Android.

### Atualizações

- Novo PARAM_FONTS adicionado para APIs abaixo do (API level 26)
- Novo Param_FONTS_NEW_API adicionado
- A estrutura do `Liveness3DTheme` teve algumas propriedades removidas, segue a lista:
    - `guidanceCustomizationHeaderFont`
    - `guidanceCustomizationSubtextFont`
    - `guidanceCustomizationButtonFont`
    - `guidanceCustomizationReadyScreenHeaderFont`
    - `guidanceCustomizationReadyScreenSubtextFont`
    - `guidanceCustomizationRetryScreenHeaderFont`
    - `guidanceCustomizationRetryScreenSubtextFont`
    - `resultScreenCustomizationMessageFont`
    - `feedbackCustomizationTextFont`
- A customização das fontes agora é feita somente pelo dicionário de chave e referencia ou caminho da fonte, assim como é aplicado com os textos. `Liveness3DFontsKey`.

### Exemplo de implementação

(Método compativel com api 26 ou superior)
Crie um hashmap semelhante aos textos ja aplicados anteriormente, passando o caminho da fonte com referencia a pasta fontes:
```kotlin
val fontsNewApi = hashMapOf(
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_HEADER_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_SUBTEXT_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_READY_SCREEN_HEADER_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_READY_SCREEN_SUBTEXT_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_RETRY_SCREEN_HEADER_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_RETRY_SCREEN_SUBTEXT_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.RESULT_SCREEN_CUSTOMIZATION_MESSAGE_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_BUTTON_FONT to R.font.vinasans_regular,
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_READY_SCREEN_HEADER_FONT to R.font.vinasans_regular,
        )
```

Após criar o hashmap passando os valores corretamente e indicando os campos a serem alteradas as fontes, envie com o intent utilizando o putExtra. Chame pelo `PARAM_FONTS_NEW_API`:
```kotlin
startActivityForResult?.launch(Intent(this, Liveness3DActivity::class.java).apply {
            putExtra(Liveness3DActivity.PARAM_LIVENESS3D_USER, liveness3DUser)
            putExtra(Liveness3DActivity.PARAM_FONTS_NEW_API, fontsNewApi)
        })
```

Caso utilize um sdk minimo um pouco mais antigo como por exemplo api 23, será necessário passar o path da fonte na pasta assets:
Utilizando o `PARAM_FONTS`
```kotlin
val fonts = hashMapOf(
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_HEADER_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_SUBTEXT_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_READY_SCREEN_HEADER_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_READY_SCREEN_SUBTEXT_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_RETRY_SCREEN_HEADER_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_RETRY_SCREEN_SUBTEXT_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.RESULT_SCREEN_CUSTOMIZATION_MESSAGE_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_BUTTON_FONT to "fonts/vinasans_regular.ttf",
            Liveness3DFontsKey.GUIDANCE_CUSTOMIZATION_READY_SCREEN_HEADER_FONT to "fonts/vinasans_regular.ttf",
        )
```

Para realizar o envio das informaçoes assim como no metodo mostrado acima, somente passamos no intent o hashmap:
```kotlin
startActivityForResult?.launch(Intent(this, Liveness3DActivity::class.java).apply {
            putExtra(Liveness3DActivity.PARAM_LIVENESS3D_USER, liveness3DUser)
            putExtra(Liveness3DActivity.PARAM_FONTS, fonts)
        })
```