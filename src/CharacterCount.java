import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void countCharacters(String s) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Counting the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {  //for loop created
            char c = s.charAt(i);   //characters are assigned as variables
            if (charCountMap.containsKey(c)) {
                int count = charCountMap.get(c);
                charCountMap.put(c, count + 1); //to count multiple characters
            } else {
                charCountMap.put(c, 1); //creating a new entry
            }
        }

        // Printing the count of each character in the string
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            System.out.println(c + ": " + count);
        }
    }

    public static void main(String[] args) {
        String s = "Home Alone";
        countCharacters(s);
    }
}
