package sofisapp.sofistrending

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import sofisapp.sofistrending.R
import kotlinx.android.synthetic.main.activity_login.*
import sofisapp.sofistrending.R.id.txtCorreo_login
import sofisapp.sofistrending.R.id.txtPassword_login

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        ingresarCuenta()

        }
    private fun ingresarCuenta() {        btnIniciar_login.setOnClickListener {
            val correoUsuario = txtCorreo_login.text.toString()
            val passwordUsuario = txtPassword_login.text.toString()

            if (correoUsuario.isEmpty() || passwordUsuario.isEmpty()){
                Toast.makeText(this, "Porfavor llenar los campos", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //Toast.makeText(this, "El correo es: $correoUsuario y la contraseña es: $passwordUsuario", Toast.LENGTH_LONG).show()
            // Autenticacion con Firebase
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(correoUsuario, passwordUsuario)
                .addOnCompleteListener {
                    if (!it.isSuccessful) {
                        return@addOnCompleteListener
                    } else {
                        Toast.makeText(this, "Su ingreso ha sido exitoso", Toast.LENGTH_SHORT).show()
                    }
                }
                .addOnFailureListener {
                    Toast.makeText(this, "Error al ingresar la cuenta", Toast.LENGTH_SHORT).show()
                }
        }
    }
    }


