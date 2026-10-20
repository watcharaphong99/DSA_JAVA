package string;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringForinterview {
    public static void main(String[] args) {

        String bookName = "Platform Engineering on Kubernetes with golang";

        String alternativeBookName1 = new String(String.valueOf(5));
        String alternativeBookName2 = String.valueOf(5);


        //How long of the text?
        int sizeOfMessage = bookName.length();
        System.out.println(sizeOfMessage);

        //Convert to char array
        char[] bookNameChars = bookName.toCharArray();
        System.out.println(bookNameChars);

        //Lowercase, Uppercase
        String uppercaseName = bookName.toLowerCase();
        String lowercaseName = bookName.toUpperCase();
        System.out.println(uppercaseName);
        System.out.println(lowercaseName);

        //Access on spectific index
        char selectedChar = bookName.charAt(4);
        System.out.println(selectedChar);

        //Supbstring
        System.out.println(bookName.substring(15));
        System.out.println(bookName.substring(15,18));

        // Replace
        String newTitle = bookName.replace("golang", "java");
        System.out.println(newTitle);

        String exampleData = "YWz45sfsdfsxgsfjklskdfjksdf==sdfsfd";
        for(var c : exampleData.toCharArray()) {
            System.out.println();
            System.out.println(c);
            System.out.println(Character.isLetter(c));
            System.out.println(Character.isUpperCase(c));
            System.out.println(Character.isDigit(c));
            System.out.println(Character.isLetterOrDigit(c));
        }

        String exampleMessage = "asdfjgjlsdjfksfsrwqwerr";
        int[] counter = new int[26];

        for(var c : exampleMessage.toCharArray()) {
           int distant = c - 'a';
           counter[distant]++;
        }

        System.out.println(Arrays.toString(counter));

        //Converst index back to character
        for (int i =0; i< counter.length; i++) {
            char c = (char) ('a' + i);
            System.out.println(c + ":" + counter[i]);
        }


        //String - Immutable
        //If you want to make it mutable, Organize with StringBuilder
        //and then create String

        String firstName = "Watcharaphong";
        String lastName = "Nuanyong";
        String fullNameWithPlusConcat = firstName + " " + lastName; 

        System.out.println("Name==>" + fullNameWithPlusConcat);

        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        String fullNameWithStringBuilder = sb.toString();
        System.out.println("name==>2"+ fullNameWithStringBuilder);

        // Preview -> JDK 25
        System.out.println("%s %s".formatted(firstName, lastName));
        String message = "Hello, %s!".formatted(firstName);
        System.out.println(message);



    }

    
}
