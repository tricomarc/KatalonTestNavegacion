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

WebUI.click(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/menuDestacados'))

WebUI.click(findTestObject('Archivos/archivosDestacados'))

WS.sendRequest(findTestObject('Archivos/getArchivosDestacados'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.focus(findTestObject('Archivos/menuDestacados'))

WebUI.click(findTestObject('Archivos/listaDestacados'))

WS.sendRequest(findTestObject('Archivos/getListaArchivosDestacados'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/carpetasDisponibles'))

WS.sendRequest(findTestObject('Archivos/getCarpetasDisponibles'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/listaArchivos'))

WS.sendRequest(findTestObject('Archivos/getListaArchivos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/archivoGeneral'))

WS.sendRequest(findTestObject('Archivos/getArchivoGeneral'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/cargaMarca'))

WS.sendRequest(findTestObject('Archivos/getCargaMarca'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/cargaArchivosCarpeta'))

WS.sendRequest(findTestObject('Archivos/getCargaArchivoCarpeta'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/descargas'))

WS.sendRequest(findTestObject('Archivos/getDescargas'))

WS.verifyResponseStatusCode(response,200)

WebUI.focus(findTestObject('Archivos/menuArchivos'))

WebUI.click(findTestObject('Archivos/eliminarMasivo'))

WS.sendRequest(findTestObject('Archivos/getEliminarMasivo'))

WS.verifyResponseStatusCode(response, 200)

WebUI.closeBrowser();



