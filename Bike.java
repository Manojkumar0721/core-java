public class Bike{
    public static void main(String[] args){
        System.out.println("--------------------**--------------------");
        System.out.println("               BMW S1000RR                ");
        System.out.println("--------------------**--------------------");
        System.out.println("                                           ");
        System.out.println("   VARIANT                     Price");
        System.out.println("S1000 RR Standard         Price : 20,75,000");
        System.out.println("S1000 RR Pro              price : 23,10,000");
        System.out.println("S1000 RR M Sport          price : 25,25,000");
        System.out.println("-------------------------------------------");

       specifications();
       features();
       about();
    }
    public static void specifications(){
        System.out.println("SPECIFICATIONS");
        System.out.println("Engine      : 999cc");
        System.out.println("Power       : 212.91PS");
        System.out.println("Torque      : 113Nm");
        System.out.println("Mileage     : 15.62Kmpl");
        System.out.println("Kerb Weight : 198Kg");
        System.out.println("Brakes      : Double Disc");
        System.out.println("..............................");
    }

    public static void features(){
        System.out.println("FEATURES");
        System.out.println("ABS                 : DUual Channel");
        System.out.println("Mobile Connectivity : Bluetooth");
        System.out.println("Riding Modes        : Rain,Road,Dynamic");
        System.out.println("..............................");
    }

    public static void about(){
        System.out.println("BMW S1000 RR is a race oriented sport bike initially made by BMW Motorrad to compete in the 2009 Superbike World Championship");

    }
    
}