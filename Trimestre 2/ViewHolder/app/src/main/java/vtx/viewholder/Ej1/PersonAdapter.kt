package vtx.viewholder.Ej1

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import vtx.viewholder.R

class PersonAdapter(private val personList: List<Person>) :
    RecyclerView.Adapter<PersonAdapter.PersonViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_item_person, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val person = personList[position]
        holder.nameTextView.text = "${person.name} ${person.age} años"
    }

    override fun getItemCount(): Int = personList.size

    class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.nameTextView)
    }
}