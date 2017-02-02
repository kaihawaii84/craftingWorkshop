import crafting.Stack
import org.scalatest.{Matchers, WordSpec}

class StackShould extends WordSpec with Matchers {

  "empty Stack " should {
      "throw Exception when popped" in {
          val stack = new Stack()
          a[Exception] shouldBe thrownBy(stack.pop())
      }

  }

  "a single element Stack " should {
    "pop its element" in {
      val stack = new Stack()
      val element = new Object
      stack.push(element)

      stack.pop() shouldBe element
    }

    "not pop its element twice" in {
      val stack = new Stack()
      val element = new Object
      stack.push(element)
      stack.pop()
      a[Exception] shouldBe thrownBy(stack.pop())
    }
  }

  "a multi element Stack " should {
    "pop its elements in reverse order they where pushed" in {
      val stack = new Stack()
      val element = new Object
      val element2 = new Object

      stack.push(element)
      stack.push(element2)

      stack.pop() shouldBe element2
      stack.pop() shouldBe element
    }
  }

}
