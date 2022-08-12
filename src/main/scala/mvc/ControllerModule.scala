package mvc

object ControllerModule:
  trait Controller:
    // here come all your view methods
    def notifyChange(s: String): Unit

  trait Provider:
    val controller: Controller

  type Requirements = ViewModule.Provider with ModelModule.Provider

  import mvc.ControllerComponent

  trait Interface extends Provider with ControllerComponent:
    self: Requirements =>