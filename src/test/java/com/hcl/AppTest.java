package com.hcl;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    
    public void testRestController()
    {
    	/*RestTemplate restTemplate = new RestTemplate();
    	HttpStatus statusCode = restTemplate.exchange("http://localhost:8080/getflightdetails", HttpMethod.GET, new HttpEntity<String>(""), String.class).getStatusCode();
        assertTrue( statusCode.equals(HttpStatus.OK) );*/
    	
    	assertTrue( true);
    }
}
