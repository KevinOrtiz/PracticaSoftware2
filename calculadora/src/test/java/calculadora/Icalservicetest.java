package calculadora;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import junit.framework.Assert;

public class Icalservicetest {
icalservice CalService;

	@Before
	public void setup(){
		//Here built mocks to integration test
		iCalculator cal = Mockito.mock(iCalculator.class);
		//Pass parameter of my method and also the result that I expect see
		Mockito.when(cal.add(3, 3)).thenReturn(6);
		CalService = new icalservice();
		CalService.setCalc(cal);	
		
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		Assert.assertEquals(6, CalService.addTwoNumbers(3, 3));
	}

}
