package unmodel;

import gov.nasa.jpl.aerie.contrib.models.Accumulator;
import gov.nasa.jpl.aerie.merlin.framework.Registrar;

public final class Mission {
  private final Accumulator work = new Accumulator();

  public Mission(final Registrar registrar) {
    registrar.real("/work", this.work);
    registrar.real("/load", this.work.rate);
  }

  public void addLoad(final double workFactor) {
    this.work.add(workFactor);
  }
}
