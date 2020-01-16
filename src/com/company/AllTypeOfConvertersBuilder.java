package com.company;

 class AllTypeOfConvertersBuilder {

    static Converter<String,Integer> createConvertToArabic() {
        return new ConvertToArabic();
    }

    static Converter <Integer,String> createConvertToRoman() {
        return new ConvertToRoman();
    }
}