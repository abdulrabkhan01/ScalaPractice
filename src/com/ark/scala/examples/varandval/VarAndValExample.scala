package com.ark.scala.examples.varandval

object VarAndValExample {


  def main(args: Array[String]): Unit = {
    var name: String = "ARK"
    println("Var is used to create mutable variable")
    name ="A"
    println(name)
    val myName: String = "ARK"
    println("Val is used to create immutable variable")
  }
}
