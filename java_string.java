import java.util.Scanner;

public class java_string {
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);

        String first_string = sc.nextLine();
        String second_string = sc.nextLine();
        
        int lenofFirstStr = first_string.length();
        int lenofSecondStr = second_string.length();

        System.out.println("The length of the first string is " + lenofFirstStr);
        System.out.println("The length of the first string is " + lenofSecondStr);

        // Here we are comparing the length of given strings
        if(lenofFirstStr == lenofSecondStr) 
        {
            System.out.println("The length of the two strings are the same");
        }
        else System.out.println("The length of the two strings is not the same");

        // Now We are Checking that Two strings are equal or not!
        if(first_string.equals(second_string))
        {
            System.out.println("Two strings are equal");
        }
        else System.out.println("Two strings are not equal");

    }
}