package chandan.prasad.kapplicationfizzbuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input = findViewById<EditText>(R.id.inputUI)
        val operate = findViewById<Button>(R.id.button)
        val result = findViewById<TextView>(R.id.result)
        operate.setOnClickListener(View.OnClickListener {
            val inputnumVal: String = input.text.toString()
            //Example for Toast
            val msg: Toast = Toast.makeText(this, inputnumVal, Toast.LENGTH_SHORT)
            msg.show()
            result.clearComposingText()
            val x: Int = inputnumVal.toInt()
            if (x % 3 == 0 && x % 5 == 0) {
                val resultTextVal: String = "FIZZ BUZZ"
                displayResult(resultTextVal)
                //Seting text to textview
                result.text = resultTextVal
            } else if (x % 5 == 0) {
                val resultTextVal: String = " BUZZ"
                displayResult(resultTextVal)
                result.text = resultTextVal
            } else if (x % 3 == 0) {
                val resultTextVal: String = "FIZZ"
                displayResult(resultTextVal)
                result.text = resultTextVal
            }
            else
            {
                val resultTextVal: String = "NOT FIZZ BUZZ"
                displayResult(resultTextVal)
                result.text = resultTextVal
            }
        })

    }
//Alert Dialog example
    private fun displayResult(resultTextVal: String) {
        val alt: AlertDialog.Builder = AlertDialog.Builder(this)
        alt.setTitle("Result")
        alt.setMessage(resultTextVal)
        alt.setCancelable(true)
        alt.show()
    }
}