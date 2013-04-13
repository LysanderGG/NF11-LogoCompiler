
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	T visitSub(LogoParser.SubContext ctx);

	T visitArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx);

	T visitDiv(LogoParser.DivContext ctx);

	T visitTg(LogoParser.TgContext ctx);

	T visitSum(LogoParser.SumContext ctx);

	T visitTd(LogoParser.TdContext ctx);

	T visitMul(LogoParser.MulContext ctx);

	T visitRe(LogoParser.ReContext ctx);

	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	T visitAv(LogoParser.AvContext ctx);

	T visitProgramme(LogoParser.ProgrammeContext ctx);

	T visitVe(LogoParser.VeContext ctx);

	T visitFpos(LogoParser.FposContext ctx);

	T visitLc(LogoParser.LcContext ctx);

	T visitRand(LogoParser.RandContext ctx);

	T visitParenthesis(LogoParser.ParenthesisContext ctx);

	T visitBc(LogoParser.BcContext ctx);

	T visitFcc(LogoParser.FccContext ctx);
}