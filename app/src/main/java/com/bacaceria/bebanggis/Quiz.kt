package com.bacaceria.bebanggis

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.bacaceria.bebanggis.databinding.ActivityQuizBinding

class Quiz : AppCompatActivity() {
    lateinit var binding: ActivityQuizBinding

    lateinit var dialog : Dialog
    lateinit var buttonYes : Button
    lateinit var buttonNo : Button
    lateinit var buttonX : ImageButton

    var questions = arrayOf(
        "1. Apa bahasa inggrisnya merah?",
        "2. Bahasa inggrisnya kucing adalah?",
        "3. Penulisan yang benar dari wortel dalam bahasa inggris adalah?",
        "4. \"Yellow\" dan \"red\" bila dicampur akan menghasilkan warna?",
        "5. Penulisan yang benar adalah?",
        "6. Warna hijau merupakan campuran dari warna?",
        "7. Buah dalam bahasa inggris yang berawalan huruf A adalah?",
        "8. Dalam bahasa inggris, bunga matahari berwarna?",
        "9. Dalam bahasa inggris, sayur sayuran biasanya berwarna?",
        "10. Bahasa inggrisnya ungu adalah?",
        "11. Cabbage dalam bahasa indonesia artinya?",
        "12. Warna apa saja yang ada dimiliki oleh Zebra?",
        "13. Car dalam bahasa indonesia memiliki arti?",
        "14. Warna dari bendera Indonesia adalah?",
        "15. Bahasa indonesianya dolphin adalah?"
    )
    var answers = arrayOf(
        "Red",
        "Cat",
        "Carrot",
        "Orange",
        "Xylophone",
        "Blue and Yellow",
        "Apple",
        "Yellow",
        "Green",
        "Purple",
        "Kol",
        "White and Black",
        "Mobil",
        "Red and White",
        "Lumba - lumba"
    )
    var opt = arrayOf(
        "Red", "Black", "Pink", "Orange",
        "Dinosaur", "Eagle", "Dog", "Cat",
        "Carrot", "Caarot", "Carot", "Caroot",
        "Green", "Black", "Brown", "Orange",
        "Xylophone", "Xilophone", "Xilofone", "Xylofone",
        "White and Blue", "Blue and Red", "Blue and Yellow", "Yellow and Red",
        "Mango", "Carrot", "Banana", "Apple",
        "Yellow", "Black", "Red", "White",
        "Red", "Yellow", "Green", "White",
        "Blue", "Yellow", "Red", "Purple",
        "Kol", "Wortel", "Buncis", "Brokoli",
        "White and Black", "Black and Red", "Black and Grey", "White and Blue",
        "Mobil", "Motor", "Pesawat", "Perahu",
        "Blue and Red", "Red and Black", "White and Blue", "Red and White",
        "Kucing", "Lumba - lumba", "Jerapah", "Gajah"
    )

    var flag = 0
    var marks : Int = 0
    var correct : Int = 0
    var ans : String = ""
    var no = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)

        dialog = Dialog(this)

        val level = intent.getStringExtra("Level").toString()
        if (level == "1"){
            binding.nomorlevel.text = "/5"
        }
        else if (level == "2"){
            binding.nomorlevel.text = "/10"
        }
        else {
            binding.nomorlevel.text = "/15"
        }
        binding.textView7.text = no.toString()

        binding.soal.text = questions[flag]
        binding.optionA.text = opt[0]
        binding.optionB.text = opt[1]
        binding.optionC.text = opt[2]
        binding.optionD.text = opt[3]

        binding.buttonjawabA.setOnClickListener {
            ans = binding.optionA.text.toString()
            binding.buttona.setBackgroundResource(R.drawable.circlegreen)
            binding.buttona.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
//
            binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonb.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonc.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttond.setBackgroundResource(R.drawable.circlepurple)
            binding.buttond.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
        binding.buttonjawabB.setOnClickListener {
            ans = binding.optionB.text.toString()

            binding.buttonb.setBackgroundResource(R.drawable.circlegreen)
            binding.buttonb.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
//
            binding.buttona.setBackgroundResource(R.drawable.circlepurple)
            binding.buttona.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonc.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttond.setBackgroundResource(R.drawable.circlepurple)
            binding.buttond.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
        binding.buttonjawabC.setOnClickListener {
            ans = binding.optionC.text.toString()

            binding.buttonc.setBackgroundResource(R.drawable.circlegreen)
            binding.buttonc.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
//
            binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonb.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttona.setBackgroundResource(R.drawable.circlepurple)
            binding.buttona.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttond.setBackgroundResource(R.drawable.circlepurple)
            binding.buttond.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
        binding.buttonjawabD.setOnClickListener {
            ans = binding.optionD.text.toString()

            binding.buttond.setBackgroundResource(R.drawable.circlegreen)
            binding.buttond.setTextColor(ContextCompat.getColor(this, R.color.colorPrimaryDark))
//
            binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonb.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
            binding.buttonc.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttona.setBackgroundResource(R.drawable.circlepurple)
            binding.buttona.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonback.setOnClickListener {
            onBackPressed()
        }

        binding.next.setOnClickListener {
            if (ans == ""){
                Toast.makeText(this, "SELECT ONE BUTTON", Toast.LENGTH_SHORT).show()
            }
            else if (ans == answers[flag]){
                correct = correct+1
            }

            if (ans != ""){
                flag++
                ans = ""
                if (level == "1" && flag == 5){
                    marks = correct*20
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("nilai",marks)
                    intent.putExtra("level", "1")
                    startActivity(intent)
                    finish()
                }
                else if (level == "2" && flag == 10){
                    marks = correct*10
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("nilai",marks)
                    intent.putExtra("level", "2")
                    startActivity(intent)
                    finish()
                }
                else if (level== "3" && flag == 15){
                    marks = (correct*6) + 10
                    val intent = Intent(this, Result::class.java)
                    intent.putExtra("nilai",marks)
                    intent.putExtra("level", "3")
                    startActivity(intent)
                    finish()
                } else {
                    binding.soal.text = questions[flag]
                    binding.optionA.text = opt[flag*4]
                    binding.optionB.text = opt[flag*4+1]
                    binding.optionC.text = opt[flag*4+2]
                    binding.optionD.text = opt[flag*4+3]
                    binding.textView7.text = no++.toString()
                    binding.buttona.setBackgroundResource(R.drawable.circlepurple)
                    binding.buttona.setTextColor(ContextCompat.getColor(this, R.color.white))

                    binding.buttonb.setBackgroundResource(R.drawable.circlepurple)
                    binding.buttonb.setTextColor(ContextCompat.getColor(this, R.color.white))

                    binding.buttonc.setBackgroundResource(R.drawable.circlepurple)
                    binding.buttonc.setTextColor(ContextCompat.getColor(this, R.color.white))

                    binding.buttond.setBackgroundResource(R.drawable.circlepurple)
                    binding.buttond.setTextColor(ContextCompat.getColor(this, R.color.white))
                }
            }
        }

    }

    override fun onBackPressed() {
        dialog.setContentView(R.layout.alertdialog)
        buttonYes = dialog.findViewById(R.id.button_ya)
        buttonNo = dialog.findViewById(R.id.button_tidak)
        buttonX = dialog.findViewById(R.id.button_x)
        buttonYes.setOnClickListener {
            super.onBackPressed()
            finish()
        }
        buttonNo.setOnClickListener {
            dialog.dismiss()
        }
        buttonX.setOnClickListener {
            dialog.dismiss()
        }
        dialog.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.show()
    }


}