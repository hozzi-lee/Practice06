package com.javaex.ex07;

public class SmartPhone extends MusicPhone {

	public void execute(String str){

		//코드작성
		if("음악".equals(str)){
			playMusic();
		}else if ("앱".equals(str)) {
			onApp();
		}else {
			super.execute(str); // Phone.class
		}

	}

	//메소드작성
	protected void playMusic() {
		System.out.println("다운로드해서 음악재생");
	}

	//메소드작성
	//	private void call() {
	//		System.out.println("통화기능시작");
	//	}

	public void onApp() {
		System.out.println("앱실행");
	}

	@Override
	public String toString() {
		return super.toString();
	}


}
