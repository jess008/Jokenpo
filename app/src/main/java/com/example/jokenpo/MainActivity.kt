package com.example.jokenpo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.*


class Operacao {
    val reader = Scanner(System.`in`)
    val jogador1:Int=(1..3).random()
    val jogador2:Int=(1..3).random()
}
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val op = Operacao()
        val jogador1 = op.jogador1.toString()
        val jogador2 = op.jogador2.toString()

        var impressao1 = findViewById(R.id.jogador1) as TextView
        var impressao2 = findViewById(R.id.jogador2) as TextView

            val escolha1:String = when (jogador1){
                "1" -> "PEDRA"
                "2" -> "PAPEL"
                "3" -> "TESOURA"
                else -> ""
            }

            val escolha2:String = when (jogador2){
                "1" -> "PEDRA"
                "2" -> "PAPEL"
                "3" -> "TESOURA"
                else -> ""
            }

        impressao1.setText(jogador1)
        impressao2.setText(jogador2)

            if(jogador1=="1" && jogador2=="3"){
                ppt1.setText(escolha1)
                ppt2.setText(escolha2)
                ganhador.setText("Jogador1 ganhou ")

            }else if(jogador2=="1" && jogador1=="3"){
                ppt1.setText(escolha1)
                ppt2.setText(escolha2)
                ganhador.setText("Jogador2 ganhou ")

            }else if(jogador1=="2" && jogador2=="3"){
                ppt1.setText(escolha1)
                ppt2.setText(escolha2)
                ganhador.setText("Jogador2 ganhou ")

            }else if(jogador1=="1" && jogador2=="2"){
                ppt1.setText(escolha1)
                ppt2.setText(escolha2)
                ganhador.setText("Jogador2 ganhou ")

            }else if(jogador1=="3" && jogador2=="2"){
                ppt1.setText(escolha1)
                ppt2.setText(escolha2)
                ganhador.setText("Jogador1 ganhou ")

            }else if(jogador1=="2" && jogador2=="1"){
                ppt1.setText(escolha1)
                ppt2.setText(escolha2)
                ganhador.setText("Jogador1 ganhou ")

            }






    }
}