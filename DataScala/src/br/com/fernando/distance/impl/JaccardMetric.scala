package br.com.fernando.distance.impl

import scala.math

/**
 * O jaccard metric � o resultado da divisao do A intersessao com B divido pela 
 * A uniao com B. 
 * 
 * Ou seja, o que � igual dividido pelo todo. 
 * 
 * Ja a distancia � dado por 1 - metric.
 * 
 * 
 */
class JaccardMetric {

  
  def metric(vetA: Array[Double], vetB: Array[Double]):Double ={
    
   ( ( vetA intersect vetB) length) / ( (vetA union vetB) length)
   }
   
  def distance (vetA: Array[Double], vetB: Array[Double]):Double ={
    1 - metric(vetA,vetB)
   
  }
  
}