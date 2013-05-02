
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoListener extends ParseTreeListener {
	void enterSub(LogoParser.SubContext ctx);
	void exitSub(LogoParser.SubContext ctx);

	void enterTg(LogoParser.TgContext ctx);
	void exitTg(LogoParser.TgContext ctx);

	void enterDiv(LogoParser.DivContext ctx);
	void exitDiv(LogoParser.DivContext ctx);

	void enterSum(LogoParser.SumContext ctx);
	void exitSum(LogoParser.SumContext ctx);

	void enterTd(LogoParser.TdContext ctx);
	void exitTd(LogoParser.TdContext ctx);

	void enterRe(LogoParser.ReContext ctx);
	void exitRe(LogoParser.ReContext ctx);

	void enterSup(LogoParser.SupContext ctx);
	void exitSup(LogoParser.SupContext ctx);

	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	void enterVe(LogoParser.VeContext ctx);
	void exitVe(LogoParser.VeContext ctx);

	void enterRand(LogoParser.RandContext ctx);
	void exitRand(LogoParser.RandContext ctx);

	void enterBc(LogoParser.BcContext ctx);
	void exitBc(LogoParser.BcContext ctx);

	void enterInfEq(LogoParser.InfEqContext ctx);
	void exitInfEq(LogoParser.InfEqContext ctx);

	void enterArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx);
	void exitArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx);

	void enterOr(LogoParser.OrContext ctx);
	void exitOr(LogoParser.OrContext ctx);

	void enterInf(LogoParser.InfContext ctx);
	void exitInf(LogoParser.InfContext ctx);

	void enterMul(LogoParser.MulContext ctx);
	void exitMul(LogoParser.MulContext ctx);

	void enterAv(LogoParser.AvContext ctx);
	void exitAv(LogoParser.AvContext ctx);

	void enterAnd(LogoParser.AndContext ctx);
	void exitAnd(LogoParser.AndContext ctx);

	void enterProgramme(LogoParser.ProgrammeContext ctx);
	void exitProgramme(LogoParser.ProgrammeContext ctx);

	void enterSupEq(LogoParser.SupEqContext ctx);
	void exitSupEq(LogoParser.SupEqContext ctx);

	void enterFpos(LogoParser.FposContext ctx);
	void exitFpos(LogoParser.FposContext ctx);

	void enterLc(LogoParser.LcContext ctx);
	void exitLc(LogoParser.LcContext ctx);

	void enterParenthesis(LogoParser.ParenthesisContext ctx);
	void exitParenthesis(LogoParser.ParenthesisContext ctx);

	void enterBool(LogoParser.BoolContext ctx);
	void exitBool(LogoParser.BoolContext ctx);

	void enterFcc(LogoParser.FccContext ctx);
	void exitFcc(LogoParser.FccContext ctx);

	void enterEq(LogoParser.EqContext ctx);
	void exitEq(LogoParser.EqContext ctx);
}