package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {


    private static final Logger log = Logger.getLogger(AccountPage.class);
    @CacheLookup
    @FindBy(xpath = "//div[@ng-hide='noAccount']//button[2]")
    WebElement clickOnDepositeTopTab;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/div[1]/input[1]")
    WebElement enterAmountField;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnDepositeAfterAmountField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement clickOnWithdrawTopTab;


    public void clickOnDepositeTab() {
        clickOnElement(clickOnDepositeTopTab);
    log.info("click on deoposit" + clickOnDepositeTopTab);

    }

    public void enter100InAmountField() {
        sendTextToElement(enterAmountField, "100");
        log.info("click on deoposit" + clickOnDepositeTopTab);

    }

    public void clickOnDepositeButton() {
        clickOnElement(clickOnDepositeAfterAmountField);
      log.info("click on deoposit" + clickOnDepositeTopTab);

    }

    public void ClickOnWithdrawTab() {
        clickOnElement(clickOnWithdrawTopTab);
        log.info("click on deoposit" + clickOnDepositeTopTab);

    }

    @CacheLookup
    @FindBy(tagName = "input")
    WebElement amountWithdraw;

    public void enterAmountInWithdrawField() {
        sendTextToElement(amountWithdraw, "50");
       log.info("withdraw amount " + amountWithdraw.toString());

    }


    @CacheLookup
    @FindBy(xpath = "//body/div[1]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement clickOnWithdrawBtn;


    public void clickOnWithdrawButton() {
        clickOnElement(clickOnWithdrawBtn);
     log.info("click on withdraw" + clickOnWithdrawBtn.toString());

    }


    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifydepositTransactionSuccessful;

    public String verifyDepositTransactionSuccessful() {
        log.info("verify transaction " + verifydepositTransactionSuccessful.toString());
        return getTextFromElement(verifydepositTransactionSuccessful);

    }

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    WebElement verifywithdrawTransactionSuccessful;

    public String verifywithdrawlTransactionSuccessful() {
       log.info("verify transaction " + verifywithdrawTransactionSuccessful.toString());
        return getTextFromElement(verifywithdrawTransactionSuccessful);

    }

}
