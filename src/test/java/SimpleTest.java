import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.util.Random;

 
/**  
 * Created by dshmaya on 15/11/2017 ......567
 */  
public class SimpleTest {
	
   @Test  
   public void alwaysPass1()
   {
       Assert.assertEquals(1, 2);
   }

   @Test
    public void alwaysPass2()
    {
        Assert.assertEquals(2, 1);
    }
   @Test  
   public void alwaysPass3()
   {
       Assert.assertEquals(1, 1);
   }

  @Test
    public void alwaysPass4()
    {
        Assert.assertEquals(1, 1);
    }
   @Test
   public void alwaysFail5()
   {
       Assert.assertEquals(2, 2);
   }

   @Test
   public void alwaysFail6()
   {
       Assert.assertEquals(2, 3);
   }


  @Test
    public void alwaysPass6()
    {
        Assert.assertEquals(1, 1);
    }
 	@Test  
   public void alwaysPass7()
   {
       Assert.assertEquals(1, 1);
   }
   
    	@Test  
   public void alwaysPass8()
   {
       Assert.assertEquals(3, 3);
   }
   
       	@Test  
   public void alwaysPass9()
   {
       Assert.assertEquals(4, 4);
   }

    @Test
    public void sometimesPass1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
 	Assert.assertEquals(true, true);
    }

    @Test
    public void sometimesPass3()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(200);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
 	Assert.assertEquals(true, true);
    }


    @Test
    public void sometimesPass2()
    {
 //        Random random = new Random();
 //       int randomNumber = random.nextInt(100);
 //       boolean smallerThanFiftee =  randomNumber < 50 ? true : false;         
		 //Assert.assertEquals(smallerThanFiftee, true);
	Assert.assertEquals(true, true);
    }
	
	@Test
    public void sometimesPass4()
    {
 //        Random random = new Random();
 //       int randomNumber = random.nextInt(100);
 //       boolean smallerThanFiftee =  randomNumber < 50 ? true : false;         
		 //Assert.assertEquals(smallerThanFiftee, true);
	Assert.assertEquals(true, true);
    }
	
	
    @Test
    @Ignore
    public void ignored1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);	
    }
	
    @Test
    @Ignore
    public void ignored2()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);
    }
	
    @Test
    @Ignore
    public void ignored3()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);	
    }
	
    @Test
    @Ignore
    public void ignored4()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);	
    }
	
		
    @Test
    @Ignore
    public void ignored5()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(99);
        boolean smallerThanFiftee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFiftee, true);	
    }
	
			
    @Test
    @Ignore
    public void ignored6()
    {
        Random random = new Random();
        Assert.assertEquals(smallerThanFiftee, true);	
    }
}
 

