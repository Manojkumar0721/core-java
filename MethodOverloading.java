
public class MethodOverloading {
    public static void main(String[] args){

        loginInfo("manu07y@gamil.com",7019234429L);
        loginInfo("manu07y@gamil.com",7019234429L,"Manu@123");
        loginInfo("manu07y@gamil.com","Manu@123",7019234429L);
        System.out.println(".............................................................."); 
        BachInfo(9);
        BachInfo(21);
        BachInfo(20,"Manoj");
        BachInfo("Sarvam",21);
        System.out.println("..............................................................");
        carInfo("supra Mk4");
        carInfo("Nissan GTR R34",250);
        carInfo(250,"BMW M5 competition");
        System.out.println("..............................................................");
        student('A');
        student('A',98.5f);
        student(80.45f,'B');
        System.out.println("..............................................................");
        

        int intValue = addingValues(4,5);
        System.out.println("Addition of Int Numbers : " + intValue);

        float floatValue  = addingValues(4.65f,56.765f);
        System.out.println("Addition of Floating Numbers : " + floatValue);

        double doubleValue = addingValues(53.87738d, 65.2726636d);
        System.out.println("Addition of Double Values : " + doubleValue);

        
    

    }

    public static void loginInfo(String email, long phoneNumber ){
        System.out.println("Login Details : " + email + "," + phoneNumber);
    }

     public static void loginInfo(String email, long phoneNumber , String password){
        System.out.println("Login Details : " + email + "," + phoneNumber + "," + password);
    }

     public static void loginInfo(String email, String password, long phoneNumber ){
        System.out.println("Login Details : " + email + "," + password + "," + phoneNumber);
    }





    public static void BachInfo(int rollNumber){
        if(rollNumber <= 20){
            System.out.println("Bach Akatsuki");
        }
        else{
            System.out.println("Bach Swordsman");
        }
    }

    public static void BachInfo(int rollNumber , String name){
      System.out.println("Bach Info : " + rollNumber + "," + name);
    }
    
     public static void BachInfo(String name , int rollNumber){
      System.out.println("Bach Info : " + name + "," + rollNumber);
    }





    public static void carInfo(String carName){
        System.out.println(carName);
    }

     public static void carInfo(String carName,int topSpeed){
        System.out.println(carName + ":" + topSpeed);
    }

     public static void carInfo(int topSpeed , String carName){
        System.out.println(topSpeed + ":" + carName);
    }


    


    public static void student(char grade ){
        System.out.println("Grade : " + grade);
    }

     public static void student(char grade , float percentage){
        System.out.println("Grade : " + grade);
        System.out.println("Percentage : " + percentage);
    }

    public static void student(float percentage , char grade ){
        System.out.println("Percentage : " + percentage);
        System.out.println("Grade : " + grade);
    }





    public static int addingValues(int x , int y){
        return x + y;
    }

    public static float addingValues(float x , float y){
        return x + y;
    }

    public static double addingValues(double x , double y){
        return x + y;
    }



}