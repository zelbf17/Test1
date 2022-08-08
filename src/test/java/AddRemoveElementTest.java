import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class AddRemoveElementTest extends BaseTest{

    String URL = "https://the-internet.herokuapp.com/add_remove_elements/";
    String addButtonLocator = "//button[@onclick='addElement()']";
    String deleteButtonLocator = "[onclick='deleteElement()']";

    @Test
    public void addRemoveElement() {
        driver.get(URL);
        WebElement addButton = driver.findElement(By.xpath(addButtonLocator));
        addButton.click();
        addButton.click();

        List<WebElement> deleteButton = driver.findElements(By.cssSelector(deleteButtonLocator));
        assertEquals(deleteButton.size(),2,"количество элементов не равно 2");

        deleteButton.get(1).click();
        deleteButton = driver.findElements(By.cssSelector(deleteButtonLocator));
        assertEquals(deleteButton.size(),1,"количество элементов не равно 2");

    }
}
