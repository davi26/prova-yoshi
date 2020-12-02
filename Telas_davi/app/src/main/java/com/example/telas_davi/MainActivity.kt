package com.example.telas_davi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
    }

    fun irTelaDono(componente:View){
        val telaDono = Intent(this, Perfil_dono::class.java)

        if (et_nome.text.isBlank()){
            et_nome.error = "Favor Preencher esse campo"
            return
        }
        if (et_email.text.isBlank()){
            et_email.error = "Favor Preencher esse campo"
            return
        }
        if (et_senha.text.isBlank()){
            et_senha.error = "Favor Preencher esse campo"
            return
        }
        if (et_con_senha.text.isBlank()){
            et_con_senha.error = "Favor Preencher esse campo"
            return
        }
        if (!et_con_senha.text.equals(et_senha.text)){
            et_con_senha.error = "Favor verificar se digitou corretamente "
            return
        }
        startActivity(telaDono)
    }
}