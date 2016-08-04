package Concordance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Concordance {

	/**
	 * This method counts occurrence of each letter of input string and save it
	 * to Map accordingly
	 * 
	 * @param input String to check for concordance
	 * @return It returns Map with character as keys and list of integers as
	 *         values
	 */
	public Map<Character, List<Integer>> concordanceCharacter(String input) {
		Map<Character, List<Integer>> map = new HashMap<Character, List<Integer>>();

		for (int index = 0; index < input.length(); index++) {

			char letter = input.charAt(index);
			if (letter == ' ') {

				continue;
			}

			List<Integer> list = map.get(letter);
			if (list == null) {
				list = new ArrayList<Integer>();
			}
			list.add(index);
			map.put(letter, list);
		}
		return map;
	}
}
