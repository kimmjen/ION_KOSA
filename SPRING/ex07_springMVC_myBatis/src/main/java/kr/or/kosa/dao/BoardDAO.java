package kr.or.kosa.dao;

import java.util.HashMap;
import java.util.List;

import kr.or.kosa.domain.BoardVO;

public interface BoardDAO {
	
	public void insertBoard(BoardVO vo);
	
	public void updateBoard(BoardVO vo);
	
	public void deleteBoard(BoardVO vo);
	
	// 리스트(전체보기)
	public List<BoardVO> selectAll(HashMap map);
	
	// 검색 특정한 것만 보기
	public BoardVO selectBoard(BoardVO vo);
	

}
