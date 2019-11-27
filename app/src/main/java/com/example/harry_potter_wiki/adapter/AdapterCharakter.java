package com.example.harry_potter_wiki.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.example.harry_potter_wiki.model.Charakter;
import com.example.harry_potter_wiki.ui.charakters.CharaktersViewModel;

public class AdapterCharakter extends ListAdapter<Charakter, CharaktersViewModel> {

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
    public CharaktersViewModel onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull CharaktersViewModel holder, int position) {

    }
}
