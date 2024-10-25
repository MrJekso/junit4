import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

// Пример работы с параметеризированным тестом

@RunWith(Parameterized.class)
public class CalculatorTest {
    private final int v1;
    private final int v2;
    private final int v3;

    public CalculatorTest(int v1, int v2, int v3){
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }


    @Parameterized.Parameters
    public static Iterable<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {1,1,2},
                {2,2,4},
                {4,4,9}
        });
    }

    @Test
    public void sum(){
        Calculator calculator = new Calculator();
        Assert.assertEquals("Значение не совпадает 15: ",v3, calculator.sum(v1,v2));
    }
}
