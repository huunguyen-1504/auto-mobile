package stepdefinition;

import io.cucumber.java.en.Given;

import pages.HomePage;

public class Steps {
    HomePage homePage = new HomePage();

    @Given("Open Easy Online Shopping App")
    public void openBanggoodEasyOnlineShoppingApp() {
        homePage.verifyHome();
    }

}
