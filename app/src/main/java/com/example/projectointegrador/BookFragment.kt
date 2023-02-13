package com.example.projectointegrador

import android.annotation.SuppressLint
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.FileProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectointegrador.adapter.SuperHeroAdapter
import java.io.File

class BookFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false)
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
