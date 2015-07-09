package br.com.fernando.distance.impl

import br.com.fernando.distance.Distance

class ManhattanDistance extends Distance {
  
  def distance(x: Array[Double], y: Array[Double]):Double ={
    (x zip y).map{case (a,b) => Math.abs(a-b) }.sum
  }
  
}