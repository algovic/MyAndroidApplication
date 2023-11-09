package com.example.appcurso
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botonEntrar:Button=findViewById(R.id.botonAceptar)
        val botonSalir:Button=findViewById(R.id.botonSalir)
        val textContrasena:EditText=findViewById(R.id.editTextContrasena)
        botonSalir.setOnClickListener {
            finish()
        }
        botonEntrar.setOnClickListener {
            if(textContrasena.text.toString()=="123")
            {//Entrar en la otra partalla
                val intento = Intent(this, ejercicios::class.java)
                startActivity(intento)
            }
            else{
                //Borrar datos contraseña y espera  nueva contraseña
                textContrasena. setText("")
            }
        }
    }
}