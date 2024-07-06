public class SportsBike{
	String brandName;
	String bikeName;
	int price;
	float engineCapacity;
	int mileage;
	float fuelTankCapacity;

	public Bike(String brandName,String bikeName,int price,float engineCapacity,int mileage,float fuelTankCapacity){
		this.brandName = brandName;
		this.bikeName = bikeName;
		this.price = price;
		this.engineCapacity = engineCapacity;
		this.mileage = mileage;
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public static void main(String[] args) {

		Bike bike1 = new Bike("Kawasaki","Kawasaki Ninja ZX-10RR",1700000,998.0f,15,17.0f);
			System.out.println("-->Specifications of Bike1");
			System.out.println(bike1.brandName);
			System.out.println(bike1.bikeName);
			System.out.println(bike1.price);
			System.out.println(bike1.engineCapacity+"CC");
			System.out.println(bike1.mileage+"kmpl");
			System.out.println(bike1.fuelTankCapacity+"L");

		Bike bike2 = new Bike("Kawasaki","Kawasaki Ninja H2R",79990000,998.0f,15,17.0f);
			System.out.println("-->Specifications of Bike2");
			System.out.println(bike2.brandName);
			System.out.println(bike2.bikeName);
			System.out.println(bike2.price);
			System.out.println(bike2.engineCapacity+"CC");
			System.out.println(bike2.mileage+"kmpl");
			System.out.println(bike2.fuelTankCapacity+"L");

		Bike bike3 = new Bike("Honda","Honda CBR1000RR-R",2362720,1000.0f,18,16.1f);
			System.out.println("-->Specifications of Bike3");
			System.out.println(bike3.brandName);
			System.out.println(bike3.bikeName);
			System.out.println(bike3.price);
			System.out.println(bike3.engineCapacity+"CC");
			System.out.println(bike3.mileage+"kmpl");
			System.out.println(bike3.fuelTankCapacity+"L");

		Bike bike4 = new Bike("BMW","BMW S1000RR",2075000,999.0f,16,16.5f);
			System.out.println("-->Specifications of Bike4");
			System.out.println(bike4.brandName);
			System.out.println(bike4.bikeName);
			System.out.println(bike4.price);
			System.out.println(bike4.engineCapacity+"CC");
			System.out.println(bike4.mileage+"kmpl");
			System.out.println(bike4.fuelTankCapacity+"L");

		Bike bike5 = new Bike("Ducati","Ducati Panigale V4",2772549,1103.0f,13,17);
			System.out.println("-->Specifications of Bike5");
			System.out.println(bike5.brandName);
			System.out.println(bike5.bikeName);
			System.out.println(bike5.price);
			System.out.println(bike5.engineCapacity+"CC");
			System.out.println(bike5.mileage+"kmpl");
			System.out.println(bike5.fuelTankCapacity+"L");

		Bike bike6 = new Bike("Yamaha","Yamaha YZF-R1M",3405896,998.0f,15,17);
			System.out.println("-->Specifications of Bike6");
			System.out.println(bike6.brandName);
			System.out.println(bike6.bikeName);
			System.out.println(bike6.price);
			System.out.println(bike6.engineCapacity+"CC");
			System.out.println(bike6.mileage+"kmpl");
			System.out.println(bike6.fuelTankCapacity+"L");

		Bike bike7 = new Bike("BMW","BMW R 1250 GS",2055000,1254.0f,21,20);
			System.out.println("-->Specifications of Bike7");
			System.out.println(bike7.brandName);
			System.out.println(bike7.bikeName);
			System.out.println(bike7.price);
			System.out.println(bike7.engineCapacity+"CC");
			System.out.println(bike7.mileage+"kmpl");
			System.out.println(bike7.fuelTankCapacity+"L");

		Bike bike8 = new Bike("Ducati","Ducati Multistrada V4",2148000,1158.0f,15,22);
			System.out.println("-->Specifications of Bike8");
			System.out.println(bike8.brandName);
			System.out.println(bike8.bikeName);
			System.out.println(bike8.price);
			System.out.println(bike8.engineCapacity+"CC");
			System.out.println(bike8.mileage+"kmpl");
			System.out.println(bike8.fuelTankCapacity+"L");

		Bike bike9 = new Bike("Honda","Honda Africa Twin", 1601500,1082.0f,24,24.5f);
			System.out.println("-->Specifications of Bike9");
			System.out.println(bike9.brandName);
			System.out.println(bike9.bikeName);
			System.out.println(bike9.price);
			System.out.println(bike9.engineCapacity+"CC");
			System.out.println(bike9.mileage+"kmpl");
			System.out.println(bike9.fuelTankCapacity+"L");

		Bike bike10 = new Bike("Triumph","Triumph Tiger 1200",1939000,1160.0f,18,20);
			System.out.println("-->Specifications of Bike10");
			System.out.println(bike10.brandName);
			System.out.println(bike10.bikeName);
			System.out.println(bike10.price);
			System.out.println(bike10.engineCapacity+"CC");
			System.out.println(bike10.mileage+"kmpl");
			System.out.println(bike10.fuelTankCapacity+"L");
	}

}