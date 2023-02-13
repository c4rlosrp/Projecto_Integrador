package com.example.projectointegrador

import android.Manifest
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.projectointegrador.adapter.SuperHeroAdapter
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottom_navigation_view = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        bottom_navigation_view.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.action_book -> {
                    goToFragment(BookFragment())
                    true
                }
                R.id.action_search -> {
                    goToFragment(SearchFragment())
                    true
                }
                R.id.action_user -> {
                    goToFragment(UserFragment())
                    true
                }
                else -> false
            }
        }
        bottom_navigation_view.selectedItemId = R.id.action_book

    }

    fun goToFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.mainContainer, fragment).commit()
    }


}