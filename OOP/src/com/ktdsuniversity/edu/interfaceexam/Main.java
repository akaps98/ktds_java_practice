package com.ktdsuniversity.edu.interfaceexam;

public class Main {
	public static void main(String[] args) {
		LgTvRemoteControl lgRemoteControl = new LgTvRemoteControl();
		RemoteControl godRemoteControl = new StandardTvRemoteControl();
		RemoteControl danawaRemoteControl = new DanawaRemoteControl();
		
		SamsungTV qhdTV = new SamsungTV();
		qhdTV.welcome(godRemoteControl);
		qhdTV.goodbye(danawaRemoteControl);
		LgTV oledTV = new LgTV();
		oledTV.on(danawaRemoteControl);
		oledTV.off(godRemoteControl);
	}
}
