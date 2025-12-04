//Two types of varibles: instance/dynamic and static
//Varibles use camelCase
//Constants use uppercase

class Student {
    String studentName; //Dynamic varible, belongs to the object
    static int studentCount = 0; //static varible, belongs to the class
    static final String SCHOOL_NAME = "CSAEA";

    Student(String n){
        studentName = n;
        System.out.println(n + "Is a student at " + SCHOOL_NAME);

        studentCount++;
        System.out.println("Number of Students: " + studentCount);
    }
}
public class Variables{
    public static void main(String[]args){
    new Student("Alex");
    new Student("Joanna");
    new Student("Jason");
    new Student("Elise");
    new Student("Leslie");

}   

}