package br.com.fernando.distance.impl

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
class HammingDistance {
  
  
  def distance(x: String, y: String):Double ={
    (x zip y) count (x => x._1 != x._2 )
  }
  
  
}