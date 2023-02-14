package com.example.projectointegrador.adapter2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projectointegrador.Books
import com.example.projectointegrador.R
import com.example.projectointegrador.SuperHero

 class BookAdapter(private var bookList:List<Books>) : RecyclerView.Adapter<BookViewHolder>(){

     override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
         val item = bookList[position]
         holder.render(item)
     }

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookViewHolder {
         val layoutInflater = LayoutInflater.from(parent.context)
         return BookViewHolder(layoutInflater.inflate(R.layout.item_libros, parent, false))

     }
     override fun getItemCount(): Int = bookList.size

     fun setFilteredList(bookList: List<Books>){
         this.bookList = bookList
         notifyDataSetChanged()
     }
 }

