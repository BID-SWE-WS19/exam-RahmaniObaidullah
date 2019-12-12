package BID.SWE;
import java.sql.*;

public class Exercise6Impl implements Exercise6
{
    @Override
    public Object Method1() {
        /*
        Connection myconnection = null;
        try {
            myconnection = DriverManager.getConnection("jdbc:mysql://localhost", "User", "Password");
            Statement mystatement = null; String sql_insert;
            mystatement = myconnection.createStatement();
            return mystatement.executeQuery("select * from temperatur_daten");
            sql_insert = sql_insert(temperatur_data, date, time)
        } catch (SQLException e) {
            e.printStackTrace();
        }
         */
        //Mein Objekt
        String sql_insert = new String("insert into TestAbgaben (Stunde, Minute, Name) values (10, 24, 'Rahmani')");
        return sql_insert;
}
}
