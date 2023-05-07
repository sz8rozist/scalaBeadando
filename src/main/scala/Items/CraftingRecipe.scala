package Items

import Inventories.ItemStack

case class CraftingRecipe(inputs: List[ItemStack], output: ItemStack){
  def canCraft(items: List[ItemStack]): Boolean = {
    if (items.length == inputs.length && inputs.zip(items).forall { case (recipeItem, item) => recipeItem == item }) {
      true
    } else {
      false
    }
  }
}
