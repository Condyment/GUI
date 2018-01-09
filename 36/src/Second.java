public class Second  implements Runnable  {
private Vectorandstuufs p;
	
	public Second(Object e)
	{
		p=(Vectorandstuufs)e;
	}
	@Override
	public void run() {
		p.readstheinfile();
		
	}

}