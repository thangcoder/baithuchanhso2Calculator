package com.thangcoder.baithuchanhso2calculator;

/**
 * Created by Administrator on 28/09/2016.
 */

public class NumberOperator {

    private int number;
    private String operator;

    public NumberOperator(int number, String operator) {
        this.number = number;
        this.operator = operator;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
}
