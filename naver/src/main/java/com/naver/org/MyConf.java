package com.naver.org;

import org.apache.tomcat.jdbc.pool.DataSource;

public class MyConf {
	public DataSource dataSource() {
		DataSource ds = new DataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://192.168.0.200/spring5fs?characterEncoding=utf8");
		ds.setUsername("root");
		ds.setPassword("1234");
		return ds;
	}
}
