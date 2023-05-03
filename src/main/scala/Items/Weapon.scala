package Items

/**
 * Weapon egy speciális item
 * @param nev item neve
 * @param maxStackSize stack méret
 * @param damage sebzés
 */
case class Weapon(nev: String, damage: Int, maxStackSize: Int = 1) extends Item
