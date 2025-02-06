package com.ktdsuniversity.edu.inheritance;

public class Computer {
	public static void calculateAndDraw(Cpu cpu) {
		cpu.calculate();
		if(cpu instanceof Apu apu) {
			apu.draw();
		}

	}
	
	public static void main(String[] args) {
		Cpu intelChip = new Cpu("intel", "i9");
//		intelChip.calculate();
		
		Apu amdChip = new Apu("AMD", "Rizen7");
//		amdChip.calculate();
//		amdChip.draw(); // amdChip을 Cpu로 선언 시 draw 메소드 사용 불가. why? super class인 cpu에는 draw 메소드가 존재하지 않음!
		
//		Apu tempChip = (Apu) intelChip; // type casting
//		tempChip.draw();
		
//		if(amdChip instanceof Apu tempAmdChip) {
//			tempAmdChip.draw();
//		}
		
		calculateAndDraw(intelChip);
		calculateAndDraw(amdChip);
		
//		System.out.println("amdChip is a Apu: " + (amdChip instanceof Apu));
	}
}
