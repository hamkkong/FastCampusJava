package fc.java.course2.part1;

import fc.java.model2.Connection;
import fc.java.model2.MSSQLDriver;
import fc.java.model2.MySQLDriver;
import fc.java.model2.OracleDriver;

public class DataBaseConnection {   // 지금은 가상으로 접근설정을 해 본것이고 DB를 배울 때 좀 더 심화적인 내용을 다룰 것이다.
    public static void main(String[] args) {
        //Oracle DB접속
        Connection conn = new OracleDriver();
        conn.getConnetion("jdbc:oracle:thin:@localhost:1521:XE ","system", "manager");

        //mysql DB 접속
        conn = new MySQLDriver();
        conn.getConnetion("jdbc:mysql://localhost:3306/test","root","12345");

        //mssql DB 접속
        conn = new MSSQLDriver();
        conn.getConnetion("jdbc:sqlserver://localhost:1433;DatabaseName=mem", "sa", "12345");
    }
}
