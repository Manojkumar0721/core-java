public class ReturnTypeExample{
    public static void main(String[] args){

    int value = intNum();
    System.out.println("Int value: " + value);

    byte byteValue = byteNum();
    System.out.println("Byte value:"+ byteValue);

    short shortValue = shortNum();
    System.out.println("Short value: " + shortValue);


    long longValue = longNum();
    System.out.println("Long value: " + longValue);

    float floatValue = floatNum();
    System.out.println("Float value: " + floatValue);


    double doubleValue = doubleNum();
    System.out.println("Double value: " + doubleValue);
    boolean writing = write();
    System.out.println("Boolean value: " + writing);

    char obtainedGrade = grade();
    System.out.println("Char value: " + obtainedGrade);

    }

    public static int intNum(){
        int value = 10;
        return value;
    }
     public static byte byteNum(){
        byte byteValue = 100;
        return byteValue;
    }
     public static short shortNum(){
        short shortValue = 1000;
        return shortValue;
    }
     public static long longNum(){
        long longValue = 200000L;
        return longValue;
    }
     public static float floatNum(){
        float floatValue = 3.14f;
        return floatValue;
    }
     public static double doubleNum(){
        double doubleValue = 4.670d;
        return doubleValue;
    }
     public static boolean write(){
        boolean writing = true;
        return writing;
    }
     public static char grade(){
        char obtainedGrade = 'A';
        return obtainedGrade;
    }
    
}
