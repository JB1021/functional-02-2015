package functional;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class RacingTest {

	Racing racing;
	@Before
	public void setup(){
		racing = new Racing();
	}
	
//	@Test
//	public void testRaceRun(){
//		racing.setCarNumber(3);
//		racing.setShow(true);
//		racing.run(3);
//	}
//	
//	@Test
//	public void testRaceGo() {
//		racing.setCarNumber(3);
//		racing.go();
//		racing.printCarStatus();
//	}
//	@Test
//	public void carTest() throws Exception {
//		Random r = new Random();
//		Car car = new Car();
//		if(car.canGo(r)) car.go();
//	}
	
	@Test
	public void runRacing() throws Exception {
		racing.run(10, Arrays.asList(new Car(), new Car(), new Car()));
	}
}
