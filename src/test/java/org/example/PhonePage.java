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
     * определение локатора поля максимальной цены
     */
    @FindBy(xpath = //*[@id="range-filter-field-glprice_1f202f07_max"])
            private WebElement Filter;
    /**
     * определение локатора чекбокса Диагонали "3.5-4.9"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[10]/div/fieldset/div/div/div[2]/div/div/div/div[2]/label)
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Диагонали "5.0-5.4"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[10]/div/fieldset/div/div/div[2]/div/div/div/div[3]/label/span/span[2])
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Диагонали "5.5-5.9"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[10]/div/fieldset/div/div/div[2]/div/div/div/div[4]/label/span/span[2])
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Диагонали "6.0-6.4"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[10]/div/fieldset/div/div/div[2]/div/div/div/div[5]/label/span/span[2])
            private WebElement Checkbox;
    /**
     * определение локатора чекбокса Диагонали "6.5 и больше"
    */
    @FindBy(xpath = //*[@id="/content/page/fancyPage/cms/4/SearchFilters-SearchFilters"]/div/div/div/div/div[10]/div/fieldset/div/div/div[2]/div/div/div/div[6]/label/span/span[2])
            private WebElement Checkbox;

    /**
     * метод для ввода значения в поле максимальной цены
    */
    public void inputSearch(String Search) {
        Object XPathType.Filter= "2000";
        SearchField.sendKeys(XPathType.Filter); }
    /**
     * метод для осуществления нажатия чекбокса Диагонали "3.5-4.9"
     */
    public void clickCheckbox() {
        HTMLInputElement Checkbox = null;
        Checkbox.click(); }
    /**
     * метод для осуществления нажатия чекбокса Диагонали "5.0-5.4"
      */
    public void clickCheckbox(){
        HTMLInputElement Checkbox = null;
        Checkbox.click();}
    /**
     * метод для осуществления нажатия чекбокса Диагонали "5.5-5.9"
     */
    public void clickCheckbox(){
        HTMLInputElement Checkbox = null;
        Checkbox.click();}
    /**
     * метод для осуществления нажатия чекбокса Диагонали "6.0-6.4"
     */
    public void clickCheckbox(){
        HTMLInputElement Checkbox = null;
        Checkbox.click();}
    /**
     * метод для осуществления нажатия чекбокса Диагонали "6.5 и больше"
     */
    public void clickCheckbox(){
        HTMLInputElement Checkbox = null;
        Checkbox.click();}

}