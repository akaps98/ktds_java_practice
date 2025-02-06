package first_java_program;
import java.util.Arrays;

public class prac {
	public static void main(String[] args) {
		int n = 4;
		int m = 1;
		int[] section = {1, 2, 3, 4};
		
		solution(n, m, section);
	}
	
	public static int solution(int n, int m, int[] section) {
        // n: length of area
        // m: length of roller
        // section: sections which are not painted yet
        int sectionIdx = 0;
        int[] area = new int[n];
        
        for(int i = 0; i < n; i++) {
            area[i] = 1;
            if(i == section[sectionIdx] - 1) {
                area[i] = 0;
                sectionIdx++;
                if(sectionIdx >= section.length) {
                    sectionIdx = 0;
                }
            }
        }
        
        int areaIdx = 0;
        int count = 0;
        
        while(true) {
        	String partOfSection = "";
        	boolean isPainted = false;
        	
        	for(int i = 0; i < m; i++) {
        		partOfSection += area[areaIdx + i];
        	}
        	
        	System.out.println(partOfSection);
        	
            if(partOfSection.contains("0")) { // contain 0? -> there is any area which is not painted
            	int newIdx = 0;
                for(int i = areaIdx; i < m; i++) { // idx starts from areaIdx
                	System.out.println(areaIdx);
                    if(areaIdx > area.length) {
                        break;
                    }
//                    if(area[areaIdx + 1] == 0) { // paints
//                    	area[areaIdx + i] = 1;
//                    }
                    area[areaIdx + newIdx] = 1;
                    newIdx++;
                }
                count++;
                isPainted = true;
                System.out.println(Arrays.toString(area));
                System.out.println(count);
            }
            
            if(isPainted) { // already painted with m size
            	areaIdx += m;
//            	System.out.println(areaIdx);
            } else { // 
            	areaIdx++;
//            	System.out.println(areaIdx);
            }
            
            if(areaIdx > area.length - m) {
                break;
            }
        }
        
        int answer = count;
        return answer;
    }
}
