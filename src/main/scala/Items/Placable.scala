package Items
/**
 * Placabel interface ami egy speciális item
 */
trait Placable extends Item {
  /**
   * Item nevét visszaadó metódus
   *
   * @return item neve
   */
  override def nev: String = ???

  /**
   * Item stack méretét visszaadó metódus
   *
   * @return item stack méret
   */
  override def maxStackSize: Int = ???
}
