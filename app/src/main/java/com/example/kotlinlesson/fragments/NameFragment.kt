package com.example.kotlinlesson.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinlesson.Adapters.NameAdapter
import com.example.kotlinlesson.Model.NameModel
import com.example.kotlinlesson.OnClick
import com.example.kotlinlesson.R
import com.example.kotlinlesson.Repository.NamesRepository

class NameFragment : Fragment(), OnClick {



    lateinit var rvText: RecyclerView
    private val textList = ArrayList<NameModel>()
    private val adapter = NameAdapter(textList, this)
    private val repo = NamesRepository()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_name, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rvText = view.findViewById(R.id.rv_names)
        val bundle = Bundle()


        initialize()
    }

    private fun initialize() {
        rvText.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        textList.addAll(repo.getListOfText())
        rvText.adapter = adapter
    }

    override fun OnClikItem(model: NameModel) {
//        val bundle = Bundle()
//        bundle.putSerializable(model.toString(), "item" )
//        val TextFragment = SecondFragment()
        parentFragmentManager.beginTransaction()
            .replace(R.id.container_view, SecondFragment())
            .addToBackStack(NameFragment::class.java.name)
            .commit()

    }

}