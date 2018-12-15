package com.eduardo.com.clickerrunner.controller;

import com.eduardo.com.clickerrunner.models.CounterMetrics;

public class CounterController {

    private CounterMetrics counter;

    public CounterController(CounterMetrics counter){
        this.counter = counter;
    }

    public void incrementCounter(){
      int currentCounter =  this.counter.getCounter();
        this.counter.setCounter(currentCounter+1);
    }

}
