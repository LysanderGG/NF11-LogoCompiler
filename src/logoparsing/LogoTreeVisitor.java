package logoparsing;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import logogui.Traceur;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.BcContext;
import logoparsing.LogoParser.FccContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.VeContext;

public class LogoTreeVisitor extends LogoBaseVisitor<Integer> {
	Traceur traceur;
	ParseTreeProperty<Integer> atts = new ParseTreeProperty<Integer>();

	public LogoTreeVisitor() {
		super();
	}
	
	public void initialize(java.awt.Graphics g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	
	public void setAttValue(ParseTree node, int value) { 
		atts.put(node, value);
	}
	
	public int getAttValue(ParseTree node) { return atts.get(node); }
	
	@Override
	public Integer visitAv(AvContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.avance(getAttValue(ctx.INT()));
		return 0;
	}
	
	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.recule(getAttValue(ctx.INT()));
		return 0;
	}

	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.td(getAttValue(ctx.INT()));
		return 0;
	}

	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.tg(getAttValue(ctx.INT()));
		return 0;
	}

	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		String intText0 = ctx.INT(0).getText();
		String intText1 = ctx.INT(1).getText();
		setAttValue(ctx.INT(0), Integer.valueOf(intText0));
		setAttValue(ctx.INT(1), Integer.valueOf(intText1));
		traceur.fPos(getAttValue(ctx.INT(0)), getAttValue(ctx.INT(1)));
		return 0;
	}

	/**
	 * Baisser Crayon
	 */
	@Override
	public Integer visitBc(BcContext ctx) {
		traceur.bc();
		return 0;
	}
	
	/**
	 * Lever Crayon
	 */
	@Override
	public Integer visitLc(LcContext ctx) {
		traceur.lc();
		return 0;
	}

	@Override
	public Integer visitVe(VeContext ctx) {
		traceur.ve();
		return 0;
	}

	@Override
	public Integer visitFcc(FccContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText(); 
		setAttValue(ctx.INT(), Integer.valueOf(intText));
		traceur.setColor(getAttValue(ctx.INT()));
		return 0;
	}
	
}
