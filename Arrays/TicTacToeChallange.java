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
            int row = random.nextInt(4);
            int collum = random.nextInt(4); 
            if(ticTacBoard[row][collum].contentEquals("o")){
                ticTacBoard[row][collum] = "x";
                oCount -= 1;
            }
       }

       boolean win = false; 
        while(win == false){
            //row    
        for(int row = 0; row<3; row++){
            if((ticTacBoard[row][0].equals("0")) && (ticTacBoard[row][1].equals("o")) && (ticTacBoard[row][2].equals("o"))){
                System.out.println("o wins!");
                break;
            }
            else if((ticTacBoard[row][0].equals("x")) && (ticTacBoard[row][1].equals("x")) && (ticTacBoard[row][2].equals("x"))){
                System.out.println("X wins!");
                break;
            }
            else{
                System.out.println("cat");
                break;
            }
        }

        break;
        }
        
    }
}
