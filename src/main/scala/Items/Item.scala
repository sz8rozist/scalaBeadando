package Items

/**
 * Item trait (interface)
 */
trait Item{
  /**
   * Item nevét visszaadó metódus
   * @return item neve
   */
  def nev : String

  /**
   * Item stack méretét visszaadó metódus
   * @return item stack méret
   */
  def maxStackSize : Int
}
