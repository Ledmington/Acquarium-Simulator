package model

import model.Fish.MAX_HUNGER

object Fish:
  val MAX_HUNGER: Int = 100

class Fish:
  val age: Int = 0
  val hunger: Int = MAX_HUNGER

  def isDead: Boolean = hunger == 0
