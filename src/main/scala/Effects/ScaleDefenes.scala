package Effects
import Entities.EntityStats

/**
 * Egy speciális effect
 * @param percentage a konstans amivel a defenset szorozzuk fel
 */
case class ScaleDefenes(percentage: Double) extends Effect{
  /**
   * Effect trait apply metódusának felülírása
   */
  override def apply(stats: EntityStats): EntityStats = ???
}
