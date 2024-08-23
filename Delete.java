import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
class Delete {
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
			String sql ="delete from customer1 where customer_id=1001"; 
			myStmt.executeUpdate(sql);
			System.out.println("delete complete.");

            //4. Close connection
			myConn.close();
		}

		catch(Exception e){
			e.printStackTrace();
		}
	}
}

    

