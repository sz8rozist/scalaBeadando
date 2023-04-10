package Effects

import Entities.EntityStats

/**
 * Egy direkt entitás statjaira hat.
 * Interface
 */
trait Effect {
  /**
   * Statokat átalakító metódus
   * @param stats átalakítandó statok
   * @return EntityStat
   */
  def apply(stats: EntityStats) : EntityStats
}
