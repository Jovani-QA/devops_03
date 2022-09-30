package tests;

import config.config;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.pageLogin;

public class testLogin {
    private WebDriver driver;

    @Before
    public void criarDriver(){
        config webdriver = new config();
        driver = webdriver.WebDriver();
    }

    @Test
    public void loginValido(){

        String email = "db106@cstng.com";
        String senha = "cst0962";

        pageLogin pagelogin = new pageLogin(driver);

        pagelogin.preencherEmail(email);
        pagelogin.preencherSenha(senha);
        pagelogin.clicarEmEntrar();
        driver.close();


    }

}
