package Effects

case object  TillDeath extends Duration{
  override def tick: Option[Duration] = Some(TillDeath)
}
