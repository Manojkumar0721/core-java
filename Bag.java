public class Bag{
    
    int bagPrice;
    String bagTypes;
    int bagSpace;


    public Bag(){
        System.out.println("Gucci Bags");
    }

    public Bag(String type,int space){
        bagTypes = type;
        bagSpace = space;
    }

    public Bag(int price){
        bagPrice = price;
    }

    public static void main(String[] args){

        new Bag();

        Bag info = new Bag("Collage Bag",20);
        System.out.println(info.bagTypes + "," + info.bagSpace+"L");

        Bag priceOfBag = new Bag(2000);
        System.out.println(priceOfBag.bagPrice);

        


    }



}