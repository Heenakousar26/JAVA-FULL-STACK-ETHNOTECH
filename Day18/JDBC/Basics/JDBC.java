package Day18.JDBC.Basics;


import java.sql.*;
import java.util.Stack;

public class JDBC {
    private static final String url="jdbc:mysql://localhost:3306/sms2";
    private static final String user="root";
    private static final String password="Heena@0563";

    public static void main(String[] args)throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection(url,user,password);
        Statement st=con.createStatement();

        //Displaying the data

//        String query="select * from student";
//        ResultSet rs= st.executeQuery(query);
//        while(rs.next())
//        {
//            int id=rs.getInt("id");
//            String name=rs.getString("name");
//            String email=rs.getString("email");
//            int matks=rs.getInt("matks");
//
//            System.out.println(id);
//            System.out.println(name);
//            System.out.println(email);
//            System.out.println(matks);
//        }
//
        //Inserting the data

//        String query=String.format("insert into student(id,name,email,matks)values(%d,'%s','%s',%d)",2,"john","r",98);
//        int myRes=st.executeUpdate(query);
//        if(myRes>0){
//            System.out.println("success");
//        }
//        else{
//            System.out.println("failure");
//        }

        //Updating the data

//        String query=String.format("Update student set matks=%d where id=%d",90,2);
//        int res=st.executeUpdate(query);
//        if(res>0){
//            System.out.println("Success");
//        }
//        else{
//            System.out.println("failed");
//        }

        //Deleting the data

        String query=String.format("Delete from student where id=%d",2);
        int rowsFull=st.executeUpdate(query);
        if(rowsFull>0){
            System.out.println("Deleted");
        }
        else{
            System.out.println("Not deleted");
        }

    }
}
