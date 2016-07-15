package assignment1;

public class PyramidPattern {
	
	/**
	 * This method is used to get desired pattern.
	 * It calls getSpaces() and getNumberSeries() and then
	 * insert the concatenated series in a string array.
	 * @param rowCount This is number of rows
	 * @return String[] This returns an array of strings containing desired pattern
	 * */
	public String[] getPyramidPattern(int rowCount){
		String spaces, numberSeries;
		String pattern[]= new String[2*rowCount-1];
		int count= 0;
		
		for(int i=1; i<=rowCount; i++){
			spaces= getSpaces(rowCount, i);
			numberSeries= getNumberSeries(i);
			pattern[count++]= spaces + numberSeries;	
		}
		for(int i= rowCount-1; i>=1; i--){
			spaces= getSpaces(rowCount, i);
			numberSeries= getNumberSeries(i);
			pattern[count++]= spaces + numberSeries;	
		}
		return pattern;
	}
	
	/**
	 * This method is used to get desired number of spaces.
	 * @param rowCount This is number of rows
	 * @param iteration This is number of iteration
	 * @return String This will return spaces in a string
	 * */
	public String getSpaces(int rowCount, int iteration){
		String temp= "";
		
		while(rowCount>iteration){
			temp+= " ";
			rowCount--;
		}
		return temp;
	}
	
	/**
	 * This method will get number series according to the current iteration.
	 * @param iteration This is current iteration number.
	 * @return String This will return number series in a String.
	 * */
	public String getNumberSeries(int iteration){
		String noSeries= "";
		int temp= iteration, j= 1;
		
		while(j<=iteration){
			noSeries+= ""+j;
			j++;
		}
		while(temp>1){
			noSeries+= ""+(temp-1);
			temp--;
		}	
		return noSeries;
	}
}