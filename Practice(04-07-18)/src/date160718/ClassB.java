package date160718;

import java.util.concurrent.Callable;

public class ClassB implements Callable<String>{
	
	public static int partno;
	
	 
	
	
	@Override
	public String call() throws Exception {
		System.out.println(partno);
		return String.valueOf(partno);
	}
	
	
	
	
	
	
}
