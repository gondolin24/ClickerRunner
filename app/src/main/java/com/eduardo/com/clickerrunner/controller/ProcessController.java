package com.eduardo.com.clickerrunner.controller;

import android.widget.TextView;

import com.eduardo.com.clickerrunner.models.CounterMetrics;


public class ProcessController {
    private CounterController counterController;
    private TextView counterView;

    public ProcessController(TextView counterView) {
    counterController = new CounterController(new CounterMetrics());
        this.counterView = counterView;
    }

    public void incrementCounter() {

        this.counterController.incrementCounter();
        this.counterView.setText(String.valueOf(counterController.getCounter()));

    }

}
