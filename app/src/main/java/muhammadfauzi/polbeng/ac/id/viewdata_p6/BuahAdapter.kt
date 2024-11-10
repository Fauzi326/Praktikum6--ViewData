package muhammadfauzi.polbeng.ac.id.viewdata_p6

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import muhammadfauzi.polbeng.ac.id.viewdata_p6.databinding.ListItemBinding

class BuahAdapter(
    private var context: Activity,
    private val dataBuah: Array<String>,
    private val dataGambar: Array<Int>
) : RecyclerView.Adapter<BuahAdapter.BuahHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return BuahHolder(binding)
    }

    // set data ke recylerview
    override fun onBindViewHolder(holder: BuahHolder, position: Int) {
        holder.binding.tvNamaBuah.text = dataBuah[position]
        holder.binding.imgBuah.setImageResource(dataGambar[position])
        holder.itemView.setOnClickListener {
            val intent = Intent(context, DetailBuahActivity::class.java)
            intent.putExtra("nama", dataBuah.get(position))
            intent.putExtra("gambar", dataGambar.get(position))
            context.startActivity(intent)
        }
    }

    // tampilan data
    override fun getItemCount(): Int = dataBuah.size

    // deklarasi id pada customAdapter, id yang ada pada list_item
    inner class BuahHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)
}
