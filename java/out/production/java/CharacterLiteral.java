package out.production.java;

public class CharacterLiteral {


    public static void main(String[] args) {

            char letter = 'a';
            char digit = '1';
            char symbol = '$';
            char space = ' ';


            char newline = '\n';  // Newline
            char tab = '\t';      // Tab
            char backslash = '\\'; // Backslash itself  \\
            char singleQuote = '\''; // Single quote
            char doubleQuote = '\"'; // Double quote


            char unicodeA = '\u0041';  //  'A'
            char unicodeOmega = '\u03A9'; //  'Ω'


            System.out.println("Single Characters:");
            System.out.println("letter: " + letter);
            System.out.println("digit: " + digit);
            System.out.println("symbol: " + symbol);
            System.out.println("space: " + space);

            System.out.println("\nEscape Sequences:");
            System.out.println("newline: \n (see below)");
            System.out.println(newline + "This is after a newline.");
            System.out.println("tab: '" + tab + "' (tabbed space)");
            System.out.println("backslash: " + backslash);
            System.out.println("singleQuote: " + singleQuote);
            System.out.println("doubleQuote: " + doubleQuote);

            System.out.println("\nUnicode Characters:");
            System.out.println("unicodeA: " + unicodeA);
            System.out.println("unicodeOmega: " + unicodeOmega);


            char x = '\u0041';
            char y = '\u0045';

            System.out.println("x===>>"+x);
            System.out.println("y===>"+y);

            char val =9;
            System.out.println(val);

            System.out.println("\\");

            System.out.println(" \' "+5+" \' ");

            System.out.println("\t\t\t\t\t\t ab \t\t\t\t cd");

            char tr ='\t';
            char nwln ='\n';

            System.out.println(tr);
            System.out.println(nwln);

            // "
            // '

            // char empty = '';  //  Empty character literal
            // char tooMany = 'ab';  //  Too many characters in literal
            // char invalidEscape = '\x';   Invalid escape sequence
            // char tripquote ='''; invalid single quote
            // char invaliddoublequote ='"'; invalid double quote
  //abhin'a'v kumar "singh"

            System.out.println("Abhin\'a\'v\tkumar\t \"Singh\" ");

        }

}
