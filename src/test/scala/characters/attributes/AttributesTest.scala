package characters.attributes

import org.scalatest.FunSuite

/**
  * Created by valentin on 19.11.16.
  */
class AttributesTest extends FunSuite {

  val fixture =
    new {
      val testBaseStats = new Attributes
    }

  test("All basic stats should be 1 after instantiation"){
    val f = fixture
    assert(f.testBaseStats.intelligence == 1)
    assert(f.testBaseStats.strength == 1)
    assert(f.testBaseStats.dexterity == 1)
    assert(f.testBaseStats.vitality == 1)
  }

  test("Adding vitality should correctly update the max health"){
    val f = fixture
    val before = f.testBaseStats.maxHealth
    f.testBaseStats.vitality = 3
    assert(f.testBaseStats.maxHealth == (before+ BaseStatsMulti.MAX_HEALTH *3).toInt)
  }

  test("Adding vitality should correctly update the max endurance"){
    val f = fixture
    val before = f.testBaseStats.maxEndurance
    f.testBaseStats.vitality = 3
    assert(f.testBaseStats.maxEndurance == (before+ BaseStatsMulti.MAX_ENDURANCE *3).toInt)
  }

  test("Adding intelligence should correctly update the max mana"){
    val f = fixture
    val before = f.testBaseStats.maxMana
    f.testBaseStats.intelligence = 3
    assert(f.testBaseStats.maxMana == (before+ BaseStatsMulti.MAX_MANA *3).toInt)
  }

}
