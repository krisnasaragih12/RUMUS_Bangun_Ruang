package com.example.uts_praktikum_11321001

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var button_logout = findViewById(R.id.btn_logout) as Button
        var button_hitung_persegi = findViewById(R.id.btnPersegi) as Button
        var button_hitung_persegi_panjang = findViewById(R.id.btnPersegiPanjang) as Button
        var button_hitung_segitiga = findViewById(R.id.btnSegitiga) as Button
        var button_hitung_lingkaran = findViewById(R.id.btnLingkaran) as Button
        var button_hitung_jajargenjang = findViewById(R.id.btnJajarGenjang) as Button
        var button_trapesium = findViewById(R.id.btnTrapesium) as Button
        var button_belah_ketupat = findViewById(R.id.btnBelahKetupat) as Button
        var button_layang_layang = findViewById(R.id.btnLayangLayang) as Button
        var button_kubus = findViewById(R.id.btnKubus) as Button
        var button_balok = findViewById(R.id.btnBalok) as Button
        var button_tabung = findViewById(R.id.btnTabung) as Button
        var button_bola = findViewById(R.id.btnBola) as Button
        var button_prisma = findViewById(R.id.btnPrisma) as Button

        button_logout.setOnClickListener {
            finish()
        }

        button_hitung_persegi.setOnClickListener {
            var intent = Intent(this, HitungPersegiActivity::class.java)
            startActivity(intent)
        }

        button_hitung_persegi_panjang.setOnClickListener {
            var intent = Intent(this, HitungPersegiActivity::class.java)
            startActivity(intent)
        }

        button_hitung_segitiga.setOnClickListener {
            var intent = Intent(this, HitungSegitigaActivity::class.java)
            startActivity(intent)
        }

        button_hitung_lingkaran.setOnClickListener {
            var intent = Intent(this, HitungLingkaranActivity::class.java)
            startActivity(intent)
        }

        button_hitung_jajargenjang.setOnClickListener {
            var intent = Intent(this, HitungJajargenjangActivity::class.java)
            startActivity(intent)
        }

        button_trapesium.setOnClickListener {
            var intent = Intent(this, HitungTrapesiumActivity::class.java)
            startActivity(intent)
        }

        button_belah_ketupat.setOnClickListener {
            var intent = Intent(this, HitungBelahKetupatActivity::class.java)
            startActivity(intent)
        }

        button_layang_layang.setOnClickListener {
            var intent = Intent(this, HitungLayangLayangActivity::class.java)
            startActivity(intent)
        }

        button_kubus.setOnClickListener {
            var intent = Intent(this, HitungKubusActivity::class.java)
            startActivity(intent)
        }

        button_balok.setOnClickListener {
            var intent = Intent(this, HitungBalok::class.java)
            startActivity(intent)
        }

        button_tabung.setOnClickListener {
            var intent = Intent(this, HitungTabungActivity::class.java)
            startActivity(intent)
        }

        button_bola.setOnClickListener {
            var intent = Intent(this, HitungBolaActivity::class.java)
            startActivity(intent)
        }

        button_prisma.setOnClickListener {
            var intent = Intent(this, HitungPrismaActivity::class.java)
            startActivity(intent)
        }
    }
}