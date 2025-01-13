package Workshop2;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle circle = new Circle(3.5);
		System.out.println(circle.radius);
		circle.getArea();
		circle.getPerimeter();		
	}

}

class Shape{
	public void getPerimeter() {
       System.out.println("This method prints perimeter: ");		
			
	}
	public void getArea() {
		System.out.println("This method prints area: ");
		
	}
}
class Circle extends Shape{
	double radius;
	
	Circle (double radius){
		this.radius = radius;
	}
	@Override
	public void getPerimeter() {
		double perimeter = 2 * Math.PI * radius;
		System.out.println("The perimeter of circle is : " + perimeter);
	}
	@Override
	public void getArea() {
		double area = Math.PI * radius * radius;
		System.out.println("The area of circle is : " + area);
	
	}	
	
}

