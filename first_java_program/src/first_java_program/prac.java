package first_java_program;

public class prac {
	public static void main(String[] args) {
		String[] park = {"SOO", "OOO", "OOO"};
		String[] routes = {"E 2", "S 2", "W 1"};
		
		int[] answer = (solution(park, routes));
		
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}
		
		String route = "E 10";
		String[] s = route.split(" ");
		String d = s[0];
	}
	
	public static int[] solution(String[] park, String[] routes) {
        // if the robot exceeds the route, ignore the current order and proceed next one right away
        
        // find the initial point
        int[] answer = new int[2];
        
        for(int i = 0; i < park.length; i++) {
            if(park[i].contains("S")) {
				answer[0] = i;
				answer[1] = park[i].indexOf("S");
			}
        }
        
        // first, check the robot will be exceeded
        // if so, ignore the current order
        // if not, proceed the current order(utilize the 'answer' array)
        
        // North = N, East = E, West = W, South = S
        for(int i = 0; i < routes.length; i++) {
        	String[] splitRoute = routes[i].split(" ");
            char way = splitRoute[0].charAt(0); // north? east? west? south?
            int distance = Integer.parseInt(splitRoute[1]);
            
            if(way == 'N') {
                int tempInitialMove = answer[0]; // x-axis
                boolean isMovable = true; // check robot can be moved
                for(int j = 1; j <= Integer.parseInt(routes[0].charAt(2) + ""); j++) { // number of moves on each route
                    answer[0] -= j; // move
                    if(answer[0] - j < park[0].length()) { // exceeds maximum x-axis
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                    if(routes[distance].charAt(answer[1]) == 'X') { // stucked
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                }
                if(!isMovable) { // not able to move
                    answer[0] = tempInitialMove; // reset x-axis with initial value
                }
            } else if(way == 'E') {
                int tempInitialMove = answer[1]; // y-axis
                boolean isMovable = true; // check robot can be moved
                for(int j = 1; j <= Integer.parseInt(routes[0].charAt(2) + ""); j++) { // number of moves on each route
                    answer[0] += j; // move
                    if(answer[0] + j < park.length) { // exceeds maximum y-axis
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                    if(routes[distance].charAt(answer[1]) == 'X') { // stucked
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                }
                if(!isMovable) { // not able to move
                    answer[1] = tempInitialMove; // reset y-axis with initial value
                }
            } else if(way == 'W') {
                int tempInitialMove = answer[1]; // y-axis
                boolean isMovable = true; // check robot can be moved
                for(int j = 1; j <= Integer.parseInt(routes[0].charAt(2) + ""); j++) { // number of moves on each route
                    answer[0] -= j; // move
                    if(answer[0] - j < 0) { // less
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                    if(routes[distance].charAt(answer[1]) == 'X') { // stucked
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                }
                if(!isMovable) { // not able to move
                    answer[1] = tempInitialMove; // reset y-axis with initial value
                }
            } else { // S
                int tempInitialMove = answer[0]; // x-axis
                boolean isMovable = true; // check robot can be moved
                for(int j = 1; j <= Integer.parseInt(routes[0].charAt(2) + ""); j++) { // number of moves on each route
                    answer[0] += j; // move
                    if(answer[0] + j > park[0].length()) { // exceeds maximum x-axis
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                    if(routes[distance].charAt(answer[1]) == 'X') { // stucked
                        isMovable = !isMovable; // cannot move anymore
                        break;
                    }
                }
                if(!isMovable) { // not able to move
                    answer[0] = tempInitialMove; // reset x-axis with initial value
                }
            }
        }
        
        return answer;
    }
}
