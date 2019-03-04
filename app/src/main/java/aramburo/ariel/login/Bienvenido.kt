package aramburo.ariel.login

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bienvenido.*

class Bienvenido : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenido)

        val user: String = (intent.getStringExtra("user"))
        tv_User.text = user
        bt_cerrarSess.setOnClickListener{
            finish()
        }
    }

}
