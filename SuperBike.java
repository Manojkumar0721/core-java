public class SuperBike{

    String bikeName;
	int displacement;
	float horsePower;
	float torqe;
    static String transmission;
    static String transmissionType;
    static String coolingSystem;
    static String speedometer;
    static String brakeCaliper;

    static{
    	transmission = "6 Speed Manual";
    	transmissionType = "Chain Drive";
    	coolingSystem = "Liquid Cooled";
    	speedometer = "Digital";
    	brakeCaliper = "Brembo Brake Calipers";
    }

    public SuperBike(String bikeName,int displacement,float horsePower,float torqe){
    	this.bikeName = bikeName;
    	this.displacement = displacement;
    	this.horsePower = horsePower;
    	this.torqe = torqe;
    	
    }

    public static void main(String[] args) {
    	SuperBike superBike1 = new SuperBike("Kawasaki ZX10 RR",998,197.2f,113.5f);
    	printSuperBikeInfo(superBike1);

    	SuperBike superBike2 = new SuperBike("Ducati Panigale V4",1103,212.5f,123.6f);
    	printSuperBikeInfo(superBike2);

    }

    public static void printSuperBikeInfo(SuperBike superBike){
    	System.out.println("-------------------------------------");
    	System.out.println("Bike Name : " + superBike.bikeName);
    	System.out.println("Dispacement : " + superBike.displacement + "CC");
    	System.out.println("Horse Power : " + superBike.horsePower + "HP");
    	System.out.println("Torqe : " + superBike.torqe + "Nm");
    	System.out.println("Transmission : " + superBike.transmission);
    	System.out.println("TransmissionType : " + superBike.transmissionType);
    	System.out.println("CoolingSystem : " + superBike.coolingSystem);
    	System.out.println("Speedometer : " + superBike.speedometer);
    	System.out.println("Brake Calipers : " + superBike.brakeCaliper);
    }

}