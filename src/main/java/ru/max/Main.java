package ru.max;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext();
        IndependentMessageRenderer renderer = context.getBean(IndependentMessageRenderer.class);
        renderer.print();
    }
}
