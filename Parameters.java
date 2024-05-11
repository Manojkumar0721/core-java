public class Parameters{
    public static void main(String[] args){
    

    myMethod("Manoj");
    myMethod("Arjay");
    myMethod("Kiran");

    bachNumber(19);
    bachNumber(21);

    saveContactInfo(701923442,"ManojKumar");
    saveContactInfo(974318691,"Prasanna");

    float z = division(5,7);
    System.out.println(z);

    machine("red");
    machine("green");    



        
    }
    public static void myMethod(String fname){
        System.out.println(fname + " Kumar");
    }

    public static int bachNumber(int rollNUmber){
        if(rollNUmber <= 20){
           System.out.println(rollNUmber + " : You are in 1st Bach");
           return rollNUmber;
        }
        else{
            System.out.println(rollNUmber + " : You are not in 1st Bach");
            return rollNUmber;
        }   
    }
    
    public static void saveContactInfo(long phoneNumber, String personName){
        System.out.println("contact info : " + phoneNumber + "," + personName);
    }

    public static float division(float x, float y){
        return x/y;
    }
    
    public static boolean machine(String button){
        if(button == "red"){
            System.out.println("Machine Turned ON");
            return true;
        }
        else{
            System.out.println("Machine Turned OFF");
            return false;
        }
    }


}
