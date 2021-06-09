package com.javaex.ex07;

public class Phone {

    public void execute(String str){
        call();
    }
    
    private void call(){
        System.out.println("통화기능시작");
    }

	@Override
	public String toString() {
		return "아.. 그냥 최상위클래스만 super구나...";
	}
    
}
