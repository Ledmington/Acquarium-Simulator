import org.scalatest.funspec.AnyFunSpec

import model.Fish

class TestFish extends AnyFunSpec:
  describe("A new Fish") {
    it("should have age 0") {
      val f: Fish = Fish()
      assert(f.age == 0)
    }

    it("should have max hunger") {
      val f: Fish = Fish()
      assert(f.hunger == Fish.MAX_HUNGER)
    }

    it("should not be dead") {
      val f: Fish = Fish()
      assert(!f.isDead)
    }
  }
