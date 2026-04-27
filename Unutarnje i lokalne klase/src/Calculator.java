import java.util.*;

public class Calculator {

    public static double eval(String expr) {

        class Lexer {
            String input;
            int pos = 0;

            Lexer(String input) { this.input = input.replace(" ", ""); }

            char peek() { return pos < input.length() ? input.charAt(pos) : '\0'; }
            char next() { return input.charAt(pos++); }

            double parseNumber() {
                StringBuilder sb = new StringBuilder();
                while (Character.isDigit(peek())) sb.append(next());
                return Double.parseDouble(sb.toString());
            }
        }

        class Parser {
            Lexer lex;
            Parser(Lexer lex) { this.lex = lex; }

            // Redoslijed: expression -> term -> factor
            double parseExpression() {
                double result = parseTerm();
                while (lex.peek() == '+' || lex.peek() == '-') {
                    char op = lex.next();
                    if (op == '+') result += parseTerm();
                    else result -= parseTerm();
                }
                return result;
            }

            double parseTerm() {
                double result = parseFactor();
                while (lex.peek() == '*' || lex.peek() == '/') {
                    char op = lex.next();
                    if (op == '*') result *= parseFactor();
                    else result /= parseFactor();
                }
                return result;
            }

            double parseFactor() {
                if (lex.peek() == '(') {
                    lex.next(); // preskoči (
                    double result = parseExpression();
                    lex.next(); // preskoči )
                    return result;
                }
                return lex.parseNumber();
            }
        }

        Lexer lexer = new Lexer(expr);
        Parser parser = new Parser(lexer);
        return parser.parseExpression();
    }

    public static void main(String[] args) {
        System.out.println(eval("2 * (3 + 4) / 2"));
        System.out.println(eval("10 + 5 * 2"));
    }
}