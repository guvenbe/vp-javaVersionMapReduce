import java.util.ArrayList;
import java.util.HashMap;


public class MapReduceAnalysis {

	ArrayList<String> output = new ArrayList<String>();

	public ArrayList<String> map(String line) {
		ArrayList<String> result = new ArrayList<String>();
		//remove all punctuation and place in lower case.
		String body = line.replaceAll("[^A-Za-z\\s]", "").toLowerCase();
		//split into words
		String[] words = body.split(" ");
		for (String word : words) {
			if(word.length() >= 7) {
				if (!result.contains(word)) {
					result.add(word);
				}
			}

		}
		return result;
	}

	public void reduce(ArrayList<String> words) {
		for (String word : words) {
			if (!output.contains(word)) {
				output.add(word);
			}
		}
	}

	public ArrayList<String> analyse() {



		//Part 1  - map
		ArrayList<String> output1 = map(AsYouLikeIt.text[0]);
		ArrayList<String> output2 = map(AsYouLikeIt.text[1]);
		ArrayList<String> output3 = map(AsYouLikeIt.text[2]);
		ArrayList<String> output4 = map(AsYouLikeIt.text[3]);
		ArrayList<String> output5 = map(AsYouLikeIt.text[4]);
		ArrayList<String> output6 = map(AsYouLikeIt.text[5]);
		ArrayList<String> output7 = map(AsYouLikeIt.text[6]);
		ArrayList<String> output8 = map(AsYouLikeIt.text[7]);

		//Part 2 - reduce
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
