import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import org.junit.After

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

WebUI.click(findTestObject('SAC/menuSac'))

WebUI.click(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/tipoAtencion'))

WS.sendRequest(findTestObject('SAC/getTipoAtencion'))

WS.sendRequest(findTestObject('SAC/getTipoAtencion'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/temaAtencion'))

WS.sendRequest(findTestObject('SAC/getTemaAtencion'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/canalesAtencion'))

WS.sendRequest(findTestObject('SAC/getCanalesAtencion'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/estadoAtencion'))

WS.sendRequest(findTestObject('SAC/getEstadoAtencion'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/categorias'))

WS.sendRequest(findTestObject('SAC/getCategorias'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/subCategorias'))

WS.sendRequest(findTestObject('SAC/getSubCategorias'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/caracteristicasCliente'))

WS.sendRequest(findTestObject('SAC/getCaracteristicasCliente'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/bancos'))

WS.sendRequest(findTestObject('SAC/getBancos'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/configuracionSla'))

WS.sendRequest(findTestObject('SAC/getConfiguracionSla'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.focus(findTestObject('SAC/subMenuParametros'))

WebUI.click(findTestObject('SAC/diasHorarios'))

WS.sendRequest(findTestObject('SAC/getDiasHorarios'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.click(findTestObject('SAC/supervisores'))

WS.sendRequest(findTestObject('SAC/getSupervisores'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.click(findTestObject('SAC/resolutores'))

WS.sendRequest(findTestObject('SAC/getResolutores'))

WebUI.focus(findTestObject('SAC/menuSac'))

WebUI.click(findTestObject('SAC/estadisticas'))

WS.sendRequest(findTestObject('SAC/getEstadisticas'))

WebUI.closeBrowser();
