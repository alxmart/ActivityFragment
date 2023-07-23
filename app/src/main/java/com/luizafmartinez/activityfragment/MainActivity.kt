package com.luizafmartinez.activityfragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {

    lateinit var buttonAbrir: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("Ciclo de vida:", "onCreate")

        setContentView(R.layout.activity_main)

        buttonAbrir = findViewById(R.id.button_abrir)

        buttonAbrir.setOnClickListener {

            // finish()

            val intent = Intent(
                this,
                DetalhesActivity::class.java
            )
            // Passar parâmetros para nova tela
//            intent.putExtra("filme","The Witcher")
//            intent.putExtra("classificacao",5)
//            intent.putExtra("avaliacoes",9.2)

            val filme = Filme(       // Usando Interface Serializable
                "Sem limites",
                "Teste",
                4.8,
                "Jamilton",
                "Netflix"
            )
            intent.putExtra("filme",filme) //Passa objeto filme

            // Iniciar uma nova tela
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        // Carregar dados...
        Log.i("Ciclo de vida: ", "onStart")
    }
    override fun onResume() {
        super.onResume()
        Log.i("Ciclo de vida: ", "onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.i("Ciclo de vida: ", "onPause")
    }
    override fun onStop() {
        super.onStop()
        Log.i("Ciclo de vida: ", "onStop")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i("Ciclo de vida: ", "onRestart")
    }
    override fun onDestroy() {
        Log.i("Ciclo de vida: ", "onDestroy")
        super.onDestroy()
    }


}








