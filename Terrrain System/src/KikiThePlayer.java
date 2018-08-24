import java.util.Scanner;


public class KikiThePlayer

{
	public KikiThePlayer(String magicCompass, String position)
	
	{
		this.position=position;
		this.magicCompass = magicCompass;
	}

	
	private String position;
	private String magicCompass;
	
	public String getmagicCompass() {
		return magicCompass;
	}

	public void setmagicCompass(String magicCompass) {
		this.magicCompass = magicCompass;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public void setposition(String position) {
		this.position = position;
	}

	
	Swamp i= new Swamp(100, 50);
	Swamp i2= new Swamp(120, 60);
	Swamp i3= new Swamp(130, 70);
	Swamp i4= new Swamp(140, 80);
	
	
	
	
	public static void scannerMethod() 
	{

		Scanner sc = new Scanner(System.in);	// finds out height to determine if player can walk in the depth of the water
		System.out.println("Whats your height?");
		int height =sc.nextInt();
		System.out.println("Whats your weight?");
		String weight =sc.next();	
	
		
		if (height<i.getDepth()) { 							// if the person height is lower than the height of the swamp, warning given
			System.out.println("Are you sure you want to proceed");
		}
		else 
			{
				System.out.println("good luck.....friend");
			}
		
		if (weight<i.getDepth())
		{
			System.out.println("Can you swim?");         
		}
		
		if ()
			
	}

		
	}
	

