package com.example.localjson.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.localjson.ui.MainActivity2
import com.example.localjson.R
import com.example.localjson.model.UserModelClass

class UserAdapter(val context: Context, val items: ArrayList<UserModelClass>) :
    RecyclerView.Adapter<UserAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(
                R.layout.item_user_layout,
                parent,
                false
            )
        )
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val item = items.get(position)

        holder.tvId.text = item.id.toString()
        holder.tvName.text = item.department_name
        holder.tvFaculty.text = item.facultyNo
        holder.tvnoOfStudent.text = item.noOfStudent
        holder.tvDetails.text = item.details
        holder.tvLocation.text = item.location
        holder.itemView.setOnClickListener {
            val intent = Intent(context, MainActivity2::class.java)
            intent.putExtra("id",item.id.toString())
            intent.putExtra("department_name",item.department_name.toString())
            intent.putExtra("facultyNo",item.facultyNo.toString())
            intent.putExtra("noOfStudent",item.noOfStudent.toString())
            intent.putExtra("details",item.details.toString())
            intent.putExtra("location",item.location.toString())
            context.startActivity(intent)
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each item to
        val tvId = view.findViewById<TextView>(R.id.tv_id)
        val tvName = view.findViewById<TextView>(R.id.tv_name)
        val tvFaculty = view.findViewById<TextView>(R.id.tv_faculty)
        val tvnoOfStudent = view.findViewById<TextView>(R.id.tv_noOfStudent)
        val tvDetails = view.findViewById<TextView>(R.id.tv_details)
        val tvLocation = view.findViewById<TextView>(R.id.location)

    }
}