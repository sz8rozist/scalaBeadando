package Effects

case class TicksLeft(ticks: Int) extends Duration{
  override def tick: Option[Duration] = {
    if(ticks == 1) None
    else Some(TicksLeft(ticks - 1))
  }
}
