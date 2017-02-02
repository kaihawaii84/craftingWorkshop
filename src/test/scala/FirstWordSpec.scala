import org.scalatest.{Matchers, WordSpec}

class FirstWordSpec extends WordSpec with Matchers {

  "FirstWordSpecTest" should {

    "2 is 1 plus 1" in {
      assert(2 == 1+1)

    }
  }
}