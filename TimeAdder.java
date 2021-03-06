/**
 * A simple java console app that compute the total time of a music album
 * Receives the total minutes and seconds by the 
 * minuteAdd(); and secondsAdd(); methods
 */

public class TimeAdder{
	public static void main(String[] args) {

		int runMin = minuteAdd(1,8,20,2,14,4,1); // Receives the minutes arguments
		int runSecs = secondsAdd(38,20,50,57,21,43,26); // Receives the seconds arguments

		System.out.printf("The total minutes: %d%n",runMin); 
		System.out.printf("The total seconds: %d%n",runSecs);


		// Checks if the Total seconds is Less than or equal to 59
		// Prints out the result
		if (runSecs <= 59) {
			int secsDiv = 0;
			int secsMod = runSecs;
			System.out.printf("%d min : %d secs %n",(secsDiv+runMin), secsMod);
		}
		// gets the number of minutes by dividing total seconds(runSecs) by 60
		// gets remaining seconds by using modulus 60 on total seconds(runSecs)
		else{
			int secsDiv = runSecs / 60;
			int secsMod = runSecs % 60;
			System.out.printf("%d min : %d secs %n",(secsDiv+runMin),secsMod);
		}
	}


	/**
	 * Add the unknown number minutes entered
	 * @param mins number of minutes
	 * @return the total minute
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
	 * @param secs the number of seconds to calculute
	 * @return the total seconds
	 */
	private static int secondsAdd(int...secs){
		int seconds = 0;
		for (int x:secs){
			seconds += x;
		}
		return seconds;
	}
}