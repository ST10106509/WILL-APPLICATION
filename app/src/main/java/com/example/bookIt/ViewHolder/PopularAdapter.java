package com.example.bookIt.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookIt.Interface.ItemClickListener;
import com.example.bookIt.R;

public class PopularAdapter extends RecyclerView.ViewHolder implements View.OnClickListener{
    public TextView price, title;
    public ImageView img, whishList;
    private ItemClickListener itemClickListener;

    public PopularAdapter(@NonNull View itemView) {
        super(itemView);
        price = itemView.findViewById(R.id.price);
        title = itemView.findViewById(R.id.title);
        img = itemView.findViewById(R.id.pic);
        whishList = itemView.findViewById(R.id.whishList);

        itemView.setOnClickListener(this);
    }

    public void setItemClickListener(ItemClickListener itemClickListener){
        this.itemClickListener = itemClickListener;
    }
    @Override
    public void onClick(View v) {
        itemClickListener.onClick(v, getAdapterPosition(), false);
    }
}
