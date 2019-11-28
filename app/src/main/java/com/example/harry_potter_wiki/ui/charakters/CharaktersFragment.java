package com.example.harry_potter_wiki.ui.charakters;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;

import com.example.harry_potter_wiki.R;
import com.example.harry_potter_wiki.adapter.AdapterCharakter;
import com.example.harry_potter_wiki.model.Charakter;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.ArrayList;
import java.util.List;

public class CharaktersFragment extends Fragment {

    private FirebaseFirestore db = FirebaseFirestore.getInstance();

    private RecyclerView recyclerRecipe;
    private AdapterCharakter adapterCharakter;
    private List<Charakter> charakters = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_charakters, container, false);
        recyclerRecipe = root.findViewById(R.id.list_charakter);
        return root;
    }
    public void getCharakter(){
        db.collection("Charakters").get()
                .addOnCompleteListener(task ->{
                    if(task.isSuccessful()){
                        charakters.clear();
                        charakters.addAll(task.getResult().toObjects(Charakter.class));
                        adapterCharakter.notifyDataSetChanged();
                    }else {
                        Log.w("Charakter", "Error getting documents.", task.getException());
                    }
                });
    }
}