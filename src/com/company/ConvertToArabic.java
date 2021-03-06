package com.company;

import static com.company.ConstantsStore.romanNumbers;

public class ConvertToArabic implements Converter<String, Integer>{

    @Override
    public Integer convert(String textOperand) {
        for(int i=0; i<romanNumbers.length; i++){
            if(romanNumbers[i].equals(textOperand)){
                return i+1;
            }
        }
        return 0;
    }
}
