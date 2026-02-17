public class GetSetTester {
    public static void main(String[] args) {
        GetSet name = new GetSet();
        System.out.println(name.getusername()); 
        name.setUsername("lostforestgirl");
        System.out.println(name.getusername()); 
    }
}

class GetSet{
    //Instance varibles / attributes
    private String username;


    //acsessor methods (getters)
    
    public String getusername(){
        return username;
    }

    public void setUsername(String newUsernmae){
        this.username = newUsernmae;
    }

}
