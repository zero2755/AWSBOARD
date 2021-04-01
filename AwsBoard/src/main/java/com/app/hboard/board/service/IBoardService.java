package com.app.hboard.board.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.app.hboard.board.model.Board;

@Service
public interface IBoardService {
	
	
	
	
	
	List<Board> selectArticleList(int page);
	
	void insertArticle(Board boardId);
	
	Board getArticle(int boardNum);
	
	int selectMaxArticleNo();
	
	int getArticleCount();
	
	void updateArticle(Board board);
	
	void deleteArticle(int boardNum);
	
	 

}
