// Generated from /Users/Adel/Documents/Programs/TranslationMethods/LL1GrammarGenerator/Grammar.g4 by ANTLR 4.5.1

	package com.lesuchevskiy.antlr;
	import java.util.*; 
	import java.io.*; 
	import com.lesuchevskiy.elements.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void enterGram(GrammarParser.GramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 */
	void exitGram(GrammarParser.GramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(GrammarParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(GrammarParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(GrammarParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(GrammarParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#termrightpart}.
	 * @param ctx the parse tree
	 */
	void enterTermrightpart(GrammarParser.TermrightpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#termrightpart}.
	 * @param ctx the parse tree
	 */
	void exitTermrightpart(GrammarParser.TermrightpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 */
	void enterNonterm(GrammarParser.NontermContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 */
	void exitNonterm(GrammarParser.NontermContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#nontermrightpart}.
	 * @param ctx the parse tree
	 */
	void enterNontermrightpart(GrammarParser.NontermrightpartContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#nontermrightpart}.
	 * @param ctx the parse tree
	 */
	void exitNontermrightpart(GrammarParser.NontermrightpartContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#skip}.
	 * @param ctx the parse tree
	 */
	void enterSkip(GrammarParser.SkipContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#skip}.
	 * @param ctx the parse tree
	 */
	void exitSkip(GrammarParser.SkipContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(GrammarParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(GrammarParser.NameContext ctx);
}