package aramburo.ariel.login

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_CrearUser.setOnClickListener {
            val intent = Intent(this, Registro::class.java)
            intent.putExtra("user", et_Usuario.text.toString())
            intent.putExtra("pass", et_Usuario.text.toString())
            startActivityForResult(intent, 123)
        }

        bt_Ingresar.setOnClickListener {
            val intent = Intent(this, Bienvenido::class.java)
            intent.putExtra("user", et_Usuario.text.toString())
            intent.putExtra("pass", et_Usuario.text.toString())
            startActivityForResult(intent, 123)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (data != null) {
            val user: String = data.getStringExtra("user")
            val pass: String = data.getStringExtra("pass")

            et_Usuario.setText(user)
            et_Pass.setText(pass)
        }
    }
}
