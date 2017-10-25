import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class exampleTest {
	
	Garage g;
	Car c;
	@Before
	void setUp() {
		g = new Garage();
		c = new Car();
	}
 
	@Test
	void test() {
 		example e = new example();
		int result = e.add(1, 2);
		assertEquals(3, result);
		
	c.name = "jeff";
		g.addVeihcle(c);
		g.removeVehicle(0);
	}

}
