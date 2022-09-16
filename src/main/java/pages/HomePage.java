package pages;

import core.AppiumBase;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.SwipeUtil;

public class HomePage extends AppiumBase {

    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='thể loại']")
    private WebElement categories;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tài khoản']")
    private WebElement account;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Thể loại hot']")
    private WebElement categoriesHot;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@text='Thể loại hot']/../androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout)[1]")
    private WebElement firstCate;

    public void clickToCategories(){
        wait.until(ExpectedConditions.visibilityOf(categories)).click();
    }

    public void verifyHome(){
        wait.until(ExpectedConditions.visibilityOf(categories));
    }

    public void scrollToHotCate(){
        SwipeUtil.getElement(By.xpath("//android.widget.TextView[@text='Cửa hàng thương hiệu']"), driver);
    }

    public void clickFirstCate(){
        wait.until(ExpectedConditions.visibilityOf(firstCate)).click();
    }

    public void clickToAccount(){
        wait.until(ExpectedConditions.visibilityOf(account)).click();
    }
}
