package view

import scalafx.Includes.*
import scalafx.scene.control.Label
import scalafx.scene.text.Font

object Labels:
  val label: Label = new Label("Nothing happened yet"):
    layoutX = 20
    layoutY = 20
    font = new Font("Times New Roman", 12.0)
