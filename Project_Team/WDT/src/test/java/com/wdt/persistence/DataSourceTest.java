package com.wdt.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

//	스프링 빈으로 등록된 datasource를 이용해 커낵션 처리 테스트
	@Autowired
	private DataSource dataSource;
	SqlSessionFactory sqlSessionFactoy;

	@Test
	public void testConnection() {

		try (Connection con = dataSource.getConnection(); SqlSession session = sqlSessionFactoy.openSession();) {

			System.out.println("con = " + con);
			System.out.println("session = " + session);
			

		} catch (Exception e) {

			e.printStackTrace();

		}

	}

}
