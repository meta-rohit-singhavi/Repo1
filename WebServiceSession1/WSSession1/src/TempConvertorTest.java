import static org.junit.Assert.*;

import org.junit.Test;


public class TempConvertorTest {

	TempConvertor tc = new TempConvertor();
	@Test
	public void testForenhiteToCalcus() {
		assertEquals(0, tc.forenhiteToCalcus(32),0);
	}

}
