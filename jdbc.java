import java.sql.*;
 class JDBC1{
    public static void main(String[] args) {
        Connection connection=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/orders","root","Prince");
            Statement statement=connection.createStatement();
            ResultSet ResultSet;
            ResultSet=statement.executeQuery("select *from customer1");
            int customer_id;
            String customer_name;
           // String contactname;
            while(ResultSet.next()){
                customer_id=ResultSet.getInt("customer_id");
                customer_name=ResultSet.getString("customer_name").trim();
               //contactname=ResultSet.getString("contactname").trim();
                System.out.println("Customer_id"+customer_id+"customer_name:"+customer_name);
            }
            ResultSet.close();
            statement.close();
            connection.close();
        } catch (Exception exception ) {
            System.out.println(exception);
        }
    }
}