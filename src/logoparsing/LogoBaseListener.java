
  package logoparsing;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class LogoBaseListener implements LogoListener {
	@Override public void enterSub(LogoParser.SubContext ctx) { }
	@Override public void exitSub(LogoParser.SubContext ctx) { }

	@Override public void enterElseBlock(LogoParser.ElseBlockContext ctx) { }
	@Override public void exitElseBlock(LogoParser.ElseBlockContext ctx) { }

	@Override public void enterTg(LogoParser.TgContext ctx) { }
	@Override public void exitTg(LogoParser.TgContext ctx) { }

	@Override public void enterDiv(LogoParser.DivContext ctx) { }
	@Override public void exitDiv(LogoParser.DivContext ctx) { }

	@Override public void enterBlock(LogoParser.BlockContext ctx) { }
	@Override public void exitBlock(LogoParser.BlockContext ctx) { }

	@Override public void enterSum(LogoParser.SumContext ctx) { }
	@Override public void exitSum(LogoParser.SumContext ctx) { }

	@Override public void enterTd(LogoParser.TdContext ctx) { }
	@Override public void exitTd(LogoParser.TdContext ctx) { }

	@Override public void enterRe(LogoParser.ReContext ctx) { }
	@Override public void exitRe(LogoParser.ReContext ctx) { }

	@Override public void enterSup(LogoParser.SupContext ctx) { }
	@Override public void exitSup(LogoParser.SupContext ctx) { }

	@Override public void enterListe_instructions(LogoParser.Liste_instructionsContext ctx) { }
	@Override public void exitListe_instructions(LogoParser.Liste_instructionsContext ctx) { }

	@Override public void enterVe(LogoParser.VeContext ctx) { }
	@Override public void exitVe(LogoParser.VeContext ctx) { }

	@Override public void enterRand(LogoParser.RandContext ctx) { }
	@Override public void exitRand(LogoParser.RandContext ctx) { }

	@Override public void enterBc(LogoParser.BcContext ctx) { }
	@Override public void exitBc(LogoParser.BcContext ctx) { }

	@Override public void enterInfEq(LogoParser.InfEqContext ctx) { }
	@Override public void exitInfEq(LogoParser.InfEqContext ctx) { }

	@Override public void enterArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx) { }
	@Override public void exitArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx) { }

	@Override public void enterOr(LogoParser.OrContext ctx) { }
	@Override public void exitOr(LogoParser.OrContext ctx) { }

	@Override public void enterIfExpression(LogoParser.IfExpressionContext ctx) { }
	@Override public void exitIfExpression(LogoParser.IfExpressionContext ctx) { }

	@Override public void enterInf(LogoParser.InfContext ctx) { }
	@Override public void exitInf(LogoParser.InfContext ctx) { }

	@Override public void enterMul(LogoParser.MulContext ctx) { }
	@Override public void exitMul(LogoParser.MulContext ctx) { }

	@Override public void enterAv(LogoParser.AvContext ctx) { }
	@Override public void exitAv(LogoParser.AvContext ctx) { }

	@Override public void enterAnd(LogoParser.AndContext ctx) { }
	@Override public void exitAnd(LogoParser.AndContext ctx) { }

	@Override public void enterProgramme(LogoParser.ProgrammeContext ctx) { }
	@Override public void exitProgramme(LogoParser.ProgrammeContext ctx) { }

	@Override public void enterSupEq(LogoParser.SupEqContext ctx) { }
	@Override public void exitSupEq(LogoParser.SupEqContext ctx) { }

	@Override public void enterFpos(LogoParser.FposContext ctx) { }
	@Override public void exitFpos(LogoParser.FposContext ctx) { }

	@Override public void enterLc(LogoParser.LcContext ctx) { }
	@Override public void exitLc(LogoParser.LcContext ctx) { }

	@Override public void enterBool(LogoParser.BoolContext ctx) { }
	@Override public void exitBool(LogoParser.BoolContext ctx) { }

	@Override public void enterParenthesis(LogoParser.ParenthesisContext ctx) { }
	@Override public void exitParenthesis(LogoParser.ParenthesisContext ctx) { }

	@Override public void enterFcc(LogoParser.FccContext ctx) { }
	@Override public void exitFcc(LogoParser.FccContext ctx) { }

	@Override public void enterEq(LogoParser.EqContext ctx) { }
	@Override public void exitEq(LogoParser.EqContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}