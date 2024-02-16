> 🚧 Este é um repositório legado. Como parte de nossos esforços, reorganizamos nossos recursos técnicos. 
**Para acessar as informações mais recentes visite o [novo repositório](https://github.com/oititec/android-oiti-versions).** 
Este repositório permancerá ativo, mas não receberá atualizações.


# Liveness 1.4.1 - Guia de migração

#### Guia de migração para a versão 1.4.1 da SDK Liveness Android.

1. Nesta versão foi adicionado um helper para debug, que exibe logs na tela do aparelho, através de Toasts. Para usá-lo, basta adicionar o extra `FaceCaptchaActivity.PARAM_DEBUG_ON` com valor `true` ao criar o intent do FaceCaptcha:

```kotlin
putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, true)
```
