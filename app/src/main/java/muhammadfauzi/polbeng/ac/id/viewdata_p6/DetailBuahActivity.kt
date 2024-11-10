package muhammadfauzi.polbeng.ac.id.viewdata_p6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import muhammadfauzi.polbeng.ac.id.viewdata_p6.databinding.ActivityDetailBuahBinding

class DetailBuahActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBuahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBuahBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Membuat variabel dan di tangkap data dri intent
        var namaBuah = intent.getStringExtra("nama")
        var image = intent.getIntExtra("gambar", 0)

        // Menangkap data intent dan di set ke layout
        binding.tvNamaBuah.text = namaBuah
        binding.imgBuah.setImageResource(image)
    }
}
