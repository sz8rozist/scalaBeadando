package Items

import Effects.{Duration, Effect}

/**
 * Potion item
 * @param name item neve
 * @param effects (effekt, duration) tuple-ok vektora
 */
case class Potion(name: String, effects: Vector[(Effect, Duration)]) extends Consumable {

  /**
   * Stack méret
   */
  val maxStackSize: Int = 64

  /**
   * Item nevét visszaadó metódus
   *
   * @return item neve
   */
  override def nev: String = name
}
