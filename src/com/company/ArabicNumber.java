package com.company;

public class ArabicNumber extends StringHandler{
     ArabicNumber(String entry) {
        init(entry);
    }

    @Override
    public void parseOfString() {
        super.parseOfString();
        firstPart = Integer.parseInt(firstPartText);
        secondPart = Integer.parseInt(secondPartText);
    }

    @Override
    protected void displayResult() {
        System.out.println(result);
    }
}
