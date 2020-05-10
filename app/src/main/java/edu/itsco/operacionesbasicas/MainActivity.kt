package edu.itsco.operacionesbasicas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var  txt_numero1=findViewById<View>(R.id.txt_numero1) as EditText
        var  txt_numero2=findViewById<View>(R.id.txt_numero2) as EditText
        var  btn_sumar=findViewById<View>(R.id.btn_suma) as Button
        var  btn_resta=findViewById<View>(R.id.btn_resta) as Button
        var  btn_multiplicacion=findViewById<View>(R.id.btn_multiplicacion) as Button
        var  btn_division=findViewById<View>(R.id.btn_division) as Button


        btn_sumar.setOnClickListener(View.OnClickListener {

            var resultado=txt_numero1.text.toString().toInt()+txt_numero2.text.toString().toInt()

            Toast.makeText(this,"El resultado de la suma es: "+resultado,Toast.LENGTH_LONG).show()
        })


        btn_resta.setOnClickListener(View.OnClickListener {

            var resultado=txt_numero1.text.toString().toInt()-txt_numero2.text.toString().toInt()

            Toast.makeText(this,"El resultado de la resta es: "+resultado,Toast.LENGTH_LONG).show()
        })


        btn_multiplicacion.setOnClickListener(View.OnClickListener {

            var resultado=txt_numero1.text.toString().toInt()*txt_numero2.text.toString().toInt()

            Toast.makeText(this,"El resultado de la multiplicacion es: "+resultado,Toast.LENGTH_LONG).show()
        })


        btn_division.setOnClickListener(View.OnClickListener {

            var resultado=txt_numero1.text.toString().toInt()/txt_numero2.text.toString().toInt()

            Toast.makeText(this,"El resultado de la division es: "+resultado,Toast.LENGTH_LONG).show()
        })


    }
}
