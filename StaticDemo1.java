public class StaticDemo1 {
    String name;
    int id;
    static String universityName="BU";

    StaticDemo1(String n,int i){
        name=n;
        id=i;
    }
    void displayInformation(){
        System.out.println("Name: "+name+"\nID: "+id+"\nUniversity Name: "+universityName);
        System.out.println("\n");
    }

    
}
