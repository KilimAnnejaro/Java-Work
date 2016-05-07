//We've previously defined a class called GeometricObject
//that gives some information relating to all geometric objects.
//This class simply creates Triangle objects. The most notable
//feature is the use of Heron's Formula to return the triangle's
//area.
public class Triangle extends GeometricObject {
	private double side1;
	private double side2;
	private double side3;
	public Triangle(){
		this.side1=1.0;
		this.side2=1.0;
		this.side3=1.0;
	}
	public Triangle(double side1, double side2, double side3){
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	public double getSide1(){
		return this.side1;
	}
	public double getSide2(){
		return this.side2;
	}
	public double getSide3(){
		return this.side3;
	}
	public double getArea(){
		return heronsFormula(this.side1,this.side2,this.side3);
	}
	public double getPerimeter(){
		return this.side1+this.side2+this.side3;
	}
	public double heronsFormula(double side1, double side2, double side3){
		return Math.sqrt(this.getPerimeter()*(this.getPerimeter()-side1)
				*(this.getPerimeter()-side2)*(this.getPerimeter()-side3));
	}
	public String toString(){
		return "Triangle: side1 = "+side1+" side2 = "+side2+" side3 = "+side3;
	}
}
