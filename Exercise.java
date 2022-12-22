import java.util.Scanner;
import java.util.*;

public class Exercise {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int size_of_array = 10;

        String[] array = new String[size_of_array];
        Set<String> hash_set = new HashSet<String>();
        HashMap<String , Integer> map = new HashMap<>();

        for(int i=0;i<size_of_array;i++)
        {
            array[i] = sc.nextLine();
            hash_set.add(array[i]);

            Integer count = map.get(array[i]);
            if(count == null)
            {
                map.put(array[i],1);
            }
            else
            {
                map.put(array[i],count+1);
            }
        }

        // Here we simply printing the content of array list
        System.out.println("List Contains:");
        for(int i=0;i<size_of_array;i++)
        {
            System.out.println(array[i]);
        }

        // Here we are printing the unique strings present in the array
        System.out.println("Set Contains:");
        Iterator itr = hash_set.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        // Here we are printing the frequency of strings 
        System.out.println("Frequency of the words:");

        for (Map.Entry<String, Integer> entry : map.entrySet())
        {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("Word = " + key + " Frequency = " + value);
        }

    }
}