package com.eduardo.com.clickerrunner.loaders;

import android.content.SharedPreferences;

import com.eduardo.com.clickerrunner.models.CounterMetrics;

public class SharedPreferenceController {
    SharedPreferences store;

    public SharedPreferenceController(SharedPreferences store) {
        this.store = store;
    }

    public void saveCounter(int counter) {
        SharedPreferences.Editor editor = store.edit();
        editor.putInt("counter", counter);
        editor.apply();

    }

    public int getCounter() {
        return store.getInt("counter", 0);
    }

    public CounterMetrics loadSavedCounterMetrice() {
        CounterMetrics current = new CounterMetrics();
        current.setCounter(getCounter());
        return current;
    }

}
