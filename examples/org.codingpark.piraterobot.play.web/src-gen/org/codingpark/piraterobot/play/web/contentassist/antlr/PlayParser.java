/*Generated by Xtext*/
package org.codingpark.piraterobot.play.web.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.codingpark.piraterobot.services.PlayGrammarAccess;

public class PlayParser extends AbstractContentAssistParser {
	
	@Inject
	private PlayGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.codingpark.piraterobot.play.web.contentassist.antlr.internal.InternalPlayParser createParser() {
		org.codingpark.piraterobot.play.web.contentassist.antlr.internal.InternalPlayParser result = new org.codingpark.piraterobot.play.web.contentassist.antlr.internal.InternalPlayParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getActionAccess().getAlternatives(), "rule__Action__Alternatives");
					put(grammarAccess.getProcedureAccess().getGroup(), "rule__Procedure__Group__0");
					put(grammarAccess.getActionAccess().getGroup_0(), "rule__Action__Group_0__0");
					put(grammarAccess.getActionAccess().getGroup_1(), "rule__Action__Group_1__0");
					put(grammarAccess.getActionAccess().getGroup_2(), "rule__Action__Group_2__0");
					put(grammarAccess.getActionAccess().getGroup_3(), "rule__Action__Group_3__0");
					put(grammarAccess.getActionAccess().getGroup_4(), "rule__Action__Group_4__0");
					put(grammarAccess.getActionAccess().getGroup_5(), "rule__Action__Group_5__0");
					put(grammarAccess.getActionAccess().getGroup_6(), "rule__Action__Group_6__0");
					put(grammarAccess.getActionAccess().getGroup_7(), "rule__Action__Group_7__0");
					put(grammarAccess.getPlayModelAccess().getProceduresAssignment(), "rule__PlayModel__ProceduresAssignment");
					put(grammarAccess.getProcedureAccess().getNameAssignment_1(), "rule__Procedure__NameAssignment_1");
					put(grammarAccess.getProcedureAccess().getActionsAssignment_5(), "rule__Procedure__ActionsAssignment_5");
					put(grammarAccess.getActionAccess().getIsUpAssignment_0_0(), "rule__Action__IsUpAssignment_0_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_0_2(), "rule__Action__ParameterValueAssignment_0_2");
					put(grammarAccess.getActionAccess().getIsRightAssignment_1_0(), "rule__Action__IsRightAssignment_1_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_1_2(), "rule__Action__ParameterValueAssignment_1_2");
					put(grammarAccess.getActionAccess().getIsDownAssignment_2_0(), "rule__Action__IsDownAssignment_2_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_2_2(), "rule__Action__ParameterValueAssignment_2_2");
					put(grammarAccess.getActionAccess().getIsLeftAssignment_3_0(), "rule__Action__IsLeftAssignment_3_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_3_2(), "rule__Action__ParameterValueAssignment_3_2");
					put(grammarAccess.getActionAccess().getIsDigAssignment_4_0(), "rule__Action__IsDigAssignment_4_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_4_2(), "rule__Action__ParameterValueAssignment_4_2");
					put(grammarAccess.getActionAccess().getIsJumpAssignment_5_0(), "rule__Action__IsJumpAssignment_5_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_5_2(), "rule__Action__ParameterValueAssignment_5_2");
					put(grammarAccess.getActionAccess().getIsFightAssignment_6_0(), "rule__Action__IsFightAssignment_6_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_6_2(), "rule__Action__ParameterValueAssignment_6_2");
					put(grammarAccess.getActionAccess().getIsRepeatAssignment_7_0(), "rule__Action__IsRepeatAssignment_7_0");
					put(grammarAccess.getActionAccess().getParameterValueAssignment_7_2(), "rule__Action__ParameterValueAssignment_7_2");
					put(grammarAccess.getActionAccess().getActionsAssignment_7_5(), "rule__Action__ActionsAssignment_7_5");
					put(grammarAccess.getParameterValueAccess().getNumAssignment(), "rule__ParameterValue__NumAssignment");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.codingpark.piraterobot.play.web.contentassist.antlr.internal.InternalPlayParser typedParser = (org.codingpark.piraterobot.play.web.contentassist.antlr.internal.InternalPlayParser) parser;
			typedParser.entryRulePlayModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public PlayGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(PlayGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
