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

WebUI.click(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/administrador'))

WS.sendRequest(findTestObject('Mantenedor/panelAdministrador'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/cambioClave'))

WS.sendRequest(findTestObject('Mantenedor/admin', [('status') : 'avalaible']))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/Usuarios'))

WebUI.click(findTestObject('Mantenedor/usuariosPanel'))

WS.sendRequest(findTestObject('Mantenedor/getUsersPanel'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/Usuarios'))

WebUI.click(findTestObject('Mantenedor/usuariosPanel'))

WS.sendRequest(findTestObject('Mantenedor/getUsersPanel'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/Usuarios'))

WebUI.click(findTestObject('Mantenedor/clusterUsers'))

WS.sendRequest(findTestObject('Mantenedor/getClusterUsers'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/changeLog'))

WS.sendRequest(findTestObject('Mantenedor/getChangeLog'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/menusFront'))

WS.sendRequest(findTestObject('Mantenedor/getMenusFront'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/settings'))

WS.sendRequest(findTestObject('Mantenedor/getSettings'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/grupos'))

WS.sendRequest(findTestObject('Mantenedor/getGrupos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/globalLogs'))

WS.sendRequest(findTestObject('Mantenedor/getGlobalLogs'))

WS.verifyResponseStatusCode(response,200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/clicsMenu'))

WS.sendRequest(findTestObject('Mantenedor/getClicsMenu'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/linksExternos'))

WS.sendRequest(findTestObject('Mantenedor/getLinksExternos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/menuSucursales'))

WebUI.click(findTestObject('Mantenedor/sucursales'))

WS.sendRequest(findTestObject('Mantenedor/getSucursales'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/menuSucursales'))

WebUI.click(findTestObject('Mantenedor/zonas'))

WS.sendRequest(findTestObject('Mantenedor/getZonas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/menuSucursales'))

WebUI.click(findTestObject('Mantenedor/subgerencias'))

WS.sendRequest(findTestObject('Mantenedor/getSubGerencias'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/menuSucursales'))

WebUI.click(findTestObject('Mantenedor/clusterSucursal'))

WS.sendRequest(findTestObject('Mantenedor/getClusterSucursal'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/menuSucursales'))

WebUI.click(findTestObject('Mantenedor/cadenas'))

WS.sendRequest(findTestObject('Mantenedor/getCadenas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/agrupaciones'))

WS.sendRequest(findTestObject('Mantenedor/getAgrupaciones'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/clientes'))

WS.sendRequest(findTestObject('Mantenedor/getClientes'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/segmentos'))

WS.sendRequest(findTestObject('Mantenedor/getSegmentos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/permisos'))

WS.sendRequest(findTestObject('Mantenedor/getPermisos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/gestionCache'))

WS.sendRequest(findTestObject('Mantenedor/getGestionCache'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/menuCargos'))

WebUI.click(findTestObject('Mantenedor/cargos'))

WS.sendRequest(findTestObject('Mantenedor/getCargos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.focus(findTestObject('Mantenedor/menuCargos'))

WebUI.click(findTestObject('Mantenedor/permisosMultiples'))

WS.sendRequest(findTestObject('Mantenedor/getPermisosPublicos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/modulos'))

WS.sendRequest(findTestObject('Mantenedor/getModulos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/dashboards'))

WS.sendRequest(findTestObject('Mantenedor/getDashboards'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/planogramas'))

WS.sendRequest(findTestObject('Mantenedor/getPlanogramas'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/codigosIOS'))

WS.sendRequest(findTestObject('Mantenedor/getCodigoIOS'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/actualizarVersion'))

WS.sendRequest(findTestObject('Mantenedor/getActualizarVersion'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/horarios'))

WS.sendRequest(findTestObject('Mantenedor/getHorarios'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/menuChat'))

WebUI.click(findTestObject('Mantenedor/chatParametros'))

WS.sendRequest(findTestObject('Mantenedor/getChat'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/productos'))

WS.sendRequest(findTestObject('Mantenedor/getProductos'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/generos'))

WS.sendRequest(findTestObject('Mantenedor/getGeneros'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/menuCondiciones'))

WebUI.click(findTestObject('Mantenedor/categorias'))

WS.sendRequest(findTestObject('Mantenedor/getCategorias'))

WS.verifyResponseStatusCode(response, 200)

WebUI.focus(findTestObject('Mantenedor/Mantenedores'))

WebUI.click(findTestObject('Mantenedor/legales'))

WS.sendRequest(findTestObject('Mantenedor/getLegales'))

WS.verifyResponseStatusCode(response, 200)

WebUI.closeBrowser();