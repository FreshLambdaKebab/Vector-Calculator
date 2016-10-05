package main;
import java.awt.EventQueue;

import maths.Vector;

public class App extends FrameWork{
	
	public static void main(String[] args) {
		
		FrameWork framework = new FrameWork();
		
		framework.run();

		Vector vec1 = new Vector(100,100);
		Vector vec2 = new Vector(120,50);

		//System.out.println(vec2.getX());
		vec2.printVector("vector2");
		vec1.printVector("vector1");
		
	}

}
