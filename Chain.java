public class Chain{

	String anime;
	float rating;
	int episodes;

	public Chain(){
		System.out.println("Anime is famous in japan");
	}
	public Chain(String anime){
		this();
		System.out.println("Nowadays all are liking Anime");
	}
	public Chain(String anime,float rating,int episodes){
		this("Naruto Shippuden");
		this.anime = anime;
		this.rating = rating;
		this.episodes = episodes; 
	}
	public static void main(String[] args) {
		Chain anime1 = new Chain("Naruto Shippuden",8.15f,500);
		System.out.println(anime1.anime);
		System.out.println(anime1.rating);
		System.out.println(anime1.episodes);

		
	}
}