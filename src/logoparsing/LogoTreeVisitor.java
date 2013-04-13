package logoparsing;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import logogui.Traceur;
import logoparsing.LogoParser.ArithmeticExpressionIntContext;
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
		traceur.avance(getAttValue(ctx.arithmeticExpression()));
		return 0;
	}
	
	@Override
	public Integer visitRe(ReContext ctx) {
		visitChildren(ctx);
		traceur.recule(getAttValue(ctx.arithmeticExpression()));
		return 0;
	}

	@Override
	public Integer visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.arithmeticExpression()));
		return 0;
	}

	@Override
	public Integer visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.arithmeticExpression()));
		return 0;
	}

	@Override
	public Integer visitFpos(FposContext ctx) {
		visitChildren(ctx);
		traceur.fPos(getAttValue(ctx.arithmeticExpression(0)), getAttValue(ctx.arithmeticExpression(1)));
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
		traceur.setColor(getAttValue(ctx.arithmeticExpression()));
		return 0;
	}

	@Override
	public Integer visitArithmeticExpressionInt(ArithmeticExpressionIntContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText();
		int val = Integer.valueOf(intText);
		setAttValue(ctx.INT(), val);
		setAttValue(ctx, val);
		return val;
	}
	
}
