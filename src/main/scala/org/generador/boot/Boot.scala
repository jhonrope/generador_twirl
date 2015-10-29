package org.generador.boot

import java.io.{File, PrintWriter}

import org.generador.Concepto
import org.generador.template.view.Index
import play.twirl.api.HtmlFormat
import template.view.html.index

import scala.xml.Elem


object Boot extends App {

  val directorio = new File("output")
  if (!directorio.exists()) directorio.mkdir()

  val htmlIndexTwirl: HtmlFormat.Appendable = index("Con Twirl")(List(Concepto("primer_nombre", "primer nombre ", "Prueba con Twirl")))

  val writer = new PrintWriter(new File("output/index.html"))
  writer.write(htmlIndexTwirl.toString())
  writer.close()


  val htmlIndexString: String = Index("Con String")(List(Concepto("primer_nombre", "primer nombre ", "Prueba con String")))

  val writerString = new PrintWriter(new File("output/indexString.html"))
  writerString.write(htmlIndexString)
  writerString.close()


  val htmlIndexElem: Elem = Index.applyElem("con Xml Elem")(List(Concepto("primer_nombre", "primer nombre ", "Prueba con XML")))

  val writerElem = new PrintWriter(new File("output/indexElem.html"))
  writerElem.write(htmlIndexElem.toString())
  writerElem.close()

}