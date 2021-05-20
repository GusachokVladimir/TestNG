import org.testng.annotations.*;

@Test
public class Test1{

    @Test (groups = {"smokeTest"}, dependsOnMethods = "testSmoke11", priority = 1)
    public void testSmoke1(){
        System.out.println("TestSmoke 1");
    }

    @Test (groups = {"smokeTest"}, dependsOnMethods = "testSmoke12", priority = 1)
    public void testSmoke11(){
        System.out.println("TestSmoke 1-1");
    }

    @Test (groups = {"smokeTest"}, dependsOnMethods = "testSmoke13", priority = 1)
    public void testSmoke12(){
        System.out.println("TestSmoke 1-2");
    }


    @Test (groups = {"smokeTest"}, priority = 1)
    public void testSmoke13(){
        System.out.println("TestSmoke 1-3");
    }

    @Test (groups = {"regressTest"}, priority = 2)
    public void testRegress1(){
        System.out.println("TestRegress 1");
    }

    @Test (groups = {"regressTest"}, priority = 2)
    public void testRegress11(){
        System.out.println("TestRegress 1-1");
    }

    @Test (groups = {"regressTest"}, priority = 2)
    public void testRegress12(){
        System.out.println("TestRegress 1-2");
    }

    @Test (groups = {"regressTest"}, priority = 2)
    public void testRegress13(){
        System.out.println("TestRegress 1-3");
    }

    @Test (groups = {"unstableTest"}, priority = 3)
    public void testUnstable1(){
        System.out.println("TestUnstable 1");
    }

    @Test (groups = {"unstableTest"}, priority = 3)
    public void testUnstable11(){
        System.out.println("TestUnstable 1-1");
    }

    @Test (groups = {"unstableTest"}, priority = 3)
    public void testUnstable12(){
        System.out.println("TestUnstable 1-2");
    }

    @Test (groups = {"unstableTest"}, priority = 3)
    public void testUnstable13(){
        System.out.println("TestUnstable 1-3");
    }

    @BeforeTest
    @Test
    public void Begin(){
        System.out.println("Begin");
    }

    @AfterTest
    @Test
    public void Finish(){
        System.out.println("Finish");
    }

}
