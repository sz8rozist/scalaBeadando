import Items.{Armor, Consumable, Equipment, Item, Placable, Weapon}

case class GameRules(){
  def getItems(p: Item => Boolean): Vector[Item] = ???

  def getPlacables(): Vector[Placable] = ???

  def getWeapons(): Vector[Weapon] = ???

  def getArmors(): Vector[Armor] = ???

  def getEquipments(): Vector[Equipment] = ???

  def getConsumable(): Vector[Consumable] = ???


}
