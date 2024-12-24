//import package
import java.sql.*;
public class Main{
    public static void main(String[]args) throws Exception{
        //connecting SQL here
        String url = "jdbc:mysql://localhost:3306/december24";
        String username = "root";
        String password = "root";

        //writing any custom query based on table in database december24, table name - student.
        String query = "select name from student where id=2";
        //query to print all data in student table
        String query1 = "select * from student";
        //query to insert record in table
        String query2 = "insert into student values (5, 'Shiv', 65.6 )";
        //using prepareStatement
        int id = 6;
        String name = "Payal";
        double marks = 72.43;
        String query3 = "insert into student values (?, ?, ?)";

        //load and register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create connection object
        Connection c = DriverManager.getConnection(url, username, password);

        //create statement
        Statement st = c.createStatement();

        //execute query
        ResultSet rs = st.executeQuery(query);
        rs.next();
        String studentName = rs.getString("name");
        System.out.println(studentName);

        //to show all data in student table
        ResultSet rs1 = st.executeQuery(query1);
        while(rs1.next()){
            String studentTableData = rs1.getInt(1)+" : "+rs1.getString(2)+" : "+rs1.getDouble(3);
            System.out.println(studentTableData);
        }

        //to insert a record in student table
        int countOfAffectedRows = st.executeUpdate(query2);//here we used executeUpdate(DML query)
        System.out.println(countOfAffectedRows+ " row/s affected");

        //insert record using preparedStatement
        PreparedStatement st1 = c.prepareStatement(query3);
        st1.setInt(1, id);
        st1.setString(2,name);
        st1.setDouble(3, marks);
        int rowsAffected = st.executeUpdate(query2);//here we used executeUpdate(DML query)
        System.out.println(rowsAffected+ " row/s affected");

        //close the connections
        st.close();
        c.close();
    }
}