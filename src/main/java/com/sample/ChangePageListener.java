package com.sample;

public interface ChangePageListener {

	public void start();
	
	public void nextPage();

	public void exit();

	public void addAnswer(int index, int data);
}
