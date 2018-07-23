package date160718;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class ClassC{
	
	public static void main(String[] args) throws Exception {
		
		/*ClassB b=new ClassB();
		for(int i=1;i<10;i++)
		{
			ClassB.partno=i;
			System.out.println(b.call());
			
		}*/
	ExecutorService es=Executors.newFixedThreadPool(10);
	for(int i=1;i<=100;i++) {
		int k =i;
		System.out.println(" ready to start "+k);
	es.execute(new Runnable() {
		@Override
		public void run() {
			System.out.println("\trunnign the thread "+k);
		}
	});
		
	/*es.submit(new Runnable() {
		@Override
		public void run() {
			System.out.println("\trunnign the thread "+k);
		}
	});*/
	}
		
	}
	

}
