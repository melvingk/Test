import java.util.Scanner;

public class runner {

	public static void main (String [] args)
	{
		
		Swamp s1= new Swamp(100, 50);
		Swamp s2= new Swamp(120, 60);
		Swamp s3= new Swamp(130, 70);
		Swamp s4= new Swamp(140, 80);
		
		KikiThePlayer n1=  new KikiThePlayer ("north","Left");
		KikiThePlayer ss1= new KikiThePlayer ("south","Right");
		KikiThePlayer e1 = new KikiThePlayer ("east","Forward");
		KikiThePlayer w1 = new KikiThePlayer ("west","Backward");
		
		
		
		switch (ss1.getmagicCompass())		// Try to show the what the compass shows when in the following directions		
		{
		case "north":
		{
			System.out.println(s1.getDistance() +" metres to north" + s1.getDepth() + "metres deep");
		}
		case "south":
		{
			System.out.println(s2.getDistance() +" metres to north" + s2.getDepth() + "metres deep- but its there");
		}
		case "east":
		{
			System.out.println(s3.getDistance() +" metres to north" + s3.getDepth() + "metres deep");
		}
		case "west":
		{
			System.out.println(s4.getDistance() +" metres to north" + s4.getDepth() + "metres deep");
		}
		
		
		KikiThePlayer.scannerMethod();
		
		
		
		}
		
		
	}
}
		
		
	
		

		
		
		
		
	

