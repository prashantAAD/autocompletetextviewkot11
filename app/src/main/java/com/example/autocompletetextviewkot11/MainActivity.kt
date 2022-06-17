package com.example.autocompletetextviewkot11

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val at=findViewById<AutoCompleteTextView>(R.id.auto)
        val fruitsArray= arrayOf("Apple","mango","kiwi","berry","peach","banana","fig","strawberry","plum","raspberry","watermelon","blackberry","guava","grapes","pineapple","coconut","pear","papaya","apricot","avocado","cranberry","gooseberry","pineberry","star fruit","lime","date","passion fruit","dragon fruit")
        val arrayAdapter=ArrayAdapter(this@MainActivity,android.R.layout.simple_list_item_1,fruitsArray)
        at.setAdapter(arrayAdapter)
    }
}