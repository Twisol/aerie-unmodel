@MissionModel(model = Mission.class)
@WithMappers(BasicValueMappers.class)
@WithActivityType(Activity.class)
package firesat;

import firesat.activities.Activity;
import gov.nasa.jpl.aerie.contrib.serialization.rulesets.BasicValueMappers;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel.WithActivityType;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel.WithConfiguration;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel.WithMappers;
