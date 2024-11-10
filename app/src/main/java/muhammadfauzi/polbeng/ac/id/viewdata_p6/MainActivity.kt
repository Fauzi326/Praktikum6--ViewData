package muhammadfauzi.polbeng.ac.id.viewdata_p6

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import muhammadfauzi.polbeng.ac.id.viewdata_p6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnViewList.setOnClickListener {
            startActivity(Intent(this, ListviewActivity::class.java))
        }

        binding.btnRecylerView.setOnClickListener {
            startActivity(Intent(this, RecylerActivity::class.java))
        }
    }
}
