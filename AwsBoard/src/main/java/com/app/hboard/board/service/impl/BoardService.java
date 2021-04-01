package com.app.hboard.board.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.hboard.board.dao.IBoardRepository;
import com.app.hboard.board.model.Board;
import com.app.hboard.board.service.IBoardService;


@Service
public class BoardService implements IBoardService{
	
	
	
	@Autowired
	@Qualifier("IBoardRepository")
	IBoardRepository boardRepository;
	
	@Transactional
	public void insertArticle(Board board) {
		
	 board.setBoardNum(boardRepository.selectMaxArticleNo()+1);
	 System.out.println(boardRepository.selectMaxArticleNo()+1);
	 boardRepository.insertArticle(board);
	 }
	
	
	public List<Board> selectArticleList(int page) {
	int start = (page-1) * 10 + 1;
	 return boardRepository.selectArticleList(start, start+9);
	}
	
	public int selectMaxArticleNo() {
		return boardRepository.selectMaxArticleNo();
	}
	
	public int getArticleCount() {
		
		return boardRepository.getAtricleCount();
	}


	@Override
	public void updateArticle(Board board) {
		 
		boardRepository.updateArticle(board);
	}


	@Transactional
	public Board getArticle(int boardNum) {
		System.out.println("getArticle"+boardNum);
		
		Board myboard=boardRepository.getArticle(boardNum);
		myboard.toString();
		return boardRepository.getArticle(boardNum);
	}


	@Transactional
	public void deleteArticle(int boardNum) {
		
		
		boardRepository.deleteArticle(boardNum);
	}
	
}
