package com.ktdsuniversity.edu.interfaceexam;

public class DanawaRemoteControl implements RemoteControl {
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("켜져라");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("꺼져라");
	}
	
	public void openDanawaPage() {
		System.out.println("브라우저를 실행해서 다나와 사이트에 접속합니다.");
	}
}
