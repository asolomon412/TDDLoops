import static org.junit.Assert.*;

import org.junit.Test;

//import Loops;

public class TestLoops {

	// @Test
	// public void test() {
	// fail("Not yet implemented");
	// }

	@Test
	public void testPrintHashPrintsOneHash() {

		String result = Loops.printHash(1);
		assertEquals("#", result);
	}

	@Test
	public void testPrintHashPrintsTwoHash() {

		String result = Loops.printHash(2);
		assertEquals("##", result);
	}

	@Test
	public void testPrintHashPrintsThreeHash() {
		String result = Loops.printHash(3);
		assertEquals("###", result);
	}

	@Test
	public void testPrintShapeA() {
		String result = Loops.makeShapeA( );
		String testGoal ="#\n"
				        +"##\n"
				        +"###\n"
		                +"####\n"
						+"#####\n"
						+"######\n"
						+"#######\n"
						+"########\n";
		assertEquals(testGoal, result);
	}

}
