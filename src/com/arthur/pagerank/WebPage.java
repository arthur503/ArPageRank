package com.arthur.pagerank;

import java.util.LinkedList;

public class WebPage {

	private String name;
	private int visitCount = 0;
	private LinkedList<WebPage> linkList = new LinkedList<WebPage>();
	
	
	public WebPage(String name){
		this.name = name;
	}
	
	public void addLink(WebPage wp){
		linkList.add(wp);
	}
	
	public WebPage getLink(int index){
		return linkList.get(index);
	}
	
	public int linkListSize(){
		return linkList.size();
	}
	
	public void addVisitCount(){
		visitCount ++;
	}
	
	public int getVisitCount(){
		return visitCount;
	}
	
	public String getName(){
		return name;
	}
	
}
