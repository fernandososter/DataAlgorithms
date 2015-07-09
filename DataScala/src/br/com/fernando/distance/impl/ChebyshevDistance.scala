package br.com.fernando.distance.impl

import br.com.fernando.distance.Distance

/**
 * @author fsoster
 * 
 * 
 * 
 */
class ChebyshevDistance extends Distance{
  
  def distance(x: Array[Double],y: Array[Double]):Double ={
   (x zip y).foldLeft(0.0){ (prev,next) => Math.max(prev, Math.abs(next._1 - next._2)) }
  } 
   
   def distance(x: String, y: String):Double ={
    0
  }
   def distance(lat1: Double, lon1: Double,lat2: Double, lon2: Double):Double={
    0
  }
}