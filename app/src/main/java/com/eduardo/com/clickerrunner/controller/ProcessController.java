package com.eduardo.com.clickerrunner.controller;

import android.widget.TextView;

import com.eduardo.com.clickerrunner.loaders.SharedPreferenceController;


public class ProcessController {
    private CounterController counterController;
    private TextView counterView;
    private SharedPreferenceController storage;

    public ProcessController(TextView counterView, SharedPreferenceController storage) {
        this.storage = storage;
        this.counterView = counterView;
        counterController = new CounterController(storage.loadSavedCounterMetrice());
        this.counterView.setText("counter "+String.valueOf(counterController.getCounter()));
    }

    public void incrementCounter() {

        this.counterController.incrementCounter();
        int currentCounter = counterController.getCounter();
        storage.saveCounter(currentCounter);
        this.counterView.setText("counter "+String.valueOf(currentCounter));

    }



}
