import de.bechte.junit.runners.context.HierarchicalContextRunner;
import org.junit.*;
import org.junit.runner.RunWith;

@RunWith(HierarchicalContextRunner.class)
public class NestedTest {

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

    public class InnerTest{

        @Before
        public void before(){
            System.out.println("InnerTest Before method");
        }

        @Test
        public void test13(){
            System.out.println("InnerTest In method test:");
        }

        @Test
        public void test14(){
            System.out.println("InnerTest In method test two:");
        }

        @After
        public void after(){
            System.out.println("InnerTest Method after");
        }


    }
}
