package com.bacaceria.bebanggis

import android.app.Dialog
import android.net.Uri
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    private lateinit var epicDialog: Dialog
    private lateinit var btnxPopUP: ImageButton
    private lateinit var btnLearnXGames: Button
    private lateinit var btnLearnXGames2: Button
    private lateinit var helptext: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        epicDialog = Dialog(this)

        buttonabout.setOnClickListener {
            val pindah = Intent(this, ActivityAbout::class.java)
            startActivity(pindah)
            overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
        }

        buttonlearn.setOnClickListener {
            epicDialog.setContentView(R.layout.learndialog)
            btnxPopUP = epicDialog.findViewById(R.id.button_xlearn)

            btnLearnXGames = epicDialog.findViewById(R.id.button_alfabeth)
            btnLearnXGames.setOnClickListener {
                val pindah = Intent(this, LearnAlfabeth::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnLearnXGames2 = epicDialog.findViewById(R.id.button_mixcolor)
            btnLearnXGames2.setOnClickListener {
                val pindah = Intent(this, LearnColor::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }

        button_help.setOnClickListener {
            epicDialog.setContentView(R.layout.helpdialog)
            btnxPopUP = epicDialog.findViewById(R.id.button_xhelp)
            helptext = epicDialog.findViewById(R.id.help)

            helptext.text = "klik tombol ini untuk membuka privacy policy"

            helptext.setOnClickListener {
                val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/bacaceriaid/home"))
                startActivity(browserIntent)
            }

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }

        buttongames.setOnClickListener {
            epicDialog.setContentView(R.layout.gamesdialog)
            btnxPopUP = epicDialog.findViewById(R.id.button_xgames)

            btnLearnXGames = epicDialog.findViewById(R.id.button_quiz)
            btnLearnXGames.setOnClickListener {
                val pindah = Intent(this, GamesQuiz::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnLearnXGames2 = epicDialog.findViewById(R.id.button_mixcolor)
            btnLearnXGames2.setOnClickListener {
                val pindah = Intent(this, GamesColor::class.java)
                epicDialog.dismiss()
                startActivity(pindah)
                overridePendingTransition(R.anim.slide_out_right, R.anim.slide_in_left)
            }

            btnxPopUP.setOnClickListener {
                epicDialog.dismiss()
            }
            epicDialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            epicDialog.show()
        }

        // Set OnClickListener for the new button to open the URL
        val buttonOpenUrl: Button = findViewById(R.id.button_open_url)
        buttonOpenUrl.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://sites.google.com/view/bacaceriaid/home"))
            startActivity(browserIntent)
        }
    }
}

