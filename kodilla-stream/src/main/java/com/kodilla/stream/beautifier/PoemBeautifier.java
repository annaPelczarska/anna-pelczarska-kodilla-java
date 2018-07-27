package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public String beautify(String poem, PoemDecorator poemDecorator){
        String beautifiedPoem = poemDecorator.decorate(poem);
        return beautifiedPoem;
    }
}
