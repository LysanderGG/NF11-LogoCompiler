
  package logoparsing;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface LogoListener extends ParseTreeListener {
	void enterProgramme(LogoParser.ProgrammeContext ctx);
	void exitProgramme(LogoParser.ProgrammeContext ctx);

	void enterFpos(LogoParser.FposContext ctx);
	void exitFpos(LogoParser.FposContext ctx);

	void enterVe(LogoParser.VeContext ctx);
	void exitVe(LogoParser.VeContext ctx);

	void enterTg(LogoParser.TgContext ctx);
	void exitTg(LogoParser.TgContext ctx);

	void enterLc(LogoParser.LcContext ctx);
	void exitLc(LogoParser.LcContext ctx);

	void enterTd(LogoParser.TdContext ctx);
	void exitTd(LogoParser.TdContext ctx);

	void enterRe(LogoParser.ReContext ctx);
	void exitRe(LogoParser.ReContext ctx);

	void enterFcc(LogoParser.FccContext ctx);
	void exitFcc(LogoParser.FccContext ctx);

	void enterBc(LogoParser.BcContext ctx);
	void exitBc(LogoParser.BcContext ctx);

	void enterAv(LogoParser.AvContext ctx);
	void exitAv(LogoParser.AvContext ctx);

	void enterListe_instructions(LogoParser.Liste_instructionsContext ctx);
	void exitListe_instructions(LogoParser.Liste_instructionsContext ctx);
}