package Inventories

import Items.Item

/**
 * ItemStack csak úgy tudjuk létrehozni, ha a darabszám
 * nemnegatív, és legfeljebb annyi, mint az Itemnek a maxStackSizea
 * @param item tárolandó item
 * @param darab legfeljebb annyi lehet mint az Item maxStackSize értéke.
 */
case class ItemStack(item: Item, darab: Int){
  /**
   * Megpróbálja egy stackbe rakni a két itemstacket
   *
   * @param that itemstack amit egyesíteni akarunk a jelenlegivel.
   * @return Ha a két stack itemjei különböznek, akkor adjuk vissza az első koordinátán
   * a bal, a másodikon a jobb oldali eredeti stacket (persze optionben); ha egyformák, és az
   * összes mennyiségük elfér egyben, akkor a visszaadott tuple első koordinátájába kerüljön
   * az egyberakott stack, a másodikba pedig kerüljön None, ha nem fér el, akkor a bal oldaliba
   * rakjunk amennyit lehet, a jobb oldaliba pedig a maradékot
   */
  def +(that: ItemStack) : (ItemStack, Option[ItemStack]) = ???

}

