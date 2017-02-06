package maths;
import java.math.*;

public class Vector {
	
	//vector variables
	private double x;
	private double y;
	
	public Vector(){}
	
	public Vector(double x,double y){
		this.x = x;
		this.y = y;
	}
	
	//getters
	public double getX(){return x;}
	public double getY(){return y;}
	
	//setters
	public void setX(double x){x = this.x;}
	public void setY(double y){y = this.y;}
	public void set(double x,double y){x = this.x;y = this.y;}
	public void reset(){x = 0.0;y = 0.0;}
	
	public double length(){
		double length = Math.sqrt(x * x + y * y);
		
		return length;
	}
	
	public void normalize(){
		double length = length();
		
		//to not divide by 0
		if(length == 0.0){
			x = 0.0;
			y = 0.0;
			
			return;
		}
		
		x/= length;
		y/= length;
	}

	//printing to console for debugging puroposes
	public void printVector(String name){
		System.out.println(name + "(" + getX() + "," + getY() + ")");
	}
	 
	//TODO:implement vector addition,subtraction.
	/*public Vector Addition(Vector v1,Vector v2)
	{
		Vector resultant;
		//resultant = v1 + v2;
		
		//return resultant;
	}*/
	
	//----------------------------------------------------------------------------------------------RESTRICTED--
	/*public Vector cross(Vector vec1,Vector vec2){  TODO:create this for when 3D implemented
		Vector newVec = new Vector();
		
		return newVec;
	}*/

}
