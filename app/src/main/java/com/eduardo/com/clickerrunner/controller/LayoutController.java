package com.eduardo.com.clickerrunner.controller;

import android.view.View;

//controls the layout
public class LayoutController {


    private View store;
    private View worldSelect;
    private View story;
    private View mainGame;
    private View setting;

    public LayoutController(View store, View worldSelect, View story, View mainGame, View setting) {
        this.store = store;
        this.worldSelect = worldSelect;
        this.story = story;
        this.mainGame = mainGame;
        this.setting = setting;
    }

    public void displayWorldSelect() {

    }

    public void displayGameSettings() {

    }

    public void displayStore() {

        store.setVisibility(View.VISIBLE);
    }

    public void displayStory() {

    }

    public void displayStats() {

    }

    public void mainScreen() {
        store.setVisibility(View.GONE);
        store.setVisibility(View.INVISIBLE);
    }

}
