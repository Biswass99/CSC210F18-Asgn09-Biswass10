package com.example.roomwordssample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by salil on 11/26/18.
 */
@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "word")

    private String mWord; // instance variable
    //
    // constructor
        public Word(@NonNull String word)
    {
        this.mWord = word;
    }

    // get method to retrieve the word
    public String getWord(){
        return this.mWord;
    }// end getWord
}
