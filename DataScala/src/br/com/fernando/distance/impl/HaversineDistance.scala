package br.com.fernando.distance.impl
import math._

import br.com.fernando.distance.Distance

/**
 * * @author fsoster
 * 
 * O haversine distance é utilizado para medir distancia em uma esfera. 
 * Para medir do globo principalmente. 
 * 
 */
class HaversineDistance extends Distance{
   val R = 6372.8  //radius in km
 
   def distance(lat1: Double, lon1: Double,lat2: Double, lon2: Double):Double={
     val dLat=(lat2 - lat1).toRadians
      val dLon=(lon2 - lon1).toRadians
 
      val a = pow(sin(dLat/2),2) + pow(sin(dLon/2),2) * cos(lat1.toRadians) * cos(lat2.toRadians)
      val c = 2 * asin(sqrt(a))
      R * c
   }
   
   
  def distance(x: String, y: String):Double ={
    0
  }
   def distance(x: Array[Double], y: Array[Double]):Double ={
    0
  }
}