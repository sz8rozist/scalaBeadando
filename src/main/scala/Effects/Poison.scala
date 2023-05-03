package Effects
import Entities.EntityStats

/**
 * Egy speciális effect
 * @param value mennyivel növeli a damaget
 */
case class Poison(value: Int) extends Effect{
  /**
   * Effect trait apply metódusának felülírása
   */
  override def apply(stats: EntityStats): EntityStats =
    stats.copy(defense = stats.defense * value)
}
