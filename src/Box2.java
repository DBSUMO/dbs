//Using constructor passing the value
public class Box2 {
	int h;
	int w;
	int d;
	
	public int volume(){
		return h*w*d;
	}
	public int area(){
		return h*d;
	}
	
	public Box2 (int h, int w, int d){
		this.h=h;
		this.w=w;
		this.d=d;
	}
	
	public Box2 (int h,int d){
		this.h=h;
		this.d=d;
		
	}
	public static void main(String[] args) {
		Box2 f =new Box2(10,20,30);
		Box2 g = new Box2(8,9);
		
		int s = f.volume();
		System.out.println("The volume of the box "+s);
		
		int s1 = g.area();
		System.out.println("The area of the box "+s1);
		

	}

}
