package vizcarra.leobardo.guessthenumber

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    var minValue=0
    var maxValue=0
    var num:Int=0
    var won=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //instancia al objeto del layout guessings
        val guessing: TextView=findViewById(R.id.guessings)
        val down: Button=findViewById(R.id.down)
        val up:Button=findViewById(R.id.up)
        val generate:Button=findViewById(R.id.generate)
        val guessed:Button=findViewById(R.id.guessed)

        //
        generate.setOnClickListener{


        }

        //
    }

}