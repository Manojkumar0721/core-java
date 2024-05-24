public class Computer{
	
	String brandName;
	int ram;
	int rom;
	int price;

	public Computer(String brandName,int ram,int rom,int price){
		this(brandName,ram,rom);
		this.price = price;
		
	}

	public Computer(String brandName,int ram,int rom){
		this(brandName,ram);
		this.rom = rom;
		
	}

	public Computer(String brandName,int ram){
		this(brandName);
		this.ram = ram;
     
	}

	public Computer(String brandName){
		this.brandName = brandName;
		
	}

	public static void main(String[] args) {
		Computer computer1 = new Computer("Lenovo Legion 7",32,1024,197490);
		printDetails(computer1);
		Computer computer2 = new Computer("Lenovo Legion 7",32,1024);
		printDetails(computer2);

		Computer computer3 = new Computer("Lenovo Legion 7",32);
		printDetails(computer3);

		
	}

	public static void printDetails(Computer computer) {
		System.out.println("Model Name : " +computer.brandName);
		System.out.println("RAM : " + computer.ram +"GB");
		System.out.println("ROM : " + computer.rom +"GB");
		System.out.println("Price : " + computer.price);

	}
	
}