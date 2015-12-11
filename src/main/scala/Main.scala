import java.io.File

import org.openqa.selenium.firefox.{FirefoxProfile, FirefoxDriver}
import org.openqa.selenium.remote.FileDetector

import scala.concurrent.Await

/**
  * Created by pnakibar on 10/12/15.
  */
object Main extends App{
  val usuario = ""
  val senha = ""
  val diaInicio = "01/12/2015"
  val diaFim = "06/12/2015"

  val profile = new FirefoxProfile
  profile.setPreference("browser.helperapps.neverAsk.saveToDisk" , "application/octet-stream;application/xls")
  profile.setPreference("browser.helperApps.alwaysAsk.force", false)
  profile.setPreference("browser.download.manager.showWhenStarting",false)
  profile.setPreference("browser.download.folderList", 2)
  profile.setPreference("browser.download.dir","~/")

  val driver = new FirefoxDriver(profile)



  driver get "http://www.wtscorporate.com.br/wtscorporate/login/"

  driver findElementById "Login1_txtLogin" sendKeys usuario
  driver findElementById "Login1_txtSenha"  sendKeys senha
  driver findElementById "Login1_btnLogar"  click


  driver get "http://www.wtscorporate.com.br/wtscorporate/versao2/Corporate/frmConstrutorRelatUI.aspx?novoRelatorio=1"

  driver findElementById "ctl00_ContentPlaceHolder1_txtInicio" sendKeys diaInicio
  driver findElementById "ctl00_ContentPlaceHolder1_txtFim" sendKeys diaFim
  driver findElementById "ctl00_ContentPlaceHolder1_btnTodas" click

  driver findElementById "ctl00_ContentPlaceHolder1_btnGerar" click

  println("opa!")
  Thread.sleep(1000000)
  driver quit
}
