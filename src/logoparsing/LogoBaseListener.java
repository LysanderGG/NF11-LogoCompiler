
  package logoparsing;


import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class LogoBaseListener implements LogoListener {
	@Override public void enterProgramme(LogoParser.ProgrammeContext ctx) { }
	@Override public void exitProgramme(LogoParser.ProgrammeContext ctx) { }

	@Override public void enterFpos(LogoParser.FposContext ctx) { }
	@Override public void exitFpos(LogoParser.FposContext ctx) { }

	@Override public void enterVe(LogoParser.VeContext ctx) { }
	@Override public void exitVe(LogoParser.VeContext ctx) { }

	@Override public void enterTg(LogoParser.TgContext ctx) { }
	@Override public void exitTg(LogoParser.TgContext ctx) { }

	@Override public void enterLc(LogoParser.LcContext ctx) { }
	@Override public void exitLc(LogoParser.LcContext ctx) { }

	@Override public void enterTd(LogoParser.TdContext ctx) { }
	@Override public void exitTd(LogoParser.TdContext ctx) { }

	@Override public void enterRe(LogoParser.ReContext ctx) { }
	@Override public void exitRe(LogoParser.ReContext ctx) { }

	@Override public void enterFcc(LogoParser.FccContext ctx) { }
	@Override public void exitFcc(LogoParser.FccContext ctx) { }

	@Override public void enterBc(LogoParser.BcContext ctx) { }
	@Override public void exitBc(LogoParser.BcContext ctx) { }

	@Override public void enterAv(LogoParser.AvContext ctx) { }
	@Override public void exitAv(LogoParser.AvContext ctx) { }

	@Override public void enterListe_instructions(LogoParser.Liste_instructionsContext ctx) { }
	@Override public void exitListe_instructions(LogoParser.Liste_instructionsContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}