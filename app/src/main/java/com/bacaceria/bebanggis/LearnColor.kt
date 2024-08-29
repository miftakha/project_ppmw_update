package com.bacaceria.bebanggis

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import com.bacaceria.bebanggis.databinding.ActivityLearnColorBinding

class LearnColor : AppCompatActivity() {

    private lateinit var popup : Dialog
    private lateinit var popupbutton : ImageButton
    private lateinit var popuptext : TextView
    var color = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_color)

        val binding = ActivityLearnColorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popup = Dialog(this)

        binding.buttonback.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.cardView4.setOnClickListener {
            color = "Green"
            soundOn()
        }

        binding.red.setOnClickListener {
            color = "Red"
            soundOn()
        }

        binding.blue.setOnClickListener {
            color = "Blue"
            soundOn()
        }

        binding.yellow.setOnClickListener {
            color = "Yellow"
            soundOn()
        }

        binding.green.setOnClickListener {
            color = "Green"
            soundOn()
        }

        binding.kuaci.setOnClickListener {
            color = "Yellow"
            soundOn()
        }

        binding.imageView3.setOnClickListener {
            color = "Red"
            soundOn()
        }

        binding.imageView5.setOnClickListener {
            color = "Blue"
            soundOn()
        }

        binding.soundblue.setOnClickListener {
            color = "Blue"
            soundOn()
        }

        binding.soundgreen.setOnClickListener {
            color = "Green"
            soundOn()
        }

        binding.soundred.setOnClickListener {
            color = "Red"
            soundOn()
        }

        binding.soundyellow.setOnClickListener {
            color = "Yellow"
            soundOn()
        }

        binding.buttonHelp.setOnClickListener {
            popup.setContentView(R.layout.helpdialog)
            popupbutton= popup.findViewById(R.id.button_xhelp)
            popuptext= popup.findViewById(R.id.help)
            popuptext.text = "Tekan warna yang ingin dipilih untuk mendengarkan cara pelafalan warna dalam bahasa inggris beserta contoh gambar disampingnya"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

    }

    fun soundOn(){
        when (color) {
            "Blue" -> {
                val player = MediaPlayer.create(this, R.raw.blue)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
            "Red" -> {
                val player = MediaPlayer.create(this, R.raw.red)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
            "Green" -> {
                val player = MediaPlayer.create(this, R.raw.green)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else -> {
                val player = MediaPlayer.create(this, R.raw.yellow)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left)
    }
}
