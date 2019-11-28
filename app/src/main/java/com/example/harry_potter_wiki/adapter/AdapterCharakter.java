package com.example.harry_potter_wiki.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.harry_potter_wiki.R;
import com.example.harry_potter_wiki.model.Charakter;
import com.example.harry_potter_wiki.ui.charakters.CharaktersViewHolder;
public class AdapterCharakter extends ListAdapter<Charakter, CharaktersViewHolder> {

    public AdapterCharakter() {
        super(DIFF_CALLBACK);
    }

    private static final DiffUtil.ItemCallback<Charakter> DIFF_CALLBACK = new DiffUtil.ItemCallback<Charakter>() {
        @Override
        public boolean areItemsTheSame(@NonNull Charakter charakter, @NonNull Charakter t1) {
            return charakter.getName().equals(t1.getName());
        }

        @Override
        public boolean areContentsTheSame(@NonNull Charakter charakter, @NonNull Charakter t1) {
            return charakter.getName().equals(t1.getName());
        }
    };

    @NonNull
    @Override
    public CharaktersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_charakter,parent,false);
        return new CharaktersViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CharaktersViewHolder holder, int position) {
        Charakter charakter = getItem(position);
        holder.setTitle(charakter.getName()+" "+ charakter.getSurname());

    }
}
