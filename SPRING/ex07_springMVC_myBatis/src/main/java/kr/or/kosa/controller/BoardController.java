package kr.or.kosa.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.kosa.service.BoardService;

@Controller
public class BoardController {

	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/selectAll.do")
//	public void selectAll(Model model) { // 검색하기전
	public void selectAll(String searchCondition, String searchKeyword, Model model) {
		
		System.out.println(searchCondition);
		System.out.println(searchKeyword);
		
		HashMap map = new HashMap();
		map.put("searchCondition", searchCondition);
		map.put("searchKeyword", "searchKeyword");
		
		model.addAttribute("boardList", boardService.selectAll(map));
//		return "getBoardList";
	}
}
