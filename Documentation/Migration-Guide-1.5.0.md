> 🚧 Este é um repositório legado. Como parte de nossos esforços, reorganizamos nossos recursos técnicos. 
**Para acessar as informações mais recentes visite o [novo repositório](https://github.com/oititec/android-oiti-versions).** 
Este repositório permancerá ativo, mas não receberá atualizações.

# Liveness 1.5.0 - Guia de migração

#### Guia de migração para a versão 1.5.0 da SDK Liveness Android.

1. Com a adição de dois novos códigos de erro, pode ser necessário adicioná-los no tratamento do resultado do SDK. Os novos códigos são:

```kotlin
// Erro ao configurar câmera
ERROR_CAMERA_SETUP,
// Erro ao capturar foto
ERROR_CAPTURE_PICTURE
```
