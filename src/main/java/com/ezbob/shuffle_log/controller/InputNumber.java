package com.ezbob.shuffle_log.controller;

public class InputNumber {

    private int number;

    public InputNumber(int number) {
        this.number = number;
    }

    public InputNumber() {
    }

    @Override
    public String toString() {
        return "InputNumber{" +
                "number=" + number +
                '}';
    }

    public int getNumber() { return number; }
    public void setNumber(int number) { this.number = number; }
}
