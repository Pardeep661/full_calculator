package com.pardeep.acalculatorProject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pardeep.a15_06_2024_all_include_assignment.R
import com.pardeep.a15_06_2024_all_include_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     var binding : ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.buttonAc?.setOnClickListener(){
            binding?.textview1?.setText("")
            binding?.textview2?.setText("")
        }
        // zero button
        binding?.button0?.setOnClickListener(){
            binding?.textview1?.append("0")
        }
        // dot button
        binding?.button?.setOnClickListener{
            binding?.textview1?.append(".")
        }
        // one button
        binding?.button1?.setOnClickListener{
            binding?.textview1?.append("1")
        }
        binding?.button2?.setOnClickListener{
            binding?.textview1?.append("2")
        }
        binding?.button3?.setOnClickListener{
            binding?.textview1?.append("3")
        }
        binding?.button4?.setOnClickListener{
            binding?.textview1?.append("4")
        }
        binding?.button5?.setOnClickListener{
            binding?.textview1?.append("5")
        }
        binding?.button6?.setOnClickListener{
            binding?.textview1?.append("6")
        }
        binding?.button7?.setOnClickListener{
            binding?.textview1?.append("7")
        }
        binding?.button8?.setOnClickListener{
            binding?.textview1?.append("8")
        }
        binding?.button9?.setOnClickListener{
            binding?.textview1?.append("9")
        }
        binding?.buttonMul?.setOnClickListener{
            binding?.textview1?.append("*")
        }
        binding?.buttonSubs?.setOnClickListener{
            binding?.textview1?.append("-")
        }
        binding?.buttonDivide?.setOnClickListener{
            binding?.textview1?.append("/")
        }
        binding?.buttonAdd?.setOnClickListener{
            binding?.textview1?.append("+")
        }
        binding?.buttonOpenBracket?.setOnClickListener{
            binding?.textview1?.append("(")
        }
        binding?.buttonClosebracket?.setOnClickListener{
            binding?.textview1?.append(")")
        }
        binding?.buttonDelete?.setOnClickListener{
        }
        binding?.buttonEqual?.setOnClickListener {

        }


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}