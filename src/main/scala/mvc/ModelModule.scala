package mvc

object ModelModule:
  trait Model:
    // here comes all your model methods
    def m(): Int

  trait Provider:
    val model: Model

  import mvc.ModelComponent

  trait Interface extends Provider with ModelComponent
