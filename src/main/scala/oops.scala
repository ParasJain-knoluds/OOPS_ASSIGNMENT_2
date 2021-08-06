trait  Ordered{
  def check(p: Person)
}

class Person(val name: String, val age: Int) extends Ordered {
  def check(p: Person) {

    if(this.name.equals(p.name)){
      if(this.age.equals(p.age))
        println("Persons Names and Age of both are same")
      else
        println("Persons Names are same but Age is not same")
    }
    else
      println("Persons Names is not same")
  }
}

object Oops {

  def main(args: Array[String]) {

    var p1 = new Person("Paras", 22)
    var p2 = new Person("Paras", 23)
    //  println(p1.name)
    p1.check(p2)




  }


}