import Entities.{Mob, Player, Position}
import Items.Placable

/**
 * Request sealed trait tehát csak ebben a fájlban extendelhető, mint egy interface
 */
sealed trait Request

/**
 * Tick egy speciális request
 */
case object Tick extends Request
/**
 * Join egy speciális request
 * @param player - aki be akar lépni a játékba.
 */
case class Join(player: Player) extends Request
/**
 * LeavePlayer egy speciális request
 * @param id játékos id-ja aki ki akar lépni a játékból.
 */
case class LeavePlayer(id: String) extends Request
/**
 * Die egy speciális request
 * @param id a játékos id-ja akit meg ölünk.
 */
case class Die(id: String) extends Request
/**
 * Mine egy speciális request
 * @param id játékos idja
 * @param position a térképen lévő pozíció
 */
case class Mine(id: String, position: Position) extends Request
/**
 * StoreItem egy speciális request
 * @param playerID a játékos id-ja
 * @param chestID a chest id-ja
 */
case class StoreItem(playerID: String, chestID: String) extends Request
/**
 * LootItem egy speciális request
 * @param playerID a játékos id-ja
 * @param chestID chest id
 * @param index index
 */
case class LootItem(playerID: String, chestID: String, index: Int) extends Request
/**
 * Consume egy speciális request
 * @param playerID játékos id
 */
case class Consume(playerID: String) extends Request
/**
 * MoveEntity egy speciális request
 * @param entityID entity id-ja
 * @param position pozíció ahova mozgatni fogjuk az entityt
 */
case class MoveEntity(entityID: String, position: Position) extends Request
/**
 * HitEntity egy speciális request
 * @param attackerID attacker id
 * @param defenderID defender id
 */
case class HitEntity(attackerID: String, defenderID: String) extends Request


/**
 * A WordState objektum fogja tárolni a világot.
 *
 * @param request a világban jelenlévő requestek
 * @param player  a világban jelenlévő játékosok
 * @param mob a világban jelenlévő mobok.
 */
case class WorldState(request: Vector[Request], player : Vector[Player], mob: Vector[Mob]){
  /**
   * Visszaadja hogy van e még feldolgozatlan request
   *
   * @return igaz ha van hamis ha nincs
   */
  def hasRequests() : Boolean = ???

  /**
   * A soronkövetkező requestet dolgozza fel.
   *
   * @return Ha nincs több feldolgozatlan request, vagy nincs benn player a játékba, akkor return az eredeti worldstate, különben a soron következő requestet vegyük ki a vectorból és aktualizáljuk vele a statet.
   */
  def processNextRequest() : WorldState = ???

  /**
   * Az összes requestet dolgozza fel.
   *
   * @return Ha elfogytak a requestek adja vissza a statet.
   */
  def processAllRequest() : WorldState = ???

  /**
   * A világban aktuálisan belépett játékosok
   *
   * @return a világban aktuálisan belépett játékosok
   */
  def players() : Vector[Player] = ???

  /**
   * Visszaadja a térkép adott koordinátáján lévő blokkot egy Optione[Placable] - ben
   * @param x A térkép x koordinátája
   * @param y A térkép y koordinátája
   * @return ha nincs ezen a pozíción blokk akkor None egyébként az ott lévő Placebel egy Someban
   */
  def apply(x: Int, y: Int) : Option[Placable] = ???

  /**
   * Visszaadja az adott pozíción lévő blokkot egy Optione[Placable] - ben
   *
   * @param position térkép pozíció
   * @return ha nincs ezen a pozíción blokk akkor NONE egyébként az ott lévő Placebel egy Someban
   */
  def apply(position: Position) : Option[Placable] = ???

  def width() : Int = ???

  def height() : Int = ???

  /* def handle(request: Request): WorldState = request match {
    case Tick => ???
    case Join(player) => ???
    case LeavePlayer(player) => ???
    case Die(id) => ???
    case Mine(id,position) => ???
    case StoreItem(playerID, chestID) => ???
    case LootItem(playerID, chestID, index) => ???
    case Consume(playerID) => ???
    case MoveEntity(entityID, position) => ???
    case HitEntity(attackerID, defenderID) => ???
  }*/
}
