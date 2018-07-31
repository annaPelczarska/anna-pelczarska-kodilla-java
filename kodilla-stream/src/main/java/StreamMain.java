import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.com.kodilla.stream.person.People;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class StreamMain {
    public static void main(String[] args) {


        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                //.filter(forumUser -> (forumUser.getSex() == 'M'))
                .filter(forumUser -> forumUser.getBirthDate().getYear()<=1998)
                .filter(forumUser -> forumUser.getPostQuantity()>0)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        System.out.println("Forum User # elements: " + theResultMapOfUsers.size());
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);


  /*      BookDirectory theBookDirectory = new BookDirectory();

        String theResultStringOfBooks = theBookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theResultStringOfBooks);*/
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
        System.out.println(poemBeautifier.beautify ("The Road Not Taken", (poem) -> "The Road Not Taken".replace("o","*")));
        System.out.println(poemBeautifier.beautify ("The Road Not Taken", (poem) -> "The Road Not Taken".replace(" ","_")));
        System.out.println(poemBeautifier.beautify ("The Road Not Taken", (poem) -> "The Road Not Taken".substring(4)+"."));
    }
}
