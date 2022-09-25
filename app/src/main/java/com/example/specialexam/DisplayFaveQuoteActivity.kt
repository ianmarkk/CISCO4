package com.example.specialexam

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.specialexam.databinding.ActivityDisplayFaveQuoteBinding

class DisplayFaveQuoteActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding : ActivityDisplayFaveQuoteBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayFaveQuoteBinding.inflate(layoutInflater)
        setContentView(binding.root)
        sharedPreferences = getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)

        val faveQuoteString = sharedPreferences.getString(FAVORITE_QUOTE,"Fave Quote")
        val timestamp = sharedPreferences.getString(TIMESTAMP,"Time Saved")

        binding.txtFavoriteQuote.text = faveQuoteString.toString()
        binding.txtTimeStamp.text = timestamp.toString()
        binding.btnRemoveFave.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        sharedPreferences.edit().clear().apply()
        finish()
    }
}