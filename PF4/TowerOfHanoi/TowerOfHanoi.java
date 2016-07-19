
public class TowerOfHanoi {

	int i=0;
/**
 * This method will calculate the steps for input number of discs
 * and store the steps in string array
 * @param discs
 * @param start
 * @param aux
 * @param end
 * @param result
 * @return It will return string array containing steps
 */
	public String[] solveTOH(int discs, String start, String aux, String end,String[] result){
		
		if(discs == 1){
			
			result[i++]= start+"->"+end;
		}
		else{
			solveTOH(discs-1, start, end, aux, result);
			result[i++]= start+"->"+end;
			solveTOH(discs-1, aux, start, end, result);
		}
		return result;
	}
}
