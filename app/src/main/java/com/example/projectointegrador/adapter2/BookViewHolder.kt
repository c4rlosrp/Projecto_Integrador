package com.example.projectointegrador.adapter2


import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.projectointegrador.Books
import com.example.projectointegrador.R
import com.example.projectointegrador.SuperHero

class BookViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    val nameBook = view.findViewById<TextView>(R.id.tvBookName)
    val authorName = view.findViewById<TextView>(R.id.tvAuthorName)
    val volumen = view.findViewById<TextView>(R.id.tvNumVolumen)
    val photo = view.findViewById<ImageView>(R.id.ivBooks)


    fun render(bookModel: Books) {
        nameBook.text = bookModel.book
        authorName.text = bookModel.author
        volumen.text = bookModel.volume
        Glide.with(photo.context).load(bookModel.photo).into(photo)
    }
}