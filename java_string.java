import java.util.Scanner;

public class java_string {
    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in);

        String first_string = sc.nextLine();
        String second_string = sc.nextLine();
        
        int lenOfFirstStr = first_string.length();
        int lenOfSecondStr = second_string.length();

        System.out.println("The length of the first string is " + lenOfFirstStr);
        System.out.println("The length of the first string is " + lenOfSecondStr);

        // Here we are comparing the length of given strings
        if(lenOfFirstStr == lenOfSecondStr) 
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