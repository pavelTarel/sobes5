package org.example;
import jdk.dynalink.linker.support.Lookup;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class SearchPage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    public WebDriver driver;
    public SearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }
    /**
     * определение локатора поля поиска
     */
    @FindBy(xpath = //*[@id="APjFqb"])
    private WebElement SearchField;
    /**
     * определение локатора кнопки поиска
     */
    @FindBy(xpath = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[1]/div/span/svg/path")
    private WebElement LookupBtn;
    /**
     * метод для ввода значения в поисковик
     */
    public void inputSearch(String Search) {
        Object SearchField = "yandex.ru";
        SearchField.sendKeys(SearchField); }
    /**
     * метод для осуществления нажатия кнопки поиска
     */
    public void clickLookupBtn() {
        HTMLInputElement LookupBtn = null;
        LookupBtn.click(); } }