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

WebUI.waitForElementPresent(findTestObject('LoginPage/btn_Login'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/txtInput_Username'), 0)

WebUI.verifyElementPresent(findTestObject('LoginPage/txtInput_Password'), 0)

WebUI.setText(findTestObject('LoginPage/txtInput_Username'), GlobalVariable.user_standard)

WebUI.setText(findTestObject('LoginPage/txtInput_Password'), GlobalVariable.pswd_all)

WebUI.click(findTestObject('LoginPage/btn_Login'))

WebUI.verifyElementNotPresent(findTestObject('LoginPage/txtError'), 0)

WebUI.waitForElementPresent(findTestObject('ProductPage/txtView_product'), 0)

WebUI.verifyElementPresent(findTestObject('ProductPage/btn_Hamburger'), 0)

WebUI.click(findTestObject('ProductPage/btn_Hamburger'))

WebUI.waitForElementPresent(findTestObject('ProductPage/btn_Logout'), 0)

WebUI.click(findTestObject('ProductPage/btn_Logout'))

WebUI.waitForElementPresent(findTestObject('LoginPage/btn_Login'), 0)

WebUI.closeBrowser()

