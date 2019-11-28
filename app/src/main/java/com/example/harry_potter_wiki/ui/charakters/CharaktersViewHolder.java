package com.example.harry_potter_wiki.ui.charakters;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.harry_potter_wiki.R;

public class CharaktersViewHolder extends RecyclerView.ViewHolder {

    private TextView title;

    public CharaktersViewHolder(@NonNull View itemView) {
        super(itemView);
        title=itemView.findViewById(R.id.title);

    }

    public void setTitle(String title) {
        this.title.setText(title);
    }
}