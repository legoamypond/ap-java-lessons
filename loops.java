import java.util.Scanner;
public class loops {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
         // break
        // continue
        // return
        
        for (int i = 0; i < 5; i += 1) {
            for (int j = 0; j < 5; j++) {
                
                    System.out.print(j);
            }
            System.out.print('\n');
        }
        // for (int i = 0; i < 5 || j == 5; i++)
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
        boolean isContinuing = true;
        int z = 0;
        while (isContinuing) {
            z++;
            if (z == 20) {
                isContinuing = false;
            }
            System.out.println(z);
        }
                
    
    for (int i = 0; i<100; i++){
        if(i % 5 == 0){
            if(i % 3 == 0){
             System.out.println("Foobar");
            }
            else{
                System.out.println("Foo");
            }
        }
        else{
            if(i % 3 == 0){
                System.out.println("bar");
            }
        }
        }  */
 
    Boolean islost = true;
    int answer = 3; 
    System.out.println("Enter a number: 1-3");
    while(islost){
        int num = Integer.parseInt(input.nextLine());
        if (answer == num){
            System.out.println("Correct!");
            islost = false;
        }
        else{
            System.out.println("Wrong");
        }  
    } 
    
   /* 
    for(int f=1; f<13; f++){
        for (int n=1; n<13; n++){
            System.out.print(n+"  ");   
    }
        for(int s=1; s<13; s++){
            System.out.print();
        }
    }
*/
}
}


