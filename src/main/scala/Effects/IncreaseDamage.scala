package Effects
import Entities.EntityStats

case class IncreaseDamage(value: Int) extends Effect{
  override def apply(stats: EntityStats): EntityStats = ???
}
