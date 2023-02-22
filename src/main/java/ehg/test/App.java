package ehg.test;

import java.io.IOException;

import org.testng.annotations.Test;

import ehg.base.BasePage;


/**
 * Unit test for simple App.
 */
public class App extends BasePage
{
    public App() throws IOException {
        super();
        //TODO Auto-generated constructor stub
    }

    /**
     * Rigorous Test :-)
     * @throws IOException
     */
    @Test
    public void shouldAnswerWithTrue() throws IOException
    {
        // assertTrue( true );
        getDriver().get(getUrl());
        System.out.println("Hello Guyss");
    }
}