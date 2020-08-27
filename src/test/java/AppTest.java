import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.After;
import org.junit.Before;


public class AppTest 
{
     private App myapp;

     @Before
      public void setUp()throws Exception{
	  myapp=new App();

      }

      @After
       public void tearDown()throws Exception{
             
	}
    
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
  
      @Test
      public void testAdd(){
            int result=myapp.add(2,3);
             assertEquals(result,5);
            
	}

      @Test
      public void testMultiply(){
            int result=myapp.multiply(2,3);
             assertEquals(result,6);
            
	}
}
