package com.example.roomwordssample;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;

import java.util.List;

/**
 * Created by salil on 11/28/18.
 */

public class WordViewModel extends AndroidViewModel{

    // instance variables
    private WordRepository mRepository;
    private LiveData<List<Word>> mAllWords;

    // constructor
    public WordViewModel (Application application) {
        super(application);
        mRepository = new WordRepository(application);
        mAllWords = mRepository.getAllWords();
    }
    // getter method that gets all the words
    LiveData<List<Word>> getAllWords() {
        return mAllWords;
    }

    // wrapper method insert
    public void insert(Word word) {
        mRepository.insert(word);
    }
}// end class WordViewModel
