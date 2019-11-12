package svn.vein.svennndd

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class FormActivity: AppCompatActivity() {
    private lateinit var etName : EditText
    private lateinit var etNim : EditText
    private lateinit var etUniv : EditText
    private lateinit var spJurusan : Spinner
    private lateinit var txtNama : TextView
    private lateinit var btnSimpan : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_form)


        etName = findViewById(R.id.edit_TViewLayout2_Name)
        etNim = findViewById(R.id.edit_TViewLayout2_nim)
        etUniv = findViewById(R.id.edit_TViewLayout2_un)
        spJurusan = findViewById(R.id.spiner)
        txtNama = findViewById(R.id.Tv_halo)


        btnSimpan = findViewById(R.id.btn_Layout2_save)

        txtNama.setText(intent.getStringExtra("edit_Text_halo"))


        btnSimpan.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)

            intent.putExtra("data1",etName.text.toString())
            intent.putExtra("data2",etNim.text.toString())
            intent.putExtra("univ",etUniv.text.toString())
            intent.putExtra("jurusan",spJurusan.textAlignment.toString())
            startActivity(intent)
        }



        //layout spinner
        val spinner: Spinner = findViewById(R.id.spiner)
        ArrayAdapter.createFromResource(
            this,
            R.array.spiner_jurusan, android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            spinner.adapter = adapter
        }


    }
}