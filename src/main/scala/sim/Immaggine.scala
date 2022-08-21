package sim

import scalafx.scene.image.Image
import scalafx.scene.image.ImageView
import scalafx.scene.Group

object Immaggine:
  def get(): Group =
    //Creating the image view
    val imageView: ImageView = new ImageView(new Image("/tuna.jpg"))

    //Setting the image view parameters
    imageView.setX(10)
    imageView.setY(10)
    imageView.setFitWidth(300)
    imageView.setPreserveRatio(true)

    //Setting the Scene object
    new Group(imageView)
