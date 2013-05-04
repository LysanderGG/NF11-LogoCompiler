package logoparsing;

import logogui.Traceur;
import logoparsing.LogoParser.AffectationExpressionContext;
import logoparsing.LogoParser.AndContext;
import logoparsing.LogoParser.ArithmeticExpressionIntContext;
import logoparsing.LogoParser.ArithmeticExpressionLoopContext;
import logoparsing.LogoParser.ArithmeticExpressionVarContext;
import logoparsing.LogoParser.AvContext;
import logoparsing.LogoParser.BcContext;
import logoparsing.LogoParser.BlockContext;
import logoparsing.LogoParser.BoolContext;
import logoparsing.LogoParser.DivContext;
import logoparsing.LogoParser.ElseBlockContext;
import logoparsing.LogoParser.EqContext;
import logoparsing.LogoParser.FccContext;
import logoparsing.LogoParser.FposContext;
import logoparsing.LogoParser.IfExpressionContext;
import logoparsing.LogoParser.InfContext;
import logoparsing.LogoParser.InfEqContext;
import logoparsing.LogoParser.LcContext;
import logoparsing.LogoParser.MulContext;
import logoparsing.LogoParser.OrContext;
import logoparsing.LogoParser.ParenthesisContext;
import logoparsing.LogoParser.RandContext;
import logoparsing.LogoParser.ReContext;
import logoparsing.LogoParser.RepeatExpressionContext;
import logoparsing.LogoParser.SubContext;
import logoparsing.LogoParser.SumContext;
import logoparsing.LogoParser.SupContext;
import logoparsing.LogoParser.SupEqContext;
import logoparsing.LogoParser.TdContext;
import logoparsing.LogoParser.TgContext;
import logoparsing.LogoParser.VeContext;
import logoparsing.LogoParser.WhileExpressionContext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;

public class LogoTreeVisitor extends LogoBaseVisitor<Value> {
	Traceur traceur;
	ParseTreeProperty<Value> atts = new ParseTreeProperty<Value>();
	VarDictionary m_dico = new VarDictionary();

	public LogoTreeVisitor() {
		super();
	}
	
	public void initialize(java.awt.Graphics g) {
	      traceur = new Traceur();
	      traceur.setGraphics(g);
    }
	
	public Value setAttValue(ParseTree node, int value) { 
		Value val = new Value(value);
		atts.put(node, val);
		return val;
	}
	
	public Value setAttValue(ParseTree node, boolean value) { 
		Value val = new Value(value);
		atts.put(node, val);
		return val;
	}
	
	public Value setAttValue(ParseTree node, Value value) { 
		atts.put(node, value);
		return value;
	}
	
	public Value getAttValue(ParseTree node) { return atts.get(node); }
	
	@Override
	public Value visitAv(AvContext ctx) {
		visitChildren(ctx);
		traceur.avance(getAttValue(ctx.arithmeticExpression()).getInt());
		return new Value();
	}
	
	@Override
	public Value visitRe(ReContext ctx) {
		visitChildren(ctx);
		traceur.recule(getAttValue(ctx.arithmeticExpression()).getInt());
		return new Value();
	}

	@Override
	public Value visitTd(TdContext ctx) {
		visitChildren(ctx);
		traceur.td(getAttValue(ctx.arithmeticExpression()).getInt());
		return new Value();
	}

	@Override
	public Value visitTg(TgContext ctx) {
		visitChildren(ctx);
		traceur.tg(getAttValue(ctx.arithmeticExpression()).getInt());
		return new Value();
	}

	@Override
	public Value visitFpos(FposContext ctx) {
		visitChildren(ctx);
		traceur.fPos(getAttValue(ctx.arithmeticExpression(0)).getInt(), getAttValue(ctx.arithmeticExpression(1)).getInt());
		return new Value();
	}

	/**
	 * Baisser Crayon
	 */
	@Override
	public Value visitBc(BcContext ctx) {
		traceur.bc();
		return new Value();
	}
	
	/**
	 * Lever Crayon
	 */
	@Override
	public Value visitLc(LcContext ctx) {
		traceur.lc();
		return new Value();
	}

	@Override
	public Value visitVe(VeContext ctx) {
		traceur.ve();
		return new Value();
	}

	@Override
	public Value visitFcc(FccContext ctx) {
		visitChildren(ctx);
		traceur.setColor(getAttValue(ctx.arithmeticExpression()).getInt());
		return new Value();
	}
	
	/*
	 * Arithmetic Expressions
	 */

	@Override
	public Value visitArithmeticExpressionInt(ArithmeticExpressionIntContext ctx) {
		visitChildren(ctx);
		String intText = ctx.INT().getText();
		Value val = new Value(intText);
		setAttValue(ctx.INT(), val.getInt());
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitSub(SubContext ctx) {
		visitChildren(ctx);
		int val = getAttValue(ctx.arithmeticExpression(0)).getInt() - getAttValue(ctx.arithmeticExpression(1)).getInt();
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitDiv(DivContext ctx) {
		visitChildren(ctx);
		int val = getAttValue(ctx.arithmeticExpression(0)).getInt() / getAttValue(ctx.arithmeticExpression(1)).getInt();
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitSum(SumContext ctx) {
		visitChildren(ctx);
		int val = getAttValue(ctx.arithmeticExpression(0)).getInt() + getAttValue(ctx.arithmeticExpression(1)).getInt();
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitMul(MulContext ctx) {
		visitChildren(ctx);
		int val = getAttValue(ctx.arithmeticExpression(0)).getInt() * getAttValue(ctx.arithmeticExpression(1)).getInt();
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitRand(RandContext ctx) {
		visitChildren(ctx);
		int val = (int)(Math.random() * (getAttValue(ctx.arithmeticExpression()).getInt() + 1));
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitParenthesis(ParenthesisContext ctx) {
		visitChildren(ctx);
		int val = getAttValue(ctx.arithmeticExpression()).getInt();
		return setAttValue(ctx, val);
	}
	
	/*
	 * Boolean Expressions
	 */
	
	@Override
	public Value visitSup(SupContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.arithmeticExpression(0)).getInt() > getAttValue(ctx.arithmeticExpression(1)).getInt());
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitInfEq(InfEqContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.arithmeticExpression(0)).getInt() <= getAttValue(ctx.arithmeticExpression(1)).getInt());
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitInf(InfContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.arithmeticExpression(0)).getInt() < getAttValue(ctx.arithmeticExpression(1)).getInt());
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitSupEq(SupEqContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.arithmeticExpression(0)).getInt() >= getAttValue(ctx.arithmeticExpression(1)).getInt());
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitEq(EqContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.arithmeticExpression(0)).getInt() == getAttValue(ctx.arithmeticExpression(1)).getInt());
		return setAttValue(ctx, val);
	}
	
	@Override
	public Value visitBool(BoolContext ctx) {
		String boolText = ctx.BOOL().getText();
		Value val = new Value(boolText);
		return setAttValue(ctx, val);
	}
	
	@Override
	public Value visitAnd(AndContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.booleanExpression(0)).getBool() && getAttValue(ctx.booleanExpression(1)).getBool());
		return setAttValue(ctx, val);
	}
	
	@Override
	public Value visitOr(OrContext ctx) {
		visitChildren(ctx);
		boolean val = (getAttValue(ctx.booleanExpression(0)).getBool() || getAttValue(ctx.booleanExpression(1)).getBool());
		return setAttValue(ctx, val);
	}
	
	/*
	 * If Expression
	 */
	
	@Override
	public Value visitIfExpression(IfExpressionContext ctx) {
		Value val = visit(ctx.booleanExpression());
		if(val.getBool()) {
			visit(ctx.block());
		} else {
			visit(ctx.elseBlock());
		}
		
		return setAttValue(ctx, val); 
	}
	
	@Override
	public Value visitElseBlock(ElseBlockContext ctx) {
		visitChildren(ctx);
		return new Value();
	}
	
	/*
	 * Block
	 */
	
	@Override
	public Value visitBlock(BlockContext ctx) {
		visitChildren(ctx);
		return new Value();
	}
	
	/*
	 * Repeat
	 */
	
	@Override
	public Value visitRepeatExpression(RepeatExpressionContext ctx) {
		int nbRepeat = visit(ctx.arithmeticExpression()).getInt();
		for(int i = 0; i < nbRepeat; ++i) {
			setAttValue(ctx, i);
			visit(ctx.block());
		}
		return new Value();
	}
	
	/*
	 * While
	 */
	
	@Override
	public Value visitWhileExpression(WhileExpressionContext ctx) {
		int i = 0;
		while(visit(ctx.booleanExpression()).getBool()) {
			setAttValue(ctx, i++);
			visit(ctx.block());
		}
		return new Value();
	}
	
	/*
	 * Variables
	 */
	
	@Override
	public Value visitAffectationExpression(AffectationExpressionContext ctx) {
		visitChildren(ctx);
		int val 	= getAttValue(ctx.arithmeticExpression()).getInt();
		String var  = ctx.VAR().getText();
		m_dico.put(var, val);
		return setAttValue(ctx, val);
	}

	@Override
	public Value visitArithmeticExpressionVar(ArithmeticExpressionVarContext ctx) {
		visitChildren(ctx);
		String varText = ctx.VAR().getText();
		try {
			Value val = new Value(m_dico.get(varText));
			return setAttValue(ctx, val);
		} catch (Exception e) {
			return new Value();
		}
	}

	/*
	 * LOOP variable
	 */
	
	@Override
	public Value visitArithmeticExpressionLoop(ArithmeticExpressionLoopContext ctx) {
		ParserRuleContext loopCtx = ctx;
		while(!(loopCtx instanceof RepeatExpressionContext) && !(loopCtx instanceof WhileExpressionContext)) {
			loopCtx = loopCtx.getParent();
		}
		return setAttValue(ctx, getAttValue(loopCtx).getInt());
	}
	
	
	
}
