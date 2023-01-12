package app.easyupdate.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import app.easyupdate.easyupdate.EasyUpdate
import app.easyupdate.easyupdate.UpdateCheckCallBack

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.tvTest).setOnClickListener { checkForUpdate() }


    }
    fun checkForUpdate()
    {

        EasyUpdate.checkForUpdate(object : UpdateCheckCallBack{
            override fun onSuccess(data: String) {
                Toast.makeText(this@MainActivity,data,Toast.LENGTH_SHORT).show()
            }

            override fun onError(data: String) {
                Toast.makeText(this@MainActivity,data,Toast.LENGTH_SHORT).show()
            }

        })
    }
}