public class Sneakers{
	public static void main(String[] args) {
		
		StringBuffer strb = new StringBuffer("Hi ");
		strb.append("Manoj,");
        strb.append(" Welcome to Java Tutorial");
        System.out.println(strb);

        strb.delete(21,25);
        System.out.println(strb);


        strb.deleteCharAt(9);
        System.out.println(strb);


        strb.reverse();
        System.out.println(strb);

        strb.reverse();
        System.out.println(strb);

        strb.replace(20,20,"Python");
        System.out.println(strb);

        StringBuffer redTape = new StringBuffer("Nice Sneakers,");
        redTape.append("My Favoret color");
        System.out.println(redTape);

        redTape.delete(0,4);
        System.out.println(redTape);

        redTape.reverse();
        System.out.println(redTape);

        redTape.reverse();
        System.out.println(redTape);

        redTape.replace(0,0,"Awsome");
        System.out.println(redTape);


        StringBuffer manoj = new StringBuffer("My Name is Manoj Kumar Y,");
        System.out.println(manoj);
        int size = manoj.length();
        System.out.println(size);

        manoj.append("I Would Like To Become ");
        manoj.append("Java Developper");
        System.out.println(manoj);

        manoj.reverse();
        System.out.println(manoj);


    
	}
}