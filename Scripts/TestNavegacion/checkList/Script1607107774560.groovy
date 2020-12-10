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

WebUI.openBrowser('https://demo.oneapp.cl/admin/')

WebUI.maximizeWindow()

def response = WS.sendRequest(findTestObject('Comun/login' /*Hace llamado objeto login*/ ))

WS.verifyResponseStatusCode(response, 200 /* Verifica que las respuesta del servidor sea 200*/ )

WebUI.setText(findTestObject('Comun/userName'), 'admin' /*Inserta valor en campo Administrador Usuario*/ )

WebUI.setText(findTestObject('Comun/passAdmin'), 'andain5546' /*Inserta valor en campo AdministradorClave*/ )

WebUI.click(findTestObject('Comun/btnLogin'))

WebUI.click(findTestObject('Comunicados/menuComunicados'))

WebUI.click(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/checkList'))

WS.sendRequest(findTestObject('CheckList/getChecklist'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/ambitos'))

WS.sendRequest(findTestObject('CheckList/getAmbitos'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/reportes'))

WS.sendRequest(findTestObject('CheckList/getReportes'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/menuLean'))

WebUI.click(findTestObject('CheckList/muebles'))

WS.sendRequest(findTestObject('CheckList/getMuebles'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.focus(findTestObject('CheckList/menuLean'))

WebUI.click(findTestObject('CheckList/mueblesSucursal'))

WS.sendRequest(findTestObject('CheckList/getMueblesSucursal'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.focus(findTestObject('CheckList/menuLean'))

WebUI.click(findTestObject('CheckList/reporteArea'))

WS.sendRequest(findTestObject('CHeckList/getReporteArea'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.focus(findTestObject('CheckList/menuLean'))

WebUI.click(findTestObject('CheckList/reporteRubro'))

WS.sendRequest(findTestObject('CheckList/getReporteRubro'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.focus(findTestObject('CheckList/menuLean'))

WebUI.click(findTestObject('CheckList/reporteLean'))

WS.sendRequest(findTestObject('CheckList/getReporteLean'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/estadisticas'))

WS.sendRequest(findTestObject('CheckList/getEstadisticas'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/dashboard'))

WS.sendRequest(findTestObject('CheckList/getDashboard'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/bi'))

WS.sendRequest(findTestObject('CheckList/getBi'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/tipoPregunta'))

WS.sendRequest(findTestObject('CheckList/getTipoPregunta'))

WebUI.focus(findTestObject('CheckList/menuCheck'))

WebUI.click(findTestObject('CheckList/semaforo'))

WebUI.click(findTestObject('CheckList/btnAlerta'))

WS.sendRequest(findTestObject('CheckList/getSemaforo'))

WebUI.closeBrowser();

