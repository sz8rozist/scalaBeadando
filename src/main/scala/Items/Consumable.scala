package Items

/**
 * Consumable egy speciális item
 * @param nev item neve
 * @param maxStackSize stack méret
 */
case class Consumable(nev: String, maxStackSize: Int) extends Item
