package com.bacaceria.bebanggis

import android.annotation.SuppressLint
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.bacaceria.bebanggis.databinding.ActivityLearnAlfabethBinding
class LearnAlfabeth : AppCompatActivity() {
    lateinit var binding: ActivityLearnAlfabethBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_alfabeth)

        val binding = ActivityLearnAlfabethBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonback.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.buttonA.setOnClickListener {
            binding.huruf.text = "Aa"
            binding.bahasaInggris.text = "Apple"
            binding.bahasaIndo.text = "Apel"
            binding.gambar.setImageResource(R.mipmap.a)
            val playera = MediaPlayer.create(this, R.raw.a)
            playera.start()
            playera.setOnCompletionListener {
                playera.release()
            }

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonB.setOnClickListener {
            binding.huruf.text = "Bb"
            binding.bahasaInggris.text = "Banana"
            binding.bahasaIndo.text = "Pisang"
            binding.gambar.setImageResource(R.mipmap.b)
            val playerb = MediaPlayer.create(this, R.raw.b)
            playerb.start()
            playerb.setOnCompletionListener {
                playerb.release()
            }

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonC.setOnClickListener {
            binding.huruf.text = "Cc"
            binding.bahasaInggris.text = "Cat"
            binding.bahasaIndo.text = "Kucing"
            binding.gambar.setImageResource(R.mipmap.c)
            val playerc = MediaPlayer.create(this, R.raw.c)
            playerc.start()
            playerc.setOnCompletionListener {
                playerc.release()
            }

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonD.setOnClickListener {
            binding.huruf.text = "Dd"
            binding.bahasaInggris.text = "Doctor"
            binding.bahasaIndo.text = "Doktor"
            binding.gambar.setImageResource(R.mipmap.d)
            val playerd = MediaPlayer.create(this, R.raw.d)
            playerd.start()
            playerd.setOnCompletionListener {
                playerd.release()
            }

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonE.setOnClickListener {
            binding.huruf.text = "Ee"
            binding.bahasaInggris.text = "Elephant"
            binding.bahasaIndo.text = "Gajah"
            binding.gambar.setImageResource(R.mipmap.e)
            val playere = MediaPlayer.create(this, R.raw.e)
            playere.start()
            playere.setOnCompletionListener {
                playere.release()
            }

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonF.setOnClickListener {
            binding.huruf.text = "Ff"
            binding.bahasaInggris.text = "Fire truck"
            binding.bahasaIndo.text = "Mobil pemadam kebakaran"
            binding.gambar.setImageResource(R.mipmap.f)
            val playerf = MediaPlayer.create(this, R.raw.f)
            playerf.start()
            playerf.setOnCompletionListener {
                playerf.release()
            }

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonG.setOnClickListener {
            binding.huruf.text = "Gg"
            binding.bahasaInggris.text = "Guitar"
            binding.bahasaIndo.text = "Gitar"
            binding.gambar.setImageResource(R.mipmap.g)
            val playerg = MediaPlayer.create(this, R.raw.g)
            playerg.start()
            playerg.setOnCompletionListener {
                playerg.release()
            }

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonH.setOnClickListener {
            binding.huruf.text = "Hh"
            binding.bahasaInggris.text = "Horse"
            binding.bahasaIndo.text = "Kuda"
            binding.gambar.setImageResource(R.mipmap.h)
            val playerh = MediaPlayer.create(this, R.raw.h)
            playerh.start()
            playerh.setOnCompletionListener {
                playerh.release()
            }

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonI.setOnClickListener {
            binding.huruf.text = "Ii"
            binding.bahasaInggris.text = "Ice cream"
            binding.bahasaIndo.text = "Es krim"
            binding.gambar.setImageResource(R.mipmap.i)
            val playeri = MediaPlayer.create(this, R.raw.i)
            playeri.start()
            playeri.setOnCompletionListener {
                playeri.release()
            }

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonJ.setOnClickListener {
            binding.huruf.text = "Jj"
            binding.bahasaInggris.text = "Jar"
            binding.bahasaIndo.text = "Toples"
            binding.gambar.setImageResource(R.mipmap.j)
            val playerj = MediaPlayer.create(this, R.raw.j)
            playerj.start()
            playerj.setOnCompletionListener {
                playerj.release()
            }

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonK.setOnClickListener {
            binding.huruf.text = "Kk"
            binding.bahasaInggris.text = "Kite"
            binding.bahasaIndo.text = "Layangan"
            binding.gambar.setImageResource(R.mipmap.k)
            val playerk = MediaPlayer.create(this, R.raw.k)
            playerk.start()
            playerk.setOnCompletionListener {
                playerk.release()
            }

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonL.setOnClickListener {
            binding.huruf.text = "Ll"
            binding.bahasaInggris.text = "Ladder"
            binding.bahasaIndo.text = "Tangga"
            binding.gambar.setImageResource(R.mipmap.l)
            val playerl = MediaPlayer.create(this, R.raw.l)
            playerl.start()
            playerl.setOnCompletionListener {
                playerl.release()
            }

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonM.setOnClickListener {
            binding.huruf.text = "Mm"
            binding.bahasaInggris.text = "Mango"
            binding.bahasaIndo.text = "Mangga"
            binding.gambar.setImageResource(R.mipmap.m)
            val playerm = MediaPlayer.create(this, R.raw.m)
            playerm.start()
            playerm.setOnCompletionListener {
                playerm.release()
            }

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonN.setOnClickListener {
            binding.huruf.text = "Nn"
            binding.bahasaInggris.text = "Nest"
            binding.bahasaIndo.text = "Sarang"
            binding.gambar.setImageResource(R.mipmap.n)
            val playern = MediaPlayer.create(this, R.raw.n)
            playern.start()
            playern.setOnCompletionListener {
                playern.release()
            }

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonO.setOnClickListener {
            binding.huruf.text = "Oo"
            binding.bahasaInggris.text = "Owl"
            binding.bahasaIndo.text = "Burung hantu"
            binding.gambar.setImageResource(R.mipmap.o)
            val playero = MediaPlayer.create(this, R.raw.o)
            playero.start()
            playero.setOnCompletionListener {
                playero.release()
            }

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonP.setOnClickListener {
            binding.huruf.text = "Pp"
            binding.bahasaInggris.text = "Panda"
            binding.bahasaIndo.text = "Panda"
            binding.gambar.setImageResource(R.mipmap.p)
            val playerp = MediaPlayer.create(this, R.raw.p)
            playerp.start()
            playerp.setOnCompletionListener {
                playerp.release()
            }

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonQ.setOnClickListener {
            binding.huruf.text = "Qq"
            binding.bahasaInggris.text = "Queen"
            binding.bahasaIndo.text = "Ratu"
            binding.gambar.setImageResource(R.mipmap.q)
            val playerq = MediaPlayer.create(this, R.raw.q)
            playerq.start()
            playerq.setOnCompletionListener {
                playerq.release()
            }

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonR.setOnClickListener {
            binding.huruf.text = "Rr"
            binding.bahasaInggris.text = "Rabbit"
            binding.bahasaIndo.text = "Kelinci"
            binding.gambar.setImageResource(R.mipmap.r)
            val playerr = MediaPlayer.create(this, R.raw.r)
            playerr.start()
            playerr.setOnCompletionListener {
                playerr.release()
            }

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonS.setOnClickListener {
            binding.huruf.text = "Ss"
            binding.bahasaInggris.text = "Socks"
            binding.bahasaIndo.text = "Kaus Kaki"
            binding.gambar.setImageResource(R.mipmap.s)
            val players = MediaPlayer.create(this, R.raw.s)
            players.start()
            players.setOnCompletionListener {
                players.release()
            }

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonT.setOnClickListener {
            binding.huruf.text = "Tt"
            binding.bahasaInggris.text = "Turtle"
            binding.bahasaIndo.text = "Kura - kura"
            binding.gambar.setImageResource(R.mipmap.t)
            val playert = MediaPlayer.create(this, R.raw.t)
            playert.start()
            playert.setOnCompletionListener {
                playert.release()
            }

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonU.setOnClickListener {
            binding.huruf.text = "Uu"
            binding.bahasaInggris.text = "Umbrella"
            binding.bahasaIndo.text = "Payung"
            binding.gambar.setImageResource(R.mipmap.u)
            val playeru = MediaPlayer.create(this, R.raw.u)
            playeru.start()
            playeru.setOnCompletionListener {
                playeru.release()
            }

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonV.setOnClickListener {
            binding.huruf.text = "Vv"
            binding.bahasaInggris.text = "Volleyball"
            binding.bahasaIndo.text = "Bola voli"
            binding.gambar.setImageResource(R.mipmap.v)
            val playerv = MediaPlayer.create(this, R.raw.v)
            playerv.start()
            playerv.setOnCompletionListener {
                playerv.release()
            }

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonW.setOnClickListener {
            binding.huruf.text = "Ww"
            binding.bahasaInggris.text = "Wolf"
            binding.bahasaIndo.text = "Serigala"
            binding.gambar.setImageResource(R.mipmap.w)
            val playerw = MediaPlayer.create(this, R.raw.w)
            playerw.start()
            playerw.setOnCompletionListener {
                playerw.release()
            }

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonX.setOnClickListener {
            binding.huruf.text = "Xx"
            binding.bahasaInggris.text = "Xylophone"
            binding.bahasaIndo.text = "Gambang"
            binding.gambar.setImageResource(R.mipmap.x)
            val playerx = MediaPlayer.create(this, R.raw.x)
            playerx.start()
            playerx.setOnCompletionListener {
                playerx.release()
            }

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonY.setOnClickListener {
            binding.huruf.text = "Yy"
            binding.bahasaInggris.text = "Yoyo"
            binding.bahasaIndo.text = "Yoyo"
            binding.gambar.setImageResource(R.mipmap.y)
            val playery = MediaPlayer.create(this, R.raw.y)
            playery.start()
            playery.setOnCompletionListener {
                playery.release()
            }

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))
        }

        binding.buttonZ.setOnClickListener {
            binding.huruf.text = "Zz"
            binding.bahasaInggris.text = "Zebra"
            binding.bahasaIndo.text = "Zebra"
            binding.gambar.setImageResource(R.mipmap.z)
            val playerz = MediaPlayer.create(this, R.raw.z)
            playerz.start()
            playerz.setOnCompletionListener {
                playerz.release()
            }

            binding.buttonZ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonZ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonB.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonB.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonC.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonC.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonA.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonA.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonE.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonE.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonF.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonF.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonG.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonG.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonH.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonH.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonI.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonI.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonJ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonJ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonK.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonK.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonL.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonL.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonM.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonM.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonN.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonN.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonO.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonO.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonP.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonP.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonQ.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonQ.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonR.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonR.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonS.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonS.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonT.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonT.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonD.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonD.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonV.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonV.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonW.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonW.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonX.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonX.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonY.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonY.setTextColor(ContextCompat.getColor(this, R.color.white))

            binding.buttonU.setBackgroundResource(R.drawable.buttonalfabeth)
            binding.buttonU.setTextColor(ContextCompat.getColor(this, R.color.white))
        }
    }

    private fun soundOn(){
        when(binding.huruf.text){
            "Aa" -> {
                val player = MediaPlayer.create(this, R.raw.a)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Bb" -> {
                val player = MediaPlayer.create(this, R.raw.b)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Cc" -> {
                val player = MediaPlayer.create(this, R.raw.c)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Dd" -> {
                val player = MediaPlayer.create(this, R.raw.d)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ee" -> {
                val player = MediaPlayer.create(this, R.raw.e)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ff" -> {
                val player = MediaPlayer.create(this, R.raw.f)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Gg" -> {
                val player = MediaPlayer.create(this, R.raw.g)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Hh" -> {
                val player = MediaPlayer.create(this, R.raw.h)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ii" -> {
                val player = MediaPlayer.create(this, R.raw.i)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Jj" -> {
                val player = MediaPlayer.create(this, R.raw.j)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Kk" -> {
                val player = MediaPlayer.create(this, R.raw.k)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ll" -> {
                val player = MediaPlayer.create(this, R.raw.l)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Mm" -> {
                val player = MediaPlayer.create(this, R.raw.m)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Nn" -> {
                val player = MediaPlayer.create(this, R.raw.n)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Oo" -> {
                val player = MediaPlayer.create(this, R.raw.o)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Pp" -> {
                val player = MediaPlayer.create(this, R.raw.p)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Qq" -> {
                val player = MediaPlayer.create(this, R.raw.q)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Rr" -> {
                val player = MediaPlayer.create(this, R.raw.r)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ss" -> {
                val player = MediaPlayer.create(this, R.raw.s)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Tt" -> {
                val player = MediaPlayer.create(this, R.raw.t)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Uu" -> {
                val player = MediaPlayer.create(this, R.raw.u)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Vv" -> {
                val player = MediaPlayer.create(this, R.raw.v)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Ww" -> {
                val player = MediaPlayer.create(this, R.raw.w)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Xx" -> {
                val player = MediaPlayer.create(this, R.raw.x)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            "Yy" -> {
                val player = MediaPlayer.create(this, R.raw.y)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else -> {
                val player = MediaPlayer.create(this, R.raw.z)
                player.start()
                player.setOnCompletionListener {
                    player.release()
                }
            }
        }
    }
}