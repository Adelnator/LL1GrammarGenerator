import com.lesuchevskiy.PostfixParser;
import com.lesuchevskiy.elements.Grammar;
import com.lesuchevskiy.PostfixParser.s;

public class Test {
	public static void main(String[] args) throws Exception {
		new Grammar("Postfix", "s");
		PostfixParser parser = new PostfixParser("input2");
		if (parser.getTree() instanceof s) {
			s startRule = (s) parser.getTree();
			System.out.println(startRule.val);
		}
		parser.getTree().show();

//		new Grammar("JavaGrammar", "prog");
//		JavaGrammarParser parser = new JavaGrammarParser("input");
//		parser.getTree().show();
	}
}
