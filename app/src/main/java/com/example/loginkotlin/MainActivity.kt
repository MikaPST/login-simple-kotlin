package com.example.loginkotlin

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var pref = getPreferences(Context.MODE_PRIVATE)
        var login = pref.getString("Login", null)
        editLogin.setText(login).toString()
    }


    fun EnvoiOk(view: View) {
        var login = editLogin.text.toString()
        var pref = getPreferences(Context.MODE_PRIVATE)
        val editor = pref.edit()
        editor.putString("Login", login)
        editor.commit()
    }



    fun cancel(view: View) {
        finish()
    }
}
