package Effects

case object Permament extends Duration{
  override def tick: Option[Duration] = Some(Permament)
}
