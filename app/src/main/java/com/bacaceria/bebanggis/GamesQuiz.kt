package com.bacaceria.bebanggis

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.bacaceria.bebanggis.databinding.ActivityGamesQuizBinding

class GamesQuiz : AppCompatActivity() {
    lateinit var binding: ActivityGamesQuizBinding

    private lateinit var popup : Dialog
    private lateinit var popupbutton : ImageButton
    private lateinit var popuptext : TextView

    var level : String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_quiz)

        val binding = ActivityGamesQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popup = Dialog(this)

        binding.buttonback.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.buttonHelp.setOnClickListener() {
            popup.setContentView(R.layout.helpdialog)
            popupbutton= popup.findViewById(R.id.button_xhelp)
            popuptext= popup.findViewById(R.id.help)
            popuptext.text = "Pilih jumlah soal yang kamu inginkan"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

        binding.button.setOnClickListener {
            level = "1"
            binding.button.setBackgroundResource(R.drawable.circlegreen)
            binding.button.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))

            binding.button2.setTextColor(ContextCompat.getColor(this, R.color.white))
            binding.button3.setTextColor(ContextCompat.getColor(this, R.color.white))
            binding.button2.setBackgroundResource(R.drawable.circlepurple)
            binding.button3.setBackgroundResource(R.drawable.circlepurple)
        }

        binding.button2.setOnClickListener {
            level = "2"
            binding.button2.setBackgroundResource(R.drawable.circlegreen)
            binding.button2.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))

            binding.button.setTextColor(ContextCompat.getColor(this, R.color.white))
            binding.button3.setTextColor(ContextCompat.getColor(this, R.color.white))
            binding.button.setBackgroundResource(R.drawable.circlepurple)
            binding.button3.setBackgroundResource(R.drawable.circlepurple)
        }

        binding.button3.setOnClickListener {
            level = "3"
            binding.button3.setBackgroundResource(R.drawable.circlegreen)
            binding.button3.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))

            binding.button.setTextColor(ContextCompat.getColor(this, R.color.white))
            binding.button2.setTextColor(ContextCompat.getColor(this, R.color.white))
            binding.button2.setBackgroundResource(R.drawable.circlepurple)
            binding.button.setBackgroundResource(R.drawable.circlepurple)
        }

        binding.mulai.setOnClickListener {
            when (level) {
                "" -> {
                    Toast.makeText(this, "Pilih salah satu level!", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    binding.button3.setBackgroundResource(R.drawable.circlepurple)
                    binding.button3.setTextColor(ContextCompat.getColor(this, R.color.white))
                    binding.button.setTextColor(ContextCompat.getColor(this, R.color.white))
                    binding.button2.setTextColor(ContextCompat.getColor(this, R.color.white))
                    binding.button2.setBackgroundResource(R.drawable.circlepurple)
                    binding.button.setBackgroundResource(R.drawable.circlepurple)
                    val intent = Intent(this, Quiz::class.java)
                    intent.putExtra("Level", level)
                    startActivity(intent)
                }
            }
        }
    }
}
