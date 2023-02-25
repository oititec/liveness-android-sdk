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
