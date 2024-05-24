public class Naruto{
	
	public static void main(String[] args) {

		Naruto.writer();
		Naruto.hokage();
        Naruto.villages();

        Naruto akatsukiMembers = new Naruto();
        akatsukiMembers.akatsuki();
        akatsukiMembers.summon();
        akatsukiMembers.teamNumber();


	
	}
	 public static void writer(){
        System.out.println("Manga Artist : Masashi Kishimoto");
    }

    public static void hokage(){
        System.out.println("----------**----------");
        System.out.println("First Hokage : Hashirama Senju");
        System.out.println("Second Hokage : Tobirama Senju");
        System.out.println("Third Hokage :  Hiruzen Sarutobi");
        System.out.println("Fourth Hokage : Minato Namikaze");
        System.out.println("Fifth Hokage : Tsunade");
        System.out.println("Sixth Hokage : Kakashi Hatake");
        System.out.println("Seventh Hokage : Naruto Uzumaki");
        System.out.println("Eighth Hokage : Shikamaru Nara");
        System.out.println("----------**----------");
    }

    public static void villages(){
        System.out.println("----------**----------");
        System.out.println("Hidden Leaf Village");
        System.out.println("Hidden Sand Village");
        System.out.println("Hidden Rock Village");
        System.out.println("Hidden Mist Village");
        System.out.println("Hidden Cloud Village");
        System.out.println("Hidden Rain Village");
        System.out.println("Hidden Watterfall Village");
        System.out.println("Hidden Sound Village");
        System.out.println("----------**----------");
    }

    public void akatsuki(){
    	System.out.println("All akatsuki Members Wellcome");

    }
    public void summon(){
        System.out.println("Naruto summoning animal is Gamakichi");
    }

    public void teamNumber(){
        System.out.println("Team 07 Members are Naruto, Sasuke, Sakura and Mentor : Kakashi");
    }

}