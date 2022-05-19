package com.zeynab.exploreinstagram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.zeynab.exploreinstagram.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val url = listOf<String>(
            "https://t4.ftcdn.net/jpg/04/89/38/75/240_F_489387547_YPqU2zL2ZD5DnNsC9YIINoaMkDlznrhN.jpg",
            "https://t3.ftcdn.net/jpg/04/91/88/20/240_F_491882087_MqpXv3wrrTgR8YVFwrUyebNgIKlKHYsn.jpg",
            "https://t4.ftcdn.net/jpg/04/93/48/75/240_F_493487592_yAr7QYH29kSOqmhHB1EnrqpwoiTCvqDZ.jpg",
            "https://t3.ftcdn.net/jpg/04/91/26/40/240_F_491264093_8IuhGBhwMoodZNjQF6e9CWvwRjowQMR9.jpg",
            "https://t3.ftcdn.net/jpg/04/93/72/46/240_F_493724636_kuI0k9beOFJROdzI8HQuBosyTxQPuBLm.jpg",
            "https://t3.ftcdn.net/jpg/04/80/14/72/240_F_480147249_VYLrQJvtMw4IFd1IsLPYJJOXqF4HR9qE.jpg",
            "https://t4.ftcdn.net/jpg/04/88/75/97/240_F_488759776_O7V9NC2uLzGYiYitlo2YP8gEL8UCr1WC.jpg",
            "https://t4.ftcdn.net/jpg/04/86/50/05/240_F_486500521_JhnGk8xGGI3SHE0oqkZ7uHGzlJea30Ab.jpg",
            "https://t4.ftcdn.net/jpg/04/91/77/21/240_F_491772109_VLC8fgKafsHh2AZSyVsu7PC9ZJiQraKh.jpg",
            "https://t4.ftcdn.net/jpg/04/93/65/35/240_F_493653568_usLjsb67OUSrdnZt9EPUVWXxvfedjzFT.jpg",
            "https://t4.ftcdn.net/jpg/04/89/26/73/240_F_489267365_Wh1YSbLgAzov1TgE8d7v9JbCm1PLyBIZ.jpg",
            "https://t3.ftcdn.net/jpg/04/96/28/50/240_F_496285084_VufYVjs2NRL8MNo9z1oVKoNkz9uuR6aS.jpg",
            "https://t3.ftcdn.net/jpg/04/89/75/04/240_F_489750459_LGxGJKbXUZuqd6WF7Tb132wKJH7e1hV7.jpg",
            "https://t3.ftcdn.net/jpg/04/81/40/40/240_F_481404002_l5mZmXBuDvJZmnjkIw5pplwwt4nLw2dF.jpg",
            "https://t3.ftcdn.net/jpg/04/89/16/92/240_F_489169211_VRIdqeL5FjPLCDNaOeAKqeUzzXeKWCRC.jpg",
            "https://t4.ftcdn.net/jpg/04/95/40/21/240_F_495402116_azOitf5GosupdBReHp9LDgvXBcLDXOCi.jpg",
            "https://t3.ftcdn.net/jpg/04/92/37/44/240_F_492374421_EWVlrcmt1vZrbys5oj2W9v6oKepbVFne.jpg",
            "https://t3.ftcdn.net/jpg/04/94/22/26/240_F_494222653_9sixVOpuuL6Vz6LLUUEDuQvlYMrABTHD.jpg",
            "https://t4.ftcdn.net/jpg/04/86/51/81/240_F_486518113_DLV0dXprHv9iuBOe6BTmFM2woaeAGceC.jpg",
            "https://t3.ftcdn.net/jpg/04/92/54/98/240_F_492549825_SWKsPwQYyuWazbiy9N6L0reAwoqGlNR3.jpg",
            "https://t4.ftcdn.net/jpg/04/89/69/45/240_F_489694597_6BZf0rpArVmgXEqqFXVZ8yIcBMKZc83D.jpg",
            "https://t3.ftcdn.net/jpg/04/89/76/44/240_F_489764476_Se3gldhSLOdaWIgmQaHAapVSMPSrlodq.jpg",
            "https://t3.ftcdn.net/jpg/04/87/90/32/240_F_487903228_lf4Cxe9WOMp4Ew9UDC2f4ZI0y5nAQJVT.jpg",
            "https://t3.ftcdn.net/jpg/04/86/48/06/240_F_486480699_EMn73v89o3QytqphXQUMGW9e9s9i3gI3.jpg",
            "https://t3.ftcdn.net/jpg/04/85/26/00/240_F_485260050_Sf5MN0PBu3p55FZKlZIus1UfmXJQ7y7X.jpg",
            "https://t3.ftcdn.net/jpg/04/96/21/64/240_F_496216416_sS26LBcOhjwy4iCt9LjDvN9ipcE8Wqry.jpg",
            "https://t3.ftcdn.net/jpg/04/85/15/18/240_F_485151842_WE9C24QWXpdJ0dyeuyDrsq8pUctc8ITp.jpg"

         )

        if (NetworkChecker(this).isInternetConnected) {
            /// glide object
            val glide = Glide.with(this)

            glide.load(url[0]).into(binding.img1)
            glide.load(url[1]).into(binding.img2)
            glide.load(url[2]).into(binding.img3)
            glide.load(url[3]).into(binding.img4)
            glide.load(url[4]).into(binding.img5)
            glide.load(url[5]).into(binding.img6)
            glide.load(url[6]).into(binding.img7)
            glide.load(url[7]).into(binding.img8)
            glide.load(url[8]).into(binding.img9)
            glide.load(url[9]).into(binding.img10)
            glide.load(url[10]).into(binding.img11)
            glide.load(url[11]).into(binding.img12)
            glide.load(url[12]).into(binding.img13)
            glide.load(url[13]).into(binding.img14)
            glide.load(url[14]).into(binding.img15)
            glide.load(url[15]).into(binding.img16)
            glide.load(url[16]).into(binding.img17)
            glide.load(url[17]).into(binding.img18)
            glide.load(url[18]).into(binding.img19)
            glide.load(url[19]).into(binding.img20)
            glide.load(url[20]).into(binding.img21)
            glide.load(url[21]).into(binding.img22)
            glide.load(url[22]).into(binding.img23)
            glide.load(url[23]).into(binding.img24)
            glide.load(url[24]).into(binding.img25)
            glide.load(url[25]).into(binding.img26)
            glide.load(url[26]).into(binding.img27)



        } else {

            Toast.makeText(this, "Please Connect to the Internet", Toast.LENGTH_SHORT).show()
        }


        // we can use NetwordChecker class here to check internet

//        binding.btn.setOnClickListener {
//            val isInternet :  Boolean = NetworkChecker(this).isInternetConnected
//            Toast.makeText(this, isInternet.toString(), Toast.LENGTH_SHORT).show()
//        }


    }
}