package br.com.fernando.distance.impl
import math._


/**
 * * @author fsoster
 * 
 * O haversine distance Ã© utilizado para medir distancia em uma esfera. 
 * Para medir do globo principalmente. 
 * 
 * Esse código leva em consideracao o circunferencia do globo quando calcula 
 * a distancia em um triangulo. 
 */
class HaversineDistance {
   val R = 6372.8  //radius in km
 
   def distance(lat1: Double, lon1: Double,lat2: Double, lon2: Double):Double={
     val dLat=(lat2 - lat1).toRadians
      val dLon=(lon2 - lon1).toRadians
 
      val a = pow(sin(dLat/2),2) + pow(sin(dLon/2),2) * cos(lat1.toRadians) * cos(lat2.toRadians)
      val c = 2 * asin(sqrt(a))
      R * c
   }
   
   
}