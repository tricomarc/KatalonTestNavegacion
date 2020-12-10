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

WebUI.click(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/kpiArchivos'))

WS.sendRequest(findTestObject('Kpi/getKpiArchivos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/vendedores'))

WS.sendRequest(findTestObject('Kpi/getVendedores'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/categorias'))

WS.sendRequest(findTestObject('Kpi/getCategorias'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/indicadores'))

WS.sendRequest(findTestObject('Kpi/getIndicadores'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/elementos'))

WS.sendRequest(findTestObject('Kpi/getElementos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/resumen'))

WS.sendRequest(findTestObject('Kpi/getResumen'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/indicadoresFront'))

WS.sendRequest(findTestObject('Kpi/getIndicadoresFront'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Kpi/menuKpi'))

WebUI.click(findTestObject('Kpi/reporteUso'))

WS.sendRequest(findTestObject('Kpi/getReporteUso'))

WS.verifyResponseStatusCode(response, 200)

WebUI.closeBrowser();