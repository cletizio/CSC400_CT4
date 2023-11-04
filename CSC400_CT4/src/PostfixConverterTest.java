public class PostfixConverterTest {
    public static void  main(String[] args){
        testPostfix("a/b*(c+(d-e))");
        testPostfix("(a+b)/(c-d)");
        testPostfix("(9-8)*6^2");

    }
    public static void testPostfix(String inFix){
        String postfix = PostfixConverter.convertToPostfix(inFix);
        System.out.println("infix expression is: " + inFix);
        System.out.println("Postfix converted expression is: " + postfix);

    }
}
