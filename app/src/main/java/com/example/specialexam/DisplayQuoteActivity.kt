package com.example.specialexam

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.specialexam.databinding.ActivityDisplayQuoteBinding
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle


class DisplayQuoteActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityDisplayQuoteBinding
    private lateinit var sharedPreferences: SharedPreferences

    private var categoryNumber = -1
    private var quoteString = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

        categoryNumber = intent.getIntExtra(CATEGORY,1)
        quoteString = MainHelper.getRandomQuote(categoryNumber)
        binding.txtDisplayQuote.text = quoteString

        binding.btnRandomQuote.setOnClickListener(this)
        binding.btnFaveThis.setOnClickListener(this)
    }

    private fun getTimestamp(): String {
        val current = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
        return current.format(formatter)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            (R.id.btn_RandomQuote) -> {
                quoteString = MainHelper.getRandomQuote(categoryNumber)
                binding.txtDisplayQuote.text = quoteString
            }
            (R.id.btn_FaveThis) -> {
                val editor = sharedPreferences.edit()
                editor.putString(FAVORITE_QUOTE,quoteString)
                editor.putString(TIMESTAMP, getTimestamp())
                editor.apply()
                Toast.makeText(this,"Saved to Favorite Section!",Toast.LENGTH_SHORT).show()
            }
        }
    }
}