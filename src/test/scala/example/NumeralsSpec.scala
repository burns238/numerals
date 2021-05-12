package example

import org.scalatest._
import org.scalatest.wordspec.AnyWordSpec
import org.scalatest.matchers.should.Matchers

class NumeralsSpec extends AnyWordSpec with Matchers {

  "Numerals" should {

    "say hello" in {
      Numerals.sayHello("Mike") shouldEqual "Hello Mike"
    }
    
  }

}
