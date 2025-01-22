package movie;

public class Movie {
	// 멤버변수
	String title;
	int runningTime;
	
//	public Movie(String title, int runningTime) {
//		this.title = title;
//		this.runningTime = runningTime;
//	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getRunningTime() {
		return runningTime;
	}
	public void setRunningTime(int runningTime) {
		this.runningTime = runningTime;
	}
}
