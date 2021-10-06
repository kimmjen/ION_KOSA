package kr.or.kosa.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.kosa.dao.BoardDAOImpl;
import kr.or.kosa.domain.BoardVO;

@Service("boarDAO")
public class BoardServiceImpl implements BoardService {
	
	@Autowired // 자동주입(DI)
	private BoardDAOImpl boardDAO;

	@Override
	public void insertBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDAO.insertBoard(vo);

	}

	@Override
	public void updateBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDAO.updateBoard(vo);
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		boardDAO.deleteBoard(vo);
	}

	@Override
	public List<BoardVO> selectAll(HashMap map) {
		// TODO Auto-generated method stub
		return boardDAO.selectAll(map);
	}

	@Override
	public BoardVO selectBoard(BoardVO vo) {
		// TODO Auto-generated method stub
		return boardDAO.selectBoard(vo);
	}

}
