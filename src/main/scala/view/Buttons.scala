package view

import scalafx.Includes._
import scalafx.scene.control.Button
import scalafx.event.ActionEvent
import scalafx.geometry._
import Labels.label

object Buttons:
  val button1 = new Button("Button 1"):
    layoutX = 20
    layoutY = 50
    onAction = (e: ActionEvent) => label.text = "B1 clicked"

  val button2 = new Button("Button 2"):
    layoutX = 20
    layoutY = 80
    onAction = (e: ActionEvent) => label.text = "B2 clicked"
