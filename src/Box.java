//directly assign the value to the varibale
public class Box {

	int h=3;
	int w=5;
	int d=4;
	
	public int volume (){
		return h*w*d;
	}
	public int area (){
		return h*w;
	}
	
	
	public static void main(String[] args) {
		Box b = new Box();
		int x = b.volume();
		System.out.println("The Volume of the box"+x);
		int x1=b.area();
		System.out.println("The area of the box"+x1);
		System.out.println("Added for GitHub !");

	}

}
