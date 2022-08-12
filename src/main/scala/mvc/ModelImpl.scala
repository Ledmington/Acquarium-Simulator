package mvc
import mvc.ModelModule.Model

trait ModelComponent:
  class ModelImpl extends Model:
    // here come all your model methods implementation
    def m() = 1
