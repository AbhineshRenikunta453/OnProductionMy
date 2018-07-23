package date160718;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
	
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<100;i++)
			list.add(i);
		
	list.forEach(new Consumer<Integer>() {
		@Override
		public void accept(Integer t) {
		System.out.print(t+"\t");
			
		}
	});
	}

}
