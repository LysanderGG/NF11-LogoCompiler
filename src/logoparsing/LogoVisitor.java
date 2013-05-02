
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	T visitSub(LogoParser.SubContext ctx);

	T visitTg(LogoParser.TgContext ctx);

	T visitDiv(LogoParser.DivContext ctx);

	T visitSum(LogoParser.SumContext ctx);

	T visitTd(LogoParser.TdContext ctx);

	T visitRe(LogoParser.ReContext ctx);

	T visitSup(LogoParser.SupContext ctx);

	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);

	T visitVe(LogoParser.VeContext ctx);

	T visitRand(LogoParser.RandContext ctx);

	T visitBc(LogoParser.BcContext ctx);

	T visitInfEq(LogoParser.InfEqContext ctx);

	T visitArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx);

	T visitOr(LogoParser.OrContext ctx);

	T visitInf(LogoParser.InfContext ctx);

	T visitMul(LogoParser.MulContext ctx);

	T visitAv(LogoParser.AvContext ctx);

	T visitAnd(LogoParser.AndContext ctx);

	T visitProgramme(LogoParser.ProgrammeContext ctx);

	T visitSupEq(LogoParser.SupEqContext ctx);

	T visitFpos(LogoParser.FposContext ctx);

	T visitLc(LogoParser.LcContext ctx);

	T visitParenthesis(LogoParser.ParenthesisContext ctx);

	T visitBool(LogoParser.BoolContext ctx);

	T visitFcc(LogoParser.FccContext ctx);

	T visitEq(LogoParser.EqContext ctx);
}