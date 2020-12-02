package com.example.fragmentado

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class uFragmentoForte : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento_forte, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val nomeRecebido = arguments?.getString("usuario")
        val idadeRecebida = arguments?.getInt("idade")

        val texto = """
            Então, $nomeRecebido, com $idadeRecebida anos 
            voce ja deveria saber o quer da vida
        """.trimIndent()

        //para quem atualizou o Android Studio
        activity?.findViewById<TextView>(R.id.tv_forte)?.text = texto
    }
}