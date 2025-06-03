package com.dinocode.memorama1

import android.graphics.Color
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //<editor-fold desc="IMAGENES GUI">

    lateinit var iv_11: ImageView
    lateinit var iv_12: ImageView
    lateinit var iv_13: ImageView
    lateinit var iv_14: ImageView

    lateinit var iv_21: ImageView
    lateinit var iv_22: ImageView
    lateinit var iv_23: ImageView
    lateinit var iv_24: ImageView

    lateinit var iv_31: ImageView
    lateinit var iv_32: ImageView
    lateinit var iv_33: ImageView
    lateinit var iv_34: ImageView


    //</editor-fold>

    //<editor-fold desc="OTROS GUI">

    lateinit var tv_j1:TextView
    lateinit var tv_j2:TextView


    lateinit var mp: MediaPlayer
    lateinit var mpFondo: MediaPlayer

    lateinit var imagen1: ImageView
    lateinit var imagen2: ImageView

    //</editor-fold>

    //<editor-fold desc="VARIABLES">

        var imagenesArray = arrayOf(11,12,13,14,15,16,21,22,23,24,25,26)

        var abuelo = 0
        var calamardo = 0
        var fry = 0
        var lucas = 0
        var mascota = 0
        var misa = 0

        var turno = 1
        var puntosj1 = 0
        var puntosj2 = 0
        var numeroImagen = 1
        var escuchar = true

    //</editor-fold> GUI






    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        enlazarGUI()

    }

    private fun enlazarGUI() {
        iv_11 = findViewById(R.id.iv_12)
        iv_12 = findViewById(R.id.iv_13)
        iv_13 = findViewById(R.id.iv_14)
        iv_14 = findViewById(R.id.iv_11)

        iv_21 = findViewById(R.id.iv_21)
        iv_22 = findViewById(R.id.iv_22)
        iv_23 = findViewById(R.id.iv_23)
        iv_24 = findViewById(R.id.iv_24)

        iv_31 = findViewById(R.id.iv_31)
        iv_32 = findViewById(R.id.iv_32)
        iv_33 = findViewById(R.id.iv_33)
        iv_34 = findViewById(R.id.iv_34)


        iv_11.tag = "0"
        iv_12.tag = "1"
        iv_13.tag = "2"
        iv_14.tag = "3"
        iv_21.tag = "4"
        iv_22.tag = "5"
        iv_23.tag = "6"
        iv_24.tag = "7"
        iv_31.tag = "8"
        iv_32.tag = "9"
        iv_33.tag = "10"
        iv_34.tag = "11"


        abuelo = R.drawable.abuelo
        calamardo = R.drawable.calamardo
        fry = R.drawable.fry
        lucas = R.drawable.lucas
        mascota = R.drawable.mascota
        misa = R.drawable.misa

        imagenesArray.shuffle()
        tv_j1 = findViewById(R.id.tv_j1)
        tv_j2 = findViewById(R.id.tv_j2)

        tv_j2.setTextColor(Color.GRAY)
        tv_j1.setTextColor(Color.WHITE)


        var abuelo = 0
        var calamardo = 0
        var fry = 0
        var lucas = 0
        var mascota = 0
        var misa = 0



    }

    fun seleccionar(imagen:View){
        var tag = imagen.tag.toString().toInt()
        verificar(imagen)
    }

    private fun verificar(imagen: View) {
        var iv = (imagen as ImageView)
        var tag = imagen.tag.toString().toInt()
        if(imagenesArray[tag]==11){
            iv.setImageResource(abuelo)
        }else if (imagenesArray[tag]==12){
            iv.setImageResource(calamardo)
        }else if (imagenesArray[tag]==13){
            iv.setImageResource(fry)
        }else if (imagenesArray[tag]==14){
            iv.setImageResource(lucas)
        }else if (imagenesArray[tag]==15){
            iv.setImageResource(mascota)
        }else if (imagenesArray[tag]==16){
            iv.setImageResource(misa)
        }else if (imagenesArray[tag]==21) {
            iv.setImageResource(abuelo)
        }else if (imagenesArray[tag]==22) {
            iv.setImageResource(calamardo)
        }else if (imagenesArray[tag]==23) {
            iv.setImageResource(fry)
        }else if (imagenesArray[tag]==24) {
            iv.setImageResource(lucas)
        }else if (imagenesArray[tag]==25) {
            iv.setImageResource(mascota)
        }else if (imagenesArray[tag]==26) {
            iv.setImageResource(misa)
        }
        // guardar temp imagen seleccionar
        if(numeroImagen==1){
            imagen1 = iv
            numeroImagen = 2
            iv.isEnabled = false
        }else if(numeroImagen==2) {
            imagen2 = iv
            numeroImagen = 1
            iv.isEnabled = false

            desahabilitarImagenes()
            val h = Handler(Looper.getMainLooper())
            h.postDelayed({sonImagenesIguales()}, 1000)
        }



    }

    private fun sonImagenesIguales() {

    }

    private fun desahabilitarImagenes() {
        iv_11.isEnabled = false
        iv_12.isEnabled = false
        iv_13.isEnabled = false
        iv_14.isEnabled = false
        iv_21.isEnabled = false
        iv_22.isEnabled = false
        iv_23.isEnabled = false
        iv_24.isEnabled = false
        iv_31.isEnabled = false
        iv_32.isEnabled = false
        iv_33.isEnabled = false
        iv_34.isEnabled = false

    }
}