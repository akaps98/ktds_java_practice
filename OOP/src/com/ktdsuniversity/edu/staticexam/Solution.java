package com.ktdsuniversity.edu.staticexam;

import java.util.Queue;
import java.util.LinkedList;

class Solution {
	public static void main(String[] args) {
        int[] bandage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1, 2}, {3, 2}};
        
        int result = solution(bandage, health, attacks);
        System.out.println(result);  
	}
	
    public static int solution(int[] bandage, int health, int[][] attacks) {
        Queue<Integer> rule = new LinkedList<>();
        
        int checkAttackIdx = 0;
        int attackIdx = 0;
        
        for(int i = 0; i <= attacks[attacks.length - 1][0]; i++) {
            if(attacks[attackIdx][0] == checkAttackIdx) {
                rule.offer(attacks[attackIdx][1]);
                attackIdx++;
            } else {
                rule.offer(null);
            }
            checkAttackIdx++;
        }
        
        int maxHealth = health;
        int healStreak = 0;
        
        while(!rule.isEmpty()) {
        	Integer damage = rule.poll();
            if(damage != null) {
                healStreak = 0;
                health -= damage;
            } else {
                if(health <= maxHealth) {
                    health += bandage[1];
                    if(health > maxHealth) {
                        health = maxHealth;
                    } else {
                        healStreak++;
                    }
                    if(healStreak == bandage[0]) {
                        health += bandage[2];
                        if(health > maxHealth) {
                            health = maxHealth;
                            healStreak = 0;
                        }
                    }
                }
            }
        }
        
        if(health <= 0) {
            health = -1;
        }
        
        int answer = health;
        return answer;
    }
//	public static int solution(int[] bandage, int health, int[][] attacks) {
//        int maxHealth = health; // 최대 체력
//        int healStreak = 0; // 연속 회복 횟수
//        int time = 0; // 현재 시간
//        
//        Queue<int[]> attackQueue = new LinkedList<>();
//        for (int[] attack : attacks) {
//            attackQueue.add(attack);
//        }
//
//        while (!attackQueue.isEmpty()) {
//            int[] nextAttack = attackQueue.poll(); // 다음 공격 이벤트
//            int attackTime = nextAttack[0];
//            int damage = nextAttack[1];
//
//            // 공격이 발생하기 전까지 체력 회복
//            while (time < attackTime) {
//                if (health < maxHealth) {
//                    health += bandage[1]; // 초당 회복
//                    healStreak++;
//
//                    if (healStreak == bandage[0]) { // 연속 성공 시 추가 회복
//                        health += bandage[2];
//                        healStreak = 0; // 연속 성공 초기화
//                    }
//
//                    if (health > maxHealth) { // 최대 체력 초과 방지
//                        health = maxHealth;
//                    }
//                }
//                time++; // 시간 증가
//            
//
//            // 몬스터의 공격 적용
//            health -= damage;
//            healStreak = 0; // 공격을 받으면 연속 성공 초기화
//
//            // 체력이 0 이하로 내려가면 즉시 종료
//            if (health <= 0) {
//                return -1;
//            }
//
//            time++; // 다음 시간으로 이동
//        }
//
//        return health; // 마지막 공격 후 남은 체력 반환
//    }
}