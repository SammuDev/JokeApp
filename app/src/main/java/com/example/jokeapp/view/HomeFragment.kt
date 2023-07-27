package com.example.jokeapp.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.jokeapp.R
import com.example.jokeapp.model.Category

class HomeFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    @SuppressLint("NotifyDataSetChanged")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val categoryItemsList = mutableListOf<Category>()

        categoryItemsList.add(Category("Categoria 1", "0xffface6e"))
        categoryItemsList.add(Category("Categoria 2", "0xffecd16d"))
        categoryItemsList.add(Category("Categoria 3", "0xffded36e"))
        categoryItemsList.add(Category("Categoria 4", "0xffcfd571"))

        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerView_main)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = CategoryItem(categoryItemsList)
        recyclerView.adapter = adapter

        adapter.notifyDataSetChanged()
    }
}
