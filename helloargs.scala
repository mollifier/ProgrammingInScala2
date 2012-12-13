#!/bin/bash
exec scala "$0" "$@"
!#

args.foreach(println)
//args.foreach(arg => println(arg))
//args.foreach((arg: String) => println(arg))

/*
var i = 0
while (i < args.length) {
  println(args(i))
  i += 1
}
*/

//println("Hello, " + args(0) + "!");

