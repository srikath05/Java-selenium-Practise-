package StringPrograms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighestandSecondHigestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        String sentence = "my name is srikanth and my my name";
		        String result = findSecondHighestFrequencyWord(sentence);
		        System.out.println("Second highest frequency word: " + result);
		    }

		    public static String findSecondHighestFrequencyWord(String sentence) {
		        String[] words = sentence.split(" ");
		        Map<String, Integer> wordCount = new HashMap<>();

		        for (int i = 0; i < words.length; i++) {
		            String word = words[i];
		            wordCount.put(word, wordCount.containsKey(word) ? wordCount.get(word) + 1 : 1);
		        }

		        int highest = 0, secondHighest = 0;
		        String highestWord = "", secondHighestWord = "";
		        
		        List<String> keys = new ArrayList<>(wordCount.keySet());
		        for (int i = 0; i < keys.size(); i++) {
		            String key = keys.get(i);
		            int count = wordCount.get(key);
		            if (count > highest) {
		                secondHighest = highest;
		                secondHighestWord = highestWord;
		                highest = count;
		                highestWord = key;
		            } else if (count > secondHighest && count < highest) {
		                secondHighest = count;
		                secondHighestWord = key;
		            }
		        }

		        return secondHighestWord.isEmpty() ? "No second highest frequency word" : secondHighestWord;
		        
		    }
		


	}


