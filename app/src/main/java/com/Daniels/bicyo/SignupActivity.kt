package com.Daniels.bicyo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity


class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
    fun goToLogin(view: View){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }
    fun signup(view: View){
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}