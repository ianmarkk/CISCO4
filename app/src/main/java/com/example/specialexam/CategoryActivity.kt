package com.example.specialexam

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.specialexam.databinding.ActivityCategoryBinding


class CategoryActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding : ActivityCategoryBinding
    private lateinit var sharedPreferences: SharedPreferences
    private var faveQuote = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        sharedPreferences = getSharedPreferences(PREFERENCE_NAME, MODE_PRIVATE)

        setContentView(binding.root)
        supportActionBar?.hide()

        faveQuote = sharedPreferences.getString(FAVORITE_QUOTE,"isEmpty").toString()
        isFaveEmpty(faveQuote)

        binding.btnLyricsQuotes.setOnClickListener(this)
        binding.btnMovieQuotes.setOnClickListener(this)
        binding.btnSadQuote.setOnClickListener(this)
        binding.btnFaveQuote.setOnClickListener(this)
    }

    override fun onResume() {
        super.onResume()
        faveQuote = sharedPreferences.getString(FAVORITE_QUOTE,"isEmpty").toString()
        isFaveEmpty(faveQuote)
    }

    private fun isFaveEmpty(faveQuoteStr:String){
       binding.btnFaveQuote.isEnabled = faveQuoteStr != "isEmpty"
    }

    override fun onClick(p0: View?) {
        when (p0!!.id){
            (R.id.btnSadQuote) -> {
                val intent = Intent(this, DisplayQuoteActivity::class.java)
                intent.putExtra(CATEGORY,1)
                startActivity(intent)
            }

            (R.id.btnLyricsQuotes) -> {
                val intent = Intent(this, DisplayQuoteActivity::class.java)
                intent.putExtra(CATEGORY,2)
                startActivity(intent)
            }

            (R.id.btnMovieQuotes) -> {
                val intent = Intent(this, DisplayQuoteActivity::class.java)
                intent.putExtra(CATEGORY,3)
                startActivity(intent)
            }

            (R.id.btnFaveQuote) -> {
                val intent = Intent(this, DisplayFaveQuoteActivity::class.java)
                startActivity(intent)
            }

        }
    }
}