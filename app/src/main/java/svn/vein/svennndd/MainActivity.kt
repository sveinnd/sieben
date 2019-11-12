package svn.vein.svennndd

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var et1 : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.edit_Text_User)

        button = findViewById(R.id.btn_masuk)
        button.setOnClickListener {
            val intent = Intent(this, FormActivity::class.java)
            intent.putExtra("edit_Text_halo", et1.text.toString())
            startActivity(intent)
        }
    }


}
