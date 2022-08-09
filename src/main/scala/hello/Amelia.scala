package hello

val x: Seq[Int] = Seq(1, 2, 3)
val y: Seq[String] = Seq("a", "b", "c")

val pippo = for
  a <- x
  b <- y
yield (a, b)

@main def amelia(): Unit =
  println(pippo)
