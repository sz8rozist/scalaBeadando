package Entities

case class EntityStats(attack: Int, defense: Int, speed: Double, maxHP: Int, regeneration: Double){
  def applyEffect(effect: Effect) : EntityStats = ???

  def applyEffect(effect: Effect*) : EntityStats = ???
}
