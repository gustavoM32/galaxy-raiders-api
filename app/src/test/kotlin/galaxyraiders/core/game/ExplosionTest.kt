package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

@DisplayName("Given an explosion")
class ExplosionTest {
  private val explosion = Explosion(
    position = Point2D(1.0, 1.0),
    durationInTicks = 2
  )

  @Test
  fun `it has a type Explosion `() {
    assertEquals("Explosion", explosion.type)
  }

  @Test
  fun `it has a symbol asterisk `() {
    assertEquals('*', explosion.symbol)
  }

  @Test
  fun `it shows the type Explosion when converted to String `() {
    assertTrue(explosion.toString().contains("Explosion"))
  }

  @Test
  fun `it does not die if ticksUntilDeath is positive`() {
    val explosion = Explosion(
      position = Point2D(1.0, 1.0),
      durationInTicks = 15
    )

    assertFalse(explosion.died())
  }

  @Test
  fun `it dies if ticksUntilDeath is zero`() {
    val explosion = Explosion(
      position = Point2D(1.0, 1.0),
      durationInTicks = 0
    )

    assertTrue(explosion.died())
  }

  @Test
  fun `it dies if ticksUntilDeath is negative`() {
    val explosion = Explosion(
      position = Point2D(1.0, 1.0),
      durationInTicks = -1
    )

    assertTrue(explosion.died())
  }
}
