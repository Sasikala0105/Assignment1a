
public class YogaMain {

	public static void main(String[] args) {
		
		Participant p = new Participant("Shashy ","Gauthaman ","789-G Jalan sungai dua, penang.");
		System.out.println("Participant name : "+p.toString());
		System.out.println("Participant address : "+ p.getaddress());
		
		StressRelief s = new StressRelief();
		System.out.println("The benefits and poses of yoga for stress relief : ");
		s.benefits();
		s.setposes("Sukhasana");
		System.out.println("First pose : " + s.getposes());
		s.setposes("Balasana");
		System.out.println("Second pose : " + s.getposes());
	}

}
