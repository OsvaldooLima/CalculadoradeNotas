package com.example.calculadoradenotas


import android.graphics.Color
import android.graphics.Color.GREEN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular =calcular
        val resultado =Resultado

        btCalcular.setOnClickListener {
            val nota1 :Int = Integer.parseInt(Nota1.text.toString())
            val nota2 :Int = Integer.parseInt(Nota2.text.toString())
            val media:Int =(nota1+nota2)/2
            val faltas:Int = Integer.parseInt(Faltas.text.toString())

            if (media >=6 && faltas <=10) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final:" + media+ "\n" + "Faltas:" +faltas)
                resultado.setTextColor(Color.GREEN)
            }

            else{
                resultado.setText("Aluno foi Reprovado" + "\n"+ "Nota Final:" + media+"\n" + "Faltas:" + faltas)
                resultado.setTextColor(Color.RED)
            }

        }

    }
}