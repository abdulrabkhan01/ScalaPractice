package com.ark.scala.examples.functions

/**
 * <p> Scala example of using scala functions. </p>
 * @author Abdul
 */
object FunctionsExample {
  def main(args: Array[String]): Unit = {
    print("Min Value = " + min(1, 5))
  }

  /**
   * <p> Scala function to return min value. <p>
   * @param n1
   * @param n2
   * @return
   */
  def min(n1: Int, n2: Int): Int = {
    var min: Int = 0;
    if (n1 < n2) {
      min = n1
    } else {
      min = n2
    }
    return min
  }
}
