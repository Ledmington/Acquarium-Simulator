import org.scalatest.funspec.AnyFunSpec

class TestFunnySpeck extends AnyFunSpec:
  describe("A Set ") {
    describe("when empty ") {
      it("should have size 0") {
        assert(Set.empty.size == 0)
      }

      it("should raise NoSuchElementException for head") {
        assertThrows[NoSuchElementException] {
          val x: Set[Int] = Set()
          x.empty.head
        }
      }
    }
  }
