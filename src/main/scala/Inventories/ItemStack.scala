package Inventories

import Items.Item

case class ItemStack(item: Item, darab: Int){
  def +(that: ItemStack) : (ItemStack, Option[ItemStack]) = ???

}

