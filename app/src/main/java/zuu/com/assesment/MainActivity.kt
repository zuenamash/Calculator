package zuu.com.assesment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    lateinit var tilInputOne:TextInputLayout
    lateinit var tieInputOne:TextInputEditText
    lateinit var tilInputTwo:TextInputLayout
    lateinit var tieInputTwo:TextInputEditText
    lateinit var btnAdd:Button
    lateinit var btnSubtract:Button
    lateinit var btnModulus:Button
    lateinit var btnDivide:Button
    lateinit var tvOutput:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tilInputOne=findViewById(R.id.tilInputOne)
        tieInputOne=findViewById(R.id.tieInputOne)
        tilInputTwo=findViewById(R.id.tilInputTwo)
        tieInputTwo=findViewById(R.id.tieInputTwo)
        btnAdd=findViewById(R.id.btnAdd)
        btnDivide=findViewById(R.id.btnDivide)
        btnModulus=findViewById(R.id.btnModulus)
        btnSubtract=findViewById(R.id.BtnSubtract)
        tvOutput=findViewById(R.id.tvOutput)

        btnAdd.setOnClickListener {
            var x = tieInputOne.text.toString().toInt()
            var y= tieInputTwo.text.toString().toInt()
            calculateAddition(x,y)
            validateCalculations()

        }
        btnSubtract.setOnClickListener {
            var x = tieInputOne.text.toString().toInt()
            var y = tieInputTwo.text.toString().toInt()
            calculateSubtraction(x,y)
            validateCalculations()
        }
        btnDivide.setOnClickListener {
            var x = tieInputOne.text.toString().toInt()
            var y = tieInputTwo.text.toString().toInt()
            calculateDivide(x,y)
            validateCalculations()
        }
        btnModulus.setOnClickListener {
            var x = tieInputOne.text.toString().toInt()
            var y = tieInputTwo.text.toString().toInt()
            calculateModulus(x,y)
            validateCalculations()

    }}
        fun calculateAddition(Number1: Int, Number2: Int) {
            var addition = Number1 + Number2
            tvOutput.text = addition.toString()
        }

        fun calculateSubtraction(Number1: Int, Number2: Int) {
            var subtract  = Number1 - Number2
            tvOutput.text = subtract.toString()
        }

        fun calculateDivide(Number1: Int, Number2: Int) {
            var multiple = Number1 / Number2
            tvOutput.text = multiple.toString()
        }

        fun calculateModulus(Number1: Int, Number2: Int) {
            var modulus = Number1 % Number2
            tvOutput.text = modulus.toString()

        }
    fun validateCalculations() {

        var one = tieInputOne.text.toString()
        var two= tieInputTwo.text.toString()
        if (one.isBlank()) {
            tilInputOne.error = getString(R.string.number_is_required)
        }
        if (two.isBlank()) {
            tilInputTwo.error = getString(R.string.Input_num_required)
        }


    }}