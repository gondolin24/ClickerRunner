package com.eduardo.com.clickerrunner.controller;

import android.os.Vibrator;
import android.widget.TextView;

import com.eduardo.com.clickerrunner.loaders.SharedPreferenceController;


public class ProcessController {
    private CounterController counterController;
    private TextView counterView;
    private SharedPreferenceController storage;
    private Vibrator sexyVibrator;

    public ProcessController(TextView counterView, SharedPreferenceController storage, Vibrator sexyVibrator) {
        this.storage = storage;
        this.sexyVibrator = sexyVibrator;
        this.counterView = counterView;
        counterController = new CounterController(storage.loadSavedCounterMetrics());
        this.counterView.setText("counter " + String.valueOf(counterController.getCounter()));
    }

    public void incrementCounter() {
        vibrate();
        this.counterController.incrementCounter();
        int currentCounter = counterController.getCounter();
        storage.saveCounter(currentCounter);
        this.counterView.setText("counter " + String.valueOf(currentCounter));

    }

    private void vibrate() {
        //get vibrate  toggle/time from setting
        this.sexyVibrator.vibrate(400);
    }

}
