/*
package seleniumExamp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

    public static void main(String[] args) {
        // Задаем путь до драйвера
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Инициализация драйвера
        WebDriver driver = new ChromeDriver();
        // Открытие страницы
        driver.get("https://google.com");

        // findElements - найдет список элементов подходящих под локатор и требуется дополнительно указать к какому элементу обращаться
        //List<WebElement> input = driver.findElement();
        // findElement - будет ссылаться на первый найденный элемент

        WebElement input = driver.findElement(
                // Находит элемент по его id. Возможна проблема, если id создается динамически
                //By.id()
                // Поиск элемента по полному тексту
                //By.linkText()
                // Поиск элемента по частичному совпадению текста
                //By.partialLinkText()
                By.id("input")
        );



    }


}
*/