package br.com.exerciciofirebase.ui.login.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.exerciciofirebase.R
import br.com.exerciciofirebase.databinding.ActivityLoginBinding
import br.com.exerciciofirebase.ui.register.view.RegisterActivity

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.txtToRegister?.setOnClickListener {
            initRegister()
        }
    }
    private fun initRegister() {
        startActivity(Intent(this,RegisterActivity::class.java))
    }
}