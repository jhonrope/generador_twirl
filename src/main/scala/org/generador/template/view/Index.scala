package org.generador.template.view

import org.generador.Concepto

import scala.xml.Elem

/**
 * Created by Jhony on 28/10/2015.
 */
object Index {

  def apply(title: String)(listaConceptos: List[Concepto]): String = {

    Main(title) {
      s"""
         |<h1>Home page</h1>
         |
         |<!--Este comentario si se va a ver-->
         |
         |
         |
         |  ${<ul> {for (concepto <- listaConceptos) yield{
                <li>
                  <u>${concepto.concepto}</u>
                  <b>${concepto.descripcion}</b>
                  <i>${concepto.valor}</i>
                </li>
              }
              }
              </ul>
            }
          |
          |
      """.stripMargin
    }
  }

  def applyElem(title: String)(listaConceptos: List[Concepto]): Elem = {

    Main.applyElem(title){
      <h1>Home page</h1>
        <ul>
          {for(concepto <- listaConceptos) yield {
            <li>
              <u>{concepto.concepto}</u>
              <b>{concepto.descripcion}</b>
              <i>{concepto.valor}</i>
            </li>
            }
          }
        </ul>
    }
  }

}
