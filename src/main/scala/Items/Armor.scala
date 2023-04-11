package Items


/**
 * Armor egy speciális item
 * @param nev item neve
 * @param maxStackSize stack méret
 * @param defense védekezés
 */
case class Armor(nev: String, maxStackSize: Int = 1, defense: Int) extends Item
