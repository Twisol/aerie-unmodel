@MissionModel(model = Mission.class)
@WithMappers(BasicValueMappers.class)
@WithActivityType(Activity.class)
package unmodel;

import unmodel.activities.Activity;
import gov.nasa.jpl.aerie.contrib.serialization.rulesets.BasicValueMappers;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel.WithActivityType;
import gov.nasa.jpl.aerie.merlin.framework.annotations.MissionModel.WithMappers;
