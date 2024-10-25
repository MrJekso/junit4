import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.Assert;
import org.junit.Test;
import com.tngtech.java.junit.dataprovider.DataProvider;
import org.junit.runner.RunWith;

// Пример работы с параметеризированным тестом
// (Сокращенная версия)

@RunWith(DataProviderRunner.class)
public class DataProviderCalculator {

    @DataProvider
    public static Object[][] dataMethod(){
        return new Object[][]{
                {1,1,2},
                {2,2,4},
                {4,4,9}
        };
    }

    @Test
    @UseDataProvider("dataMethod")
    public void sum(int v1, int v2, int v3){
        Calculator calculator = new Calculator();
        Assert.assertEquals("Значение не совпадает 15: ",v3, calculator.sum(v1,v2));
    }
}
