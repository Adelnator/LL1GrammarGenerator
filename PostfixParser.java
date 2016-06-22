
import java.io.IOException;
import java.util.*;
import java.text.ParseException;

import com.lesuchevskiy.elements.Tree;
import com.lesuchevskiy.elements.TerminalTree;

public class PostfixParser {
	public List<Double> addAndReturn(List<Double> list, double val) {
		list.add(val);
		return list;
	}
	public List<Double> delAddAndReturn(double val, List<Double> list) {
		list.remove(list.size() - 1);
		list.remove(list.size() - 1);
		list.add(val);
		return list;
	}
	public List<Double> initArrayList() {
		return new ArrayList<>();
	}
	private PostfixLexer lex;
	private Tree root;
	
	public PostfixParser(String inputFile) throws IOException, ParseException {
		lex = new PostfixLexer(inputFile);
		root = new s();
	}
	
	public Tree getTree() {
		return root;
	}

	public class op extends Tree {
		public double val;
		public op(String s) {
			node = "op";
			switch(lex.curTerminal().get()) {
			case "ADD": {
				Tree _0 = null;
				if (lex.curTerminal().get().equals("ADD")) {
					_0 = new TerminalTree(lex.curTerminal().get(), lex.curToken());
				} else {
					throw new AssertionError("ADD expected, instead of " + lex.curToken());
				}
				lex.nextToken();
				children.add(_0);
				{
				        val = Double.parseDouble(s.substring(0, s.indexOf("\n"))) + Double.parseDouble(s.substring(s.indexOf("\n") + 1));
				    }
				}
				break;
			case "SUB": {
				Tree _0 = null;
				if (lex.curTerminal().get().equals("SUB")) {
					_0 = new TerminalTree(lex.curTerminal().get(), lex.curToken());
				} else {
					throw new AssertionError("SUB expected, instead of " + lex.curToken());
				}
				lex.nextToken();
				children.add(_0);
				{
				        val = Double.parseDouble(s.substring(0, s.indexOf("\n"))) - Double.parseDouble(s.substring(s.indexOf("\n") + 1));
				    }
				}
				break;
			case "DIV": {
				Tree _0 = null;
				if (lex.curTerminal().get().equals("DIV")) {
					_0 = new TerminalTree(lex.curTerminal().get(), lex.curToken());
				} else {
					throw new AssertionError("DIV expected, instead of " + lex.curToken());
				}
				lex.nextToken();
				children.add(_0);
				{
				        val = Double.parseDouble(s.substring(0, s.indexOf("\n"))) / Double.parseDouble(s.substring(s.indexOf("\n") + 1));
				    }
				}
				break;
			case "MUL": {
				Tree _0 = null;
				if (lex.curTerminal().get().equals("MUL")) {
					_0 = new TerminalTree(lex.curTerminal().get(), lex.curToken());
				} else {
					throw new AssertionError("MUL expected, instead of " + lex.curToken());
				}
				lex.nextToken();
				children.add(_0);
				{
				        val = Double.parseDouble(s.substring(0, s.indexOf("\n"))) * Double.parseDouble(s.substring(s.indexOf("\n") + 1));
				    }
				}
				break;
			default:
				throw new AssertionError();
			}
					}
	}

	public class s extends Tree {
		public double val;
		public s() {
			node = "s";
			switch(lex.curTerminal().get()) {
			case "N": {
				t _0 = null;
				_0 = new t(initArrayList());
				children.add(_0);
				{
				        val = _0.val.get(0);
				    }
				}
				break;
			case "EOF": {
				Tree _0 = null;
				_0 = new TerminalTree("EPS", "");
				children.add(_0);
				{
				        val = 0;
				    }
				}
				break;
			default:
				throw new AssertionError();
			}
					}
	}

	public class t extends Tree {
		public List<Double> val;
		public t(List<Double> val1) {
			node = "t";
			switch(lex.curTerminal().get()) {
			case "N": {
				Tree _0 = null;
				if (lex.curTerminal().get().equals("N")) {
					_0 = new TerminalTree(lex.curTerminal().get(), lex.curToken());
				} else {
					throw new AssertionError("N expected, instead of " + lex.curToken());
				}
				lex.nextToken();
				f _1 = null;
				_1 = new f(addAndReturn(val1,Double.parseDouble(_0.text)));
				children.add(_0);
				children.add(_1);
				{
				        val = val1;
				    }
				}
				break;
			default:
				throw new AssertionError();
			}
					}
	}

	public class f extends Tree {
		public double val;
		public f(List<Double> val1) {
			node = "f";
			switch(lex.curTerminal().get()) {
			case "N": {
				t _0 = null;
				_0 = new t(val1);
				op _1 = null;
				_1 = new op(String.valueOf(_0.val.get(_0.val.size()-2))+"\n"+String.valueOf(_0.val.get(_0.val.size()-1)));
				f _2 = null;
				_2 = new f(delAddAndReturn(_1.val,_0.val));
				children.add(_0);
				children.add(_1);
				children.add(_2);
				{
				        val = _2.val;
				    }
				}
				break;
			case "ADD": {
				Tree _0 = null;
				_0 = new TerminalTree("EPS", "");
				children.add(_0);
				{
				        val = val1.get(val1.size() - 1);
				    }
				}
				break;
			case "DIV": {
				Tree _0 = null;
				_0 = new TerminalTree("EPS", "");
				children.add(_0);
				{
				        val = val1.get(val1.size() - 1);
				    }
				}
				break;
			case "MUL": {
				Tree _0 = null;
				_0 = new TerminalTree("EPS", "");
				children.add(_0);
				{
				        val = val1.get(val1.size() - 1);
				    }
				}
				break;
			case "EOF": {
				Tree _0 = null;
				_0 = new TerminalTree("EPS", "");
				children.add(_0);
				{
				        val = val1.get(val1.size() - 1);
				    }
				}
				break;
			case "SUB": {
				Tree _0 = null;
				_0 = new TerminalTree("EPS", "");
				children.add(_0);
				{
				        val = val1.get(val1.size() - 1);
				    }
				}
				break;
			default:
				throw new AssertionError();
			}
					}
	}

}
