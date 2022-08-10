package view

import scalafx.Includes._
import scalafx.scene.control.TitledPane
import scalafx.beans.property.DoubleProperty
import scalafx.beans.value.ObservableValue
import scalafx.collections.ObservableBuffer
import scalafx.event.ActionEvent
import scalafx.scene.Scene
import scalafx.scene.control.cell.TextFieldListCell
import scalafx.scene.control.{Button, ListView, TitledPane}
import scalafx.scene.layout.BorderPane
import scalafx.geometry._
import scalafx.scene.layout.HBox

object MyPane:
  private val expandedHeight = new DoubleProperty()
  private val data: ObservableBuffer[String] =
    new ObservableBuffer[String]() ++= List("some", "content", "for", "testing")

  private val list: ListView[String] = new ListView[String](data):
    editable = true
    cellFactory = TextFieldListCell.forListView()
  /*height.onChange { (source: ObservableValue[Double, Number], oldValue: Number, newValue: Number) =>
      expandedHeight.value = titled.height.value
      if (newValue.doubleValue() == expandedHeight.value) {
        edit(1)
      }
    }*/

  val titled: TitledPane = new TitledPane:
    text = "titled"
    content = list
