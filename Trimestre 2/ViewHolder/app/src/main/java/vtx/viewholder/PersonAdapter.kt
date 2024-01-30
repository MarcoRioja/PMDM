package vtx.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PersonAdapter (private val personList: List<Persona>) : RecyclerView.Adapter<PersonAdapter.PersonViewHolder> {



    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    }
}