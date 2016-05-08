/*Hacked by DSL Forge*/
package org.eclipse.xtext.example.fowlerdsl.web.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import org.eclipse.xtext.example.fowlerdsl.services.StatemachineGrammarAccess;

public class StatemachineParser extends AbstractContentAssistParser {
	
	@Inject
	private StatemachineGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected org.eclipse.xtext.example.fowlerdsl.web.contentassist.antlr.internal.InternalStatemachineParser createParser() {
		org.eclipse.xtext.example.fowlerdsl.web.contentassist.antlr.internal.InternalStatemachineParser result = new org.eclipse.xtext.example.fowlerdsl.web.contentassist.antlr.internal.InternalStatemachineParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getStatemachineAccess().getGroup(), "rule__Statemachine__Group__0");
					put(grammarAccess.getStatemachineAccess().getGroup_1(), "rule__Statemachine__Group_1__0");
					put(grammarAccess.getStatemachineAccess().getGroup_2(), "rule__Statemachine__Group_2__0");
					put(grammarAccess.getStatemachineAccess().getGroup_3(), "rule__Statemachine__Group_3__0");
					put(grammarAccess.getEventAccess().getGroup(), "rule__Event__Group__0");
					put(grammarAccess.getCommandAccess().getGroup(), "rule__Command__Group__0");
					put(grammarAccess.getStateAccess().getGroup(), "rule__State__Group__0");
					put(grammarAccess.getStateAccess().getGroup_2(), "rule__State__Group_2__0");
					put(grammarAccess.getTransitionAccess().getGroup(), "rule__Transition__Group__0");
					put(grammarAccess.getStatemachineAccess().getEventsAssignment_1_1(), "rule__Statemachine__EventsAssignment_1_1");
					put(grammarAccess.getStatemachineAccess().getResetEventsAssignment_2_1(), "rule__Statemachine__ResetEventsAssignment_2_1");
					put(grammarAccess.getStatemachineAccess().getCommandsAssignment_3_1(), "rule__Statemachine__CommandsAssignment_3_1");
					put(grammarAccess.getStatemachineAccess().getStatesAssignment_4(), "rule__Statemachine__StatesAssignment_4");
					put(grammarAccess.getEventAccess().getNameAssignment_0(), "rule__Event__NameAssignment_0");
					put(grammarAccess.getEventAccess().getCodeAssignment_1(), "rule__Event__CodeAssignment_1");
					put(grammarAccess.getCommandAccess().getNameAssignment_0(), "rule__Command__NameAssignment_0");
					put(grammarAccess.getCommandAccess().getCodeAssignment_1(), "rule__Command__CodeAssignment_1");
					put(grammarAccess.getStateAccess().getNameAssignment_1(), "rule__State__NameAssignment_1");
					put(grammarAccess.getStateAccess().getActionsAssignment_2_2(), "rule__State__ActionsAssignment_2_2");
					put(grammarAccess.getStateAccess().getTransitionsAssignment_3(), "rule__State__TransitionsAssignment_3");
					put(grammarAccess.getTransitionAccess().getEventAssignment_0(), "rule__Transition__EventAssignment_0");
					put(grammarAccess.getTransitionAccess().getStateAssignment_2(), "rule__Transition__StateAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			org.eclipse.xtext.example.fowlerdsl.web.contentassist.antlr.internal.InternalStatemachineParser typedParser = (org.eclipse.xtext.example.fowlerdsl.web.contentassist.antlr.internal.InternalStatemachineParser) parser;
			typedParser.entryRuleStatemachine();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public StatemachineGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(StatemachineGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
