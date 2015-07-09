package br.com.fernando.distance.impl

class EuclideanDistance{

  def distance(x: Array[Double],y: Array[Double]):Double ={
   Math.sqrt( (x zip y).map{ case (a,b) => Math.pow(a-b,2) }.sum)
  } 
  
}