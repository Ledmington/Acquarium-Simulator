package sim

import scalafx.scene.image.Image
import scalafx.scene.image.ImageView
import scalafx.scene.Group

object Immaggine:
  def get(): Group =
    //val stream: InputStream = new FileInputStream("..\\..\\..\\..\\res\\tuna.jpg")
    //val imageResource: URL = getClass.getResource("<my_resource_name>")
    //val path = getClass.getResource("/tuna.jpg").getPath
    //val file: File = new File(path)
    //val image: Image = new Image(file)
    //Creating the image view
    val imageView: ImageView = new ImageView(new Image(getClass.getResource("tuna.jpg").getPath))
    //Setting image to the image view
    //imageView.setImage(image)
    //Setting the image view parameters
    imageView.setX(10)
    imageView.setY(10)
    imageView.setFitWidth(575)
    imageView.setPreserveRatio(true)
    //Setting the Scene object
    new Group(imageView)
