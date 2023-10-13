package com.example.lateralmenu

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import com.example.lateralmenu.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            toggle = ActionBarDrawerToggle(this@MainActivity, drawerLayout, R.string.open, R.string.close)
            drawerLayout.addDrawerListener(toggle)
            toggle.syncState()

            supportActionBar?.setDisplayHomeAsUpEnabled(true)

            navView.setNavigationItemSelectedListener {
                when (it.itemId) {
                    R.id.home -> {
                        Toast.makeText(this@MainActivity, "First Item Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.settings -> {
                        Toast.makeText(this@MainActivity, "Second Item Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.share -> {
                        Toast.makeText(this@MainActivity, "third Item Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.about -> {
                        Toast.makeText(this@MainActivity, "third Item Clicked", Toast.LENGTH_SHORT).show()
                    }
                    R.id.logout -> {
                        Toast.makeText(this@MainActivity, "third Item Clicked", Toast.LENGTH_SHORT).show()
                    }


                }
                true
            }

        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            true
        }
        return super.onOptionsItemSelected(item)
    }
}