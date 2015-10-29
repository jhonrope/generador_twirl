package org.generador.template.view

import scala.xml.{NodeBuffer, Elem}

object Main {

  def apply(title: String)(content: String ):  String = {
      s"""
        |<!DOCTYPE html>
        |<html>
        |<head>
        |    <title>$title</title>
        |</head>
        |<body>
        |<section class="content">$content</section>
        |</body>
        |</html>
      """.stripMargin
  }


  def applyElem(title: String)(content: NodeBuffer ): Elem = {
//    <!DOCTYPE html>
      <html>
        <head>
          <title>{title}</title>
        </head>
        <body>
          <section class="content">{content}</section>
        </body>
      </html>
  }
}
