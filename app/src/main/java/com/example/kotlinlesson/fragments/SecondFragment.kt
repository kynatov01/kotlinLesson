package com.example.kotlinlesson.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

import com.example.kotlinlesson.R

class SecondFragment : Fragment() {

    private val admin = "admin"
    lateinit var edText: EditText
    lateinit var btn: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn = view.findViewById(R.id.btn_to_textfragment)
        edText = view.findViewById(R.id.search_edit_frame)
        click()
    }

    private fun click() {
        btn.setOnClickListener(View.OnClickListener {

            val text = edText.text.toString().trim()

            if (!text.equals(admin)){
                edText.setError("Не Правильные Данные")
            }else {
                parentFragmentManager.beginTransaction()
                    .replace(R.id.container_view, NameFragment())
                    .addToBackStack("SecondFragment")
                    .commit()
            }
        })
    }
}