package mvc
import mvc.ViewModule.{View, Requirements}

trait ViewComponent:
  context: Requirements =>
  class ViewImpl extends View:
    // here come all your view methods implementation
    def show(i: Int): Unit = println(i)
    def update(): Unit = context.controller.notifyChange("changhed")