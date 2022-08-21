import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.should.Matchers
import org.scalatest.matchers.must.Matchers as MustMatchers

class SetSuite extends AnyFunSuite with Matchers:
  test("An empty Set should have size 0") {
    Set.empty.size shouldBe 0
    Set.empty should have size 0
  }

class StringSuite extends AnyFunSuite with MustMatchers:
  test("Some check with regex") {
    "abbccxxx" must startWith regex ("a(b*)(c*)" withGroups ("bb", "cc"))
  }
