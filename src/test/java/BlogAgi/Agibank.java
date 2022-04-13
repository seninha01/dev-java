package BlogAgi;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.Metodos;

public class Agibank {

    Metodos metodos = new Metodos();


        @Before
        public void setUp() throws Exception{
            metodos.acessarSistema();
        }

        @After
        public void tearDown() throws Exception {
            //metodos.encerrandoSistema();
        }

        @Test
        public void abrirLupa() {
            String texto ="";
            By lupa = By.id("search-open");
            By digitar = By.className("search-field");
            By acionar = By.xpath("/html/body/header/div[1]/div[2]/form/input");

            metodos.cliqueLupa(lupa);
            metodos.pesquisar(digitar, "investimento");
            metodos.enter(acionar);

        }
    }

