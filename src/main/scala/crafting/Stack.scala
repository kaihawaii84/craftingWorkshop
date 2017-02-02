package crafting


class Stack() {

  var elements : Vector[Any] = Vector.empty

  def push(element: Any) = {
    this.elements = this.elements :+ element
  }

  def pop(): Any = {
    elements match {
      case e: Vector[Any] if e.isEmpty => throw new Exception
      case _ => {
        e
      }
    }
  }
}
