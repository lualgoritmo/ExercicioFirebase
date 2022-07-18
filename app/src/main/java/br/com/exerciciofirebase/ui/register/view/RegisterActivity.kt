package br.com.exerciciofirebase.ui.register.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.exerciciofirebase.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}