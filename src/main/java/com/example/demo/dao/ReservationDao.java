package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.ibatis.session.SqlSession;

import com.example.demo.dto.Reservation;

@Repository
public class ReservationDao {
	@Autowired(required=true)
	private SqlSession sqlSession;
	private String ns = "com.example.ReservationMapper.";
	
	public boolean addReservation(Reservation r) {
		if(r == null) {
			return false;
		}
		try {
			sqlSession.insert(ns + "insertReservation", r);
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public List<Reservation> getReservationList() {
		return sqlSession.selectList(ns + "getTotalReservation");
	}
	
	public boolean deleteReservation(Reservation r) {
		try {
			sqlSession.delete(ns + "deleteReservationById", r);
		}catch(Exception e) {
			return false;
		}
		return true;
	}
	
	public boolean updateReservation(Reservation r) {
		try {
			sqlSession.update(ns + "updateReservation");
		}catch(Exception e) {
			return false;
		}
		return true;
	}
}
