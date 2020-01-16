package com.company;

public class RomanNumber extends StringHandler{

    RomanNumber(String entry) {
        init(entry);
    }

    @Override
    public void parseOfString() {
        super.parseOfString();
        firstPart =AllTypeOfConvertersBuilder.createConvertToArabic().convert(firstPartText);
        secondPart = AllTypeOfConvertersBuilder.createConvertToArabic().convert(secondPartText);
    }

    @Override
    public void calc() {
        super.calc();
        result= AllTypeOfConvertersBuilder.createConvertToRoman().convert(Integer.parseInt(result));
    }

    @Override
    protected void displayResult() {
        System.out.println(result);
    }
}
