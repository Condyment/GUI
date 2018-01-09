
public class Main {

	public static void main(String[] args) {
		Vectorandstuufs rr=new Vectorandstuufs();
		First f=new First(rr);
		Second s=new Second(rr);
		Thread t1=new Thread(f);
		Thread t2=new Thread(s);
		
	
		t1.start();
		t1.setPriority(10);
		t2.start();
		try {
			t1.join();
			
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}}