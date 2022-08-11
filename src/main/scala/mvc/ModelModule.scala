package mvc

object ModelModule:
  trait Model:
    // here comes all your model methods
    def m(): Int

  trait Provider:
    val model: Model

  trait Component:
    class ModelImpl extends Model:
    // here come all your model methods implementation
      def m() = 1

  trait Interface extends Provider with Component