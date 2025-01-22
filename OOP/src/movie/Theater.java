package movie;

public class Theater {
	// 속성 - 상영관이 가지고 있는 것들
	Movie movie;
	Seat seat;
	Speaker speaker;
	Light light;
	AirConditioner airConditioner;
	Projector projector;
	
//	public Theater(Movie movie, Seat seat, Speaker speaker, Light light, AirConditioner airConditioner,
//			Projector projector) {
//		this.movie = movie;
//		this.seat = seat;
//		this.speaker = speaker;
//		this.light = light;
//		this.airConditioner = airConditioner;
//		this.projector = projector;
//	}
	
	// 기능(행동) - 상영관 할 수 있는 것들
	// 1. 영화를 재생한다.
	//   - projector 변수의 isOn값이 false라면 isOn값을 true로 변경한다.
	//   - projector 변수의 isOn값이 true 일때만 isPlay값을 true로 변경한다.
	//     projector 변수의 isPlay값이 true라면 '영화의 제목을 러닝타임동안 재생함'이라고 출력.
	//   - projector 변수의 isPlay값을 false로, isOn값도 false로 변경한다.
	public void playMovie() {
		if(!projector.isOn) {
			projector.isOn = true;
		}
		
		if(projector.isOn) {
			projector.isPlay = true;
			
			if(projector.isPlay) {
				System.out.println(movie.title + "을(를) " + movie.runningTime + "동안 재생함.");
				projector.isPlay = false;
				projector.isOn = false;
			}
		}
	}
	
	// 2. 에어컨을 켠다.
	//  - airConditioner의 isOn값이 false라면 true로 변경한다.
	//  - 현재온도, 세기, 냉/난방여부, 설정온도를 할당한다.
	public void turnOnAirConditioner() {
		if(!airConditioner.isOn) {
			airConditioner.isOn = true;
			
			airConditioner.curTemp = (float) Math.random() * 40;
			airConditioner.windSpeed = (int) Math.random() * 4;
			airConditioner.aimedTemp = (float) Math.random() * 40;
			
			boolean isNowWinter = airConditioner.curTemp < airConditioner.aimedTemp;
			airConditioner.isCooling = !isNowWinter;
		}
	}
	
	// 3. 조명을 끄고 켠다.
	//  - light의 isOn값이 false라면 true로 변경, true라면 false로 변경.
	//    light의 isOn값이 true라면 light의 color를 지정해준다.
	//    light의 isOn값이 false라면 light의 color를 null로 변경한다.
	//  - color 지정 방법:
	//   - 0 ~ 2 중의 임의의 난수를 받아 0이면 RED, 1이면 BLUE, 2이면 GREEN 으로 지정.
	public void turnOnLight() {
		if(!light.isOn) {
			light.isOn = true;
			
			int valueOfColor = (int) (Math.random() * 3);
			
			if(valueOfColor == 0) {
				light.color = "RED";
			} else if(valueOfColor == 1) {
				light.color = "BLUE";
			} else {
				light.color = "GREEN";
			}
		} else {
			light.isOn = false;
		}
	}
	

	
	// 4. 볼륨을 조절한다.
	//  - speaker의 isOn값이 false라면 true로 변경.
	//  - speaker의 isOn값이 true일때만 볼륨 변경.
	//   - 볼륨이 변경되는 방식:
	//    - 정수를 파라미터로 받아와서 볼륨에 더해 할당하거나 뺀다.
	//    - 증가하거나 감소할때의 조건
	//     - 증가된 볼륨의 값이 100 초과라면 100으로 변경.
	//     - 증가된 볼륨의 값이 0 미만이라면 0으로 변경.
	public void controlVolume(int value) {
		if(!speaker.isOn) {
			speaker.isOn = true;
			
			if(speaker.volume + value > 100) {
				speaker.volume = 100;
			} else if(speaker.volume - value < 0) {
				speaker.volume = 0;
			} else {
				speaker.volume += value;
			}
			
//			if(value > 0) {
//				int tempIncreaseVolume = speaker.volume + value;
//				
//				if(tempIncreaseVolume > 100) {
//					speaker.volume = 100;
//				} else {
//					speaker.volume = tempIncreaseVolume;
//				}
//			} else if(value < 0) {
//				int tempDecreaseVolume = speaker.volume - value;
//				
//				if(tempDecreaseVolume < 0) {
//					speaker.volume = 0;
//				} else {
//					speaker.volume = tempDecreaseVolume;
//				}
//			} else {
//				// no need to control volume -> value of volume is 0.
//			}
		}
	}
	
	// 5. 의자를 조정한다.
	//  - seat 변수의 isFold값이 true라면 false로 변경, false라면 true로 변경.
	//  - 변경 seat 변수의 isFold값이 true라면 "좌석번호가 접혔습니다." 라고 출력
	//    false라면 "좌석번호가 펼쳐쳤습니다." 라고 출력.
	public void controlSeat() {
		if(!seat.isFold) {
			seat.isFold = true;
			System.out.println(seat.seatNumber + " 가 접혔습니다.");
		} else {
			seat.isFold = false;
			System.out.println(seat.seatNumber + " 가 펼쳐졌습니다.");
		}
	}
}
