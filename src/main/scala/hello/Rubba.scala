package hello

final case class Point(x: Int, y: Int)

trait Rectangular:
  def topLeft: Point
  def bottomRight: Point

  def left: Int = topLeft.x
  def right: Int = bottomRight.x
  def top: Int = topLeft.y
  def bottom: Int = bottomRight.y

final case class Rectangle(
    override val topLeft: Point,
    override val bottomRight: Point
) extends Rectangular

@main def Rubba(): Unit =
  val r = Rectangle(Point(0, 0), Point(10, 20))
  println(s"${r.left},${r.right}")
  println(s"${r.top},${r.bottom}")
