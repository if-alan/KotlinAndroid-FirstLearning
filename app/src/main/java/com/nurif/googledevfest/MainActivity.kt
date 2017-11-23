package com.nurif.googledevfest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //lateinit memberikan kebebasan mengisi data dimana saja
    lateinit var data: DevFest

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save.setOnClickListener {
            data = DevFest(edt_nama.text.toString(), edt_gender.text.toString(), edt_alamat.text.toString())

//            result(data.nama,
//                    data.gender,
//                    data.address)

            result(data.nama,
                    data.gender,
                    address())
        }
    }

    fun result(name: String, gender: String, address: String) {
        txt_result.text = "Nama Lengkap: " + name + "\n" +
                "Jenis Kelamin: " + gender + "\n" +
                "Alamat: " + address
    }

    fun address(): String = edt_alamat.text.toString()
}
