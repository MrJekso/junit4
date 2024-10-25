import org.junit.runner.RunWith;
import org.junit.runners.Suite;

// Пример как группировать тесты

@RunWith(Suite.class)
@Suite.SuiteClasses({
        Test1.class, Test2.class, Test3.class
})
public class TestSuite {

}
