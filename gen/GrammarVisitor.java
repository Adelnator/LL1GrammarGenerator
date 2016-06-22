// Generated from /Users/Adel/Documents/Programs/TranslationMethods/LL1GrammarGenerator/Grammar.g4 by ANTLR 4.5.1

	package com.lesuchevskiy.antlr;
	import java.util.*; 
	import java.io.*; 
	import com.lesuchevskiy.elements.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#gram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGram(GrammarParser.GramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(GrammarParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(GrammarParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#termrightpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermrightpart(GrammarParser.TermrightpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nonterm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonterm(GrammarParser.NontermContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#nontermrightpart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNontermrightpart(GrammarParser.NontermrightpartContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#skip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkip(GrammarParser.SkipContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(GrammarParser.NameContext ctx);
}