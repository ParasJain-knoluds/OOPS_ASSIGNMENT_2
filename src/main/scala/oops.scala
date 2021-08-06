trait  Ordered{
  def check(p: Person)

}

class Person(val name: String, val age: Int) extends Ordered {
  def check(p: Person) {
    if(this.name.equals(p.name)){
      if (this.age equals(p.age)){
        println("true | Persons Names and Age both are same");
      }
      else{
        println("False | Persons Names is same but Age is not same");
      }
    }
    else{
      if (this.name.length equals(p.name.length)) {
        println("true | Persons Name length are same");
      }
      else
      {
        println("False | Persons Name length are not same");
      }

    }
  }
}

object Oops {

  def main(args: Array[String]) {

    var p1 = new Person("Paras", 22)
    var p2 = new Person("Paras", 22)
    p1.check(p2)




  }


}