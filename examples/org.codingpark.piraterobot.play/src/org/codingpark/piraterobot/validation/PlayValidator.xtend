/*
 * generated by Xtext
 */
package org.codingpark.piraterobot.validation

import org.codingpark.piraterobot.play.Action
import org.codingpark.piraterobot.play.PlayPackage
import org.eclipse.xtext.validation.Check
import org.codingpark.piraterobot.play.PlayModel
import org.codingpark.piraterobot.play.Procedure
import org.eclipse.emf.common.util.EList

/**
 * Custom validation rules. 
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PlayValidator extends AbstractPlayValidator {

	@Check
	def checkExistsPirateRobotProcedure(PlayModel play) {
		var found = false;
		var i = 0;
		while (!found && i < play.procedures.size) {
			var Procedure p = play.procedures.get(i);
			i++;
			if (p.name.equalsIgnoreCase("pirateRobot")) {
				found = true;
			}
		}
		if (!found) {
			error("A procedure called pirateRobot must exist", play, PlayPackage.eINSTANCE.playModel_Procedures);
		}
	}

	@Check
	def checkExistsDigAction(PlayModel playModel) {
		var found = false;
		var i = 0;
		while (!found && i < playModel.procedures.size) {
			var Procedure p = playModel.procedures.get(i);
			i++;
			found = containsDig(p.actions);
		}
		if (!found) {
			warning("You should include dig()", playModel, PlayPackage.eINSTANCE.playModel_Procedures);
		}
	}

	def Boolean containsDig(EList<Action> list) {
		var found = false;
		var j = 0;
		while (!found && j < list.size) {
			if (list.get(j).isDig) {
				found = true;
			} else if (list.get(j).isRepeat) {
				found = containsDig(list.get(j).actions);
			}
			j++;
		}
		return found;
	}

	@Check
	def checkActionNumberParameter(Action action) {
		if (action.parameterValue != null) {
			if (action.parameterValue.num == 0 && !action.isDig && !action.isFight) {
				error("Number should be greater than 0", action, PlayPackage.eINSTANCE.action_ParameterValue);
			}
			if (action.parameterValue.num > 20) {
				error("Number should be less than 20", action, PlayPackage.eINSTANCE.action_ParameterValue);
			}
		}
	}

	@Check
	def checkDigNumber(Action action) {
		if (action.isDig) {
			if (action.parameterValue != null) {
				error("dig() does not take a parameter, remove the number", action,
					PlayPackage.eINSTANCE.action_ParameterValue);
			}
		}
	}

	@Check
	def checkFightNumber(Action action) {
		if (action.isFight) {
			if (action.parameterValue != null) {
				error("fight() does not take a parameter, remove the number", action,
					PlayPackage.eINSTANCE.action_ParameterValue);
			}
		}
	}

//	@Check
//	def checkisDig(PlayModel model) {
//		val lastAction = model.actions.findLast[it instanceof Action]
//		if (!lastAction.isDig) {
//			error("You'd better dig() once you reached the objective", lastAction, PlayPackage.eINSTANCE.actions_Num)		
//		}	
//	}
}
