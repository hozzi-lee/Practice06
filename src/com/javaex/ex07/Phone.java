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
		return "Phone 상속받는 바로 위 상위클래스가 super";
	}
    
}
