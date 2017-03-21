import java.util.Scanner;

public class TimeAdder{
	public static void main(String[] args) {

		int runMin = minuteAdd(4,3,5,3,3,2);
		int runSecs = secondsAdd(5,3,2,5,6);

		System.out.println(runMin); 
		System.out.println(runSecs);

		if (runSecs < 59) {
			int secsDiv = 0;
			int secsMod = runSecs;
			System.out.printf("%d : %d%n",secsDiv, secsMod);
		}
		else{
			int secsDiv = runSecs / 60;
			int secsMod = runSecs % 60;
			System.out.printf("%d : %d %n",secsDiv,secsMod);
		}
	}


	/**
	 * Add the unkwnown minutes entered
	 * return the minute
	 */
	private static int minuteAdd(int...mins){
		int minute = 0;
		for (int x:mins){
			minute += x;
		}
		return minute;
	}


	/**
	 * Add the number of unknown seconds entered
	 * return seconds
	 */
	private static int secondsAdd(int...secs){
		int seconds = 0;
		for (int x:secs){
			seconds += x;
		}
		return seconds;
	}

}