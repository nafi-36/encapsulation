package coba;
// childclass
public class person {
    
    public static void main(String[] args) {

    encap cap = new encap();
    cap.setName("John"); 
    cap.setAge (17);
    System.out.println("Name : " + cap.getName()); 
    System.out.println("Age : " + cap.getAge()); 
    }
    
}

