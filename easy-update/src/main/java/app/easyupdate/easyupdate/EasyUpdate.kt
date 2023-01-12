package app.easyupdate.easyupdate

import android.app.Application

object EasyUpdate {
    private var secretKey: String? = null
    private var applicationContext: Application? = null
    private var endpoint: ENDPOINT? = null
    fun configure(
        secretKey: String,
        applicationContext: Application,
        endpoint: ENDPOINT = ENDPOINT.PRODUCTION
    ) {
        this.secretKey = secretKey
        this.applicationContext = applicationContext
        this.endpoint = endpoint
    }

    fun checkForUpdate(callBack: UpdateCheckCallBack) {
        var isValid = false
        secretKey?.let {
            applicationContext?.let {
                isValid = true
            }
        }
        if (isValid) {

            var response = ""
            Connector().callApi(onSuccess = {
                callBack.onSuccess(
                    "${applicationContext?.packageName}:${it?.entries}"
                )
            }, onFailure = {
                callBack.onError(
                    "${applicationContext?.packageName}:error"
                )
            })

        } else {
            callBack.onError("Error")
        }
    }

    enum class ENDPOINT {
        PRODUCTION, SANDBOX
    }
}