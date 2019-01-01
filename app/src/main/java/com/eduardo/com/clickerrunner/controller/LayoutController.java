package com.eduardo.com.clickerrunner.controller;

import android.view.View;

//controls the layout
public class LayoutController {


    private View store;
    private View worldSelect;
    private View story;
    private View mainGame;
    private View setting;
    private View stats;

    public LayoutController(View store, View worldSelect, View story, View mainGame, View setting, View stats) {
        this.store = store;
        this.worldSelect = worldSelect;
        this.story = story;
        this.stats = stats;
        this.mainGame = mainGame;
        this.setting = setting;
    }

    public void displayWorldSelect() {
        stats.setVisibility(View.GONE);
        store.setVisibility(View.GONE);
        story.setVisibility(View.GONE);
        mainGame.setVisibility(View.GONE);
        setting.setVisibility(View.GONE);
        worldSelect.setVisibility(View.VISIBLE);
    }

    public void displayGameSettings() {
        stats.setVisibility(View.GONE);

        worldSelect.setVisibility(View.GONE);
        store.setVisibility(View.GONE);
        story.setVisibility(View.GONE);
        mainGame.setVisibility(View.GONE);
        setting.setVisibility(View.VISIBLE);
    }

    public void displayStore() {
        stats.setVisibility(View.GONE);
        worldSelect.setVisibility(View.GONE);
        story.setVisibility(View.GONE);
        mainGame.setVisibility(View.GONE);
        setting.setVisibility(View.GONE);
        store.setVisibility(View.VISIBLE);
    }

    public void displayStory() {
        stats.setVisibility(View.GONE);

        worldSelect.setVisibility(View.GONE);
        store.setVisibility(View.GONE);
        mainGame.setVisibility(View.GONE);
        setting.setVisibility(View.GONE);
        story.setVisibility(View.VISIBLE);
    }

    public void displayStats() {
        worldSelect.setVisibility(View.GONE);
        store.setVisibility(View.GONE);
        mainGame.setVisibility(View.GONE);
        setting.setVisibility(View.GONE);
        story.setVisibility(View.GONE);
        stats.setVisibility(View.VISIBLE);
    }

    public void mainScreen() {
        stats.setVisibility(View.GONE);

        worldSelect.setVisibility(View.GONE);
        store.setVisibility(View.GONE);
        story.setVisibility(View.GONE);
        setting.setVisibility(View.GONE);
        mainGame.setVisibility(View.VISIBLE);
    }

}
