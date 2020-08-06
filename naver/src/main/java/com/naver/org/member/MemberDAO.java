package com.naver.org.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

public class MemberDAO {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Member> selectAll() {
		List<Member> list = jdbcTemplate.query("select * from member", new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member mb = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				return mb;
			}
		});
		return list;
	}

	public Member selectOne() {
		Member mb = jdbcTemplate.queryForObject("select * from member where email=?", new RowMapper<Member>() {
			@Override
			public Member mapRow(ResultSet rs, int rowNum) throws SQLException {
				Member mb = new Member(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getString(5));
				return mb;
			}
		}, "juny0413@naver.com");
		return mb;
	}

	public void insert(final Member mb) {
		KeyHolder keyholder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
				PreparedStatement pstmt = con.prepareStatement(
						"insert into member " + "(EMAIL,PASSWORD,NAME,REGDATE) " + "values " + "(?,?,?,now())",
						new String[] { "ID" });
				pstmt.setString(1, mb.getEmail());
				pstmt.setString(2, mb.getPassword());
				pstmt.setString(3, mb.getPassword());
				return pstmt;
			}
		}, keyholder);
	}

	public void update(Member mb) {
		jdbcTemplate.update("update member set password=? where email=?", mb.getPassword(), mb.getEmail());
	}

	public void delete(Member mb) {
		jdbcTemplate.update("delete from member where email = ? ", mb.getEmail());
	}
}
