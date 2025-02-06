package com.ktdsuniversity.edu.array;

import java.util.Arrays;

public class Lottery {
	public static void main(String[] args) {
		sortNumbers(makeLottoNumbers());
	}
	
	public static int[] makeLottoNumbers() {
		// 1 ~ 45까지 6개 찍기 (중복 불가)-> 1게임에 1,000원
		// 내가 찍은 6개의 번호와 주관사가 랜덤하게 찍은 6개의 번호와 정확하게 일치하면 1등
		// 1등 당첨자가 적립금을 다 먹음
		
		// 로또 번호 6개 모아보기
		/*
		 *  시작: [0, 0, 0, 0, 0, 0]
		 *  1. 1 ~ 45 중 랜덤하게 하나만 뽑기 => 결과: 37
		 *     => 배열에 37이 존재하는지 확인 => 존재할 경우 아무것도 하지 않는다.
		 *     => 존재하지 않는 경우 => 첫 번째 인덱스에 37 할당
		 *     => [37, 0, 0, 0, 0, 0]
		 *  2. 1 ~ 45 중 랜덤하게 하나만 뽑기 => 결과: 15
		 *     => 배열에 15가 존재하는지 확인 => 존재할 경우 아무것도 하지 않는다.
		 *     => 존재하지 않는 경우 => 두 번째 인덱스에 15 할당
		 *     => 두 번째 인덱스에 15 할당
		 *     => [37, 15, 0, 0, 0, 0]
		 *  3. 1 ~ 45 중 랜덤하게 하나만 뽑기 => 결과: 3
		 *     => 이하 동일
		 *     => [37, 15, 3, 0, 0, 0]
		 */
		int[] lotteryNumbers = new int[6];
		
		int idx = 0;
		
		while(idx < 6) {
			int number = (int) (Math.random() * 45) + 1;
			boolean isDuplicated = false;
			
			for(int j = 0; j < idx; j++) {
				if(lotteryNumbers[j] == number) {
					isDuplicated = true;
					break;
				}
			}
			
			if(!isDuplicated) {
				lotteryNumbers[idx] = number;
				idx++;
			}
		}
		
		return lotteryNumbers;
	}
	
	public static void sortNumbers(int[] lottoNumbers) {
		for(int i = 0; i < lottoNumbers.length; i++) {
			for(int j = 0; j < lottoNumbers.length - 1; j++) {
				if(lottoNumbers[j] > lottoNumbers[j + 1]) {
					int tempNum = lottoNumbers[j];
					lottoNumbers[j] = lottoNumbers[j + 1];
					lottoNumbers[j + 1] = tempNum;
				}
			}
		}
		
		System.out.println(Arrays.toString(lottoNumbers));
	}
}
