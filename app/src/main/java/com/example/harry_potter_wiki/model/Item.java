package com.example.harry_potter_wiki.model;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public class Item {
        @SerializedName("name")
        private String name;
        @SerializedName("discription")
        private String discription;
    }
