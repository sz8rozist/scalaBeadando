import Effects.{IncreaseDamage, Poison, ScaleDefenes}
import Items.{Armor, Consumable, Equipment, Item, Placable, Potion, Weapon}

/**
 * GameRules case class ami tartalmazza a világban lévő összes item típust.
 */
case class GameRules(){

  private val items: Vector[Item] = Vector(
    Armor(nev = "Armor",1,5),
    Potion(name = "Potion", Vector[(IncreaseDamage,2),(ScaleDefenes,10)]),
    Weapon(nev = "Weapon",20)
  )

  /**
   * Visszaadja az összes Item egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getItems(p: Item => Boolean): Vector[Item] = items.filter(p)

  /**
   * Visszaadja az Placable Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getPlacables(p: Item => Boolean): Vector[Placable] = items.collect{case placable: Placable => placable}

  /**
   * Visszaadja az Weapons Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getWeapons(p: Item => Boolean): Vector[Weapon] = items.collect {case weapon: Weapon => weapon}

  /**
   * Visszaadja az ArmorsItemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getArmors(p: Item => Boolean): Vector[Armor] = items.collect {case armor: Armor => armor}

  /**
   * Visszaadja az Equipments Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getEquipments(p: Item => Boolean): Vector[Equipment] = items.collect{case eq: Equipment => eq}

  /**
   * Visszaadja az Consumables Itemek egy vektorát amire igaz a predikátum
   * @param p predikátum
   */
  def getConsumables(p: Item => Boolean): Vector[Consumable] = items.collect{case c: Consumable => c}

}
