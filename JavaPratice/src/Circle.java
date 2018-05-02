
public class Circle {
	public int radius;
	public String name;
	
	//매개변수 없는 생성자
	public Circle(){
		radius = 1;
		name = "";
	}
	
	//매개변수를 가진 생성자
	public Circle(int r, String n){
		// TODO Auto-generated method stub
		
		radius = r;
		name = n;
		
	}
	//메소드
	public double getArea(){
		return 3.14 * radius * radius;
	}
	
	//메인메소드
	public static void main(String[] args){
		
		Circle pizza = new Circle(10,"자바피자");
		double area = pizza.getArea();
		System.out.println(pizza.name + "의 면적은" + area);
		
		/*Circle donut = new Circle(); //매개변수 없는 생성자 호출
		donut.name = "자바도넛";
		donut.radius = 2;
		
		area = donut.getArea();
		System.out.println(donut.name +"의 면적은" + area);
		System.out.println(pizza.name + "의 면적은" + area);*/
	}
	
	
	
	

}
