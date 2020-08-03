package com.jh.dao;

import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jh.dto.AADTO;

@Repository
public class AADAO {

	@Autowired
	BasicDataSource dataSource; // (servlet-context.xml에 있는) class명 끝, id명

	@Autowired
	SqlSession sqlSession;

	public List<AADTO> select() {
		List<AADTO> list = sqlSession.selectList("aa.getaa");
		return list;
	}

	public void insert(String bb) {
		sqlSession.insert("aa.insertaa", bb);
	}

	public void update(AADTO aaDTO) {
		sqlSession.update("aa.updateaa", aaDTO);
	}

	public void deleteall() {
		sqlSession.delete("aa.deleteallaa");
	}
}
