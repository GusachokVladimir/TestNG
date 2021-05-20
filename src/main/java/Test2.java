import org.testng.annotations.*;

@Test
public class Test2 {

    @DataProvider(name = "db")
    public static Object[][] dbData (){
        return new Object[][] {
                {"parameter1", new Integer(1)},
                {"parameter2", new Integer(2)}
        };
    }
/*
    @BeforeClass
    @Test
    public void Begin(){
        System.out.println("Begin");
    }

    @AfterClass
    @Test
    public void Finish(){
        System.out.println("Finish");
    }
*/

    public void testUnstable1(){
        System.out.println("TestUnstable 1");
    }

    public void testUnstable11(){
        System.out.println("TestUnstable 1-1");
    }

    @Parameters({"parameters"})
    public void testUnstable12(String parameters){
        System.out.println("TestUnstable 1-2 " + parameters);
    }

    @Parameters({"db"})
    @Test (dataProvider = "db")
    public void testUnstable13(String e1, int e2) {
        System.out.println("TestUnstable 1-3 " + e1 + " " + e2);
    }
}
