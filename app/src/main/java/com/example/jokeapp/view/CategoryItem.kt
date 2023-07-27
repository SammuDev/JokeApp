package com.example.jokeapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jokeapp.R
import com.example.jokeapp.model.Category

class CategoryItem(
    private val category: List<Category>
) : RecyclerView.Adapter<CategoryItem.CategoryViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = category[position]
        holder.bind(category)
    }

    override fun getItemCount(): Int {
        return category.size
    }

    inner class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val textTitleCategory: TextView = itemView.findViewById(R.id.text_category)
        private val containerCategory: LinearLayout = itemView.findViewById(R.id.container_category)

        fun bind(category: Category) {
            textTitleCategory.text = category.name
            containerCategory.setBackgroundColor(category.backgroundColor.toInt())
        }
    }
}
