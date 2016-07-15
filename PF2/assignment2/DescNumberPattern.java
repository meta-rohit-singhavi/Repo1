package assignment2;

public class DescNumberPattern {
	
	/**
	 * This method is used to get desired pattern.
	 * It calls getSpaces() and getNumberSeries() and then
	 * insert the concatenated series in a string array.
	 * @param rowCount This is number of rows
	 * @return String[] This returns an String array containing desired pattern
	 * */
	public String[] getDescNumberPattern(int rowCount){
		if(rowCount<0){
			System.out.println("Number is negative");
			System.exit(0);
		}
		
		int count= 0;
		String spaces, noSeries;
		String noPattern[]= new String[rowCount];
		
		for(int i=1; i<=rowCount; i++){
			spaces= getSpaces(i);
			noSeries= getNumberSeries(rowCount, i);
			noPattern[count++]= (spaces + noSeries);	
		}
		for(int i=0; i<noPattern.length; i++){
			System.out.println(noPattern[i]);
		}
		return noPattern;
	}

	/**
	 * This method is used to get desired number of spaces.
	 * @param rowCount This is number of rows
	 * @param iteration This is number of iteration
	 * @return String This will return spaces in a string
	 * */
	public String getSpaces(int iteration){
		String temp= "";
		while(iteration>1){
			temp+= " ";
			iteration--;
		}
		return temp;
	}
	
	/**
	 * This method will get number series according to the current iteration.
	 * @param iteration This is current iteration number.
	 * @return String This will return number series in a String.
	 * */
	public String getNumberSeries(int rowCount, int iteration){
		String temp= "";
		int number= 1;
		
		while(iteration<=rowCount){
			temp+= ""+number;
			iteration++;
			number++;
		}
		return temp;
	}
}