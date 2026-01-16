import java.util.Random;
public class TicTacToeChallange {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] ticTacBoard = new String[3][3]; 
        int xCount = 0;
        int oCount = 0; 
        for(int i =  0; i < ticTacBoard.length; i++){
            System.out.println();
            for(int j = 0; j < ticTacBoard[i].length; j++){
                int nextMarkInt = random.nextInt(2);
                String nextMark = "o";
                if(nextMarkInt == 1){
                    if(xCount == 5){
                        nextMark = "o";
                        oCount++;
                    }
                    else{
                        nextMark = "x";
                        xCount++;
                    }
                }
                else{
                    nextMark = "o";
                    oCount++; 
                }
                ticTacBoard[i][j] = nextMark;
                System.out.print(ticTacBoard[i][j]+" ");
         }
        }
       while(oCount >= 6){
        while(true){
            int row = random.nextInt(4);
            int collum = random.nextInt(4); 
            if(ticTacBoard[row][collum].contentEquals("o")){
                ticTacBoard[row][collum] = "x";
                oCount -= 1;
            }
        }
       }
        /*//Rows
        for(int row = 0; row<3; row++){
            System.out.println();
            System.out.println(ticTacBoard[row][row]);
            if(ticTacBoard[row][row] == "x"){
                System.out.println("Yep");
            }
    
        }*/
    }
}
