package Effects

import Entities.EntityStats

trait Effect {
  def apply(stats: EntityStats) : EntityStats
}
