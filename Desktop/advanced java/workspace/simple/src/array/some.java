package array;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.rest.message;

public class some  {
	public static void main(String args[]) throws SQLException, ClassNotFoundException, IOException 
	{
		 Class.forName("com.mysql.jdbc.Driver");
message m = new message();
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila" , "root" , "root");

final message m1 =new message();



m.setId(1);
m.setName("ash");
 FileOutputStream f = new FileOutputStream("some.ser");
 ObjectOutputStream ob = new ObjectOutputStream(f);
 ob.writeObject(m);

 File fi = new File("some.ser");
 



	}
	}



