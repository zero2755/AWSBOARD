package com.app.hboard.board;

import org.springframework.stereotype.Component;

@Component
public class PageHandler {
	private int startPage=1;
	private int endPage;
	private int curPage=1;
	private int totalBoardCount;
	private int displayPageNum=10;
	
	


	
	private boolean prev;
	private boolean next;
	 
	
	public void calcData() {
		
		
		endPage=(int)(Math.ceil((curPage)/ (double)displayPageNum))*displayPageNum;
		System.out.println("calcData()의 endPage값 : "+endPage);
		startPage=(endPage-displayPageNum)+1;
		
		int tempEndPage=(int)(totalBoardCount)/10+1;
	
		System.out.println("calcData()의 tempEndPage값 : "+tempEndPage);
		if(endPage>tempEndPage) {
			endPage=tempEndPage;
			System.out.println("tempEndPage사용됨");
		}
		
		prev=startPage == 1 ? false : true;
		
		next = endPage * 10 >= totalBoardCount ? false : true;
		
	}
	

	public int getDisplayPageNum() {
		return displayPageNum;
	}


	public void setDisplayPageNum(int displayPageNum) {
		this.displayPageNum = displayPageNum;
	}


	public int getStartPage() {
		return startPage;
	}
	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}
	public int getEndPage() {
		return endPage;
	}
	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}
	public int getCurPage() {
		return curPage;
	}
	public void setCurPage(int curPage) {
		this.curPage = curPage;
	}
	
	
	public int getTotalBoardCount() {
		return totalBoardCount;
	}


	public void setTotalBoardCount(int totalBoardCount) {
		this.totalBoardCount = totalBoardCount;
	}


	public boolean isPrev() {
		return prev;
	}
	public void setPrev(boolean prev) {
		this.prev = prev;
	}
	public boolean isNext() {
		return next;
	}
	public void setNext(boolean next) {
		this.next = next;
	}

	
	
	
	
	
	
}
