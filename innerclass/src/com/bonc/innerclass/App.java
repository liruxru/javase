package com.bonc.innerclass;

public class App {
    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence.add(i);
        }
        Selector selector = sequence.new SelertorImpl();
        while (!selector.end()){
            System.out.println(selector.current());
            selector.next();
        }

        Sequence sequence1 = new Sequence();
        for (int i = 0; i < 10; i++) {
            sequence1.add(new Admin("aaa"+i));
        }
        Selector selector1 = sequence1.selector();
        while (!selector1.end()){
            System.out.println(selector1.current());
            selector1.next();
        }

    }
}
