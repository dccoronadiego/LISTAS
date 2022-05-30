package com.example.listas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listas.modelo.Personaje

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val listaPersonaje = ArrayList<Personaje>()

        listaPersonaje.add(Personaje("Blender", "https://purepng.com/public/uploads/large/purepng.com-futurama-benderfuturamaanimated-sciencefictionsitcomcartoonfuturama-benderbender-17015285478607nfr5.png"))
        listaPersonaje.add(Personaje("Homero", "https://www.elimparcial.com/__export/1589305546381/sites/elimparcial/img/2020/05/12/hrehey_2.png_851672003.png"))
        listaPersonaje.add(Personaje("Flash", "https://www.gratistodo.com/wp-content/uploads/2016/07/fondo-the-flash-barry-allen-serie-tv-800x419.jpg"))
        listaPersonaje.add(Personaje("Spiderman", "https://pngimg.com/uploads/spider_man/spider_man_PNG3.png"))
        listaPersonaje.add(Personaje("Batman", "https://pngimg.com/uploads/batman/batman_PNG34.png"))
        listaPersonaje.add(Personaje("Supergirl", "https://pngimg.com/uploads/supergirl/supergirl_PNG47.png"))


    }
}