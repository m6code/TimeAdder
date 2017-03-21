import java.util.Scanner;

public class TimeAdder{
	public static void main(String[] args) {

		int runMin = minuteAdd(4,3,5,3,3,2);
		int runSecs = secondsAdd(56,3,2,5,6);
		int secsMod;
		int secsDiv;

		System.out.printf("The total minutes: %d%n",runMin); 
		System.out.printf("The total seconds: %d%n",runSecs);

		if (runSecs < 59) {
			secsDiv = 0;
			secsMod = runSecs;
			System.out.printf("%d min : %d secs %n",(secsDiv+runMin), secsMod);
		}
		else{
			secsDiv = runSecs / 60;
			secsMod = runSecs % 60;
			System.out.printf("%d min : %d secs %n",(secsDiv+runMin),secsMod);
		}

		//System.out.printf("%d : %d %n",(secsDiv+runMin),secsMod);
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