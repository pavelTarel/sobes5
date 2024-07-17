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
    @FindBy(xpath = //*[@id="text"])
            private WebElement SearchField;
            /**
             * определение локатора кнопки "Маркета"
            */
            @FindBy(xpath = /html/body/main/div[2]/form/div[4]/nav/ul/li[1]/a/div[1])
            private WebElement Btn;
            /**
             * метод для ввода значения в поисковик
            */
            public void inputSearch(String Search) {
        Object SearchField = "Сотовые телефоны";
        SearchField.sendKeys(SearchField); }
    /**
     * метод для осуществления нажатия кнопки "Маркета"
     */
    public void clickBtn() {
        HTMLInputElement Btn = null;
        Btn.click(); } }