package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class Metodos {

    WebDriver driver;

    /**
     *
     * Método para iniciar o programa
     * @author Alexandre Sena
     */

    public void acessarSistema() {

        System.setProperty("webdriver.chrome.driver", "C:/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://blogdoagi.com.br");
        driver.manage().window().maximize();

        System.out.println("*** INICIANDO TESTE***");
    }


    /**
     * Método para encerrar o programa
     *@author Alexandre Sena
     */

    public void encerrandoSistema() {
        driver.quit();
        System.out.println("*** FINALIZANDO TESTE***");

    }

    public void cliqueLupa(By elemento) {
            driver.findElement(elemento).click();
    }

    public void pesquisar(By elemento, String investimento) {
         driver.findElement(elemento).sendKeys(investimento);
    }
    public void enter(By elemento) {
        driver.findElement(elemento).submit();


    }


    }

