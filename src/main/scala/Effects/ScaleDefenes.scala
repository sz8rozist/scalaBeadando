package Effects
import Entities.EntityStats

case class ScaleDefenes(percentage: Double) extends Effect{
  override def apply(stats: EntityStats): EntityStats = ???
}
