package mvc

object MVC extends ModelModule.Interface with ViewModule.Interface with ControllerModule.Interface:
  // Instantiation of components, dependencies are implicit
  override val model = new ModelImpl()
  override val view = new ViewImpl()
  override val controller = new ControllerImpl()

  /*@main*/
  def main(): Unit =
    view.show(1)
