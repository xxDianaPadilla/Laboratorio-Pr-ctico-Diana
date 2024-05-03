package diana.padilla.laboratoriopracticadiana

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class activity_Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnLogin = findViewById<ConstraintLayout>(R.id.btnLogin)
        val textoLogin = findViewById<TextView>(R.id.textoLogin)

        btnLogin.setOnClickListener {
            val pantallaMenu = Intent(this, MainActivity::class.java)
            startActivity(pantallaMenu)
        }

        textoLogin.setOnClickListener {
            val menuPantalla = Intent(this, MainActivity::class.java)
            startActivity(menuPantalla)
        }
    }
}