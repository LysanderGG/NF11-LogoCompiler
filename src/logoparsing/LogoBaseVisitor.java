
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LogoBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LogoVisitor<T> {
	@Override public T visitSub(LogoParser.SubContext ctx) { return visitChildren(ctx); }

	@Override public T visitTg(LogoParser.TgContext ctx) { return visitChildren(ctx); }

	@Override public T visitDiv(LogoParser.DivContext ctx) { return visitChildren(ctx); }

	@Override public T visitSum(LogoParser.SumContext ctx) { return visitChildren(ctx); }

	@Override public T visitTd(LogoParser.TdContext ctx) { return visitChildren(ctx); }

	@Override public T visitRe(LogoParser.ReContext ctx) { return visitChildren(ctx); }

	@Override public T visitSup(LogoParser.SupContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_instructions(LogoParser.Liste_instructionsContext ctx) { return visitChildren(ctx); }

	@Override public T visitVe(LogoParser.VeContext ctx) { return visitChildren(ctx); }

	@Override public T visitRand(LogoParser.RandContext ctx) { return visitChildren(ctx); }

	@Override public T visitBc(LogoParser.BcContext ctx) { return visitChildren(ctx); }

	@Override public T visitInfEq(LogoParser.InfEqContext ctx) { return visitChildren(ctx); }

	@Override public T visitArithmeticExpressionInt(LogoParser.ArithmeticExpressionIntContext ctx) { return visitChildren(ctx); }

	@Override public T visitOr(LogoParser.OrContext ctx) { return visitChildren(ctx); }

	@Override public T visitInf(LogoParser.InfContext ctx) { return visitChildren(ctx); }

	@Override public T visitMul(LogoParser.MulContext ctx) { return visitChildren(ctx); }

	@Override public T visitAv(LogoParser.AvContext ctx) { return visitChildren(ctx); }

	@Override public T visitAnd(LogoParser.AndContext ctx) { return visitChildren(ctx); }

	@Override public T visitProgramme(LogoParser.ProgrammeContext ctx) { return visitChildren(ctx); }

	@Override public T visitSupEq(LogoParser.SupEqContext ctx) { return visitChildren(ctx); }

	@Override public T visitFpos(LogoParser.FposContext ctx) { return visitChildren(ctx); }

	@Override public T visitLc(LogoParser.LcContext ctx) { return visitChildren(ctx); }

	@Override public T visitParenthesis(LogoParser.ParenthesisContext ctx) { return visitChildren(ctx); }

	@Override public T visitBool(LogoParser.BoolContext ctx) { return visitChildren(ctx); }

	@Override public T visitFcc(LogoParser.FccContext ctx) { return visitChildren(ctx); }

	@Override public T visitEq(LogoParser.EqContext ctx) { return visitChildren(ctx); }
}