import java.util.Scanner;
public class ComputeAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double testCase[] = new double[10];
        double sum = 0, avg = 0;

       for(int i = 0; i<testCase.length; i++){
        System.out.println("Input score " + i);
        testCase[i] = input.nextInt();
        System.out.println(testCase[i]);
       }

       for (int index = 0; index<testCase.length; index++){
        sum = sum + testCase[index];
        System.out.println(sum);
    }
    avg = (sum/10);
    System.out.println(avg);
    
}}
