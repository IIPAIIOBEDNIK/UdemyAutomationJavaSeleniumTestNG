package seleniumExamp;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class findElement {
    public static void main(String[] args) {

        // Задаем путь до драйвера
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // Инициализация драйвера
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Ожидание появления элемента на странице
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS); // Ожидание полной загрузки страницы
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS); // Ожидание загрузки всех ассинхронных запросов

        // Открытие страницы
        driver.get("https://google.com");

        // findElements - найдет список элементов подходящих под локатор и требуется дополнительно указать к какому элементу обращаться
        //List<WebElement> input = driver.findElement();
        // findElement - будет ссылаться на первый найденный элемент

        //driver.findElement(By.cssSelector("*" - все элементы));
        //driver.findElement(By.cssSelector("." - поиск по классу));
        //driver.findElement(By.cssSelector("#" - поиск по id));
        //driver.findElement(By.cssSelector("div a" - все ссылки внутри тега див));
        //driver.findElement(By.cssSelector("div.main + p" - параграф следующий за div.main));
        //driver.findElement(By.cssSelector("a[href='asdasd']"));
        //driver.findElement(By.cssSelector("a[href*='asdasd' - поиск по части текста]"));
        //driver.findElement(By.cssSelector("a[href^='asdasd' - поиск по тексту, который начинается с asdasd]"));
        //driver.findElement(By.cssSelector("a[href^='asdasd' - поиск по тексту, который заканчивается на asdasd]"));
        //driver.findElement(By.cssSelector("div:not(#main)" - все id не содержащие main));
        //driver.findElement(By.cssSelector("div::first-line" - выбор первой строки div'a'));
        //driver.findElement(By.cssSelector("div::nth-child(4)" - выбор 4-го элемента с начала));
        //driver.findElement(By.cssSelector("div::nth-last-child(2)" - выбор 2-го элемента с конца));
        driver.findElement(By.cssSelector("div id='inputWrapper' + input id = 'input'")).click();
        //driver.findElement(By.cssSelector("*"));
        //driver.findElement(By.cssSelector("*"));
        //driver.findElement(By.cssSelector("*"));
        //driver.findElement(By.cssSelector("*"));
    }
}
