package view

import scalafx.Includes._
import scalafx.scene.control.Button
import scalafx.event.ActionEvent
import scalafx.geometry._
import Labels.label

object ControlButtons:
  val herbivoresFood = new Button("Herbivores food"):
    //layoutX = 20
    //layoutY = 50
    onAction = (e: ActionEvent) => label.text = "Herbivores food"

  val carnivoresFood = new Button("Carnivores food"):
    //layoutX = 20
    //layoutY = 50
    onAction = (e: ActionEvent) => label.text = "Carnivores food"
