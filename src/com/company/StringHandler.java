package com.company;

import static com.company.ConvertToArabic.convertRomanToArabic;
import static com.company.ConvertToRoman.IntegerToRomanNumeral;

public class StringHandler {
	private String entry;
	private int indexOfOperator;
	private int firstPart;
	private int secondPart;
	private String operator;
	private String result;
	private boolean hasRoman;

	public StringHandler(String entry){
		this.entry = entry;
		hasRoman=entry.matches("^[^\\d].*");
		parseOfString();
		calc();
	}
	
	public void parseOfString(){
		if(entry.contains("+")){
			indexOfOperator = entry.indexOf("+");
			operator="+";
		}
		if(entry.contains("-")){
			indexOfOperator = entry.indexOf("-");
			operator="-";
		}
		if(entry.contains("*")){
			indexOfOperator = entry.indexOf("*");
			operator="*";
		}
		if(entry.contains("/")){
			indexOfOperator = entry.indexOf("/");
			operator="/";
		}
		String firstPartText=entry.substring(0, indexOfOperator);
		String secondPartText=entry.substring(indexOfOperator+1);
		if(hasRoman){
			firstPart = convertRomanToArabic(firstPartText);
			secondPart = convertRomanToArabic(secondPartText);
		} else {
			firstPart = Integer.parseInt(firstPartText);
			secondPart = Integer.parseInt(secondPartText);
		}
	}

	public void calc(){
		int resultNumber = 0;
		if(operator.equals("+")){
			resultNumber=firstPart+secondPart;
		}
		if(operator.equals("-")){
			resultNumber=firstPart-secondPart;
		}
		if(operator.equals("*")){
			resultNumber=firstPart*secondPart;
		}
		if(operator.equals("/")){
			resultNumber=firstPart/secondPart;
		}
		result = String.valueOf(resultNumber);
		if (hasRoman) {
			result = IntegerToRomanNumeral(Integer.parseInt(result));
		}
	}

	public String getResult()
	{
		return result;
	}

}
