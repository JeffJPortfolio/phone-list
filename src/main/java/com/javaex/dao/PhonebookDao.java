package com.javaex.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhonebookDao {
	
	// 필드
	@Autowired
	private SqlSession sqlSession;
	
	
	//생성자
	//기본생성자 사용(그래서 생략)  
	
	//메소드 gs
	//필드값을 외부에서 사용하면 안됨(그래서 생략)
	
	//메소드 일반
	// DB연결 메소드
	
	
	/* 전체 가져오기 */
	public List<PersonVo> getPersonList() {
		
		System.out.println("PhonebookDao.getPersonList()");
		List<PersonVo> personList = sqlSession.selectList("phonebook.selectList");

		return personList;
	}
	
	
	
	
	
	
}
