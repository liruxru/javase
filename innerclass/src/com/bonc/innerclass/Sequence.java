package com.bonc.innerclass;


public class Sequence {
    static {
        System.out.println("类初始化");
    }
    private int size;


    Object[] objs = new Object[10];
    public void add(Object obj){
        if(size<10){
            objs[size++] = obj;
        }
    }
    public int size(){
        return  this.size;
    }

    public Sequence() {
        System.out.println("外部类构造器");
    }

    public  class SelertorImpl implements  Selector{
        public SelertorImpl() {
            System.out.println("内部类构造器");
        }

        private int i=0;
        @Override
        public boolean end() {
            return i>=size;
        }

        @Override
        public void next() {
            i++;
        }

        @Override
        public Object current() {
            return objs[i];
        }
    }

    public  Selector selector(){
        return  new SelertorImpl();
    }


}
class Admin{
    private String name;

    public Admin(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

