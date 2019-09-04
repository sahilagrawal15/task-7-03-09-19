import java.sql.*;
import java.util.Scanner;

class Insert {

	public static void main(String args[]) throws Exception{

		Scanner scan = new Scanner(System.in);
		try {

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded");

			String url = "jdbc:mysql://localhost:3306/db";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, user, password);
			System.out.println("Connection Established");

			System.out.println("Choose among the following options");
			System.out.println("1) Insert Data");
			System.out.println("2) Update Data");
			System.out.println("3) Delete Data");
			System.out.println("4) Create Table");
			System.out.println("5) Alter Table");

			int n;
			n = scan.nextInt();

			switch (n) {
 			case 1: {
 				
 				System.out.println("Enter Customer ID");
 				int cid=scan.nextInt();
 				System.out.println("Enter Customer Name");
 				String name=scan.next();
 				System.out.println("Enter Mobile Number");
 				int mobile=scan.nextInt();
 				
 				Statement stmt=con.createStatement();
 				String sql="insert into Customer values("+cid+",'"+name+"',"+mobile+")";
 				int k=stmt.executeUpdate(sql);
 				if(k>0)
 				{
 					System.out.println("Record Inserted");
 				}
 				else
 					System.out.println("Please Check");
 				
 						break;

			}
 			
 			case 2:
 			{
 				System.out.println("Enter Customer ID for updating its name");
 				int id=scan.nextInt();
 				System.out.println("Enter new Name");
 				String na=scan.next();

 				
 				Statement stmt=con.createStatement();
 				String sql="update Customer set customer_name='"+na+"' where customer_id="+id+"";
 				int k=stmt.executeUpdate(sql);
 				if(k>0)
 				{
 					System.out.println("Record Updated");
 				}
 				else
 					System.out.println("Please Check");
 				
 						break;
 				
 				
 				
 			}
 			case 3:
 			{
 				Statement stmt=con.createStatement();
 				System.out.println("Enter Customer ID for deleting its data");
 				int d=scan.nextInt();
 				String sql="delete from Customer where(customer_id="+d+")";
 				int l=stmt.executeUpdate(sql);
 				if(l>0)
 				{
 					System.out.println("record Deleted");
 					
 				}
 				else
 					System.out.println("Not deleted");
 				break;
 			}
 			case 4:
 			{
 				Statement stmt=con.createStatement();
 				System.out.println("Enter table name which you want to create");
 				String tab=scan.next();
 				System.out.println("Enter first column name");
 				String col1=scan.next();
 				System.out.println("Enter second column name");
 				String col2=scan.next();
 				System.out.println("Enter third column name");
 				String col3=scan.next();
 				
 				String sql="create table "+tab+" ("+col1+" int,"+col2+" varchar(20),"+col3+" int)   "; 
 				
 						
 				int l=stmt.executeUpdate(sql);
 				if(l>=0) 
 				{
 					System.out.println("Table Created");
 					
 				}
 				else
 					System.out.println("Table cannot be created");
 				break;
 			}
 			case 5:
 			{
 				Statement stmt=con.createStatement();
 				System.out.println("Enter table name which you want to alter");
 				String tab=scan.next();
 				
 				
 				
 				String sql="alter table "+tab+" change customer_id c_id int  "; 
 				
 						
 				int l=stmt.executeUpdate(sql);
 				if(l>=0) 
 				{
 					System.out.println("Table Altered");
 					
 				}
 				else
 					System.out.println("Table cannot be Altered");
 				break;
 			}

			}

			
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}