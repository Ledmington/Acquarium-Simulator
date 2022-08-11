package mvc

object ViewModule:
  trait View:
  // here come all your view methods
    def show(i: Int): Unit

  trait Provider:
    val view: View

  type Requirements = ControllerModule.Provider
  trait Component:
    context: Requirements =>
    class ViewImpl extends View:
      // here come all your view methods implementation
      def show(i: Int): Unit = println(i)
      def update(): Unit = context.controller.notifyChange("changhed")

  trait Interface extends Provider with Component:
    self: Requirements =>