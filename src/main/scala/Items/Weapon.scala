package Items

/**
 * Weapon egy speciális item
 * @param nev item neve
 * @param maxStackSize stack méret
 * @param damage sebzés
 */
case class Weapon(nev: String, maxStackSize: Int = 1, damage: Int) extends Item
