import java.util.ArrayList;

public class StandardAnalysis {

	

	public ArrayList<String> analyse() {

		ArrayList<String> output = new ArrayList<String>();

		for (String line : AsYouLikeIt.text) {

			//remove all punctuation and place in lower case.
			String body = line.replaceAll("[^A-Za-z\\s]", "").toLowerCase();
			//split into words
			String[] words = body.split(" ");
			for (String word : words) {
				if(word.length() >= 7) {
					if (!output.contains(word)) {
						output.add(word);
					}
				}
			}
		}
		return output;
	}

}
