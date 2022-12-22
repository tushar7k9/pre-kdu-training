import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MostRepWord {
  public static void main(String[] args) {

    // Read the CSV file and store its contents in a Map.

    Map<String, Integer> word_Counts = new HashMap<>();
    try (BufferedReader reader = new BufferedReader(new FileReader("InputData.csv"))) 
    {
      String line;
      while ((line = reader.readLine()) != null) 
      {
        String[] words = line.split(",");
        for (String word : words) 
        {
            // Remove whitespace.
          word = word.trim(); 
          if (word_Counts.containsKey(word)) 
          {
            word_Counts.put(word, word_Counts.get(word) + 1);
          } 
          else 
          {
            word_Counts.put(word, 1);
          }
        }
      }
    } 
    catch (IOException e) 
    {
      System.out.println("Error reading CSV file: " + e.getMessage());
      return;
    }

    // Create a PriorityQueue to store the top 3 most repeated words.
    PriorityQueue<Map.Entry<String, Integer>> topWords = new PriorityQueue<>(3, (a, b) -> b.getValue() - a.getValue());

    // Add all the words and their counts to the PriorityQueue.
    for (Map.Entry<String, Integer> entry : word_Counts.entrySet()) {
      topWords.add(entry);
    }

    // Print the top 3 most repeated words.
    for (int i = 0; i < 3; i++) {
      Map.Entry<String, Integer> entry = topWords.poll();
      if (entry == null) {
        break;
      }
      System.out.println(entry.getKey());
    }
  }
}
