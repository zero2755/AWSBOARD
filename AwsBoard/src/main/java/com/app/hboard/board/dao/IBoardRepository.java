package com.app.hboard.board.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.app.hboard.board.model.Board;

public interface IBoardRepository {
	
	int selectMaxArticleNo();
	List<Board> selectArticleList(@Param("start") int start, @Param("end") int end);
	
	void insertArticle(Board board);
	
	Board getArticle(int boardNum);
	
	void updateArticle(Board board);
	
	void deleteArticle(int boardNum);
	
	int getAtricleCount();
}
