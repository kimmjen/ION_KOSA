package kr.or.kosa.service;

import java.util.HashMap;
import java.util.List;

import kr.or.kosa.domain.BoardVO;

public interface BoardService {
	
	// CRUD 기능의 메소드 구현
	// 글 등록
	void insertBoard(BoardVO vo);
	// 글 수정
	void updateBoard(BoardVO vo);
	// 글 삭제
	void deleteBoard(BoardVO vo);
	// 글 목록 조회
	List<BoardVO> selectAll(HashMap map);
	// 글 상세 조회
	BoardVO selectBoard(BoardVO vo);

}
