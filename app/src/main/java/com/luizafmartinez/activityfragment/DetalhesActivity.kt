package com.luizafmartinez.activityfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class DetalhesActivity : AppCompatActivity() {

    lateinit var buttonFechar : Button
    lateinit var textFilme : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        buttonFechar = findViewById(R.id.button_fechar)
        textFilme = findViewById(R.id.text_filme)

        // Para recuperar o valor vindo da MainActivity, passado no intent:
        val bundle = intent.extras //Todos os parâmetros passados

        if (bundle != null) {
            val filme = bundle.getString("filme")
            val classificacao = bundle.getInt("classificacao")
            val avaliacoes = bundle.getDouble("avaliacoes")
            val resultado =
             "Filme: $filme, Classif.: $classificacao, Aval.: $avaliacoes"

            textFilme.text = resultado
        }

        buttonFechar.setOnClickListener {
            finish()
        }

    }
}