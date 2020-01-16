package com.company;


public abstract class StringHandler {
	private String entry;
	private int indexOfOperator;
	int firstPart;
	int secondPart;
	private String operator;
	String result;
    String firstPartText;
    String secondPartText;

    protected abstract void displayResult();

	void init(String entry){
		this.entry = entry;
	}
	
	public void parseOfString(){
        defineOfOperator();
        firstPartText=entry.substring(0, indexOfOperator);
		secondPartText=entry.substring(indexOfOperator+1);
	}

    private void defineOfOperator() {
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
	}
}
