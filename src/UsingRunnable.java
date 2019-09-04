
public class UsingRunnable implements Runnable{
	
	
	public void run()
	{
		salaryCalculate();
	}
	
	private int eno;
	private String ename;
	private double basicSalary;
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public UsingRunnable(int eno, String ename, double basicSalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "UsingRunnable [eno=" + eno + ", ename=" + ename + ", basicSalary=" + basicSalary + "]";
	}
	
	/*
	 * public void processSalary() { double hra=basicSalary/10; double
	 * da=basicSalary/4; double ca=basicSalary/10;
	 * 
	 * }
	 */
	
	public void salaryCalculate()
	{
		System.out.println(Thread.currentThread().getName()+"HRA :"+ basicSalary/10);
		System.out.println(Thread.currentThread().getName()+"DA :"+ basicSalary/4);
		System.out.println(Thread.currentThread().getName()+"CA :"+ basicSalary/10);
	}
public static void main(String[] args) {
		
		UsingRunnable e1=new UsingRunnable(101,"Amit",100000);
		
		UsingRunnable e2=new UsingRunnable(102,"Bhavik",220000);
		
		UsingRunnable e3=new UsingRunnable(103,"Rajat",120000);
		
		UsingRunnable e4=new UsingRunnable(104,"Sagar",70000);
		UsingRunnable e5=new UsingRunnable(105,"Ankit",80000);
		
		Thread t1=new Thread(e1);
		Thread t2=new Thread(e2);
		Thread t3=new Thread(e3);
		Thread t4=new Thread(e4);
		Thread t5=new Thread(e5);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
		
		

}
}
