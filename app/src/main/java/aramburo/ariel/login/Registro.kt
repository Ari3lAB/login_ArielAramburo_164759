package aramburo.ariel.login

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registro.*

class Registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        val user: String = (intent.getStringExtra("user"))
        et_user.setText(user)

        val pass: String = (intent.getStringExtra("pass"))
        et_pass.setText(pass)

        bt_aceptar.setOnClickListener {
            val resultIntent = Intent()

            resultIntent.putExtra("user", et_user.text.toString())
            resultIntent.putExtra("pass", et_pass.text.toString())

            setResult(Activity.RESULT_OK, resultIntent)

            finish()
        }

        bt_cancelar.setOnClickListener{
            finish()
        }
    }


}
