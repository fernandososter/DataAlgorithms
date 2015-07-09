package br.com.fernando.distance.impl

import br.com.fernando.distance.Distance

class ManhattanDistance extends Distance {
  
  def distance(x: Array[Double], y: Array[Double]):Double ={
    (x zip y).map{case (a,b) => Math.abs(a-b) }.sum
  }
  
  def distance(x: String, y: String):Double ={
    0
  }
  def distance(lat1: Double, lon1: Double,lat2: Double, lon2: Double):Double={
    0
  }
}