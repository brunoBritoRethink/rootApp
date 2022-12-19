package com.example.rootapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.rootapp.databinding.ActivityMainBinding
import com.example.rootapp.utils.RootUtil

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private var rooted: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        //Segue abaixo Metodo 01
        //Via classe RootUtil
        rooted = RootUtil.isDeviceRooted()

        //Segue abaixo Metodo 02
        //link do github da biblioteca utilizada: https://github.com/scottyab/rootbeer
        //rooted = RootBeer(this).isRooted


        //Segue abaixo Metodo 03
        //esse eu não consegui implementar pois ele possui mais exigencias e atua do lado do servidor da google
        //Link do github da biblioteca: https://github.com/scottyab/safetynethelper


        //Abaixo apenas vou chamar a função para mudar o textView
        checkRoot(rooted)
    }

    private fun checkRoot(isRooted: Boolean){
        if (isRooted){
            binding.checkRoot.text = "Possui root"
        } else {
            binding.checkRoot.text = "Não contem root"
        }
    }
}