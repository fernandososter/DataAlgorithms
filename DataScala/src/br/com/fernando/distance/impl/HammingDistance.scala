package br.com.fernando.distance.impl

import br.com.fernando.distance.Distance

/**
 * @author fsoster
 * 
 * Hamming distance. 
 * a distancia entre duas strings (textos) é calculada pelos elementos 
 * diferentes nas mesmas posicoes.
 * 
 *  karolin" and "kathrin" is 3.
 *  karolin" and "kerstin" is 3.
 *  1011101 and 1001001 is 2.
 *  2173896 and 2233796 is 3.
 * 
 * 
 */
class HammingDistance extends Distance {
  
  def distance(x: Array[Double], y: Array[Double]):Double ={
    0
  }
  
  def distance(x: String, y: String):Double ={
    (x zip y) count (x => x._1 != x._2 )
  }
  
  def distance(lat1: Double, lon1: Double,lat2: Double, lon2: Double):Double={
    0
  }
  
}