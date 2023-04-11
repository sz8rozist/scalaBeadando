import Items.{Armor, Consumable, Equipment, Item, Placable, Weapon}

/**
 * GameRules case class ami tartalmazza a világban lévő összes item típust.
 */
case class GameRules(){

  /**
   * Visszaadja az összes Item egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getItems(p: Item => Boolean): Vector[Item] = ???

  /**
   * Visszaadja az Placable Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getPlacables(p: Item => Boolean): Vector[Placable] = ???

  /**
   * Visszaadja az Weapons Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getWeapons(p: Item => Boolean): Vector[Weapon] = ???

  /**
   * Visszaadja az ArmorsItemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getArmors(p: Item => Boolean): Vector[Armor] = ???

  /**
   * Visszaadja az Equipments Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getEquipments(p: Item => Boolean): Vector[Equipment] = ???

  /**
   * Visszaadja az Consumables Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getConsumables(p: Item => Boolean): Vector[Consumable] = ???

}
