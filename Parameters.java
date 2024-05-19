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
     myNote("Saikumar");
       

        guessPrice(2000);
        guessPrice(3000);
        guessPrice(4000);

        hospital(7);
        hospital(12);
        hospital(24);

        longNumber(9223372036854775807L);
        longNumber(2377763524536378373L);

        floatValue(3.4567366f);
        floatValue(7.7777777f);

        doubleValue(2.46867363563763d);


        friendInfo("Manoj" , 7019234429L);
        friendInfo("Sarvam" , 3876872672L);



        
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
    
    public static void myNote(String name){
        System.out.println("WELL COME "+ name +" TO MY HOME");
    }

    public static void guessPrice(int price){
        if(price == 4000){
            System.out.println("Your guess is correct");
        }
        else{
            System.out.println("Your guess is wrong");
        }
    }

    public static void hospital(int token){
        if(token <= 20){
            System.out.println("Chekup Timming Is  9:00 to 1:00");
        }
        else{
            System.out.println("Chekup Timming Is 2:00 to 3:00");
        }
    }

    public static void longNumber(long digits){
        System.out.println("Long Stores Whole Numbers from -9,223,373,036,854,775,808 to 9,223,372,036,854,775,807 : " + digits);
    }

    public static void floatValue(float floatingNumber){
        System.out.println("Float datatype stores upto 6 to 7 decimal digits : " + floatingNumber );
    }

    public static void doubleValue(double doubleNumber){
        System.out.println("double datatype stores upto 15 decimal digits : " + doubleNumber );
    }

    public static void friendInfo(String nameOfPerson , long phoneNumber){
        System.out.println("Contact Info : " + nameOfPerson + "," + phoneNumber);
    }


}
