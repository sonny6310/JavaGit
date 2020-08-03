package com.jh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jh.dao.AADAO;
import com.jh.dto.AADTO;

@Service
public class AAService {

	@Autowired
	AADAO aaDAO;

	public void insert(String bb) {
		aaDAO.insert(bb);
	}

	public List<AADTO> selectAll() {
		return aaDAO.select();
	}

	public void update(AADTO aaDTO) {
		aaDAO.update(aaDTO);
	}
}
