
public class Employee extends Thread{
	
	
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
	public Employee(int eno, String ename, double basicSalary) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.basicSalary = basicSalary;
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", basicSalary=" + basicSalary + "]";
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
		
		Employee e1=new Employee(101,"Amit",100000);
		e1.setName("First Employee Salary Record : ");
		Employee e2=new Employee(102,"Bhavik",220000);
		e2.setName("Second Employee Salary Record : ");
		Employee e3=new Employee(103,"Rajat",120000);
		e3.setName("Third Employee Salary Record : ");
		Employee e4=new Employee(104,"Sagar",70000);
		e4.setName("Fourth Employee Salary Record : ");
		Employee e5=new Employee(105,"Ankit",80000);
		e5.setName("Fifth Employee Salary Record : ");
		
		e1.start();
		e2.start();
		e3.start();
		e4.start();
		e5.start();
		
		
		
		

}
}
