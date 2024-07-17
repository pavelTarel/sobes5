package org.example;
import jdk.javadoc.internal.doclets.formats.html.taglets.snippet.Style;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class Page {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public Page (WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора кликабельной ссылки
     */
    @FindBy(xpath = //*[@id="rso"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3)
            private WebElement Style.Link;

    /**
     * метод для осуществления нажатия на ссылку
     */
    public void clicklink() {
        Link.click(); } }