package com.example.cafeapp

import android.app.ProgressDialog.show
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.accessibility.AccessibilityEventCompat.setAction
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private var mOrderMessage: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }
    }
    // Display a Toast message
    private fun displayToast(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
    // Show a message that the donut image was clicked
    fun showDonutOrder(view: View) {
        mOrderMessage = "You ordered a donut."
        displayToast(mOrderMessage)
    }
    // Show a message that the ice cream sandwich image was clicked
    fun showIceCreamOrder(view: View) {
        mOrderMessage = "You ordered an ice cream sandwich."
        displayToast(mOrderMessage)
    }
    // Show a message that the froyo image was clicked
    fun showFroyoOrder(view: View) {
        mOrderMessage = "You ordered a Froyo."
        displayToast(mOrderMessage)
    }

    // Show a message using Snackbar at the bottom of the screen if clicked
    fun startOrder(view: View) {
        Snackbar.make(view, "Not yet implemented Order functionality", Snackbar.LENGTH_LONG)
            .setAction("Action") {
            }
            .show()
    }
}