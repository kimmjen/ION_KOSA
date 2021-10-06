package kr.or.kosa.dao;

import java.util.HashMap;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.or.kosa.domain.BoardVO;

@Repository("boardDAO")
public class BoardDAOImpl implements BoardDAO { // 실질적인 DB 연동
	
	private SqlSessionTemplate mybatis;

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		System.out.println("===> MyBatis insertBoard() 호출");
		mybatis.insert("BoardDAO.insertBoard", vo);
	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		System.out.println("===> MyBatis updateBoard() 호출");
		mybatis.update("BoardDAO.updateBoard", vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		System.out.println("===> MyBatis deleteBoard() 호출");
		mybatis.delete("BoardDAO.deleteBoard", vo);
	}

	@Override
	public List<BoardVO> selectAll(HashMap map) { // 전체
		// TODO Auto-generated method stub
		System.out.println("===> MyBatis selectAll() 호출");
		return mybatis.selectList("BoardDAO.slectAll", map);	
	}

	@Override
	public BoardVO selectBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		System.out.println("===> MyBatis selectBoard() 호출");
		return mybatis.selectOne("BoardDAO.slsectBoard", vo);
	}

}
