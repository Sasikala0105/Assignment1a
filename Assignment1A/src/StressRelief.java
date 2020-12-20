import java.util.Scanner;

public class StressRelief {
	
	
		
		private String benefits;
		private String poses;
		
		StressRelief(){
			this.benefits = "Benefits";
		}
			
			
		public void benefits() {
			System.out.println("Do you have stress problems?");
	    	Scanner in = new Scanner(System.in);
	    	String benefits = in.next();  
	    	System.out.println("Then, you will know how to calm your body and mind");
	    	
		 }

	    public String getposes() {
	    	return poses;   	
	    }
	    	
	 
	    public void setposes(String poses) {
	    	this.poses = poses;
	    
			
	
			
		

	

		
		
	}

}
