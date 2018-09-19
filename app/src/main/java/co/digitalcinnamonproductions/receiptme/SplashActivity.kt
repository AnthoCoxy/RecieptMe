package co.digitalcinnamonproductions.receiptme

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlin.concurrent.thread

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //Use a thread to create and set the new activity to not overload the main thread
        thread(block = {
            startActivity(Intent(this, MainActivity::class.java))
        })
    }
}
