
public class First implements Runnable {
private Vectorandstuufs p;
	
	public First(Object e)
	{
		p=(Vectorandstuufs)e;
	}
	@Override
	public void run() {
		
		p.calcprodus_printout();
	}}
