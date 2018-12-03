package com.example.roomwordssample;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by salil on 11/26/18.
 */

@Dao
public interface WordDao {
    // methods for DAO (data access object)
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Word word); // method to insert a word
    //
    @Query("DELETE FROM word_table")
    void deleteAll(); // method to delete all words

    @Query("SELECT * from word_table ORDER BY word ASC")
    LiveData<List<Word>> getAllWords(); // method to get all words from the table
}
