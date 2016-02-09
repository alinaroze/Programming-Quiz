
import java.util.Scanner;

public class BikeDriver 
{
	public static void main(String[]args)
	{
		
		
		Scanner input = new Scanner( System.in );
		
		System.out.printf( "Please enter bike's cadence: " );
	    int cadence = input.nextInt();
	    System.out.printf( "Please enter the bike's gear: " );
	    int gear = input.nextInt();
	    System.out.printf( "Please enter the bike's speed: " );
	    int speed = input.nextInt();
	    System.out.printf("Pleas enter the bicycle's seat height; ");
	    int seatHeight = input.nextInt();
	    
	    MountainBike abike = new MountainBike(cadence, gear, speed, seatHeight);
	    
	    abike.display();
	    
	    System.out.printf("Please enter how much the brake was applied: ");
	    int decrement = input.nextInt();
	    abike.applyBreak(decrement);
	    
	    System.out.printf("Please enter how much the the bike sped up: ");
	    int increment = input.nextInt();
	    abike.speedup(increment);
	    
	    abike.display();
	    
		
	}
}

class Bicycle
{
	private int cadence;
	private int gear;
	private int speed;
	
	public Bicycle( int startCadence, int startSpeed, int startGear)
	{
		this.cadence = startCadence;
		this.speed = startSpeed;
		this.gear = startGear;
				
	}
	
	public void SetCadence(int newValue)
	{
		cadence = newValue;
	}
	
	public int getCadence()
	{
		return cadence;
	}
	
	public void SetGear(int newGear)
	{
		gear = newGear;
	}
	
	public int getGear()
	{
		return gear;
	}
	public void applyBreak(int decrement)
	{
		speed -= decrement;
	}
	
	public void speedup(int increment)
	{
		speed += increment;
	}
	
	public int getSpeed()
	{
		return speed;
	}
}

class MountainBike extends Bicycle
{
	private int seatHeight;
	
	public MountainBike(int startCadence,int startGear, int startSpeed, int startHeight)
	{
		super(startCadence, startGear, startSpeed);
		this.seatHeight = startHeight;
	}
	
	public void seatHeight(int newValue)
	{
		seatHeight = newValue;
	}
	
	public void display()
	{
		System.out.println("The cadence of the bike is: "+getCadence());
		System.out.println("The gear of the bike is: "+getGear());
		System.out.println("The speed of the bike it: "+getSpeed());
		System.out.println("The seat height of the bike is: "+seatHeight);
	}
}
