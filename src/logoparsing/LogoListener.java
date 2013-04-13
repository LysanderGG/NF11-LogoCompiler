
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoListener extends ParseTreeListener {
	void enterSub(LogoParser.SubContext ctx);
	void exitSub(LogoParser.SubContext ctx);

	void enterArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx);
	void exitArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx);

	void enterDiv(LogoParser.DivContext ctx);
	void exitDiv(LogoParser.DivContext ctx);

	void enterTg(LogoParser.TgContext ctx);
	void exitTg(LogoParser.TgContext ctx);

	void enterSum(LogoParser.SumContext ctx);
	void exitSum(LogoParser.SumContext ctx);

	void enterTd(LogoParser.TdContext ctx);
	void exitTd(LogoParser.TdContext ctx);

	void enterMul(LogoParser.MulContext ctx);
	void exitMul(LogoParser.MulContext ctx);

	void enterRe(LogoParser.ReContext ctx);
	void exitRe(LogoParser.ReContext ctx);

	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	void enterAv(LogoParser.AvContext ctx);
	void exitAv(LogoParser.AvContext ctx);

	void enterProgramme(LogoParser.ProgrammeContext ctx);
	void exitProgramme(LogoParser.ProgrammeContext ctx);

	void enterVe(LogoParser.VeContext ctx);
	void exitVe(LogoParser.VeContext ctx);

	void enterFpos(LogoParser.FposContext ctx);
	void exitFpos(LogoParser.FposContext ctx);

	void enterLc(LogoParser.LcContext ctx);
	void exitLc(LogoParser.LcContext ctx);

	void enterRand(LogoParser.RandContext ctx);
	void exitRand(LogoParser.RandContext ctx);

	void enterParenthesis(LogoParser.ParenthesisContext ctx);
	void exitParenthesis(LogoParser.ParenthesisContext ctx);

	void enterBc(LogoParser.BcContext ctx);
	void exitBc(LogoParser.BcContext ctx);

	void enterFcc(LogoParser.FccContext ctx);
	void exitFcc(LogoParser.FccContext ctx);
}