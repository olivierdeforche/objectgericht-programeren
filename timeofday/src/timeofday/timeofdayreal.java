package timeofday;

/**
 * @invar The hours are between 0 and 23
 * 	| 0 <= getHours() && getHours >= 23
 * 
 * @invar The minutes are between 0 and 59
 * 	| 0 <= getMinutes () && getMinutes <= 59
 * 
 */

public class timeofdayreal {
	/**
	 * @invar minutesSinceMidnight is between 0 (inclusive) and 24 * 60 (exclusive)
	 *  | 0 <= minutesSinceMidnight && minutesSinceMidnight 24*60 
	 */
	
	private int minutesSinceMidnight;
	static int getHours() {return this.minutesSinceMidnight / 60;}
	static int getMinutes() {return this.minutesSinceMidnight % 60;}
	
	/**
	 * sets this objerct's in hours
	 * 
	 *  @pre The given hours are between 0 and 23
	 *  	| 0 <= hours && hours <= 23
	 *  @post this object's hours equal to given hours. 
	 *  	| getHours() == hours
	 *  @post this object's minutes have remained inchanged
	 *  	| getMinutes() == old(getMinutes())
	 * 
	 */
	
	
	static void setHours(int hours) {this.minutesSinceMidnight = this.getMinutes() + hours * 60;}
	
	/**
	 * sets this objerct's in hours
	 * 
	 *  @pre The given minutes are between 0 and 59
	 *  	| 0 <= minutes && minutes <= 59
	 *  @post this object's minutes equal to given minutes. 
	 *  	| getMinutes() == getMinutes()
	 *  @post this object's hours have remained inchanged
	 *  	| getHours() == old(getHours())
	 * 
	 */
	static void setMinutes(int minutes) {this.minutesSinceMidnight = this.getHours() * 60 + minutes;}
	
	

}
