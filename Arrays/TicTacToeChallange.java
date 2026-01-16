import java.util.Random;
public class TicTacToeChallange {
    public static void main(String[] args) {
        Random random = new Random();
        String[][] ticTacBoard = new String[3][3]; 
        int xCount = 0;
        for(int i =  0; i < ticTacBoard.length; i++){
            System.out.println();
            for(int j = 0; j < ticTacBoard[i].length; j++){
                int nextMarkInt = random.nextInt(2);
                String nextMark = "o";
                if(nextMarkInt == 1){
                    if(xCount == 4){
                        nextMark = "o";
                    }
                    else{
                        nextMark = "x";
                        xCount++;
                    }
                }
                else{
                    nextMark = "o"; 
                }
                ticTacBoard[i][j] = nextMark;
                System.out.print(ticTacBoard[i][j]+" ");
        }
        }
    }
}
