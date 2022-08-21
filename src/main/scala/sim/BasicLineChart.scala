package sim

import java.io.File
import javax.imageio.ImageIO

import scalafx.application.JFXApp3
import scalafx.embed.swing.SwingFXUtils
import scalafx.scene.Scene
import scalafx.collections.ObservableBuffer
import scalafx.scene.chart.LineChart
import scalafx.scene.chart.NumberAxis
import scalafx.scene.chart.XYChart
import scalafx.scene.image.WritableImage

object BasicLineChart extends JFXApp3:
  override def start(): Unit =
    stage = new JFXApp3.PrimaryStage:
      title = "Line Chart Example"
      scene = new Scene:
        root =
          val xAxis = NumberAxis("Values for X-Axis", 0, 3, 1)
          val yAxis = NumberAxis("Values for Y-Axis", 0, 3, 1)

          // Helper function to convert a tuple to `XYChart.Data`
          val toChartData = (xy: (Double, Double)) => XYChart.Data[Number, Number](xy._1, xy._2)

          val series1 = new XYChart.Series[Number, Number] {
            name = "Series 1"
            data = Seq((0.0, 1.0), (1.2, 1.4), (2.2, 1.9), (2.7, 2.3), (2.9, 0.5)).map(toChartData)
          }

          val series2 = new XYChart.Series[Number, Number] {
            name = "Series 2"
            data = Seq((0.0, 1.6), (0.8, 0.4), (1.4, 2.9), (2.1, 1.3), (2.6, 0.9)).map(toChartData)
          }

          val lineChart = new LineChart[Number, Number](xAxis, yAxis, ObservableBuffer(series1, series2))
          lineChart.setAnimated(false)

          /*def savePng: Unit = {
                val img = lineChart.snapshot(null, new WritableImage(500, 250))
                val file = new File("/tmp/chart.png")
                ImageIO.write(SwingFXUtils.fromFXImage(img, null), "png", file)
              }*/

          lineChart
