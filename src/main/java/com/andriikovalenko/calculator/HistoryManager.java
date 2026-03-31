package com.andriikovalenko.calculator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class HistoryManager {
    private final List<CalculationResult> history;
    private final Gson gson;

    public HistoryManager() {
        this.history = new ArrayList<>();
        this.gson = new GsonBuilder().setPrettyPrinting().create();
    }

    public void addResult(CalculationResult calculationResult) {
        history.add(calculationResult);
    }

    public List<CalculationResult> getHistory() {
        return new ArrayList<>(history);
    }

    public String exportHistoryAsJson() {
        return gson.toJson(history);
    }
}