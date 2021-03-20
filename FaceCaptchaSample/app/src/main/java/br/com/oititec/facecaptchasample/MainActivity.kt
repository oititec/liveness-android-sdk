package br.com.oititec.facecaptchasample

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import br.com.oiti.certiface.FaceCaptchaActivity
import br.com.oiti.certiface.UserData
import br.com.oiti.certiface.data.FaceCaptchaErrorCode

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onDefaultClick(view: View) {

        val userData = UserData(appKey = APP_KEY)

        val intent = Intent(this, FaceCaptchaActivity::class.java).apply {
            putExtra(FaceCaptchaActivity.PARAM_ENDPOINT, ENDPOINT)
            putExtra(FaceCaptchaActivity.PARAM_USER_DATA, userData)
            putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) // Passar true para mostrar logs na tela
        }

        startActivityForResult(intent, CAPTCHA_RESULT_REQUEST)
    }

    fun onCustomImageClick(view: View) {

        val userData = UserData(appKey = APP_KEY)

        val intent = Intent(this, FaceCaptchaActivity::class.java).apply {
            putExtra(FaceCaptchaActivity.PARAM_ENDPOINT, ENDPOINT)
            putExtra(FaceCaptchaActivity.PARAM_USER_DATA, userData)
            putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) // Passar true para mostrar logs na tela
            putExtra(FaceCaptchaActivity.PARAM_OVERLAY_IMAGE, R.drawable.custom_overlay)
        }

        startActivityForResult(intent, CAPTCHA_RESULT_REQUEST)
    }

    fun onCustomViewClick(view: View) {

        val userData = UserData(appKey = APP_KEY)

        val intent = Intent(this, FaceCaptchaActivity::class.java).apply {
            putExtra(FaceCaptchaActivity.PARAM_ENDPOINT, ENDPOINT)
            putExtra(FaceCaptchaActivity.PARAM_USER_DATA, userData)
            putExtra(FaceCaptchaActivity.PARAM_DEBUG_ON, false) // Passar true para mostrar logs na tela
            putExtra(FaceCaptchaActivity.PARAM_CUSTOM_FRAGMENT, R.layout.fragment_custom)
        }

        startActivityForResult(intent, CAPTCHA_RESULT_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == CAPTCHA_RESULT_REQUEST) {
            when (resultCode) {
                Activity.RESULT_OK -> onResultSuccess(data)
                Activity.RESULT_CANCELED -> onResultCancelled(data)
            }
        }
    }

    private fun onResultSuccess(data: Intent?) {
        val result = data?.getBooleanExtra(FaceCaptchaActivity.PARAM_RESULT, false)
        val cause = data?.getStringExtra(FaceCaptchaActivity.PARAM_RESULT_CAUSE)
        val codID = data?.getDoubleExtra(FaceCaptchaActivity.PARAM_RESULT_COD_ID, 0.0)
        val protocol = data?.getStringExtra(FaceCaptchaActivity.PARAM_RESULT_PROTOCOL)
        Toast.makeText(this, "Valid: $result\nCause: $cause", Toast.LENGTH_LONG).show()
        Log.d(TAG, "Result: $result - Cause: $cause - CodID: $codID - Protocol: $protocol")
    }

    private fun onResultCancelled(data: Intent?) {

        val errorMessage = data?.getStringExtra(FaceCaptchaActivity.PARAM_RESULT_ERROR)
        val errorCode = data?.getSerializableExtra(FaceCaptchaActivity.PARAM_RESULT_ERROR_CODE) as? FaceCaptchaErrorCode

        errorCode?.let {

            Toast.makeText(this, "Código de Erro: $it\n\nMensagem: $errorMessage", Toast.LENGTH_LONG).show()

            when (it) {
                FaceCaptchaErrorCode.INVALID_BUNDLE_PARAMS -> Log.d(TAG, "Error code: INVALID_BUNDLE_PARAMS")
                FaceCaptchaErrorCode.INVALID_APP_KEY -> Log.d(TAG, "Error code: INVALID_APP_KEY")
                FaceCaptchaErrorCode.CERTIFACE_OFF -> Log.d(TAG, "Error code: CERTIFACE_OFF")
                FaceCaptchaErrorCode.NO_FRONT_CAMERA -> Log.d(TAG, "Error code: NO_FRONT_CAMERA")
                FaceCaptchaErrorCode.NO_CAMERA_PERMISSION -> Log.d(TAG, "Error code: NO_CAMERA_PERMISSION")
                FaceCaptchaErrorCode.NO_INTERNET_CONNECTION -> Log.d(TAG, "Error code: NO_INTERNET_CONNECTION")
                FaceCaptchaErrorCode.PHONE_CALL_IN_PROGRESS -> Log.d(TAG, "Error code: PHONE_CALL_IN_PROGRESS")
                FaceCaptchaErrorCode.REQUEST_ERROR -> Log.d(TAG, "Error code: REQUEST_ERROR")
                FaceCaptchaErrorCode.CHALLENGE_INTERRUPTED -> Log.d(TAG, "Error code: CHALLENGE_INTERRUPTED")
                FaceCaptchaErrorCode.LOW_MEMORY -> Log.d(TAG, "Error code: LOW_MEMORY")
                FaceCaptchaErrorCode.ERROR_CAMERA_SETUP -> Log.d(TAG, "Error code: ERROR_CAMERA_SETUP")
                FaceCaptchaErrorCode.ERROR_CAPTURE_PICTURE -> Log.d(TAG, "Error code: ERROR_CAPTURE_PICTURE")
                FaceCaptchaErrorCode.INVALID_CUSTOM_FRAGMENT -> Log.d(TAG, "Error code: INVALID_CUSTOM_FRAGMENT")
            }
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
        private const val CAPTCHA_RESULT_REQUEST = 1
        private const val ENDPOINT = "https://comercial.certiface.com.br:443"
        private const val APP_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJjZXJ0aWZhY2UiLCJ1c2VyIjoiMzBFNDRFOEFDQjYyOTRGRUREQjk5NUI5NjAzNjY4MkU2N0Q1fGZlbGlwZS5tb2JpbGUiLCJlbXBDb2QiOiIwMDAwMDAwMDAxIiwiZmlsQ29kIjoiMDAwMDAwMjU3OCIsImNwZiI6IjM4MDc1NjUwODY3Iiwibm9tZSI6IkFGMzYxNzI3MDg5NUYyMEE5N0RBMDFBRDY3NkY3OUZGOEUzQTc4MEFDNUM5NjYxMDhBODdGMDIzMjAyQkE3NjlDQzgyNUFGODI4NkZBQkNDNTc1QjgyNkZEQTEwQ0ZFQTNCQTA4MDVFOUVCNDg0MjJEQkQzQTQ5RTg4NTg4NUFEOEE2QkRERjc2fEZFTElQRSBTSUxWQSIsIm5hc2NpbWVudG8iOiIwNS8wNS8xOTkwIiwiZWFzeS1pbmRleCI6IkFBQUFFcjI4VVo5VnlBOTRtQlE4THJZbjJWUXpEV21hU29XeHBpSDFqcXVBODJiVVI4bkFjLytDNHlXdlJRPT0iLCJrZXkiOiJRMjl1YzJsa1pYSWdjM0JsWVd0cGJtY2diV1VnY0hKdmMzQmxZM1FnZDJoaGRHVT0iLCJleHAiOjE2MTYxOTA5MzUsImlhdCI6MTYxNjE5MDYzNX0.ZSMcAS6dDI5psJoCHgYAk4IITZJa2A-p_nnvFIuwXLc"
    }
}
