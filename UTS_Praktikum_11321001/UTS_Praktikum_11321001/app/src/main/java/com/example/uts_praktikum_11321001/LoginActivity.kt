package com.example.uts_praktikum_11321001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.app.AlertDialog

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var button_register = findViewById(R.id.btn_register) as Button

        button_register.setOnClickListener {
            var intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }

    fun login(view: View) {

        val builder = AlertDialog.Builder(this)
        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)

        if (username.text.toString() == "krisnati1" && password.text.toString() == "krisna") {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        } else {
            builder.setTitle("Login Gagal")
            builder.setMessage("Username atau Password Salah")
            builder.setPositiveButton("OK", null)
            builder.show()
        }
    }
}