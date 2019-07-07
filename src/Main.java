import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
			
//		StandardAnalysis standardAnalysis = new StandardAnalysis();
		MapReduceAnalysis mapReduceAnalysis = new MapReduceAnalysis();
//		ArrayList<String> longWords = standardAnalysis.analyse();
		ArrayList<String> longWords = mapReduceAnalysis.analyse();

		MapReduceVowelCount mapReduceVowelCount = new MapReduceVowelCount();
		HashMap<String,Integer> vovelHashMap = mapReduceVowelCount.analyse();

		for (String word : longWords) {
		    System.out.println(word);
		}
		System.out.println ("Total: " + longWords.size());

		for (Map.Entry me : vovelHashMap.entrySet()) {
			System.out.println("Key: " + me.getKey() + " & Value: " + me.getValue());
		}
		
	}
}
