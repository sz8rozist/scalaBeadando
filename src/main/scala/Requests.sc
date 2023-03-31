import Entities.Player
import Items.Placable

sealed trait Request

case object Tick extends Request

case class Join(player: Player) extends Request

case class LeavePlayer(id: String) extends Request

case class Die(id: String) extends Request

case class Mine(id: String, position: Position) extends Request

case class StoreItem(playerID: String, chestID: String) extends Request

case class LootItem(playerID: String, chestID: String, index: Int) extends Request

case class Consume(playerID: String) extends Request

case class MoveEntity(entityID: String, position: Position) extends Request

case class HitEntity(attackerID: String, defenderID: String) extends Request


case class WorldState(){
  //Kell egy Request szekvencia ebbe még.
  def hasRequests() : Boolean = ???

  def processNextRequest(request: Request) : WorldState = ???

  def processNextRequest() : WorldState = ???

  def players() : Vector[Player] = ???

  def apply(x: Int, y: Int) : Option[Placable] = ???

  def apply(position: Position) : Option[Placable] = ???

  def width() : Int = ???

  def handle(request: Request): WorldState = request match {
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
  }
}