/**
 * Author @ Anirban Dasgupta
 * Date: 6/9/19
 * Code to show finch robot dancing to music.
 */

package Code;

import edu.cmu.ri.createlab.terk.robot.finch.Finch;
import java.util.Random;

public class FinchDance {
	private static Finch f;  //static finch object
	private static Random r; //static random object
	private static int[] frequencies = {523,587,659,698,784,880,988,1047}; //array for frequencies 
	
	public FinchDance(){
		FinchDance.f = new Finch();	 //instantiate object
		FinchDance.r = new Random();  //instantiate object
	}
	
	/**
	 * precondition: Random and finch object is instantiated.
	 * postcondition: LED set to random number, says hello world.
	 */
	public static void startState() {
		f.setLED(r.nextInt(256), r.nextInt(256), r.nextInt(256));	
		f.sleep(1300);
		f.saySomething("Hello World! Today I will dance, sing, and light up!");
		f.sleep(1300);
	}
	
	/**
	 * precondition: Random and finch object is instantiated.
	 * postcondition: LED set to random number, sings Hot Cross Buns, dances, and ends finch movement. 
	 */
	
	public static void HotCrossBuns () {
		f.buzz(frequencies[6], 1000);  //first segment of HCB 
		f.sleep(500);
		f.setWheelVelocities(150,150,1000); //up
		f.buzz(frequencies[5], 1000);
		f.sleep(500);
		f.setWheelVelocities(-150,-150,1000); //back
		f.buzz(frequencies[4], 2000);
		f.sleep(1500);
		f.setLED(r.nextInt(256), r.nextInt(256), r.nextInt(256));	
		f.setWheelVelocities(0,150,1000);//left 
	
		f.buzz(frequencies[6], 1000);  //repeated segment same code
		f.sleep(500);
		f.setWheelVelocities(0,-150,1000); //back
		f.buzz(frequencies[5], 1000);
		f.sleep(500);
		f.setWheelVelocities(150, 0 ,1000);  //right
		f.buzz(frequencies[4], 2000);
		f.sleep(1500);
		f.setLED(r.nextInt(256), r.nextInt(256), r.nextInt(256));	
		f.setWheelVelocities(-150, 0,1000); //back
		
		
		f.buzz(frequencies[4], 1000);     //third segment
		f.sleep(500);
		f.setWheelVelocities(0,250,1000); //spin left
		f.buzz(frequencies[3], 50); //filler to repeat note
		f.sleep(50);
		f.buzz(frequencies[4], 1000);
		f.sleep(500);
		f.setWheelVelocities(250,0,1000); //spin right
		f.buzz(frequencies[5], 1000);
		f.sleep(500);
		f.setWheelVelocities(250,250,1000); //full circle
		f.buzz(frequencies[4], 50);  //filler to repeat note
		f.sleep(50);
		f.buzz(frequencies[5], 1000);
		f.sleep(1500);
		f.setLED(r.nextInt(256), r.nextInt(256), r.nextInt(256));	
		f.setWheelVelocities(-250,-250,1000); //backwards circle
		
		
		f.buzz(frequencies[6], 1000);  //repeat for ending
		f.sleep(500);
		f.setWheelVelocities(150,150,1000);
		f.buzz(frequencies[5], 1000);
		f.sleep(500);
		f.setWheelVelocities(-150,-150,1000);
		f.buzz(frequencies[4], 2000);
		f.setLED(r.nextInt(256), r.nextInt(256), r.nextInt(256));	
		f.sleep(1500);
		
		
		f.quit(); //required statement to end 
	}
	
	
	/**
	 * precondition:  Finch object is instantiated.
	 * postcondition: Says thank you.
	 */
	public static void endState() {
		f.saySomething("Thank you for watching me dance, sing, and light up!");
		f.sleep(3000);
	}
	

}
