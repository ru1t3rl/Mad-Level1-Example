package tech.tucano.madlevel1example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import tech.tucano.madlevel1example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnConfirm.setOnClickListener{
            checkAnswer()
        }
    }

    private fun checkAnswer(){
        val ans = binding.etAnswer.text.toString()

        if (ans == getString(R.string.giraffe)){
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
        }
    }
}