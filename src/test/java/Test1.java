import org.junit.*;

// Наглядный тест основного функционала


public class Test1 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Method Before class");
    }

    @Before
    public void before(){
        System.out.println("Before method");
    }

    @Test
    public void test13(){
        System.out.println("In method test:");
    }

    @Test
    public void test14(){
        System.out.println("In method test two:");
    }

    @After
    public void after(){
        System.out.println("Method after");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("Method After class");
    }
}
