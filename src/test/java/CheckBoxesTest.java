import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class CheckBoxesTest extends BaseTest{
    String URL = "https://the-internet.herokuapp.com/checkboxes";

    @Test
    public void checkBoxesTest1() {
        driver.get(URL);
        List<WebElement> checkBoxes = driver.findElements(By.id("checkboxes"));
        assertFalse(checkBoxes.get(0).isSelected());
        assertTrue(checkBoxes.get(1).isSelected()); //В 1 тесте один assert
        //checkBoxes.get(0).click();
    }

}
