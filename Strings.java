public class Strings {
    public static void main(String[] args){

        String nameObj = new String("CeCe");

        // 0 1 2 3
        // C e C e

        String name1 = "CeCe";
        String name2 = "Melo";
        String name3 = "Melo";

        System.out.println("name1 and name2 " + name1.equals(name2));
        System.out.println("name1 and nameObj " + name1.equals(nameObj));
        System.out.println("name1 and nameObj " + (name1 == nameObj)); //False because diffrent memory adress
        System.out.println("name2 and name3" + (name2 == name3)); //Prints TRUE :( because weird, not a new object 


        //compareTo 
        System.out.println("Compare: " + name1.compareTo(name2)); //Takes the first letter of the word and counts how many jumps there are from one word to the next
        
        //.length
         System.out.println("# of chars in string" + name1.length()); //Prints how many charecters in string

         //indexOf
         System.out.println("Index select: " + name2.indexOf("o")); // prints first intance in index

         //charAt
         System.out.println("Index select: " + name2.charAt(2));//Gives the letter at that index
        
         //Sub strings
         String quote = "Talk is cheap, show me the code";
         String result1 = quote.substring(15); // start at 15 and give evrything else afterwards
         String result2 = quote.substring(5,13);

         System.out.println("Full quote "+ quote);
         System.out.println("Substring1 "+ result1);
         System.out.println("Full quote "+ result2 );
    }
}
