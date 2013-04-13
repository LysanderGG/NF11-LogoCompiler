
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class LogoBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements LogoVisitor<T> {
	@Override public T visitProgramme(LogoParser.ProgrammeContext ctx) { return visitChildren(ctx); }

	@Override public T visitFpos(LogoParser.FposContext ctx) { return visitChildren(ctx); }

	@Override public T visitVe(LogoParser.VeContext ctx) { return visitChildren(ctx); }

	@Override public T visitTg(LogoParser.TgContext ctx) { return visitChildren(ctx); }

	@Override public T visitLc(LogoParser.LcContext ctx) { return visitChildren(ctx); }

	@Override public T visitTd(LogoParser.TdContext ctx) { return visitChildren(ctx); }

	@Override public T visitRe(LogoParser.ReContext ctx) { return visitChildren(ctx); }

	@Override public T visitFcc(LogoParser.FccContext ctx) { return visitChildren(ctx); }

	@Override public T visitBc(LogoParser.BcContext ctx) { return visitChildren(ctx); }

	@Override public T visitAv(LogoParser.AvContext ctx) { return visitChildren(ctx); }

	@Override public T visitListe_instructions(LogoParser.Liste_instructionsContext ctx) { return visitChildren(ctx); }
}