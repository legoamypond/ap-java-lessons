import java.util.Scanner;
public class GetSetTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        GetSet name = new GetSet();
        System.out.println(name.getusername()); 
        name.setUsername("lostforestgirl");
        System.out.println(name.getusername()); 
        
        System.out.println(name.getid());
        name.setid(124);
        System.out.println(name.getid());
        
        System.out.println(name.getRank());
        name.setRank("NOOB");
        System.out.println(name.getRank());
        
        GetSet player1 = new GetSet();
        System.out.println("Enter a username");
        String username1 = input.nextLine();
        player1.setUsername(username1);
        System.out.println(player1.getusername());

        System.out.println("Enter an Id");
        player1.setid(Integer.parseInt(input.nextLine()));
        System.out.println(player1.getid());

        System.out.println("Enter a rank");
        String rank1 = input.nextLine();
        player1.setRank(rank1);
        System.out.println(player1.getRank());

        String checkRank = player1.getRank();

        if (checkRank.equals("Stone")){
            System.out.println("Get good lol");
        }
        if (checkRank.equals("Iorn")){
            System.out.println("Get more good lol");
        }
        if (checkRank.equals("Gold")){
            System.out.println("Getting better");
        }
        if (checkRank.equals("Dimond")){
            System.out.println("Good job");
        }


        input.close();
    }
}

class GetSet{
    //Instance varibles / attributes
    private String username;
    private int id;
    private String rank;


    //Username methods
    
    public String getusername(){
        return username;
    }
    public void setUsername(String newUsernmae){
        this.username = newUsernmae;
    }

    //Id challenge
    public int getid(){
        return id;
    }
    public void setid(int newId){
        this.id = newId;
    }
// Rank methods
    public String getRank(){
        return rank;
    }
    public void setRank(String newRank){
        this.rank = newRank;
    }
    
}

/*
CHALLENGE 1
In the GetSetTester.java file:

ADD an ID attribute
ADD a "rank" attribute: (5 ranks of your choice, like N00b, Bruh, Novice, Hacker, Gawdlike)

Create getters and setters (mutator methods) for both.
Test by printing setters and getters

CHALLENGE 2
Take in user input for a username, ID, and Rank.
Set input data for a new player object.

CHALLENGE 3
Create conditional logic to display a person's level based on their rank.
For example: if your rank is "Hacker" display "You are one powerful hacker!" */