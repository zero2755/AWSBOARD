package com.app.hboard.board.model;


import java.sql.Timestamp;

public class Board {
	
	private int boardNum;
	private String title;
	private String boardContent;
	private String writer;
	//private Timestamp boardDate;
	
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
//	public Timestamp getBoardDate() {
//		return boardDate;
//	}
//	public void setBoardDate(Timestamp boardDate) {
//		this.boardDate = boardDate;
//	}
	
	
}
