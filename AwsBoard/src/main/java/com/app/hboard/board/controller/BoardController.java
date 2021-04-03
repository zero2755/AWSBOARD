package com.app.hboard.board.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.hboard.board.PageHandler;
import com.app.hboard.board.model.Board;
import com.app.hboard.board.service.IBoardService;


@Controller
public class BoardController {
	
	@Autowired
	IBoardService boardService;
	
	@Autowired
	PageHandler pageHandler;
	
	
	private static Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	
	//web.xml hboard가아니라 myboard로 해놓음 
	@RequestMapping("/hihome")
	public String hi() {
		System.out.println("hihome");
		return "home";
	}
	
	
	//Create
	
	@RequestMapping(value="/insert", method=RequestMethod.GET)
	 public String insertEmp() {
		System.out.println("insert 겟");
	 	return "insert";
	 }
	
	
	
	
	
	
	@RequestMapping(value="/insert", method=RequestMethod.POST)
	public String insertEmp(Board board) {
		System.out.println("insert포스트1");
		boardService.insertArticle(board);
		System.out.println("insert포스트2");
		return "redirect:/getlist?page=1";
	 }
	
	//Read
	
	
	@RequestMapping(value="/getBoard/{boardNum}", method=RequestMethod.GET)
	public String getBoard(@PathVariable int boardNum,Model model) {
		
		System.out.println("보드넘버"+boardNum+"조회");
		//보드서비스에서 보드정보를 따오는쿼리
		
		Board board=boardService.getArticle(boardNum);
		board.toString();
		model.addAttribute("board", board);
		System.out.println("보드서비스호출후");
		
		return "getBoard";
		
	}
	
	
	//UPDATE
	
	
	@RequestMapping(value="/update/{boardNum}", method=RequestMethod.GET)
	 public String updateEmp(@PathVariable int boardNum,Model model) {
		System.out.println("업데이트 겟");
		model.addAttribute("boardNum",boardNum);
	 	return "update";
	 }
	
	 
	
	@RequestMapping(value="/board/update", method=RequestMethod.POST)
	public String updateEmp(Board board) {
		System.out.println("update board 1");
		boardService.updateArticle(board);
		System.out.println("update board 2");
		return "redirect:/getlist?page=1";
	 }
	
	//delete
	
	/*
	@RequestMapping(value="/deleteBoard/{boardNum}", method=RequestMethod.GET)
	public String deleteBoard(@PathVariable int boardNum) {
		
		boardService.deleteArticle(boardNum);
		
		return "redirect:/getlist?page=1";
	}
	*/
	
	
	@RequestMapping(value="/deleteBoard/{boardNum}", method=RequestMethod.GET)
	public String deleteBoard(@PathVariable int boardNum) {
		
		boardService.deleteArticle(boardNum);
		
		return "redirect:/getlist?page=1";
	}
	
	
	//getAllList
	
	@RequestMapping("/getlist")
	public String getAllEmp(Model model,int page)
	{	
	logger.info("getList호출..........");
	//System.out.println("getlist");
		
	//System.out.println(page);
		
		model.addAttribute("List", boardService.selectArticleList(page));
		
		int boardCount=boardService.getArticleCount();
		int totalPage=(int)(boardCount)/10+1;
		
		
		pageHandler.setCurPage(page);
		pageHandler.setTotalBoardCount(boardService.getArticleCount());
		pageHandler.calcData();
		
		System.out.println("요청페이지 : "+page);
		System.out.println("현제페이지 : "+pageHandler.getCurPage());
		
		System.out.println("pageHandler.startPage : "+pageHandler.getStartPage());
		System.out.println("pageHandler.endPage : "+pageHandler.getEndPage());
		/* 
		 * 
		 * pageHandler 기존페이징처리
		 * 
	 		<!--  
			<table border="1">
				
						 
				<c:forEach begin="1" end="${pageHandler.totalPage }" varStatus="num">
				
					<td><a href="<c:url value='/getlist?page=${num.count}'/>">페이지${num.count}보기</a></td>
				</c:forEach>
				
				
			</table>
			 -->
			
			
			<td><a href="<c:url value='/getlist?page=${num.count}'/>">페이지${num.count}보기</a></td>
		 * 
		 */
		
		
		model.addAttribute("pageHandler", pageHandler);
		model.addAttribute("pageHandler", pageHandler);
		
		return "getlist";
	}
	
	
}
