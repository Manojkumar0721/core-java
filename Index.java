
public class Index{
    public static void main(String[] args){

        byte[] time = {1,2,3,4,5,6,7,8,9,10,11,12};

        System.out.println(time[6]);

        for(int i=0;i<12;i++){
            System.out.println(time[i]);
        }

        short[] score = {200,210,180,195,176,189};

        for(int i=0;i<6;i++){
            System.out.println(score[i]);
        }

        int[] age = {20,25,30,34,36,40,45,50};

        System.out.println(age[6]);

        System.out.println(age.length);

        for(int i=0;i<8;i++){
            System.out.println(age[i]);
        }

        long[] phoneNumber = {7019234429L,9743186912L,8754162565L};

        for(int i=0;i<3;i++){
            System.out.println(phoneNumber[i]);
        }

        
       float[] flaotNumbers = {4.63f,7.434f,7.89f,6.78f,9.763535f};

       for(int i=0;i<5;i++){
        System.out.println(flaotNumbers[i]);
       }

       double[] doubleNumber = {2.534778373868d,3.6387483494d,4.67373827327d};

       for(int i=0;i<3;i++){
        System.out.println(doubleNumber[i]);
       }

       char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

       for(int i=0;i<24;i++){
        System.out.println(alphabets[i]);
       }

       boolean[] booleanValues = {true,true,false,true,false};

       for(int i=0;i<5;i++){
        System.out.println(booleanValues[i]);
       }

       String[] brother = {"Saikumar","Akhilesh","Siddlinga","Altaf","Sudarshan","Basavaraj","Adithya","Naveen","Revan","prabhu","Abhijeet","Manjunath",};

       System.out.println(brother.length);

       for(int i=0;i<12;i++){
        System.out.println(brother[i]);
       }

    }




}



