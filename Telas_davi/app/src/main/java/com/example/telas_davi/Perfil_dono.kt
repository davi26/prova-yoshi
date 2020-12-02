package com.example.telas_davi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_perfil_dono.*

class Perfil_dono : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_dono)
    }

    fun irHomeDono(componente: View) {
        if (et_cpf.text.isBlank()){
            et_cpf.error = "Favor preencher esse campo"
            return
        }
        if (et_dt_nasc.text.isBlank()){
            et_dt_nasc.error = "Favor preencher esse campo"
            return
        }
        if (et_sexo.text.isBlank()){
            et_sexo.error = "Favor preencher esse campo"
            return
        }

    }
}


