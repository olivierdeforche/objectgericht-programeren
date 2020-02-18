package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class timeofday {

	
	@Test
	void test() {
		timeofday myTimeOfDay = new timeofday();
		assert timeofdayreal.getHours() == 0;
		assert timeofdayreal.getMinutes() == 0;
		timeofdayreal.setHours(12);
		timeofdayreal.setMinutes(45);
		assert timeofdayreal.getHours() == 12;
		assert timeofdayreal.getMinutes() == 0;
	}

}
