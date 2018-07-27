import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.com.kodilla.stream.person.People;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import static jdk.nashorn.internal.objects.NativeString.toLocaleUpperCase;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {

/*        BookDirectory theBookDirectory = new BookDirectory();
        theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .forEach(System.out::println);*/

/*
        People.getList().stream()
                .map(s -> s.toUpperCase())
                .filter(s -> s.length()>11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(s -> System.out.println(s));
*/

/*        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);



        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);*/

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("Beautifying texts with lambdas");
        System.out.println(poemBeautifier.beautify("The Road Not Taken",(poem) -> "ABC "+"The Road Not Taken"+" ABC"));
        System.out.println(poemBeautifier.beautify ("The Road Not Taken", (poem) -> toUpperCase("The Road Not Taken")));
        System.out.println(poemBeautifier.beautify ("The Road Not Taken", (poem) -> toLowerCase("The Road Not Taken")));
        System.out.println(poemBeautifier.beautify ("The Road Not Taken", (poem) -> "The Road Not Taken".replace("o","*")));

    }
}
