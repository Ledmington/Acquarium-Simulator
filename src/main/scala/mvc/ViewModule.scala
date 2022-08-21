package mvc

object ViewModule:
  trait View:
    // here come all your view methods
    def show(i: Int): Unit

  trait Provider:
    val view: View

  type Requirements = ControllerModule.Provider

  import mvc.ViewComponent

  trait Interface extends Provider with ViewComponent:
    self: Requirements =>
