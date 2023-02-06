# Documentoscopia 
Saiba como implementar a customização de view (telas), conforme a sua necessidade.

Você pode utilizar o SDK padrão e por meio dele, também customizar a visualização dessas telas.

## Entenda como funciona

O processo de Documentoscopia possui as seguintes telas:

### 1. Tela inicial
O usuário define qual o tipo de documento que deseja enviar:

<div><img src="Images/01_tipo_de_documento.png" width="214" height="488"></div>

### 2. Tela de captura do documento (frente)
O usuário recebe a instrução de captura da frente do documento, dentro da marcação apresentada:

<div><img src="Images/02_instrucao_documento_frente.png" width="214" height="488"></div>

### 3. Abaixo, um exemplo de como esse documento deve ficar posicionado

<div><img src="Images/03_documento_frente.png" width="214" height="488"></div>

### 4. Tela de confirmação da captura do documento (frente)
Nesta tela, o usuário deve confirmar se a imagem do documento capturado está em boa qualidade, clicando em Não, refazer ou Sim:

<div><img src="Images/04_documento_frente_validacao.png" width="214" height="488"></div>

### 5. Tela de captura do documento (verso)
O usuário recebe a instrução de captura do verso do documento, dentro da marcação apresentada:

<div><img src="Images/05_instrucao_documento_verso.png" width="214" height="488"></div>

### 6. Abaixo, um exemplo de como esse documento deve ficar posicionado

<div><img src="Images/06_documento_verso.png" width="214" height="488"></div>

### 7. Tela de confirmação da captura do documento (verso)
Nesta tela, o usuário deve confirmar se a imagem do documento capturado está em boa qualidade, clicando em Não, refazer ou Sim:

<div><img src="Images/07_documento_verso_validacao.png" width="214" height="488"></div>

### 8. Tela de conclusão do envio do documento (sucesso)
O usuário receberá uma notificação de **sucesso** caso o envio do documento seja concluído com sucesso:

<div><img src="Images/09_envio_de_documento_sucesso.png" width="214" height="488"></div>

### 9. Tela de processamento do documento (erro)
O usuário receberá uma notificação de erro ao processar o documento:

<div><img src="Images/13_envio_de_documento_erro.png" width="214" height="488"></div>

### 10. Tela para tentar processar o documento novamente (erro)
Nesta tela o usuário poderá clicar no botão **Tentar novamente**, após a mensagem de erro:

<div><img src="Images/10_envio_de_documento_erro.png" width="214" height="488"></div>

---

## Instalação e configuração das telas customizáveis

De forma semelhante ao Liveness, a customização das views é realizada por meio da implementação dos layouts (XMLs), os quais devem obrigatoriamente conter alguns elementos visuais com IDs pré-determinados, para o funcionamento correto do processo de documentoscopia. A diferença é que, neste caso, deve-se implementar dois layouts, sendo um para cada tela citada anteriormente.

O componente de Documentoscopia é dividido em três etapas: 
- Tela inicial, onde o usuário deve escolhar se irá capturar foto da CNH ou do RG, ambas com frente e verso 
- Tela de captura das imagens, onde o usuário irá fotografar o documento. 
- Tela de feedback, onde o usuário poderá confirmar se as fotos estão boas, e em caso negativo, poderá capturá-las novamente.

## Implementação

> **Nota: [Clique aqui](https://github.com/oititec/liveness-android-sdk/blob/main/Documentation/Documentscopy-Usage.md) para visualizar um exemplo de implementação.**

## Tela Inicial  

**DocumentscopyActivity.PARAM_CUSTOM_HOME_FRAGMENT**

Elementos obrigatórios:


| **Indice** | **Elemento** | **Descrição** |
|:-----------|:-------------|:--------------|
| (**1**) | `contentView` |  |
| (**2**) | `backButton` | Botão para função voltar da navegação. |
| (**3**) | `cnhPictureButton` | View que terá a ação de iniciar o fluxo de captura do documento CNH. |
| (**4**) | `rgPictureButton` | View que terá a ação de iniciar o fluxo de captura do documento RG. |


## Tela de captura das imagens  

**DocumentscopyActivity.PARAM_CUSTOM_CAMERA_FRAGMENT**

Elementos obrigatórios:

| **Indice** | **Elemento** | **Descrição** |
|:-----------|:-------------|:--------------|
| (**1**) | `takeNewPictureButton` |  |
| (**1**) | `activityIndicatorView` |  |
| (**1**) | `backButton` | Button para fechar a tela. |
| (**2**) | `closeButton` | Button para fechar a tela. |
| (**3**) | `titleTextView` |  |
| (**4**) | `previewContainer` |  |
| (**5**) | `checkFront` | Texto informativo com orientação da captura, é exibido por apenas alguns segundos. |
| (**6**) | `checkBack` | Nesta view será colocado o preview da câmera. |
| (**7**) | `cameraFrameLayout` |  |
| (**8**) | `cameraFrameBorder` |  |
| (**9**) | `captureButton` | Botão para capturar foto. |
| (**10**) | `previewImageView` | ImageView onde será exibida a imagem capturada para o usuário confirmar se ficou boa. |
| (**11**) | `instructionsTextView` |  |
| (**12**) | `usePictureButton` | Botão para que o usuário confirme a foto capturada. |
|          | `bottomSheetTitleTextView` | Método que indica quando a *view* de confirmação de imagem deve ou não ser mostrada, esse método possui dois parâmetros: <br/> - **visibility** que é um `enum` do tipo ``DocumentscopyConfirmationSheetVisibility`` que indica o estado da *view* de confirmação;<br/> - **animated** que indica quando é recomendado que esse comportamento seja feito com animação. |
|          | `setFocus(to:animated:)` | Método que indica qual o indicador de face do documento deve estar em foco no momento, esse método possui dois parâmetros: <br/> - **to (*focusElement*)** que é um `enum` do tipo ``DocumentscopyFocusIndicator`` que possui os valores de *frontIndicator* e *backIndicator* que representam a frente e o verso do documento respectivamente;<br/> - **animated** que indica quando é recomendado que esse comportamento seja feito com animação. |
|          | `setUsePictureButtonTitle(to:)` | Método responsável por atribuir um novo titlulo para o botão de usar foto (`usePictureButton`). |

<br/>
<div>
    <img src="Images/dc_camera_1.png" width="432" height="396" />
    <img src="Images/dc_camera_3.png" width="432" height="396" />
<div/>
    

## 3. Tela de processamento do documento

Elementos obrigatórios:

    
| **Indice** | **Elemento** | **Descrição** |
|:-----------|:-------------|:--------------|
| (**1**) | `successView` |  |
| (**2**) | `failureView` |  |
| (**3**) | `failureTextView` | Button para fechar a tela. |
| (**4**) | `failureCloseButton` | Button para fechar a tela. |

---
    
## Observações

No projeto Sample, neste mesmo repositório, encontra-se um exemplo de implementação.


