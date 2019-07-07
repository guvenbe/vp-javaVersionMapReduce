import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;


public class MapReduceVowelCount {

	HashMap<String,Integer> output = new HashMap<String,Integer>();
//	Function<List<String>, List<String>> listFunction = (words)->{ words.forEach();
//
//	};

	public HashMap<String,Integer> map(String line) {
		HashMap<String,Integer> result = new HashMap<String,Integer>();
		result.put("a",0);
		result.put("e",0);
		result.put("i",0);
		result.put("o",0);
		result.put("u",0);


		char[] chars = line.toLowerCase().toCharArray();
		for (char letter : chars){
			String sLetter=String.valueOf(letter);
			if (result.containsKey(sLetter)){
				result.put(sLetter,result.get(sLetter) +1);
			}
		}

		return result;
	}

	public void reduce(HashMap<String,Integer> letters) {

		for (String key :letters.keySet()){
			output.put(key, output.get(key) + letters.get(key));
		}
		
	}
	

	public HashMap<String,Integer> analyse() {

		//Part 1  - map
		HashMap<String,Integer> output1 = map(AsYouLikeIt.text[0]);
		HashMap<String,Integer> output2 = map(AsYouLikeIt.text[1]);
		HashMap<String,Integer> output3 = map(AsYouLikeIt.text[2]);
		HashMap<String,Integer> output4 = map(AsYouLikeIt.text[3]);
		HashMap<String,Integer> output5 = map(AsYouLikeIt.text[4]);
		HashMap<String,Integer> output6 = map(AsYouLikeIt.text[5]);
		HashMap<String,Integer> output7 = map(AsYouLikeIt.text[6]);
		HashMap<String,Integer> output8 = map(AsYouLikeIt.text[7]);

		//Part 2 - reduce
		output.put("a",0);
		output.put("e",0);
		output.put("i",0);
		output.put("o",0);
		output.put("u",0);
		
		reduce(output1);
		reduce(output2);
		reduce(output3);
		reduce(output4);
		reduce(output5);
		reduce(output6);
		reduce(output7);
		reduce(output8);


		return output;

	}

}
