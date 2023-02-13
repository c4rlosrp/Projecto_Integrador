package com.example.projectointegrador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectointegrador.adapter.SuperHeroAdapter
import com.squareup.picasso.Picasso

class SearchFragment : Fragment() {
    private lateinit var imagen:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_search, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerSuperHero)
        recyclerView?.layoutManager = LinearLayoutManager(requireContext())
        recyclerView?.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList)
    }

}