package mvc

object ControllerModule:
  trait Controller:
  // here come all your view methods
    def notifyChange(s: String ): Unit

  trait Provider:
    val controller: Controller

  type Requirements = ViewModule.Provider with ModelModule.Provider
  trait Component:
    context: Requirements =>
    class ControllerImpl extends Controller:
      // here come all your view methods implementation
      def notifyChange(s: String): Unit =
        context.view.show(context.model.m())

  trait Interface extends Provider with Component:
    self : Requirements =>