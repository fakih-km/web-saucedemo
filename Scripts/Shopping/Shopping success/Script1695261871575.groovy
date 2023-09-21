import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser(GlobalVariable.url_saucedemo)

CustomKeywords.'utilies.login'(GlobalVariable.user_standard, GlobalVariable.pswd_all)

WebUI.verifyElementPresent(findTestObject('ProductPage/btn_AddToCart1'), 0)

WebUI.verifyElementPresent(findTestObject('ProductPage/btn_AddToCart2'), 0)

WebUI.verifyElementPresent(findTestObject('ProductPage/img_products1'), 0)

WebUI.verifyElementPresent(findTestObject('ProductPage/img_products2'), 0)

WebUI.click(findTestObject('ProductPage/btn_addToCart2'))

WebUI.verifyElementPresent(findTestObject('ProductPage/btn_removeProduct2'), 0)

WebUI.verifyElementPresent(findTestObject('ProductPage/txtView_badgeCart'), 0)

WebUI.click(findTestObject('ProductPage/btn_removeProduct2'))

WebUI.verifyElementNotPresent(findTestObject('ProductPage/btn_removeProduct2'), 0)

WebUI.verifyElementNotPresent(findTestObject('ProductPage/txtView_badgeCart'), 0)

titleProduct1 = WebUI.getText(findTestObject('ProductPage/textView_titleProduct1'))

descProduct1 = WebUI.getText(findTestObject('ProductPage/txtView_descProduct1'))

priceProduct1 = WebUI.getText(findTestObject('ProductPage/txtView_priceProduct1'))

titleProduct2 = WebUI.getText(findTestObject('ProductPage/textView_titleProduct2'))

descProduct2 = WebUI.getText(findTestObject('ProductPage/txtView_descProduct2'))

priceProduct2 = WebUI.getText(findTestObject('ProductPage/txtView_priceProduct2'))

WebUI.click(findTestObject('ProductPage/txtLink_titleProduct1'))

WebUI.waitForElementPresent(findTestObject('ProductPage/PDP/btn_back'), 0)

WebUI.verifyTextPresent(titleProduct1, false)

WebUI.click(findTestObject('ProductPage/PDP/btn_back'))

WebUI.click(findTestObject('ProductPage/txtLink_titleProduct1'))

WebUI.waitForElementPresent(findTestObject('ProductPage/btn_addToCart1'), 0)

WebUI.verifyTextPresent(titleProduct1, false)

WebUI.verifyTextPresent(descProduct1, false)

WebUI.verifyTextPresent(priceProduct1, false)

WebUI.click(findTestObject('ProductPage/btn_addToCart1'))

WebUI.verifyElementPresent(findTestObject('ProductPage/txtView_badgeCart'), 0)

WebUI.verifyElementPresent(findTestObject('ProductPage/btn_removeProduct1'), 0)

WebUI.click(findTestObject('ProductPage/btn_cart'))

WebUI.waitForElementPresent(findTestObject('ProductPage/textView_titleProduct1'), 0)

WebUI.verifyElementPresent(findTestObject('Cart/btn_continueShopping'), 0)

WebUI.click(findTestObject('Cart/btn_continueShopping'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('ProductPage/txtView_product'), 0)

WebUI.click(findTestObject('ProductPage/btn_addToCart2'))

priceProduct2 = WebUI.getText(findTestObject('ProductPage/txtView_priceProduct2'))

WebUI.click(findTestObject('ProductPage/btn_cart'))

WebUI.waitForElementPresent(findTestObject('Cart/btn_chekout'), 0)

WebUI.verifyTextPresent(priceProduct2, false)

WebUI.click(findTestObject('Cart/btn_chekout'))

WebUI.waitForElementPresent(findTestObject('Checkout/txtInput_firtName'), 0)

WebUI.setText(findTestObject('Checkout/txtInput_firtName'), 'First ' + CustomKeywords.'utilies.randomString'(5))

WebUI.setText(findTestObject('Checkout/txtInput_lastName'), 'Last ' + CustomKeywords.'utilies.randomString'(5))

WebUI.setText(findTestObject('Checkout/txtInput_postalCode'), CustomKeywords.'utilies.randomInt'(5))

WebUI.click(findTestObject('Checkout/btn_continue'))

WebUI.waitForElementPresent(findTestObject('Checkout/btn_finish'), 0)

WebUI.verifyTextPresent(titleProduct1, false)

WebUI.verifyTextPresent(descProduct1, false)

WebUI.verifyTextPresent(priceProduct1, false)

WebUI.verifyElementPresent(findTestObject('Checkout/btn_finish'), 0)

WebUI.click(findTestObject('Checkout/btn_finish'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Checkout/btn_backHome'), 0)

WebUI.verifyTextPresent('Checkout: Complete!', false)

WebUI.verifyTextPresent('Thank you for your order!', false)

WebUI.click(findTestObject('Checkout/btn_backHome'))

WebUI.waitForElementPresent(findTestObject('ProductPage/txtView_product'), 0)

WebUI.closeBrowser()

