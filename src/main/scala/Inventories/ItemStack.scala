package Inventories

import Items.Item

/**
 * ItemStack csak úgy tudjuk létrehozni, ha a darabszám
 * nemnegatív, és legfeljebb annyi, mint az Itemnek a maxStackSizea
 * @param item tárolandó item
 * @param darab legfeljebb annyi lehet mint az Item maxStackSize értéke.
 */
case class ItemStack(var item: Item, var darab: Int){
  require(darab >= 0 && darab <= item.maxStackSize, "Hibás itemStack érték");
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
  def +(that: ItemStack) : (ItemStack, Option[ItemStack]) = {
    if (this.item != that.item) {
      (this, Some(that))
    } else {
      val sum = this.darab + that.darab
      if (sum <= this.item.maxStackSize) {
        (ItemStack(this.item, sum), None)
      } else {
        val amountToAdd = this.item.maxStackSize - this.darab
        (ItemStack(this.item, this.item.maxStackSize), Some(ItemStack(this.item, sum - amountToAdd)))
      }
    }
  }

  def isEmpty: Boolean = darab == 0

  def peek(amount: Int) : Option[ItemStack] = {
    if (isEmpty || amount <= 0) {
      None
    } else if (this.darab <= amount) {
      Some(copy())
    } else {
      Some(ItemStack(item, amount))
    }
  }

  def take(amount: Int) : Option[ItemStack] = {
    if( amount <= 0 || isEmpty){
      None
    } else if (this.darab <= amount) {
      val result = Some(copy())
      this.darab = 0
      this.item = null
      result
    } else {
      val result = Some(ItemStack(item, amount))
      this.darab -= amount
      result
    }
  }

}

