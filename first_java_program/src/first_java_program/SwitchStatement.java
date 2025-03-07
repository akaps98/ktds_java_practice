package first_java_program;

public class SwitchStatement {
	public static void main(String[] args) {
		// Java 1.6 switch
		
		int step = 1;
		// 라면 끓이기 절차 
		switch(step) {
		case 1: 
			System.out.println("1. 수납장 손잡이를 잡아 문을 연다.");
		case 2:
			System.out.println("2. 수납장에서 냄비 손잡이를 잡아 꺼낸다.");
		case 3:
			System.out.println("3. 냄비를 세척해야 할지 판단한다.");
		case 4: 
			int randomNumber = (int) (Math.random() * 10);
			
			if(randomNumber % 2 == 0) {
				System.out.println("4-1. 냄비가 깨끗하다면, 가스레인지에 올린다.");
			} else if(randomNumber == 9) {
				System.out.println("4-3. 냄비를 씻다가 떨어뜨려 깨져버렸습니다. 라면을 더 끓일수가 없습니다.");
				break; // terminate switch statement flow 
			} else {
				System.out.println("4-2. 냄비가 더럽다면, 씻어서 가스레인지에 올린다.");
			}
		case 5:
			System.out.println("5. 냉장고로 걸어가 문을 열고 생수를 꺼내서 뚜껑을 열어 냄비에 물을 550ml만큼 따른다.");
		case 6:
			System.out.println("6. 가스레인지의 불을 켠다.");
		case 7:
			System.out.println("7. 수납장 문을 열어 라면을 꺼내온다.");
		case 8:
			System.out.println("8. 라면 봉지를 뜯는다.");
		case 9:
			System.out.println("9. 후레이크 스프를 꺼내 뜯어 냄비에 붓는다.");
		case 10:
			System.out.println("10. 물이 끓으면, 면을 꺼내서 냄비에 넣는다.");
		case 11:
			System.out.println("11. 분말스프를 꺼내 뜯어 냄비에 붓는다.");
		case 12:
			System.out.println("12. 정해진 시간을 지켜 기다린다.");
		case 13:
			System.out.println("13. 정해진 시간이 지나면, 가스레인지 불을 끈다.");
		case 14:
			System.out.println("14. 그릇을 찾는다.");
		case 15:
			System.out.println("15. 수저를 찾는다.");
		case 16:
			System.out.println("16. 찾은 그릇과 수저를 식탁에 세팅한다.");
		case 17:
			System.out.println("17. 냄비를 가스레인지에서 옮겨 내용물을 그릇에 붓는다.");
		case 18:
			System.out.println("18. 맛있게 먹는다.");
		default:
			break;
		}
		
		// Switch를 이용해서 변수에 값 할당
		
		// Java 13 switch
		// 회원가입을 받을 때, 사용자가 등록할 수 없는 아이디 목록.
		// 관리자들이 사용하는 아이디
		// admin, root, superUser, administrator, etc.
		// 운영자들이 사용하는 아이디
		// master, operator, system, sysopr 
		String memberID = "master";
		String memberGrade = switch(memberID) {
			case "admin":
				// System.out.println("'관리자'입니다.");
			case "root":
			case "superuser":
			case "administrator":
				System.out.println("'관리자'입니다.");
				yield "관리자";
			case "master":
			case "operator":
			case "system":
			case "sysopr":
				System.out.println("'운영자'입니다.");
				yield "운영자";
			default:
				System.out.println("'일반사용자'입니다.");
				yield "일반사용자";
		};
		
		System.out.println(memberID + "는 " + memberGrade + "입니다.");
		
		// Java 14 switch
		// 콤마 및 화살표 함수로 인한 코드간소화
		String memberID2 = "system";
		String memberGrade2 = switch(memberID) {
			case "admin", "root", "superuser", "administrator" -> "관리자";
			case "master", "operator", "system", "sysopr" -> "운영자";			
			default -> "일반사용자";
		};
		
		System.out.println(memberID2 + "는 " + memberGrade2 + "입니다.");
	}
}
