package StringPermutations;

import java.util.ArrayList;
import java.util.List;

class StringPermutation{
	String temp= "";
	public List<String> getPermutation(String str){
		 List<String> newList = permutation("", str);
		 List<String> uniqueList = new ArrayList<String>();
		   
		 for(int i= 0; i < newList.size(); i++) {		//remove duplicate
			 if(!uniqueList.contains(newList.get(i)))
				 uniqueList.add(newList.get(i));
		    }
		 uniqueList.forEach(System.out::println);
		 return uniqueList;
	}
	/**it gives permutation using recursion
	 * and use temp to store
	 * @param temp-->store the permute string
	 * @param str-->it is given string
	 */
	public List<String> permutation(String temp, String str) {
		List<String> permutations = new ArrayList<>();
	    int strLen = str.length();
	    if (strLen == 0){
	    	 permutations.add(temp);
	    }else{	//recurring condition
	        for(int index = 0; index < strLen; index++){
	        	permutations.addAll(permutation(temp + str.charAt(index),
	        			str.substring(0, index) + str.substring(index+1, strLen)));
	        }
	    }
	    return permutations;
	}
}