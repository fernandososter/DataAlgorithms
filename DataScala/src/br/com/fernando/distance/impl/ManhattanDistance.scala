package br.com.fernando.distance.impl

class ManhattanDistance  {
  
  def distance(x: Array[Double], y: Array[Double]):Double ={
    (x zip y).map{case (a,b) => Math.abs(a-b) }.sum
  }
  
}