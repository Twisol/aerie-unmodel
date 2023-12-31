package unmodel.activities;

import unmodel.Mission;
import gov.nasa.jpl.aerie.merlin.framework.annotations.ActivityType;
import gov.nasa.jpl.aerie.merlin.framework.annotations.ActivityType.ControllableDuration;
import gov.nasa.jpl.aerie.merlin.framework.annotations.ActivityType.EffectModel;
import gov.nasa.jpl.aerie.merlin.protocol.types.Duration;

import java.util.Map;

import static gov.nasa.jpl.aerie.merlin.framework.ModelActions.delay;

@ActivityType("Span")
public record Activity(Duration duration, double workFactor, Map<String, String> properties) {
  @EffectModel
  @ControllableDuration(parameterName = "duration")
  public void run(Mission mission) {
    mission.addLoad(+this.workFactor);
    if (this.duration.isPositive()) delay(this.duration);
    mission.addLoad(-this.workFactor);
  }
}
