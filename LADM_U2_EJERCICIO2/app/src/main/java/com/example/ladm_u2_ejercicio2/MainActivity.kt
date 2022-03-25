package com.example.ladm_u2_ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hi = Hilo(findViewById(R.id.Txt))
        findViewById<Button>(R.id.buttonIzq)!!.setOnClickListener{ SetUp() }
    }
    var f=1
    private fun cambio(inp:Int)
    {
        val va= when(inp)
        {
            1->R.drawable.carta1
            2->R.drawable.carta2
            3->R.drawable.carta3
            4->R.drawable.carta4
            5->R.drawable.carta5
            6->R.drawable.carta6
            7->R.drawable.carta7
            8->R.drawable.carta8
            9->R.drawable.carta9
            10->R.drawable.carta10
            11->R.drawable.carta11
            12->R.drawable.carta12
            13->R.drawable.carta13
            14->R.drawable.carta14
            15->R.drawable.carta15
            16->R.drawable.carta16
            17->R.drawable.carta17
            18->R.drawable.carta18
            19->R.drawable.carta19
            20->R.drawable.carta20
            21->R.drawable.carta21
            22->R.drawable.carta22
            23->R.drawable.carta23
            24->R.drawable.carta24
            25->R.drawable.carta25
            26->R.drawable.carta26
            27->R.drawable.carta27
            28->R.drawable.carta28
            29->R.drawable.carta29
            30->R.drawable.carta30
            31->R.drawable.carta31
            32->R.drawable.carta32
            33->R.drawable.carta33
            34->R.drawable.carta34
            35->R.drawable.carta35
            36->R.drawable.carta36
            37->R.drawable.carta37
            38->R.drawable.carta38
            39->R.drawable.carta39
            40->R.drawable.carta40
            41->R.drawable.carta41
            42->R.drawable.carta42
            43->R.drawable.carta43
            44->R.drawable.carta44
            45->R.drawable.carta45
            46->R.drawable.carta46
            47->R.drawable.carta47
            48->R.drawable.carta48
            49->R.drawable.carta49
            50->R.drawable.carta50
            51->R.drawable.carta51
            52->R.drawable.carta52
            53->R.drawable.carta53
            54->R.drawable.carta54
            else->R.drawable.ic_launcher_background
        }
        findViewById<ImageView>(R.id.imageView).setImageResource(va)
    }
    lateinit var hi: Hilo
    private fun SetUp() {
        GlobalScope.launch(Dispatchers.Main) {

            var arnu: Array<Int> = Array(54, { i -> i + 1 })
            f = 0
            arnu.shuffle()
            findViewById<ImageView>(R.id.imageView)!!.setOnClickListener { cambio(arnu[f++]) }


            //hi.kill()
            delay(200)
            hi.start()
            cambio(f++)
        }
    }
}
//Segunda Clase
class Hilo(Bton: TextView) :Thread()
{
    fun kill()
    {
        bol=false
    }
    var bol=true
    var seg=0
    var min=0
    var hor=0
    var sndTicket=Bton;
    override fun run()
    {
        super.run()
        while(hor<24&&bol)
        {
            if(seg>=60){seg=0;min++}
            if(min>=60){min=0;hor++}
            sndTicket.text = "${hor}:${min}:${seg++}"
            sleep(1000)
        }
        bol=true
        seg=0
        seg=0
        min=0
        hor=0
    }
}
