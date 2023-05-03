package Entities

import Effects.{Effect, IncreaseDamage}

import scala.language.postfixOps


/**
 * Egy élő, mozgó entitás statjai
 * @param attack támadás
 * @param defense védelem
 * @param speed sebesség
 * @param maxHP maximális életerő
 * @param regeneration regenerálódás (HP per tick)
 */
case class EntityStats(attack: Int, defense: Int, speed: Double, maxHP: Int, regeneration: Double){

  /**
   * Visszaadja az effect alapján módosított statokat
   * @param effect ez az effect alapján módosítjuk az entity statjait
   * @return Az entitás statjai a módosítás után
   */
  def applyEffect(effect: Effect) : EntityStats = effect.apply(this)

  /**
   * Visszaadja a kapott effectek mindegyike alapján módosított statokat
   *
   * @param effect a kapott effectek ez lehet egy vagy több
   * @return Az entitás statjai a módosítás után
   */
  def applyEffect(effect: Effect*) : EntityStats = effect.foldLeft(this) { (stats, effect) =>
    effect.apply(stats)
  }
}
