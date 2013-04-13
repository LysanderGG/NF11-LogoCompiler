
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoVisitor<T> extends ParseTreeVisitor<T> {
	T visitProgramme(LogoParser.ProgrammeContext ctx);

	T visitFpos(LogoParser.FposContext ctx);

	T visitVe(LogoParser.VeContext ctx);

	T visitTg(LogoParser.TgContext ctx);

	T visitLc(LogoParser.LcContext ctx);

	T visitTd(LogoParser.TdContext ctx);

	T visitRe(LogoParser.ReContext ctx);

	T visitFcc(LogoParser.FccContext ctx);

	T visitBc(LogoParser.BcContext ctx);

	T visitAv(LogoParser.AvContext ctx);

	T visitListe_instructions(LogoParser.Liste_instructionsContext ctx);
}