package lab18;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;
public class StringCalcTests {
	
	
	@Test
	void test0Numbers() throws Exception {
		
		String string = "";
		
		int actual = lab18.add(string);
		
		assertEquals(0, actual);
		
	}
	
	@Test
	void test1Number() throws Exception {
		
		String string = "1";
		
		int actual = lab18.add(string);
		
		assertEquals(1, actual);
		
	}
	
	@Test
	void test2Numbers() throws Exception {
		
		String string = "1,2";
		
		int actual = lab18.add(string);
		
		assertEquals(3, actual);
		
	}
	
	@Test
	void test5Numbers() throws Exception {
		
		String string = "1,2,3,4,5";
		
		int actual = lab18.add(string);
		
		assertEquals(15, actual);
		
	}
	
	@Test
	void test10Numbers() throws Exception {
		
		String string = "1,2,3,4,5,6,7,8,9,10";
		
		int actual = lab18.add(string);
		
		assertEquals(55, actual);
		
	}
	
	@Test
	void testNewLinesBetweenNumbers() throws Exception {
		
		String string = "1\n3";
		
		int actual = lab18.add(string);
		
		assertEquals(4, actual);
		
	}
	
	@Test
	void testDifferentDelimitersNumbersWithNewLine() throws Exception {
		
		String string = "1\n2;";
		
		int actual = lab18.add(string);
		
		assertEquals(3, actual);
		
	}
	
	@Test
	void negativesNotAllowed() throws Exception {
		
		
		//arrange
		String string = "-1";
				
		//act
		int actual = lab18.add(string);
				
		//assert
		assertEquals(0,actual);
	}
	
	@Test
	void greaterThan1000() throws Exception {
		
		
		//arrange
		String string = "1!1001";
				
		//act
		int actual = lab18.add(string);
				
		//assert
		assertEquals(1,actual);
	}
	
	@Test
	void delimiterFormat() throws Exception {
		
		
		//arrange
		String string = "5,1\n";
				
		//act
		int actual = lab18.add(string);
				
		//assert
		assertEquals(6,actual);
	}
	
	@Test
	void allowMultipleDelimiters() throws Exception {
		
		
		//arrange
		String string = "1,2;3";
		
		//act
		int actual = lab18.add(string);
		
		//assert
		assertEquals(6,actual);
	}
	
	@Test
	void negativesNotAllowed2() throws Exception {
		
		
		//arrange
		String string = "-10;1";
				
		//act
		int actual = lab18.add(string);
				
		//assert
		assertEquals(1,actual);
	}
}
