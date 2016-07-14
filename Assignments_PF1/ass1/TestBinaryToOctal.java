package ass1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestBinaryToOctal {

	BinaryToOctal bto=new BinaryToOctal();
	
	@Test
	   public void testconvertBinaryToOctal()
	{
	      //System.out.println("Inside testconvertBinaryToOctal()");
	      
	      assertEquals(15,bto.convertBinaryToOctal(1101));
	      assertEquals(30,bto.convertBinaryToOctal(11000));
	      assertEquals(1537,bto.convertBinaryToOctal(1101011111));
	   }
   
   }

