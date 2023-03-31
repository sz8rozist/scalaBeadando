package Inventories

import Items.{Item, Placable}

case class Chest(capacityy: Int, id: String) extends Placable{
  def isEmpty() : Boolean = ???

  def capacity() : Int = ???

  def apply(i: Int) : Option[ItemStack] = ???

  def+(stack: ItemStack): (Chest, Option[ItemStack]) = ???

  def swap(index: Int, stack: ItemStack) : (Chest, Option[ItemStack]) = ???

  def contains(item: Item) : Boolean = ???

  def count(item: Item) : Int = ???

}
