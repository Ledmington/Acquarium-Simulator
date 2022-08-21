package mvc
import mvc.ControllerModule.{Controller, Requirements}

trait ControllerComponent:
  context: Requirements =>
  class ControllerImpl extends Controller:
    // here come all your view methods implementation
    def notifyChange(s: String): Unit =
      context.view.show(context.model.m())
