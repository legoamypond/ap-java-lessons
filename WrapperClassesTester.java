public class WrapperClassesTester {
    public static void main(String[] args) {
        Wrapper.demoInteger();
    }
}

class Wrapper{
    // demo Integer, Double, Boolean, in seperate methods
    public static void demoInteger(){
        int primitiveInt = 10;
        Integer myInt = 5;

        System.out.println("PrimitiveInt: " + primitiveInt);
        System.out.println("MyInt: "  + myInt);  

        System.out.println("Max int value " + Integer.MAX_VALUE);
        System.out.println("Min int value " + Integer.MIN_VALUE);

        int parsed = Integer.parseInt("25");
        int add = parsed + 5;
        System.out.println("Parsed from String: " +parsed);
        System.out.println("Added from String: " + add);
    }

    public static void demoBooleans(){

        boolean primitiveBool = true;
        Boolean wraperBoolean = Boolean.valueOf(true);

        System.out.println("primitiveBool: " + primitiveBool);
        System.out.println("wraperBoolean: " + wraperBoolean);
        
        boolean parsed = Boolean.parseBoolean("false");
        System.out.println("Parsed bool: " + parsed);
    }

    public static void autoBoxingDemo(){
        //Autoboxing: takes primitive data type --> wraps it in Integer class
        Integer num = 5; 

        // Unboxing: wrapper --> primitive 
        int value = num;

        System.out.println("Autoboxed Integer: " + num);
        System.out.println("Unboxed int: " + value);
    

            
       
    }
}
