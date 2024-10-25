import org.junit.Assert;
import org.junit.Test;

// Основные функции assert

public class Test3 {
    @Test
    public void test1(){
        Assert.assertEquals("alex","alex");
    }
    @Test
    public void test2(){
        Assert.assertEquals("Значение не равны: ","alex","Alex");
    }
    @Test
    public void test3(){
        Object obj = new Object();
        Assert.assertNull("Объект не является null",obj);
    }
    @Test
    public void test4(){
        Object obj = new Object();
        Assert.assertNotNull("Объект является null",obj);
    }
    @Test
    public void test5(){
        Assert.assertTrue(true);
    }
    @Test
    public void test6(){
        Assert.assertFalse(false);
    }
}
