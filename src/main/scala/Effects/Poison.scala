package Effects
import Entities.EntityStats

case class Poison(value: Int) extends Effect{
  override def apply(stats: EntityStats): EntityStats = ???
}
