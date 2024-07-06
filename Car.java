
public class Car{
   int x;
   int modelYear;
   String modelName;
   int topSpeed;



public Car(){
    x = 10;
}

public Car(int year,String carName){
    modelYear = year;
    modelName = carName;
}

public Car(String carName,int speed,int year){
    modelName = carName;
    topSpeed = speed;
    modelYear = year;

}

public static void main(String[] args){

   Car obj = new Car();
   System.out.println(obj.x);  

   Car fordCar = new Car(1967,"Mustang"); 
   System.out.println(fordCar.modelYear + "," + fordCar.modelName); 

   Car germanCar = new Car("BMW M5",250,2024);
   System.out.println(germanCar.modelName + "," + germanCar.topSpeed + "," + germanCar.modelYear);


   }


}