package com.ktdsuniversity.edu.generic;

import java.util.Arrays;

/**
 * 학생 한 명의 성적을 구하는 클래스
 * 1. 추상클래스로 작성
 * 2. 합계, 평균을 안 구해준다. -> 인스턴스를 사용하는 Main에서 직접 구현하도록
 * 3. 인터페이스 활용
 * 		- 합계구하기, 평균구하기를 할 수 있는 인터페이스 제작
 * 		- ScoreArray 클래스에서 인터페이스를 통해 합계를 구하고 평균을 구한다
 */
public class ScoreArray<T> {
   
   /**
    * 학생의 이름
    */
   private String name;
   /**
    * 과목별 성적
    */
   private Object[] scoreArray;
   /**
    * 등록된 성적의 개수
    */
   private int size;
   /**
    * 점수 합계 저장
    */
   private T sum;
   
   public ScoreArray(String name, T[] array) {
      this.name = name;
      this.scoreArray = new Object[4]; // [0, 0, 0, 0]
   }
   
   /**
    * 성적 배열에 성적을 추가한다.
    * @param score
    */
   public void add(T score) {
      if(this.size >= this.scoreArray.length) {
         Object[] tempScoreArray = new Object[this.scoreArray.length + 4];
//         for(int i=0; i<this.size; i++) {
//            tempScoreArray[i] = this.scoreArray[i];
//         }
         System.arraycopy(scoreArray, 0, tempScoreArray, 0, this.size);
         this.scoreArray = tempScoreArray;
      }

      this.scoreArray[this.size++] = score;
//      this.sum += score;
   }
   
   /**
    * scoreArray에 들어있는 점수들의 합계를 반환
    * @return 
    */
//   public T sum() {
//      this.sum = 0;
//      for(T i = 0 ; i < this.size; i++) {
//         this.sum += i;
//      }
//      return this.sum;
//   }
   
//   public double average() {
//      T sum = this.sum > 0 ? this.sum : this.sum();
//      return sum / (double)this.size;
//   }
   
   public void print() {
      System.out.println(Arrays.toString(this.scoreArray));
   }
   
}