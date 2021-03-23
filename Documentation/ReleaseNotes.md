# Liveness - Release Notes

#### [2.0.0](Migration-Guide-2.0.0.md)
- Layout redesenhado.
- Mecanismo de view customizada.

#### 1.6.1
- Adição do retorno `FaceCaptchaActivity.PARAM_RESULT_COD_ID`, com o código retornado na validação dos desafios.
- A partir desta versão, a chave `FaceCaptchaActivity.PARAM_RESULT_HASH` está obsoleta, e não retornará valor nenhum.

#### 1.6.0
- Otimização do uso de memória durante a captura de fotos.

#### [1.5.0](Migration-Guide-1.5.0.md)
- Refatoração do mecanismo de callbacks da camera2 api.
- Adição de dois códigos de erro: `ERROR_CAMERA_SETUP` e `ERROR_CAPTURE_PICTURE`.

#### [1.4.1](Migration-Guide-1.4.1.md)
- Adição de um helper para debug, que exibe logs na tela através de Toasts.

#### [1.4.0](Migration-Guide-1.4.0.md)
- Foi criado um novo enum, `FaceCaptchaErrorCode`, que indica o tipo de erro retornado pelo SDK. 
- A chave `PARAM_RESULT_ERROR_APPKEY`, que indicava que a AppKey fornecida era inválida, ficou obsoleta nesta versão. Este erro agora pode ser verificado pelo código de erro `FaceCaptchaErrorCode.INVALID_APP_KEY `, através da chave `PARAM_RESULT_ERROR_CODE`.

#### 1.3.2
- Correção de crash relacionado a lateinit vars.

#### 1.3.0
- Melhoria no mecanismo de buffer de fotos da camera2 api.

#### 1.2.0
- Tratamento para erro OutOfMemory
- Verificação se aparelho está em chamada telefônica antes de iniciar os desafios.
