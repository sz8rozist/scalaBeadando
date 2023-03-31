package Entities

import Inventories.Chest

case class Player(nev: String, id: String, hp: Int, pos: Position, baseStat: EntityStats, capacity: Int, inventory: Chest, equipmentSlots: Int) extends Entity{

}
