package galaxyraiders.core.game

import galaxyraiders.core.physics.Point2D
import galaxyraiders.core.physics.Vector2D

class Explosion(
  position: Point2D,
  durationInTicks: Int
) :
  SpaceObject("Explosion", '*', position, Vector2D(0.0, 0.0), 1.0, 0.0) {
  private var ticksUntilDeath: Int = durationInTicks

  fun decrementTicksUntilDeath() {
    ticksUntilDeath--
  }

  fun died(): Boolean {
    return ticksUntilDeath <= 0
  }
}
