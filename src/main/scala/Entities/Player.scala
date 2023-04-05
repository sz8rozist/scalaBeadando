package Entities

import Effects.{Duration, Effect}
import Inventories.Chest

case class Player(nev: String, id: String, hp: Int, pos: Position, baseStat: EntityStats, activeEffect: Map[Effect,Duration], capacity: Int, inventory: Chest, equipmentSlots: Int) extends Entity{
  override def baseStats(): EntityStats = ???

  override def heal(hp: Int): Entity = ???

  override def takeDamage(hp: Int): Option[Entity] = ???

  override def addEffect(effect: Effect, duration: Duration): Entity = ???

  override def removeEffects(p: Effect => Boolean): EntityStats = ???

  override def moveTo(position: Position): Entity = ???

  override def tick(): Option[Entity] = ???
}
