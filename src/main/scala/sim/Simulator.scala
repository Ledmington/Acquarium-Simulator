package sim

import scalafx.application.JFXApp3
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.layout.HBox
import scalafx.scene.text.Text
import scalafx.scene.effect.DropShadow
import scalafx.Includes._
import scalafx.application.JFXApp
import scalafx.scene.layout._
import scalafx.geometry._
import scalafx.scene._
import scalafx.scene.control._
import scalafx.scene.paint.Color._
import scalafx.scene.paint._

/** Main class of the application */
object Simulator extends JFXApp3:

  /** This method starts the application
    *
    * @author
    *   Filippo Barbari
    *
    * @return
    *   nothing
    */
  override def start(): Unit =
    stage = new JFXApp3.PrimaryStage:

      title = "Aquarium simulation"
      //scene può essere anche una variabile
      scene = new Scene:
        // fill goes here
        root = new BorderPane:
          background = new Background(Array(new BackgroundFill(Color.rgb(38, 38, 38), null, null)))
          padding = Insets(10)
          left = new BorderPane:
            left = Buttons.button2
            //fill = Color.Black //non funziona!!
            //fill = Color.rgb(38, 38, 38)
            //fill = new BackgroundFill(Color.rgb(38, 38, 38), null, null)
            center = new HBox:
              padding = Insets(50, 80, 50, 80)
              children = Seq(
                new Text:
                  text = "Aquarium"
                  style = "-fx-font: normal bold 50pt sans-serif"
                  fill = new LinearGradient(endX = 0, stops = Stops(Red, DarkRed))
                ,
                new Text:
                  text = "Simulation"
                  style = "-fx-font: italic bold 50pt sans-serif"
                  fill = new LinearGradient(
                    endX = 0,
                    stops = Stops(DarkGray, White)
                  )
                  effect = new DropShadow:
                    color = DarkGray
                    radius = 15
                    spread = 0.25
              )

            right = new BorderPane:
              center = Immaggine.get()
              left = ControlButtons.carnivoresFood
              right = ControlButtons.herbivoresFood

    //fill = Color.rgb(38, 38, 38)

    stage.setFullScreen(false)
