import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Insert {
    public static void main(String[] args) {
        String url="jdbc:MySQL://localhost:3306/orders";
        String user= "root";
        String password="Prince";
        try {
//1. Create a connection
			Connection myConn = DriverManager.getConnection(url,user,password);
			
			//2. Create a statement
			Statement myStmt = myConn.createStatement();
			
			//3. Execute Query
			String sql = "insert into customer1 "
					+"(customer_id,customer_name,contact_name,country)"
					+ " values (1001,'priya','solanki','thailand')";
			myStmt.executeUpdate(sql);
			System.out.println("Insert complete.");

            //4. Close connection
			myConn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
}

    

