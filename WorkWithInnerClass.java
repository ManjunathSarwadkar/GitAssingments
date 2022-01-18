package MyPackage.com.training;

public class WorkWithInnerClass {

	public static void main(String[] args) {
	new outer().new inner().in();
	

	}

}
class outer{
	 private int val =  5;
	class inner{
		int val = 4;
		void in() {
			System.out.println("inside the inner's in");
			System.out.println("the outer value is:" + val);
			System.out.println("the outer value is:" +this.val);
		} 
	
	}
	void newone() {
		inner ref = new inner();
		ref.in();
	}
}