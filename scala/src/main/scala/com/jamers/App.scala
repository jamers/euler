package com.jamers

/**
 * @author ${user.name}
 */

// object = singleton. We have a class called App and an instance of App also called App
object App {
  
  def foo(x : Array[String]) = x.foldLeft("")((a,b) => a + b)

  // Unit - does not return anything (void)
  // no static declaration - static fields or methods do not exist. declared instead on singleton Objects
  def main(args : Array[String]): Unit = {
    println( "Hello World!" )
    println("concat arguments = " + foo(args))
  }

}
