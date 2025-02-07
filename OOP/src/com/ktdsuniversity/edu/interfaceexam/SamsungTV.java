package com.ktdsuniversity.edu.interfaceexam;

public class SamsungTV {
	public void welcome(RemoteControl signal) {
		signal.powerOn();
		System.out.println("SAMSANG");
	}
	
	public void goodbye(RemoteControl signal) {
		signal.powerOff();
	}
}
