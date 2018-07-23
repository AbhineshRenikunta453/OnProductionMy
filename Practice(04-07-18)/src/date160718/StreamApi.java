package date160718;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamApi {
	
	
	public static void main(String[] args) {
		Set<BasicData> set=new HashSet<BasicData>(16);
		set.add(new BasicData("Abhi", 501, (long) 16000.00));
		set.add(new BasicData("Abhi", 502, (long) 16000.00));
		set.add(new BasicData("Abhi", 501, (long) 16000.00));
		System.out.println(set);
		/*Stream<Integer> serialstream=list.stream();
		Stream<Integer> parllelstream=list.parallelStream();
		Stream<Integer> highnum=serialstream.filter(p->p>90);
		highnum.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {

				System.out.print(t+"\t");
			}
		});*/
		/*parllelstream.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer t) {
			

			System.out.println(t+"\t");
			}
		});
		long endtime=System.currentTimeMillis();
		System.out.println(endtime-startingtime);*/
	}

}
