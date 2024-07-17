package org.example;
import jdk.dynalink.linker.support.Lookup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

import javax.xml.crypto.dsig.spec.XPathType;
import java.awt.*;
import java.util.logging.Filter;

public class PhonePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public PhonePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    /**
     * определение локатора чекбокса Производителя "Apple"
     */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[8]/div/fieldset/div/div/div[2]/div[1]/div/div/div[1]/label/span/span[2])
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Производителя "Xiaomi"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[8]/div/fieldset/div/div/div[2]/div[1]/div/div/div[2]/label/span/span[2])
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Производителя "Samsung"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[8]/div/fieldset/div/div/div[2]/div[1]/div/div/div[3]/label/span/span[2])
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Производителя "AGM"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[8]/div/fieldset/div/div/div[2]/div[1]/div/div/div/div/div/div[2]/div/label)
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Производителя "Acer"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[8]/div/fieldset/div/div/div[2]/div[1]/div/div/div/div/div/div[1]/div/label)
            private WebElement Checkbox;

    /**
     * метод для осуществления нажатия чекбокса Производителя "Apple"
    */
    public void clickCheckbox() {
        HTMLInputElement Checkbox = null;
        Checkbox.click(); }
            /**
             * метод для осуществления нажатия чекбокса Производителя "Xiaomi"
            */
            public void clickCheckbox(){
                HTMLInputElement Checkbox = null;
                Checkbox.click();}
            /**
             * метод для осуществления нажатия чекбокса Производителя "Samsung"
            */
            public void clickCheckbox(){
                HTMLInputElement Checkbox = null;
                Checkbox.click();}
            /**
             * метод для осуществления нажатия чекбокса Производителя "AGM"
            */
            public void clickCheckbox(){
                HTMLInputElement Checkbox = null;
                Checkbox.click();}
            /**
             * метод для осуществления нажатия чекбокса Производителя "Acer"
            */
            public void clickCheckbox(){
                HTMLInputElement Checkbox = null;
                Checkbox.click();}
}