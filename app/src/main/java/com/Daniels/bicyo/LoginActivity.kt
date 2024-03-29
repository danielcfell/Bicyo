package com.Daniels.bicyo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        if (supportActionBar != null) {
            supportActionBar?.hide();
        }
    }
    fun login(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    fun goToSignup(view: View){
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }
}