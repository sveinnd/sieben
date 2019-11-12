package svn.vein.svennndd

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DataActivity:AppCompatActivity() {

    private lateinit var Data1 : TextView
    private lateinit var Data2 : TextView
    private lateinit var Data3 : TextView
    private lateinit var Data4 : TextView

    private lateinit var btnLanjut : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_data)

        Data1 = findViewById(R.id.TViewLayout3_Name)
        Data2 = findViewById(R.id.TVViewLayout3_Nim)
        Data3 = findViewById(R.id.TViewLayout3_Jurusan)
        Data4 = findViewById(R.id.TViewLayout3_fac)

        Data1.setText(intent.getStringExtra("data1"))
        Data2.setText(intent.getStringExtra("data2"))
        Data3.setText(intent.getStringExtra("jurusan"))
        Data4.setText(intent.getStringExtra("univ"))

        btnLanjut = findViewById(R.id.btn_layout3_submit)

        btnLanjut.setOnClickListener(){
            val intent = Intent(this,Musik::class.java)
            startActivity(intent)
        }

    }
}