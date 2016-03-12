// assigning set methods passing the value 

public class Box1 {
	int h;
	int w;
	int d;
	
	public int volume (){
		return h*w*d;
	}
	public int area (){
		return h*w;
		}
	public void setVariable(int h,int w,int d){
		this.h=h;
		this.w=w;
		this.d=d;
	}
	public void setVariable1(float h,int w){
		this.h=(int)h;
		this.w=w;
	}
	
	public static void main(String[] args) {
		Box1 b=new Box1();
		b.setVariable(1,2,3);
		int c=b.volume();
		System.out.println("The Volume of the box "+c);
		b.setVariable1(5,6);
		int c1=b.area();
		System.out.println("The Area of the box "+c1);
		

	}

}
