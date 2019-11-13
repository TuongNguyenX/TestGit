package com.example.githubtest.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.githubtest.Model.Category;
import com.example.githubtest.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {
    ArrayList<Category> listCategory;
    Context context;

    public HomeAdapter(ArrayList<Category> listCategory, Context context) {
        this.listCategory = listCategory;
        this.context = context;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater  = LayoutInflater.from(parent.getContext());
        View itemview = layoutInflater.inflate(R.layout.item_home,parent,false);
        return new MyViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(listCategory.get(position).getName());
        holder.tv_price.setText(listCategory.get(position).getPrice());
        holder.imageView.setImageResource(listCategory.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return listCategory.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tv_name,tv_price;
        public MyViewHolder(@NonNull final View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.food_image);
            tv_name = itemView.findViewById(R.id.food_name);
            tv_price = itemView.findViewById(R.id.food_price);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    RemoveItem(getAdapterPosition());
                    Toast.makeText(itemView.getContext(),"Item "+tv_name.getText(), Toast.LENGTH_SHORT).show();
                }
            });

        }
    }
    public void  RemoveItem(int i){
        listCategory.remove(i);
        notifyItemChanged(i);
    }
}
