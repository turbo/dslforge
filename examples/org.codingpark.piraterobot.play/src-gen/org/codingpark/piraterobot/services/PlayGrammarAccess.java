/*
 * generated by Xtext
 */
package org.codingpark.piraterobot.services;

import com.google.inject.Singleton;
import com.google.inject.Inject;

import java.util.List;

import org.eclipse.xtext.*;
import org.eclipse.xtext.service.GrammarProvider;
import org.eclipse.xtext.service.AbstractElementFinder.*;

import org.eclipse.xtext.common.services.TerminalsGrammarAccess;

@Singleton
public class PlayGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class PlayModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.codingpark.piraterobot.Play.PlayModel");
		private final Assignment cProceduresAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cProceduresProcedureParserRuleCall_0 = (RuleCall)cProceduresAssignment.eContents().get(0);
		
		//PlayModel:
		//	procedures+=Procedure;
		@Override public ParserRule getRule() { return rule; }

		//// For the moment only one. procedures+=Procedure*
		//procedures+=Procedure
		public Assignment getProceduresAssignment() { return cProceduresAssignment; }

		//Procedure
		public RuleCall getProceduresProcedureParserRuleCall_0() { return cProceduresProcedureParserRuleCall_0; }
	}

	public class ProcedureElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.codingpark.piraterobot.Play.Procedure");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cProcedureKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Keyword cRightParenthesisKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cActionsAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cActionsActionParserRuleCall_5_0 = (RuleCall)cActionsAssignment_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//Procedure:
		//	'procedure' name=ID '(' //parameters+=Parameter*   no parameters yet
		//	')' '{' actions+=Action* '}';
		@Override public ParserRule getRule() { return rule; }

		//'procedure' name=ID '(' //parameters+=Parameter*   no parameters yet
		//')' '{' actions+=Action* '}'
		public Group getGroup() { return cGroup; }

		//'procedure'
		public Keyword getProcedureKeyword_0() { return cProcedureKeyword_0; }

		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_2() { return cLeftParenthesisKeyword_2; }

		////parameters+=Parameter*   no parameters yet
		//')'
		public Keyword getRightParenthesisKeyword_3() { return cRightParenthesisKeyword_3; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_4() { return cLeftCurlyBracketKeyword_4; }

		//actions+=Action*
		public Assignment getActionsAssignment_5() { return cActionsAssignment_5; }

		//Action
		public RuleCall getActionsActionParserRuleCall_5_0() { return cActionsActionParserRuleCall_5_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_6() { return cRightCurlyBracketKeyword_6; }
	}

	public class ActionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.codingpark.piraterobot.Play.Action");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Assignment cIsUpAssignment_0_0 = (Assignment)cGroup_0.eContents().get(0);
		private final Keyword cIsUpUpKeyword_0_0_0 = (Keyword)cIsUpAssignment_0_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cParameterValueAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_0_2_0 = (RuleCall)cParameterValueAssignment_0_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_0_3 = (Keyword)cGroup_0.eContents().get(3);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Assignment cIsRightAssignment_1_0 = (Assignment)cGroup_1.eContents().get(0);
		private final Keyword cIsRightRightKeyword_1_0_0 = (Keyword)cIsRightAssignment_1_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cParameterValueAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_1_2_0 = (RuleCall)cParameterValueAssignment_1_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_3 = (Keyword)cGroup_1.eContents().get(3);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Assignment cIsDownAssignment_2_0 = (Assignment)cGroup_2.eContents().get(0);
		private final Keyword cIsDownDownKeyword_2_0_0 = (Keyword)cIsDownAssignment_2_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Assignment cParameterValueAssignment_2_2 = (Assignment)cGroup_2.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_2_2_0 = (RuleCall)cParameterValueAssignment_2_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_2_3 = (Keyword)cGroup_2.eContents().get(3);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Assignment cIsLeftAssignment_3_0 = (Assignment)cGroup_3.eContents().get(0);
		private final Keyword cIsLeftLeftKeyword_3_0_0 = (Keyword)cIsLeftAssignment_3_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_3_1 = (Keyword)cGroup_3.eContents().get(1);
		private final Assignment cParameterValueAssignment_3_2 = (Assignment)cGroup_3.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_3_2_0 = (RuleCall)cParameterValueAssignment_3_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_3_3 = (Keyword)cGroup_3.eContents().get(3);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Assignment cIsDigAssignment_4_0 = (Assignment)cGroup_4.eContents().get(0);
		private final Keyword cIsDigDigKeyword_4_0_0 = (Keyword)cIsDigAssignment_4_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_4_1 = (Keyword)cGroup_4.eContents().get(1);
		private final Assignment cParameterValueAssignment_4_2 = (Assignment)cGroup_4.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_4_2_0 = (RuleCall)cParameterValueAssignment_4_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_4_3 = (Keyword)cGroup_4.eContents().get(3);
		private final Group cGroup_5 = (Group)cAlternatives.eContents().get(5);
		private final Assignment cIsJumpAssignment_5_0 = (Assignment)cGroup_5.eContents().get(0);
		private final Keyword cIsJumpJumpKeyword_5_0_0 = (Keyword)cIsJumpAssignment_5_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_5_1 = (Keyword)cGroup_5.eContents().get(1);
		private final Assignment cParameterValueAssignment_5_2 = (Assignment)cGroup_5.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_5_2_0 = (RuleCall)cParameterValueAssignment_5_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_5_3 = (Keyword)cGroup_5.eContents().get(3);
		private final Group cGroup_6 = (Group)cAlternatives.eContents().get(6);
		private final Assignment cIsFightAssignment_6_0 = (Assignment)cGroup_6.eContents().get(0);
		private final Keyword cIsFightFightKeyword_6_0_0 = (Keyword)cIsFightAssignment_6_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_6_1 = (Keyword)cGroup_6.eContents().get(1);
		private final Assignment cParameterValueAssignment_6_2 = (Assignment)cGroup_6.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_6_2_0 = (RuleCall)cParameterValueAssignment_6_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_6_3 = (Keyword)cGroup_6.eContents().get(3);
		private final Group cGroup_7 = (Group)cAlternatives.eContents().get(7);
		private final Assignment cIsRepeatAssignment_7_0 = (Assignment)cGroup_7.eContents().get(0);
		private final Keyword cIsRepeatRepeatKeyword_7_0_0 = (Keyword)cIsRepeatAssignment_7_0.eContents().get(0);
		private final Keyword cLeftParenthesisKeyword_7_1 = (Keyword)cGroup_7.eContents().get(1);
		private final Assignment cParameterValueAssignment_7_2 = (Assignment)cGroup_7.eContents().get(2);
		private final RuleCall cParameterValueParameterValueParserRuleCall_7_2_0 = (RuleCall)cParameterValueAssignment_7_2.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_7_3 = (Keyword)cGroup_7.eContents().get(3);
		private final Keyword cLeftCurlyBracketKeyword_7_4 = (Keyword)cGroup_7.eContents().get(4);
		private final Assignment cActionsAssignment_7_5 = (Assignment)cGroup_7.eContents().get(5);
		private final RuleCall cActionsActionParserRuleCall_7_5_0 = (RuleCall)cActionsAssignment_7_5.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_7_6 = (Keyword)cGroup_7.eContents().get(6);
		
		//Action:
		//	isUp?='up' '(' parameterValue=ParameterValue? ')' | isRight?='right' '(' parameterValue=ParameterValue? ')' |
		//	isDown?='down' '(' parameterValue=ParameterValue? ')' | isLeft?='left' '(' parameterValue=ParameterValue? ')' |
		//	isDig?='dig' '(' parameterValue=ParameterValue? ')' | isJump?='jump' '(' parameterValue=ParameterValue? ')' |
		//	isFight?='fight' '(' parameterValue=ParameterValue? ')' | isRepeat?='repeat' '(' parameterValue=ParameterValue? ')'
		//	'{' actions+=Action* '}';
		@Override public ParserRule getRule() { return rule; }

		//// we put num also in dig and fight just to add validation messages
		//isUp?='up' '(' parameterValue=ParameterValue? ')' | isRight?='right' '(' parameterValue=ParameterValue? ')' |
		//isDown?='down' '(' parameterValue=ParameterValue? ')' | isLeft?='left' '(' parameterValue=ParameterValue? ')' |
		//isDig?='dig' '(' parameterValue=ParameterValue? ')' | isJump?='jump' '(' parameterValue=ParameterValue? ')' |
		//isFight?='fight' '(' parameterValue=ParameterValue? ')' | isRepeat?='repeat' '(' parameterValue=ParameterValue? ')'
		//'{' actions+=Action* '}'
		public Alternatives getAlternatives() { return cAlternatives; }

		//// we put num also in dig and fight just to add validation messages
		//isUp?='up' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_0() { return cGroup_0; }

		//isUp?='up'
		public Assignment getIsUpAssignment_0_0() { return cIsUpAssignment_0_0; }

		//'up'
		public Keyword getIsUpUpKeyword_0_0_0() { return cIsUpUpKeyword_0_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_0_1() { return cLeftParenthesisKeyword_0_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_0_2() { return cParameterValueAssignment_0_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_0_2_0() { return cParameterValueParameterValueParserRuleCall_0_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_0_3() { return cRightParenthesisKeyword_0_3; }

		//isRight?='right' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_1() { return cGroup_1; }

		//isRight?='right'
		public Assignment getIsRightAssignment_1_0() { return cIsRightAssignment_1_0; }

		//'right'
		public Keyword getIsRightRightKeyword_1_0_0() { return cIsRightRightKeyword_1_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_1_1() { return cLeftParenthesisKeyword_1_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_1_2() { return cParameterValueAssignment_1_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_1_2_0() { return cParameterValueParameterValueParserRuleCall_1_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_1_3() { return cRightParenthesisKeyword_1_3; }

		//isDown?='down' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_2() { return cGroup_2; }

		//isDown?='down'
		public Assignment getIsDownAssignment_2_0() { return cIsDownAssignment_2_0; }

		//'down'
		public Keyword getIsDownDownKeyword_2_0_0() { return cIsDownDownKeyword_2_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_2_1() { return cLeftParenthesisKeyword_2_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_2_2() { return cParameterValueAssignment_2_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_2_2_0() { return cParameterValueParameterValueParserRuleCall_2_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_2_3() { return cRightParenthesisKeyword_2_3; }

		//isLeft?='left' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_3() { return cGroup_3; }

		//isLeft?='left'
		public Assignment getIsLeftAssignment_3_0() { return cIsLeftAssignment_3_0; }

		//'left'
		public Keyword getIsLeftLeftKeyword_3_0_0() { return cIsLeftLeftKeyword_3_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_3_1() { return cLeftParenthesisKeyword_3_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_3_2() { return cParameterValueAssignment_3_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_3_2_0() { return cParameterValueParameterValueParserRuleCall_3_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_3_3() { return cRightParenthesisKeyword_3_3; }

		//isDig?='dig' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_4() { return cGroup_4; }

		//isDig?='dig'
		public Assignment getIsDigAssignment_4_0() { return cIsDigAssignment_4_0; }

		//'dig'
		public Keyword getIsDigDigKeyword_4_0_0() { return cIsDigDigKeyword_4_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_4_1() { return cLeftParenthesisKeyword_4_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_4_2() { return cParameterValueAssignment_4_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_4_2_0() { return cParameterValueParameterValueParserRuleCall_4_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_4_3() { return cRightParenthesisKeyword_4_3; }

		//isJump?='jump' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_5() { return cGroup_5; }

		//isJump?='jump'
		public Assignment getIsJumpAssignment_5_0() { return cIsJumpAssignment_5_0; }

		//'jump'
		public Keyword getIsJumpJumpKeyword_5_0_0() { return cIsJumpJumpKeyword_5_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_5_1() { return cLeftParenthesisKeyword_5_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_5_2() { return cParameterValueAssignment_5_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_5_2_0() { return cParameterValueParameterValueParserRuleCall_5_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_5_3() { return cRightParenthesisKeyword_5_3; }

		//isFight?='fight' '(' parameterValue=ParameterValue? ')'
		public Group getGroup_6() { return cGroup_6; }

		//isFight?='fight'
		public Assignment getIsFightAssignment_6_0() { return cIsFightAssignment_6_0; }

		//'fight'
		public Keyword getIsFightFightKeyword_6_0_0() { return cIsFightFightKeyword_6_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_6_1() { return cLeftParenthesisKeyword_6_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_6_2() { return cParameterValueAssignment_6_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_6_2_0() { return cParameterValueParameterValueParserRuleCall_6_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_6_3() { return cRightParenthesisKeyword_6_3; }

		//isRepeat?='repeat' '(' parameterValue=ParameterValue? ')' '{' actions+=Action* '}'
		public Group getGroup_7() { return cGroup_7; }

		//isRepeat?='repeat'
		public Assignment getIsRepeatAssignment_7_0() { return cIsRepeatAssignment_7_0; }

		//'repeat'
		public Keyword getIsRepeatRepeatKeyword_7_0_0() { return cIsRepeatRepeatKeyword_7_0_0; }

		//'('
		public Keyword getLeftParenthesisKeyword_7_1() { return cLeftParenthesisKeyword_7_1; }

		//parameterValue=ParameterValue?
		public Assignment getParameterValueAssignment_7_2() { return cParameterValueAssignment_7_2; }

		//ParameterValue
		public RuleCall getParameterValueParameterValueParserRuleCall_7_2_0() { return cParameterValueParameterValueParserRuleCall_7_2_0; }

		//')'
		public Keyword getRightParenthesisKeyword_7_3() { return cRightParenthesisKeyword_7_3; }

		//'{'
		public Keyword getLeftCurlyBracketKeyword_7_4() { return cLeftCurlyBracketKeyword_7_4; }

		//actions+=Action*
		public Assignment getActionsAssignment_7_5() { return cActionsAssignment_7_5; }

		//Action
		public RuleCall getActionsActionParserRuleCall_7_5_0() { return cActionsActionParserRuleCall_7_5_0; }

		//'}'
		public Keyword getRightCurlyBracketKeyword_7_6() { return cRightCurlyBracketKeyword_7_6; }
	}

	public class ParameterValueElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.codingpark.piraterobot.Play.ParameterValue");
		private final Assignment cNumAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cNumINTTerminalRuleCall_0 = (RuleCall)cNumAssignment.eContents().get(0);
		
		//ParameterValue:
		//	num=INT;
		@Override public ParserRule getRule() { return rule; }

		//// it will have expressions
		//num=INT
		public Assignment getNumAssignment() { return cNumAssignment; }

		//INT
		public RuleCall getNumINTTerminalRuleCall_0() { return cNumINTTerminalRuleCall_0; }
	}
	
	
	private final PlayModelElements pPlayModel;
	private final ProcedureElements pProcedure;
	private final ActionElements pAction;
	private final ParameterValueElements pParameterValue;
	
	private final Grammar grammar;

	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public PlayGrammarAccess(GrammarProvider grammarProvider,
		TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPlayModel = new PlayModelElements();
		this.pProcedure = new ProcedureElements();
		this.pAction = new ActionElements();
		this.pParameterValue = new ParameterValueElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.codingpark.piraterobot.Play".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	

	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PlayModel:
	//	procedures+=Procedure;
	public PlayModelElements getPlayModelAccess() {
		return pPlayModel;
	}
	
	public ParserRule getPlayModelRule() {
		return getPlayModelAccess().getRule();
	}

	//Procedure:
	//	'procedure' name=ID '(' //parameters+=Parameter*   no parameters yet
	//	')' '{' actions+=Action* '}';
	public ProcedureElements getProcedureAccess() {
		return pProcedure;
	}
	
	public ParserRule getProcedureRule() {
		return getProcedureAccess().getRule();
	}

	//Action:
	//	isUp?='up' '(' parameterValue=ParameterValue? ')' | isRight?='right' '(' parameterValue=ParameterValue? ')' |
	//	isDown?='down' '(' parameterValue=ParameterValue? ')' | isLeft?='left' '(' parameterValue=ParameterValue? ')' |
	//	isDig?='dig' '(' parameterValue=ParameterValue? ')' | isJump?='jump' '(' parameterValue=ParameterValue? ')' |
	//	isFight?='fight' '(' parameterValue=ParameterValue? ')' | isRepeat?='repeat' '(' parameterValue=ParameterValue? ')'
	//	'{' actions+=Action* '}';
	public ActionElements getActionAccess() {
		return pAction;
	}
	
	public ParserRule getActionRule() {
		return getActionAccess().getRule();
	}

	//ParameterValue:
	//	num=INT;
	public ParameterValueElements getParameterValueAccess() {
		return pParameterValue;
	}
	
	public ParserRule getParameterValueRule() {
		return getParameterValueAccess().getRule();
	}

	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	} 

	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	} 

	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	} 

	//terminal ML_COMMENT:
	//	'/ *'->'* /';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	} 

	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	} 

	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	} 

	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	} 
}
