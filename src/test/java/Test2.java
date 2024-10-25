import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

// Демонстрация доп.функционала
// Вызов тестов по определенному правилу(В алфавитном порядке)
// Игнорирование метода


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test2 {
    @Test
    public void test3(){
        System.out.println("Вторым буду");
    }
    @Test
    @Ignore("Old test")
    public void test2(){
        System.out.println(2);
    }
    @Test(timeout = 60000) // ограничение выполнения в миллисекундах.
    public void test1(){
        System.out.println("Первым буду");
    }

    @Test(expected = NullPointerException.class) // отслеживание выброса исключения
    public void test4(){
        throw new NullPointerException();
    }
}
