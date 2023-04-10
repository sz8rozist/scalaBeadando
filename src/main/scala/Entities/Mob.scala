package Entities

import Effects.{Duration, Effect}

/**
 * Mob egy speciális entitás
 * @param nev Entitás neve
 * @param id Entitás azonosítója
 * @param hp Entitás életereje
 * @param pos Entitás pozíciója a térképen
 * @param baseStat Entitás alapstatjai
 * @param activeEffect Entitáson lévő aktív statok leképezése: Map(Kulcs-érték párok ahol a kulcs az effect és a hozzá tartozó duration az effect lejárati ideje)
 */
case class Mob(nev: String, id: String, hp: Int, pos: Position, baseStat: EntityStats, activeEffect: Map[Effect,Duration]) extends Entity{
  /**
   * Entitás alapstatjainak visszaadása
   */
  override def baseStats(): EntityStats = ???

  /**
   * Az entitás életerejének növelésére szolgála metódus
   * Ha a hp negatív ne történjen semmi és adjuk vissza az eredeti entitást.
   * @param hp ennyivel legyen több az életereje (legyen növelve), de legfeljebb a max HP-igy gyógyulhasson
   * @return A felhealelt entitás vagy az eredeti ha a hp negatív
   */
  override def heal(hp: Int): Entity = ???

  /**
   * Támadás metódus. A visszaadott entitásnak ennyivel (hp-val) csökkenjen az életereje.
   * @param hp ennyivel csökkenjen az életerő
   * @return ha pozitív marad az életereje az entitásnak akkor optinben adjuk vissza az entitást ha nullára vagy alá csökken akkor None
   */
  override def takeDamage(hp: Int): Option[Entity] = ???

  /**
   * Az entitás effect listájának bővítése. Ha az effect nincs még rajta akkor plusszba kerüljön hozzá. Ha rajta van akkor a meglévő és az új duration közül a nagyobb maradjon meg.
   * @param effect   effect amit hozzáaduk az entitáshoz
   * @param duration az effect időtartama
   * @return Entitás a frissített effect listával
   */
  override def addEffect(effect: Effect, duration: Duration): Entity = ???

  /**
   * Effect levétel az entitásról. Leveszi azt az effectet az entitásról amelyre igaz a paraméterbe kapott predikátum
   * @param p predikátum
   * @return Entitás a frissített effect listával
   */
  override def removeEffects(p: Effect => Boolean): Entity = ???

  /**
   * Entitás mozgatása egy másik pozícióra
   * @param position pozíció amelyre mozgatni kivánjuk az entitást
   * @return Entitás amely mozgatva lett az új pozícióra
   */
  override def moveTo(position: Position): Entity = ???

  /**
   * Adja vissza, hogy egy tickkel később mivé válik ez az entitás. Adott
   * esetben akár el is pusztulhat (pl. mérgezés/vérzés stb. effekt miatt negatív a regene-
   * rálódása, ami egy tick múlva leviszi 0-ra vagy az alá a HPját), ekkor az opcióban Nonet
   * adjunk vissza, egyébként a megváltoztatott entitást (opcióba csomagolva). (Note: egy
   * tick alatt a következők történnek egy entitással: i) a rajta lévő effektek durationje egy
   * tickkel csökken, ii) a hp-je az effektekkel megváltoztatott regenerálódásnak megfelelően
   * változik. Figyeljünk arra, hogy ha épp lejár egy effekt, ami a maxHP-t növelte eddig,
   * akkor a HP már a kövi tickben az új maxHP fölé nem mehet, és ezt a felső korlátot
   * alkalmazzuk.)
   */
  override def tick(): Option[Entity] = ???
}
