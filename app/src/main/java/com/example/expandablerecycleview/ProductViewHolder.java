package com.example.expandablerecycleview;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ProductViewHolder extends ChildViewHolder {
    private TextView t1;

    public ProductViewHolder(View itemView) {
        super(itemView);
        t1 = itemView.findViewById(R.id.pro);


    }
    public void bind(Product product){
        t1.setText(product.name);
    }
}