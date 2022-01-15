package com.wdt.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

//	추가한 JDBC가 데이터 베이스와 연결이 되었는지 확인 테스트
public class JDBCTest {
	
	static { 
        try { 
            Class.forName("com.mysql.cj.jdbc.Driver"); 
        } catch(Exception e) { 
            e.printStackTrace(); 
        } 
    } 
    
	//mysql ex 데이터베이스만 생성 후 연결 테스트
	//그냥 실행하면 됨
	
    @Test 
    public void testConnection() { 
        try(Connection con = DriverManager.getConnection( 
                "jdbc:mysql://localhost:3306/ex?serverTimezone=Asia/Seoul", 
                "root", 
                "password")){ 
            System.out.println(con); 
        } catch (Exception e) { 
            fail(e.getMessage()); 
        } 
    
    }    
	

}
