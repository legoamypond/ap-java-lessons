import java.util.Scanner;
public class UserInput {
    
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);

    System.out.println("Enter your name");
    String name = input.nextLine();
    System.out.println(name);
    
    System.out.println("Age");
    String age = input.nextLine();
    int ageConverted = Integer.parseInt(age);
    System.out.println("Next year " + name + " will be " + (ageConverted + 1));

    System.out.println("What is your height in meters");
    double height = Double.parseDouble(input.nextLine());
    System.out.println("You are " + height + " meters tall.");
        
    System.out.println("Enter name1: ");
    String name1 = input.nextLine();
    
    System.out.println("Enter name2: ");
    String name2 = input.nextLine();

    System.out.println("Enter num1");
    int num1 = Integer.parseInt(input.nextLine());
    
    System.out.println("Enter num2");
    int num2 = Integer.parseInt(input.nextLine());
    int newNum = 0;
    if(num1+num2<100){
            newNum = num1+num2;
        }
    else{
            newNum = num1-num2;
        } 


    System.out.println(name1+name2+newNum+"@gmail.com");

    System.out.print("Enter Decimal1 ");
    double double1 = Double.parseDouble(input.nextLine()); 
    
    System.out.print("Enter Decimal2 ");
    double double2 = Double.parseDouble(input.nextLine());

    double q = double1/double2;
    System.out.println(q);

    System.out.println("Enter a diameter as a double ");
    double diameter = Double.parseDouble(input.nextLine());
    double radius = diameter/2;

    System.out.println(radius);
    double area = Math.PI*Math.pow(radius,2);
    System.out.println(area);

    input.close();

     



}



    

}
