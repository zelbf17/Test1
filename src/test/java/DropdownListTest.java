import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropdownListTest extends BaseTest {

    String URL = "https://the-internet.herokuapp.com/dropdown";

   @Test
    public void checkDropdownList() {
       driver.get(URL);
       WebElement element = driver.findElement(By.id("dropdown"));
       Select select = new Select(element); // для выпадающего списка
       List<WebElement> options = select.getOptions();
       assertEquals(options.size(),3);
       select.selectByIndex(1);
       assertEquals(select.getFirstSelectedOption().getText(), "Option 1");

   }
}
