package app.easyupdate.example

import android.app.Application
import app.easyupdate.easyupdate.EasyUpdate


class App : Application() {
    override fun onCreate() {
        super.onCreate()
        EasyUpdate.configure(secretKey = "Key", applicationContext = this, endpoint = EasyUpdate.ENDPOINT.SANDBOX)

    }
}