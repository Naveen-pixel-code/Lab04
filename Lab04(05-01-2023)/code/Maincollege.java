
class College implements Runnable{
    
	int seatfilled=48;
	int seat;
	College(int seat)
	{
		this.seat=seat;
	}
	
	public void run(){
		synchronized(this)
		{
		String name=Thread.currentThread().getName();
		
		  if(seatfilled<50){
	      System.out.println("Congrats!! "+name+" Your Admission is Successfully Completed.");
		  seatfilled++;
		  try{Thread.sleep(1000);}
	      catch(InterruptedException ie){}
		  }
	  else{System.out.println("Sorry:) "+name+" Admission is closed.");}
	}
}
}
class Maincollege{
	public static void main(String...args){
		String clgeName="Saveetha Engineering college";
	    int clgid=2122;
		
		System.out.println("College Name: "+clgeName+ "\tCollege Code: "+clgid);
		System.out.println();
		
		College c=new College(4);
		Thread c1=new Thread(c);
		Thread c2=new Thread(c);
		Thread c3=new Thread(c);
		Thread c4=new Thread(c);
		
		
		c1.setName("Naveen Kumar");
		c2.setName("Arun Kumar");
		c3.setName("Girija");
		c4.setName("Anudip");
		
		c1.start();
		c2.start();
		c3.start();
		c4.start();
	}		
}