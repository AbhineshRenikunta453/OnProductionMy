package date160718;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class BasicData {
	private String name;
	private int empcode;
	private long sal;
	
	public static void getApplication() {
		
		System.out.println("1231564");
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpcode() {
		return empcode;
	}
	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}
	public long getSal() {
		return sal;
	}
	public void setSal(long sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "BasicData [name=" + name + ", empcode=" + empcode + ", sal=" + sal + "]";
	}

	@Override
	public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(getClass()!=obj.getClass())
		return false;
	BasicData bdata=(BasicData)obj;
	return ((this.empcode==bdata.empcode) && (this.sal==bdata.sal) && (this.name.equals(bdata.name)));
	}
	@Override
	public int hashCode() {
		int intial=1;
		int result=31;
		result=result*intial+empcode;
		result=(int) (result*intial+sal);
		result=result*intial+((name==null)?0:name.hashCode());
		return result;
	}
	public BasicData(String name, int empcode, long sal) {
		super();
		this.name = name;
		this.empcode = empcode;
		this.sal = sal;
	}
}
