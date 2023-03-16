# Guia de Customização do Liveness3DTheme 

Abaixo, estão mapeadas as propriedades para customização do `Liveness3DTheme`.

## Elementos Comuns

### Guidance
    
| **Atributo**                         | **Tipo** | **Descrição**                                             |
| :----------------------------------- | :------- | :-------------------------------------------------------- |
| guidanceCustomizationBackgroundColors|  |  |
| guidanceCustomizationForegroundColor | Int? | Modifica a cor de fundo quando estiver em primeiro plano. |
| guidanceCustomizationHeaderFont      | Typeface?  | Adiciona uma fonte customizada para o header.             |
| guidanceCustomizationSubtextFont     | Typeface?  | Adiciona uma fonte customizada para o subtext.            |  
    
 ### Botões
 
| **Atributo**                                        | **Tipo** | **Descrição**                                                     |
| :-------------------------------------------------- | :------- | :---------------------------------------------------------------- |
| guidanceCustomizationButtonFont                     | Typeface?  | Adiciona uma fonte customizada para o texto do botão.             |
| guidanceCustomizationButtonTextNormalColor          | Int? | Modifica a cor do texto do botão na sua condição padrão.          |
| guidanceCustomizationButtonBackgroundNormalColor    | Int?  | Modifica a cor de fundo do botão na sua condição padrão.          |
| guidanceCustomizationButtonTextHighlightColor       | Int? | Modifica a cor do texto do botão na sua condição de destaque.     |
| guidanceCustomizationButtonBackgroundHighlightColor | Int? | Modifica a cor de fundo do botão na sua condição de destaque.     |
| guidanceCustomizationButtonTextDisabledColor        | Int? | Modifica a cor do texto do botão na sua condição de desabilitado. |
| guidanceCustomizationButtonBackgroundDisabledColor  | Int?  | Modifica a cor de fundo do botão na sua condição de desabilitado. |
| guidanceCustomizationButtonBorderColor              | Int? | Modifica a cor da borda do botão.                                 |
| guidanceCustomizationButtonBorderWidth              | Int?   | Modifica a largura da borda do botão.                             |
| guidanceCustomizationButtonCornerRadius             | Int?   | Modifica o tamanho do arredondamento das bordas do botão.         |

    
### Ready Screen
    
| **Atributo**                                           | **Tipo**            | **Descrição**                                 |
| :----------------------------------------------------- | :------------------ | :-------------------------------------------- |
| guidanceCustomizationReadyScreenHeaderFont             | Typeface?             | Adiciona uma fonte customizada para o header. |
| guidanceCustomizationReadyScreenHeaderTextColor        | Int?            | Modifica a cor da fonte do texto.             |
| guidanceCustomizationReadyScreenHeaderAttributedString | String? | Adiciona um texto para o header.              |
| guidanceCustomizationReadyScreenSubtextFont             | Typeface?             | Adiciona uma fonte customizada para o subtext. |
| guidanceCustomizationReadyScreenSubtextTextColor        | Int?            | Modifica a cor da fonte do texto.              |
| guidanceCustomizationReadyScreenSubtextAttributedString | String? | Adiciona um texto para o subtext.              |
| guidanceCustomizationReadyScreenOvarFillColor              | Int? | ***                                              |
| guidanceCustomizationReadyScreenTextBackgroundColor        | Int? | Modifica a cor de fundo.                         |
| guidanceCustomizationReadyScreenTextBackgroundCornerRadius | Int?   | Modifica o tamanho do arredondamento das bordas. |


### Retry Screen

| **Atributo**                                           | **Tipo**            | **Descrição**                                             |
| :----------------------------------------------------- | :------------------ | :-------------------------------------------------------- |
| guidanceCustomizationRetryScreenHeaderFont             | Typeface?             | Adiciona uma fonte customizada para a mensagem do header. |
| guidanceCustomizationRetryScreenHeaderTextColor        | Int?            | Modifica a cor da fonte do header.                        |
| guidanceCustomizationRetryScreenHeaderAttributedString | String | Adiciona uma mensagem personalizada no header.            |
| guidanceCustomizationRetryScreenSubtextFont             | Typeface?             | Adiciona uma fonte customizada para a mensagem do subtext. |
| guidanceCustomizationRetryScreenSubtextTextColor        | Int?            | Modifica a cor da fonte do subtext.                        |
| guidanceCustomizationRetryScreenSubtextAttributedString | String? | Adiciona uma mensagem personalizada no subtext.            |
| guidanceCustomizationRetryScreenImageBorderColor  | Int?  | Modifica a cor da borda do preview da imagem de retentativa.      |
| guidanceCustomizationRetryScreenImageBorderWidth  | Int?   | Modifica a largura da borda do preview da imagem de retentativa.  |
| guidanceCustomizationRetryScreenImageCornerRadius | Int?   | Modifica o tamanho do arredondamento das bordas.                  |
| guidanceCustomizationRetryScreenOvarStrokeColor   | Int? | Modifica a cor da borda do preview oval da imagem de retentativa. |
    
###  Result Screen Customization

| **Atributo**                                           | **Tipo**            | **Descrição**                                             |
| :----------------------------------------------------- | :------------------ | :-------------------------------------------------------- |
| resultScreenCustomizationAnimationRelativeScale | Float |  |
| resultScreenCustomizationForegroundColor | Int | Modifica a cor de fundo quando estiver em primeiro plano. |
| resultScreenCustomizationBackgroundColors | Int | Modifica a cor de fundo e caso receba duas cores diferentes cria um degradê. |
| resultScreenCustomizationActivityIndicatorColor |  @DrawableRes/Int | Modifica a cor do activity indicator. |
| resultScreenCustomizationCustomActivityIndicatorImage | Int | Adiciona uma imagem customizada para o activity indicator. |
| resultScreenCustomizationCustomActivityIndicatorRotationIntervar | Int |  |
| resultScreenCustomizationCustomActivityIndicatorAnimation | Int |  |
| resultScreenCustomizationShowUploadProgressBar    | Boolean     | Propriedade booleana que ativa a visualização da barra de progresso. |
| resultScreenCustomizationUploadProgressFillColor  | Int  | Modifica a cor do preenchimento da barra de progresso.               |
| resultScreenCustomizationUploadProgressTrackColor | Int  | Modifica a cor da barra de progresso.                                |
| resultScreenCustomizationResultAnimationBackgroundColor          | Int  | Modifica a cor de fundo da imagem que aparece após a animação finalizar.              |
| resultScreenCustomizationResultAnimationForegroundColor          | Int  | Modifica a cor do icone que vai aparecer em primeiro plano após a animação finalizar. |
| resultScreenCustomizationResultAnimationSuccessBackgroundImage   | @DrawableRes/Int | Adiciona uma imagem customizada após a animação finalizar com sucesso.|
| resultScreenCustomizationResultAnimationUnSuccessBackgroundImage | @DrawableRes/Int | Adiciona uma imagem customizada após a animação finalizar com erro. |
| resultScreenCustomizationCustomResultAnimationSuccess            | Int      |                                                                                    |
| resultScreenCustomizationCustomResultAnimationUnSuccess          | @DrawableRes/Int      |                |
| resultScreenCustomizationCustomStaticResultAnimationSuccess      | @DrawableRes/Int      |                |
| resultScreenCustomizationCustomStaticResultAnimationUnSuccess    | @DrawableRes/Int       | |
| resultScreenCustomizationMessageFont    | Typeface?       | |

   
### Oval Customization
   
| **Atributo**                                           | **Tipo**            | **Descrição**                                             |
| :----------------------------------------------------- | :------------------ | :-------------------------------------------------------- |
| ovarCustomizationStrokeWidth          | Int?   | Modifica a largura da borda da camada oval.                     |
| ovarCustomizationStrokeColor          | Int?  | Modifica a cor da borda da camada oval.                         |
| ovarCustomizationProgressStrokeWidth  | Int?   | Modifica a largura da borda do progresso da camada oval.        |
| ovarCustomizationProgressColor1       | Int?  | Modifica a cor da borda de progresso da camada oval.            |
| ovarCustomizationProgressColor2       | Int?  | Modifica a cor da borda de progresso da camada oval.            |
| ovarCustomizationProgressRadialOffset | Int?   | Modifica o distânciamento da borda de progresso da camada oval. |

 ### Frame Customization
 
| **Atributo**                                           | **Tipo**            | **Descrição**                                             |
| :----------------------------------------------------- | :------------------ | :-------------------------------------------------------- |
| frameCustomizationBorderWidth     | Int?   | Modifica a largura da borda do frame.                     |
| frameCustomizationCornerRadius    | Int?    | Modifica o tamanho do arredondamento das bordas do frame. |
| frameCustomizationBorderColor     | Int? | Modifica a cor da borda do frame.                         |
| frameCustomizationBackgroundColor | Int? | Modifica a cor de fundo do frame.                         |
| frameCustomizationElevation | Int? |                          |
 
### Overlay Customization
  
| **Atributo**                          | **Tipo** | **Descrição**                                                        |
| :------------------------------------ | :------- | :------------------------------------------------------------------- |
| overlayCustomizationBackgroundColor   | Int? | Modifica a cor de fundo da camada de overlay.                        |
| overlayCustomizationBrandingImage     | @DrawableRes/Int? | Adiciona uma imagem na camada de overlay.                            |
| overlayCustomizationShowBrandingImage | Boolean     | Propriedade booleana que ativa a visualização da imagem customizada. |


### Feedback Customization
 
| **Atributo**                             | **Tipo**         | **Descrição**                                             | 
| :--------------------------------------- | :--------------- | :-------------------------------------------------------- |
| feedbackCustomizationCornerRadius        | Int?           | Modifica o tamanho do arredondamento das bordas da barra. |
| feedbackCustomizationBackgroundColor     | Int? | Modifica a cor de fundo da barra.                         |
| feedbackCustomizationTextColor           | Int?         | Modifica a cor do texto do feedback.                      |
| feedbackCustomizationTextFont            | Typeface?          | Adiciona uma fonte customizada para o texto do feedback.  |
| feedbackCustomizationEnablePulsatingText | Boolean             |                                                        |

    
### Cancel Button

| **Atributo**                         | **Tipo**             | **Descrição**                                                              |
| :----------------------------------- | :------------------- | :------------------------------------------------------------------------- |
| cancelButtonCustomizationCustomImage | UIImage              | Cancela a operação e retorna para view anterior.                           |
| cancelButtonCustomizationLocation    | CancelButtonLocation | Enum que determina a posição do botão. Esquerda, deireita ou desabilitado. |
   
   
### Exit Animation Style
 
| **Atributo**                         | **Tipo**             | **Descrição**                                                              |
| :----------------------------------- | :------------------- | :------------------------------------------------------------------------- |
| exitAnimationStyle | Liveness3DExitAnimationStyle?              |                            | 
    
    
 ### Result Screen Message
 
| **Atributo**                         | **Tipo**             | **Descrição**                                                              |
| :----------------------------------- | :------------------- | :------------------------------------------------------------------------- |
| resultScreenOverrideSuccessMessage | String              |                            | 


# Customização dos textos por objeto

## Nova forma de customização
Agora a activity `Liveness3DActivity` possui um novo parâmetro (`PARAM_TEXTS`) que recebe um *HashMap* tendo como chave o tipo `Liveness3DTextKey` e como valor uma *string*.
Dessa forma a customização de textos da FaceTec não é feita mais pelo arquivo **strings.xml**.

```kotlin
val texts = hashMapOf<Liveness3DTextKey, String>(
    Liveness3DTextKey.READY_HEADER_1 to "Vamos Iniciar",
    Liveness3DTextKey.READY_HEADER_2 to "a jornada",
    Liveness3DTextKey.READY_MESSAGE_1 to "Instruções de como fazer",
    Liveness3DTextKey.READY_MESSAGE_2 to "o desafio do Liveness 3D.",
)

startActivityForResult?.launch(Intent(this, Liveness3DActivity::class.java).apply {
    putExtra(Liveness3DActivity.PARAM_LIVENESS3D_USER, liveness3DUser)
    putExtra(Liveness3DActivity.PARAM_TEXTS, texts)
})
```

## Novas tags

### Ready Screen

| **Novo identificador**    | **Antiga tag do arquivo XML**         |
| :------------------------ | :------------------------------------ |
| READY_HEADER_1            | FaceTec_instructions_header_ready_1   |
| READY_HEADER_2            | FaceTec_instructions_header_ready_2   |
| READY_MESSAGE_1           | FaceTec_instructions_message_ready_1  |
| READY_MESSAGE_2           | FaceTec_instructions_message_ready_2  |
| READY_BUTTON              | FaceTec_action_im_ready               |

### Retry Screen

| **Novo identificador**    | **Antiga tag do arquivo XML**        |
| :------------------------ | :----------------------------------- |
| RETRY_HEADER              | FaceTec_retry_header                 |
| RETRY_SUBHEADER           | FaceTec_retry_subheader_message      |
| RETRY_MESSAGE_SMILE       | FaceTec_retry_instruction_message_1  |
| RETRY_MESSAGE_LIGHTING    | FaceTec_retry_instruction_message_2  |
| RETRY_MESSAGE_CONTRAST    | FaceTec_retry_instruction_message_3  |
| RETRY_YOUR_PICTURE        | FaceTec_retry_your_image_label       |
| RETRY_IDEAL_PICTURE       | FaceTec_retry_ideal_image_label      |
| RETRY_BUTTON              | FaceTec_action_try_again             |

### Result Screen

| **Novo identificador** | **Antiga tag do arquivo XML**            |
| :--------------------- | :--------------------------------------- |
| RESULT_UPLOAD_MESSAGE  | FaceTec_result_facescan_upload_message   |
| RESULT_SUCCESS_MESSAGE | FaceTec_result_success_message           |

### Feedback

| **Novo identificador**                    | **Antiga tag do arquivo XML**                     |
| :---------------------------------------- | :------------------------------------------------ |
| FEEDBACK_CENTER_FACE                      | FaceTec_feedback_center_face                      |
| FEEDBACK_FACE_NOT_FOUND                   | FaceTec_feedback_face_not_found                   |
| FEEDBACK_FACE_NOT_LOOKING_STRAIGHT_AHEAD  | FaceTec_feedback_face_not_looking_straight_ahead  |
| FEEDBACK_FACE_NOT_UPRIGHT                 | FaceTec_feedback_face_not_upright                 |
| FEEDBACK_HOLD_STEADY                      | FaceTec_feedback_hold_steady                      |
| FEEDBACK_MOVE_PHONE_AWAY                  | FaceTec_feedback_move_phone_away                  |
| FEEDBACK_MOVE_PHONE_CLOSER                | FaceTec_feedback_move_phone_closer                |
| FEEDBACK_MOVE_PHONE_TO_EYE_LEVEL          | FaceTec_feedback_move_phone_to_eye_level          |
| FEEDBACK_USE_EVEN_LIGHTING                | FaceTec_feedback_use_even_lighting                |
| FEEDBACK_FRAME_YOUR_FACE                  | FaceTec_presession_frame_your_face                |
| FEEDBACK_LOOK_STRAIGHT_IN_OVAL            | FaceTec_presession_position_face_straight_in_oval |
| FEEDBACK_HOLD_STEADY_1                    | FaceTec_presession_hold_steady_1                  |
| FEEDBACK_HOLD_STEADY_2                    | FaceTec_presession_hold_steady_2                  |
| FEEDBACK_HOLD_STEADY_3                    | FaceTec_presession_hold_steady_3                  |
| FEEDBACK_REMOVE_DARK_GLASSES              | FaceTec_presession_remove_dark_glasses            |
| FEEDBACK_NEUTRAL_EXPRESSION               | FaceTec_presession_neutral_expression             |
| FEEDBACK_EYES_STRAIGHT_AHEAD              | FaceTec_presession_eyes_straight_ahead            |
| FEEDBACK_CONDITIONS_TOO_BRIGHT            | FaceTec_presession_conditions_too_bright          |
| FEEDBACK_BRIGHTEN_YOUR_ENVIRONMENT        | FaceTec_presession_brighten_your_environment      |
