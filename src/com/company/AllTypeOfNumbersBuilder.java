package com.company;

 class AllTypeOfNumbersBuilder {

    AllTypeOfNumbersBuilder(String entry) {
        if (entry.matches("^[^\\d].*")) {
            createRomanNumber(new RomanNumber(entry));
        }else
            createArabicNumber(new ArabicNumber(entry));
    }

    private void createRomanNumber(StringHandler stringHandler) {
        manageByTasks(stringHandler);
    }

    private void createArabicNumber(StringHandler stringHandler) {
        manageByTasks(stringHandler);
    }

    private void manageByTasks(StringHandler stringHandler) {
        stringHandler.parseOfString();
        stringHandler.calc();
        stringHandler.displayResult();
    }
}