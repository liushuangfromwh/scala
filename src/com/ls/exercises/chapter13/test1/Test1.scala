package com.ls.exercises.chapter13.test1

import scala.collection.SortedSet
import scala.collection.immutable.{HashMap, HashSet}

/**
  * 13.1 编写一个函数，给定字符串，产出一个包含所有字符的下标的映射。举例来说：indexes(“Mississippi”)应返回一个映射，
  * 让’M’对应集{0}，’i’对应集{1,4,7,10}，依此类推。使用字符到可变集的映射。另外，你如何保证集是经过排序的？
  *
  * @author liushuang 2018/3/21 
  */
object Test1 {
  def main(args: Array[String]): Unit = {

  }

  def aa(str:String): Unit = {
    val hashMap = new HashMap[Char,SortedSet[Int]]()
//    str.toCharArray foreach()
  }

}
