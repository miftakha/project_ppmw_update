package com.bacaceria.bebanggis

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.bacaceria.bebanggis.databinding.ActivityGamesColorBinding

class GamesColor : AppCompatActivity(){
    lateinit var binding: ActivityGamesColorBinding

    private lateinit var popup : Dialog
    private lateinit var popupbutton : ImageButton
    private lateinit var popuptext : TextView
    lateinit var player : MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_games_color)

        val binding = ActivityGamesColorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        popup = Dialog(this)
        binding.buttonback.setOnClickListener {
            onBackPressedDispatcher.onBackPressed()
        }

        binding.buttonHelp.setOnClickListener {
            popup.setContentView(R.layout.helpdialog)
            popupbutton= popup.findViewById(R.id.button_xhelp)
            popuptext= popup.findViewById(R.id.help)
            popuptext.text = "Pilih warna pada palet lalu tekan campurkan untuk melihat hasil campuran warna yang dipilih"
            popupbutton.setOnClickListener {
                popup.dismiss()
            }
            popup.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            popup.show()
        }

        binding.kuning.setOnClickListener(){
            if (binding.satu.text == "SATU"){
                binding.satu.text = "1"
                binding.satu.setBackgroundResource(R.drawable.kuning)
                binding.kuning.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "DUA" && binding.satu.text != "1") {
                binding.dua.text = "1"
                binding.dua.setBackgroundResource(R.drawable.kuning)
                binding.kuning.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "TIGA" && binding.satu.text != "1" && binding.dua.text != "1"){
                binding.tiga.text = "1"
                binding.tiga.setBackgroundResource(R.drawable.kuning)
                binding.kuning.setImageResource(R.drawable.ceklis)
            }
        }

        binding.biru.setOnClickListener(){
            if (binding.satu.text == "SATU"){
                binding.satu.text = "2"
                binding.satu.setBackgroundResource(R.drawable.biru)
                binding.biru.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "DUA" && binding.satu.text != "2") {
                binding.dua.text = "2"
                binding.dua.setBackgroundResource(R.drawable.biru)
                binding.biru.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "TIGA" && binding.satu.text != "2" && binding.dua.text != "2"){
                binding.tiga.text = "2"
                binding.tiga.setBackgroundResource(R.drawable.biru)
                binding.biru.setImageResource(R.drawable.ceklis)
            }
        }

        binding.merah.setOnClickListener(){
            if (binding.satu.text == "SATU"){
                binding.satu.text = "3"
                binding.satu.setBackgroundResource(R.drawable.merah)
                binding.merah.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "DUA" && binding.satu.text != "3") {
                binding.dua.text = "3"
                binding.dua.setBackgroundResource(R.drawable.merah)
                binding.merah.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "TIGA" && binding.satu.text != "3" && binding.dua.text != "3"){
                binding.tiga.text = "3"
                binding.tiga.setBackgroundResource(R.drawable.merah)
                binding.merah.setImageResource(R.drawable.ceklis)
            }
        }

        binding.hitam.setOnClickListener {
            if (binding.satu.text == "SATU"){
                binding.satu.text = "4"
                binding.satu.setBackgroundResource(R.drawable.hitam)
                binding.hitam.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "DUA" && binding.satu.text != "4") {
                binding.dua.text = "4"
                binding.dua.setBackgroundResource(R.drawable.hitam)
                binding.hitam.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "TIGA" && binding.satu.text != "4" && binding.dua.text != "4"){
                binding.tiga.text = "4"
                binding.tiga.setBackgroundResource(R.drawable.hitam)
                binding.hitam.setImageResource(R.drawable.ceklis)
            }
        }

        binding.putih.setOnClickListener {
            if (binding.satu.text == "SATU"){
                binding.satu.text = "5"
                binding.satu.setBackgroundResource(R.drawable.putih)
                binding.putih.setImageResource(R.drawable.ceklis)
            } else if (binding.dua.text == "DUA" && binding.satu.text != "5") {
                binding.dua.text = "5"
                binding.dua.setBackgroundResource(R.drawable.putih)
                binding.putih.setImageResource(R.drawable.ceklis)
            } else if (binding.tiga.text == "TIGA" && binding.satu.text != "5" && binding.dua.text != "5"){
                binding.tiga.text = "5"
                binding.tiga.setBackgroundResource(R.drawable.putih)
                binding.putih.setImageResource(R.drawable.ceklis)
            }
        }
//
        binding.satu.setOnClickListener {
            if (binding.satu.text == "1"){
                if (binding.dua.text != "DUA"){
                    if (binding.dua.text == "2"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "3"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "4"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "5"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                }
                else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "SATU"
                }
                binding.kuning.setImageResource(0)
            }

            else if (binding.satu.text == "2"){
                    if (binding.dua.text != "DUA"){
                        if (binding.dua.text == "1"){
                            if (binding.tiga.text != "TIGA"){
                                if (binding.tiga.text == "3"){
                                    binding.satu.setBackgroundResource(R.drawable.kuning)
                                    binding.satu.text = "1"
                                    binding.dua.setBackgroundResource(R.drawable.merah)
                                    binding.dua.text = "3"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "4"){
                                    binding.satu.setBackgroundResource(R.drawable.kuning)
                                    binding.satu.text = "1"
                                    binding.dua.setBackgroundResource(R.drawable.hitam)
                                    binding.dua.text = "4"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "5"){
                                    binding.satu.setBackgroundResource(R.drawable.kuning)
                                    binding.satu.text = "1"
                                    binding.dua.setBackgroundResource(R.drawable.putih)
                                    binding.dua.text = "5"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                            }
                            else {
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.dua.text = "DUA"
                            }
                        }
                        else if (binding.dua.text == "3"){
                            if (binding.tiga.text != "TIGA"){
                                if (binding.tiga.text == "1"){
                                    binding.satu.setBackgroundResource(R.drawable.merah)
                                    binding.satu.text = "3"
                                    binding.dua.setBackgroundResource(R.drawable.kuning)
                                    binding.dua.text = "1"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "4"){
                                    binding.satu.setBackgroundResource(R.drawable.merah)
                                    binding.satu.text = "3"
                                    binding.dua.setBackgroundResource(R.drawable.hitam)
                                    binding.dua.text = "4"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "5"){
                                    binding.satu.setBackgroundResource(R.drawable.merah)
                                    binding.satu.text = "3"
                                    binding.dua.setBackgroundResource(R.drawable.putih)
                                    binding.dua.text = "5"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                            }
                            else {
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.dua.text = "DUA"
                            }
                        }
                        else if (binding.dua.text == "4"){
                            if (binding.tiga.text != "TIGA"){
                                if (binding.tiga.text == "1"){
                                    binding.satu.setBackgroundResource(R.drawable.hitam)
                                    binding.satu.text = "4"
                                    binding.dua.setBackgroundResource(R.drawable.kuning)
                                    binding.dua.text = "1"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "3"){
                                    binding.satu.setBackgroundResource(R.drawable.hitam)
                                    binding.satu.text = "4"
                                    binding.dua.setBackgroundResource(R.drawable.merah)
                                    binding.dua.text = "3"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "5"){
                                    binding.satu.setBackgroundResource(R.drawable.hitam)
                                    binding.satu.text = "4"
                                    binding.dua.setBackgroundResource(R.drawable.putih)
                                    binding.dua.text = "5"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                            }
                            else {
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.dua.text = "DUA"
                            }
                        }
                        else if (binding.dua.text == "5"){
                            if (binding.tiga.text != "TIGA"){
                                if (binding.tiga.text == "1"){
                                    binding.satu.setBackgroundResource(R.drawable.putih)
                                    binding.satu.text = "5"
                                    binding.dua.setBackgroundResource(R.drawable.kuning)
                                    binding.dua.text = "1"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "3"){
                                    binding.satu.setBackgroundResource(R.drawable.putih)
                                    binding.satu.text = "5"
                                    binding.dua.setBackgroundResource(R.drawable.merah)
                                    binding.dua.text = "3"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                                if (binding.tiga.text == "4"){
                                    binding.satu.setBackgroundResource(R.drawable.putih)
                                    binding.satu.text = "5"
                                    binding.dua.setBackgroundResource(R.drawable.hitam)
                                    binding.dua.text = "4"
                                    binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                    binding.tiga.text = "TIGA"
                                }
                            }
                            else {
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.dua.text = "DUA"
                            }
                        }
                    }
                    else {
                        binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.satu.text = "SATU"
                    }
                binding.biru.setImageResource(0)
            }

            else if (binding.satu.text == "3"){
                if (binding.dua.text != "DUA"){
                    if (binding.dua.text == "1"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "2"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "4"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "5"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                }
                else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "SATU"
                }
                binding.merah.setImageResource(0)
            }

            else if (binding.satu.text == "4"){
                if (binding.dua.text != "DUA"){
                    if (binding.dua.text == "1"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "2"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "3"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "5"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.putih)
                                binding.dua.text = "5"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                    else if (binding.dua.text == "5"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.putih)
                                binding.satu.text = "5"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.putih)
                            binding.satu.text = "5"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                }
                else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "SATU"
                }
                binding.hitam.setImageResource(0)
            }

            else if (binding.satu.text == "5"){
                if (binding.dua.text != "DUA"){
                    if (binding.dua.text == "1"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.kuning)
                                binding.satu.text = "1"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.kuning)
                            binding.satu.text = "1"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }

                    else if (binding.dua.text == "2"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.biru)
                                binding.satu.text = "2"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.biru)
                            binding.satu.text = "2"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }

                    else if (binding.dua.text == "4"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "3"){
                                binding.satu.setBackgroundResource(R.drawable.hitam)
                                binding.satu.text = "4"
                                binding.dua.setBackgroundResource(R.drawable.merah)
                                binding.dua.text = "3"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.hitam)
                            binding.satu.text = "4"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }

                    else if (binding.dua.text == "3"){
                        if (binding.tiga.text != "TIGA"){
                            if (binding.tiga.text == "1"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.kuning)
                                binding.dua.text = "1"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "2"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.biru)
                                binding.dua.text = "2"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                            if (binding.tiga.text == "4"){
                                binding.satu.setBackgroundResource(R.drawable.merah)
                                binding.satu.text = "3"
                                binding.dua.setBackgroundResource(R.drawable.hitam)
                                binding.dua.text = "4"
                                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                                binding.tiga.text = "TIGA"
                            }
                        }
                        else {
                            binding.satu.setBackgroundResource(R.drawable.merah)
                            binding.satu.text = "3"
                            binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                            binding.dua.text = "DUA"
                        }
                    }
                }
                else {
                    binding.satu.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.satu.text = "SATU"
                }
                binding.putih.setImageResource(0)
            }
        }

        binding.dua.setOnClickListener {
            if (binding.dua.text == "1"){
                if (binding.tiga.text != "TIGA"){
                    if (binding.tiga.text == "2"){
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "3"){
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "4"){
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "5"){
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                }
                else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "DUA"
                }
                binding.kuning.setImageResource(0)
            }

            else if (binding.dua.text == "2"){
                if (binding.tiga.text != "TIGA"){
                    if (binding.tiga.text == "1"){
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "3"){
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "4"){
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "5"){
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                }
                else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "DUA"
                }
                binding.biru.setImageResource(0)
            }

            else if (binding.dua.text == "3"){
                if (binding.tiga.text != "TIGA"){
                    if (binding.tiga.text == "1"){
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "2"){
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "4"){
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "5"){
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                }
                else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "DUA"
                }
                binding.merah.setImageResource(0)
            }

            else if (binding.dua.text == "4"){
                if (binding.tiga.text != "TIGA"){
                    if (binding.tiga.text == "2"){
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "3"){
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "1"){
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "5"){
                        binding.dua.setBackgroundResource(R.drawable.putih)
                        binding.dua.text = "5"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                }
                else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "DUA"
                }
                binding.hitam.setImageResource(0)
            }

            else if (binding.dua.text == "5"){
                if (binding.tiga.text != "TIGA"){
                    if (binding.tiga.text == "2"){
                        binding.dua.setBackgroundResource(R.drawable.biru)
                        binding.dua.text = "2"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "3"){
                        binding.dua.setBackgroundResource(R.drawable.merah)
                        binding.dua.text = "3"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "1"){
                        binding.dua.setBackgroundResource(R.drawable.kuning)
                        binding.dua.text = "1"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                    if (binding.tiga.text == "4"){
                        binding.dua.setBackgroundResource(R.drawable.hitam)
                        binding.dua.text = "4"
                        binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                        binding.tiga.text = "TIGA"
                    }
                }
                else {
                    binding.dua.setBackgroundResource(R.drawable.buttonmixcolor)
                    binding.dua.text = "DUA"
                }
                binding.putih.setImageResource(0)
            }

        }

        binding.tiga.setOnClickListener {
            if (binding.tiga.text == "1"){
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.kuning.setImageResource(0)
            }
            if (binding.tiga.text == "2"){
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.biru.setImageResource(0)
            }
            if (binding.tiga.text == "3"){
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.merah.setImageResource(0)
            }
            if (binding.tiga.text == "4"){
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.hitam.setImageResource(0)
            }
            if (binding.tiga.text == "5"){
                binding.tiga.setBackgroundResource(R.drawable.buttonmixcolor)
                binding.putih.setImageResource(0)
            }
            binding.tiga.text = "TIGA"
        }

        binding.mix.setOnClickListener {
            if (binding.satu.text == "1"){
                if (binding.dua.text == "2"){
                    if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "hitam"
                        binding.namawarnaing.text = "Black"
                        binding.warnabesar.setImageResource(R.color.hitam)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "hijau tua"
                        binding.namawarnaing.text = "Dark Green"
                        binding.warnabesar.setImageResource(R.color.hijautua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "hijau muda"
                        binding.namawarnaing.text = "Light Green"
                        binding.warnabesar.setImageResource(R.color.hijaumuda)
                    }
                    else{
                        binding.namawarnaindo.text = "hijau"
                        binding.namawarnaing.text = "Green"
                        binding.warnabesar.setImageResource(R.color.hijau)
                    }
                }

                else if (binding.dua.text == "3"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "hitam"
                        binding.namawarnaing.text = "Black"
                        binding.warnabesar.setImageResource(R.color.hitam)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "jingga tua"
                        binding.namawarnaing.text = "Dark Orange"
                        binding.warnabesar.setImageResource(R.color.orangetua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "jingga muda"
                        binding.namawarnaing.text = "Light Orange"
                        binding.warnabesar.setImageResource(R.color.orangemuda)
                    }
                    else{
                        binding.namawarnaindo.text = "jingga"
                        binding.namawarnaing.text = "Orange"
                        binding.warnabesar.setImageResource(R.color.orange)
                    }
                }

                else if (binding.dua.text == "4"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "hijau tua"
                        binding.namawarnaing.text = "Dark Green"
                        binding.warnabesar.setImageResource(R.color.hijautua)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "jingga tua"
                        binding.namawarnaing.text = "Dark Orange"
                        binding.warnabesar.setImageResource(R.color.orangetua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "kuning"
                        binding.namawarnaing.text = "Yellow"
                        binding.warnabesar.setImageResource(R.color.kuning)
                    }
                    else {
                        binding.namawarnaindo.text = "kuning tua"
                        binding.namawarnaing.text = "Dark Yellow"
                        binding.warnabesar.setImageResource(R.color.kuningtua)
                    }
                }

                else if (binding.dua.text == "5"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "hijau muda"
                        binding.namawarnaing.text = "Light Green"
                        binding.warnabesar.setImageResource(R.color.hijaumuda)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "jingga muda"
                        binding.namawarnaing.text = "Light Orange"
                        binding.warnabesar.setImageResource(R.color.orangemuda)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "kuning"
                        binding.namawarnaing.text = "Yellow"
                        binding.warnabesar.setImageResource(R.color.kuning)
                    }
                    else{
                        binding.namawarnaindo.text = "kuningmuda"
                        binding.namawarnaing.text = "Light Yellow"
                        binding.warnabesar.setImageResource(R.color.kuningmuda)
                    }
                }

                else{
                    binding.namawarnaindo.text = "kuning"
                    binding.namawarnaing.text = "Yellow"
                    binding.warnabesar.setImageResource(R.color.kuning)
                }
            }

            else if (binding.satu.text == "2"){

                if (binding.dua.text == "1"){
                    if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "hitam"
                        binding.namawarnaing.text = "Black"
                        binding.warnabesar.setImageResource(R.color.hitam)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "hijau tua"
                        binding.namawarnaing.text = "Dark Green"
                        binding.warnabesar.setImageResource(R.color.hijautua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "hijau muda"
                        binding.namawarnaing.text = "Light Green"
                        binding.warnabesar.setImageResource(R.color.hijaumuda)
                    }
                    else{
                        binding.namawarnaindo.text = "hijau"
                        binding.namawarnaing.text = "Green"
                        binding.warnabesar.setImageResource(R.color.hijau)
                    }
                }

                else if (binding.dua.text == "3"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "hitam"
                        binding.namawarnaing.text = "Black"
                        binding.warnabesar.setImageResource(R.color.hitam)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "ungu tua"
                        binding.namawarnaing.text = "Dark Purple"
                        binding.warnabesar.setImageResource(R.color.ungutua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "ungu muda"
                        binding.namawarnaing.text = "Light Purple"
                        binding.warnabesar.setImageResource(R.color.ungumuda)
                    }
                    else{
                        binding.namawarnaindo.text = "ungu"
                        binding.namawarnaing.text = "Purple"
                        binding.warnabesar.setImageResource(R.color.ungu)
                    }
                }

                else if (binding.dua.text == "4"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "hijau tua"
                        binding.namawarnaing.text = "Dark Green"
                        binding.warnabesar.setImageResource(R.color.hijautua)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "ungu tua"
                        binding.namawarnaing.text = "Dark Purple"
                        binding.warnabesar.setImageResource(R.color.ungutua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "biru"
                        binding.namawarnaing.text = "Blue"
                        binding.warnabesar.setImageResource(R.color.biru)
                    }
                    else{
                        binding.namawarnaindo.text = "biru tua"
                        binding.namawarnaing.text = "Dark Blue"
                        binding.warnabesar.setImageResource(R.color.birutua)
                    }
                }

                else if (binding.dua.text == "5"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "hijau muda"
                        binding.namawarnaing.text = "Light Green"
                        binding.warnabesar.setImageResource(R.color.hijaumuda)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "ungu muda"
                        binding.namawarnaing.text = "Light Purple"
                        binding.warnabesar.setImageResource(R.color.ungumuda)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "biru"
                        binding.namawarnaing.text = "Blue"
                        binding.warnabesar.setImageResource(R.color.biru)
                    }
                    else{
                        binding.namawarnaindo.text = "biru muda"
                        binding.namawarnaing.text = "Light Blue"
                        binding.warnabesar.setImageResource(R.color.birumuda)
                    }
                }

                else{
                    binding.namawarnaindo.text = "biru"
                    binding.namawarnaing.text = "Blue"
                    binding.warnabesar.setImageResource(R.color.biru)
                }
            }

            else if (binding.satu.text == "3"){
                if (binding.dua.text == "1"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "hitam"
                        binding.namawarnaing.text = "Black"
                        binding.warnabesar.setImageResource(R.color.hitam)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "jingga tua"
                        binding.namawarnaing.text = "Dark Orange"
                        binding.warnabesar.setImageResource(R.color.orangetua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "jingga muda"
                        binding.namawarnaing.text = "Light Orange"
                        binding.warnabesar.setImageResource(R.color.orangemuda)
                    }
                    else{
                        binding.namawarnaindo.text = "jingga"
                        binding.namawarnaing.text = "Orange"
                        binding.warnabesar.setImageResource(R.color.orange)
                    }
                }

                else if (binding.dua.text == "2"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "hitam"
                        binding.namawarnaing.text = "Black"
                        binding.warnabesar.setImageResource(R.color.hitam)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "ungu tua"
                        binding.namawarnaing.text = "Dark Purple"
                        binding.warnabesar.setImageResource(R.color.ungutua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "ungu muda"
                        binding.namawarnaing.text = "Light Purple"
                        binding.warnabesar.setImageResource(R.color.ungumuda)
                    }
                    else{
                        binding.namawarnaindo.text = "ungu"
                        binding.namawarnaing.text = "Purple"
                        binding.warnabesar.setImageResource(R.color.ungu)
                    }
                }

                else if (binding.dua.text == "4"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "jingga tua"
                        binding.namawarnaing.text = "Dark Orange"
                        binding.warnabesar.setImageResource(R.color.orangetua)
                    }
                    else if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "ungu tua"
                        binding.namawarnaing.text = "Dark Purple"
                        binding.warnabesar.setImageResource(R.color.ungutua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "merah"
                        binding.namawarnaing.text = "Red"
                        binding.warnabesar.setImageResource(R.color.merah)
                    }
                    else {
                        binding.namawarnaindo.text = "merah tua"
                        binding.namawarnaing.text = "Dark Red"
                        binding.warnabesar.setImageResource(R.color.merahtua)
                    }
                }

                else if (binding.dua.text == "5"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "ungu muda"
                        binding.namawarnaing.text = "Light Purple"
                        binding.warnabesar.setImageResource(R.color.ungumuda)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "merah"
                        binding.namawarnaing.text = "Red"
                        binding.warnabesar.setImageResource(R.color.merah)
                    }
                    else if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "jingga muda"
                        binding.namawarnaing.text = "Light Orange"
                        binding.warnabesar.setImageResource(R.color.orangemuda)
                    }
                    else {
                        binding.namawarnaindo.text = "merah jambu"
                        binding.namawarnaing.text = "Pink"
                        binding.warnabesar.setImageResource(R.color.merahmuda)
                    }
                }

                else{
                    binding.namawarnaindo.text = "merah"
                    binding.namawarnaing.text = "Red"
                    binding.warnabesar.setImageResource(R.color.merah)
                }
            }

            else if (binding.satu.text == "4"){
                if (binding.dua.text == "1"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "hijau tua"
                        binding.namawarnaing.text = "Dark Green"
                        binding.warnabesar.setImageResource(R.color.hijautua)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "jingga tua"
                        binding.namawarnaing.text = "Dark Orange"
                        binding.warnabesar.setImageResource(R.color.orangetua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "kuning"
                        binding.namawarnaing.text = "Yellow"
                        binding.warnabesar.setImageResource(R.color.kuning)
                    }
                    else {
                        binding.namawarnaindo.text = "kuning tua"
                        binding.namawarnaing.text = "Dark Yellow"
                        binding.warnabesar.setImageResource(R.color.kuningtua)
                    }
                }

                else if (binding.dua.text == "2"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "hijau tua"
                        binding.namawarnaing.text = "Dark Green"
                        binding.warnabesar.setImageResource(R.color.hijautua)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "ungu tua"
                        binding.namawarnaing.text = "Dark Purple"
                        binding.warnabesar.setImageResource(R.color.ungutua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "biru"
                        binding.namawarnaing.text = "Blue"
                        binding.warnabesar.setImageResource(R.color.biru)
                    }
                    else {
                        binding.namawarnaindo.text = "biru tua"
                        binding.namawarnaing.text = "Dark Blue"
                        binding.warnabesar.setImageResource(R.color.birutua)
                    }
                }

                else if (binding.dua.text == "3"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "ungu tua"
                        binding.namawarnaing.text = "Dark Purple"
                        binding.warnabesar.setImageResource(R.color.ungutua)
                    }
                    else if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "jingga tua"
                        binding.namawarnaing.text = "Dark Orange"
                        binding.warnabesar.setImageResource(R.color.orangetua)
                    }
                    else if (binding.tiga.text == "5"){
                        binding.namawarnaindo.text = "merah"
                        binding.namawarnaing.text = "Red"
                        binding.warnabesar.setImageResource(R.color.merah)
                    }
                    else {
                        binding.namawarnaindo.text = "merah tua"
                        binding.namawarnaing.text = "Dark Red"
                        binding.warnabesar.setImageResource(R.color.merahtua)
                    }
                }

                else if (binding.dua.text == "5"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "biru"
                        binding.namawarnaing.text = "Blue"
                        binding.warnabesar.setImageResource(R.color.biru)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "merah"
                        binding.namawarnaing.text = "Red"
                        binding.warnabesar.setImageResource(R.color.merah)
                    }
                    else if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "kuning"
                        binding.namawarnaing.text = "Yellow"
                        binding.warnabesar.setImageResource(R.color.kuning)
                    }
                    else {
                        binding.namawarnaindo.text = "abu - abu"
                        binding.namawarnaing.text = "Grey"
                        binding.warnabesar.setImageResource(R.color.abuabu)
                    }
                }
                else{
                    binding.namawarnaindo.text = "hitam"
                    binding.namawarnaing.text = "Black"
                    binding.warnabesar.setImageResource(R.color.hitam)
                }
            }

            else if (binding.satu.text == "5"){
                if (binding.dua.text == "1"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "hijau muda"
                        binding.namawarnaing.text = "Light Green"
                        binding.warnabesar.setImageResource(R.color.hijaumuda)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "jingga muda"
                        binding.namawarnaing.text = "Light Orange"
                        binding.warnabesar.setImageResource(R.color.orangemuda)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "kuning"
                        binding.namawarnaing.text = "Yellow"
                        binding.warnabesar.setImageResource(R.color.kuning)
                    }
                    else{
                        binding.namawarnaindo.text = "kuningmuda"
                        binding.namawarnaing.text = "Light Yellow"
                        binding.warnabesar.setImageResource(R.color.kuningmuda)
                    }
                }
                else if (binding.dua.text == "2"){
                    if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "hijau muda"
                        binding.namawarnaing.text = "Light Green"
                        binding.warnabesar.setImageResource(R.color.hijaumuda)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "ungu muda"
                        binding.namawarnaing.text = "Light Purple"
                        binding.warnabesar.setImageResource(R.color.ungumuda)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "biru"
                        binding.namawarnaing.text = "Blue"
                        binding.warnabesar.setImageResource(R.color.biru)
                    }
                    else {
                        binding.namawarnaindo.text = "biru muda"
                        binding.namawarnaing.text = "Light Blue"
                        binding.warnabesar.setImageResource(R.color.birumuda)
                    }
                }
                else if (binding.dua.text == "3"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "ungu muda"
                        binding.namawarnaing.text = "Light Purple"
                        binding.warnabesar.setImageResource(R.color.ungumuda)
                    }
                    else if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "jingga muda"
                        binding.namawarnaing.text = "Light Orange"
                        binding.warnabesar.setImageResource(R.color.orangemuda)
                    }
                    else if (binding.tiga.text == "4"){
                        binding.namawarnaindo.text = "merah"
                        binding.namawarnaing.text = "Red"
                        binding.warnabesar.setImageResource(R.color.merah)
                    }
                    else {
                        binding.namawarnaindo.text = "merah jambu"
                        binding.namawarnaing.text = "Pink"
                        binding.warnabesar.setImageResource(R.color.merahmuda)
                    }
                }
                else if (binding.dua.text == "4"){
                    if (binding.tiga.text == "2"){
                        binding.namawarnaindo.text = "biru"
                        binding.namawarnaing.text = "Blue"
                        binding.warnabesar.setImageResource(R.color.biru)
                    }
                    else if (binding.tiga.text == "3"){
                        binding.namawarnaindo.text = "merah"
                        binding.namawarnaing.text = "Red"
                        binding.warnabesar.setImageResource(R.color.merah)
                    }
                    else if (binding.tiga.text == "1"){
                        binding.namawarnaindo.text = "kuning"
                        binding.namawarnaing.text = "Yellow"
                        binding.warnabesar.setImageResource(R.color.kuning)
                    }
                    else{
                        binding.namawarnaindo.text = "abu - abu"
                        binding.namawarnaing.text = "Grey"
                        binding.warnabesar.setImageResource(R.color.abuabu)
                    }
                }
                else{
                    binding.namawarnaindo.text = "putih"
                    binding.namawarnaing.text = "White"
                    binding.warnabesar.setImageResource(R.color.putih)
                }
            }
            else {
                Toast.makeText(this, "Ayo bermain warna", Toast.LENGTH_SHORT).show()
                binding.warnabesar.setImageResource(R.color.putihkotor)
                binding.namawarnaindo.text = ""
                binding.namawarnaing.text = ""
            }
        }

        binding.soundon.setOnClickListener {
            if(binding.namawarnaindo.text == "hitam"){
                player = MediaPlayer.create(this, R.raw.black)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "abu - abu"){
                player = MediaPlayer.create(this, R.raw.grey)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "putih"){
                player = MediaPlayer.create(this, R.raw.white)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else if (binding.namawarnaindo.text == "kuning"){
                player = MediaPlayer.create(this, R.raw.yellow)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "kuning tua"){
                player = MediaPlayer.create(this, R.raw.kuningtua)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "kuning muda"){
                player = MediaPlayer.create(this, R.raw.kuningmuda)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else if (binding.namawarnaindo.text == "merah"){
                player = MediaPlayer.create(this, R.raw.red)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "merah tua"){
                player = MediaPlayer.create(this, R.raw.merahtua)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "merah jambu"){
                player = MediaPlayer.create(this, R.raw.pink)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else if (binding.namawarnaindo.text == "biru"){
                player = MediaPlayer.create(this, R.raw.blue)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "biru tua"){
                player = MediaPlayer.create(this, R.raw.darkblue)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "biru muda"){
                player = MediaPlayer.create(this, R.raw.birumuda)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else if (binding.namawarnaindo.text == "jingga"){
                player = MediaPlayer.create(this, R.raw.orange)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "jingga tua"){
                player = MediaPlayer.create(this, R.raw.oranyetua)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "jingga muda"){
                player = MediaPlayer.create(this, R.raw.oranyemuda)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else if (binding.namawarnaindo.text == "hijau"){
                player = MediaPlayer.create(this, R.raw.green)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "hijau tua"){
                player = MediaPlayer.create(this, R.raw.hijautua)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "hijau muda"){
                player = MediaPlayer.create(this, R.raw.hijaumuda)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }

            else if (binding.namawarnaindo.text == "ungu"){
                player = MediaPlayer.create(this, R.raw.purple)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "ungu tua"){
                player = MediaPlayer.create(this, R.raw.ungutua)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
            else if (binding.namawarnaindo.text == "ungu muda"){
                player = MediaPlayer.create(this, R.raw.ungumuda)
                player.start()
                player.isLooping = false
                player.setOnCompletionListener {
                    player.release()
                }
            }
        }
    }
}