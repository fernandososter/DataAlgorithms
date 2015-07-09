package br.com.fernando.distance.impl


/**
 * @author fsoster
 * 
 * 
 * 
 */
class ChebyshevDistance {
  
  def distance(x: Array[Double],y: Array[Double]):Double ={
   (x zip y).foldLeft(0.0){ (prev,next) => Math.max(prev, Math.abs(next._1 - next._2)) }
  } 
   
  
}