package br.com.fernando.distance

trait Distance {
  def distance(x: Array[Double], y: Array[Double]):Double
  def distance(x: String, y: String):Double
  def distance(lat1: Double, lon1: Double,lat2: Double, lon2: Double):Double
  
}