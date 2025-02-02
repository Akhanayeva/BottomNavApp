package com.example.bottomnavapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {
    private var counter = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_counter, container, false)

        val textView = view.findViewById<TextView>(R.id.counterText)
        val button = view.findViewById<Button>(R.id.incrementButton)

        textView.text = counter.toString()

        button.setOnClickListener {
            counter++
            textView.text = counter.toString()
        }

        return view
    }
}
