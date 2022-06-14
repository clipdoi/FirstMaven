package org.example.exercise.unit2;

public class ThisReferenceExample {

    private void doProcess(int i, Process process) {
        process.process(i);
    }

    private void execute() {
        doProcess(10, i -> {
            System.out.println("value i: "+i);
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//        thisReferenceExample.doProcess(10, new Process() {
//            @Override
//            public void process(int i) {
//                System.out.println("value i: "+ i);
//                System.out.println(this); // this: address of instance new Process() class
//            }
//
//
//        });
//        thisReferenceExample.doProcess(10, i -> {
//            System.out.println("value i: "+i);
////            System.out.println(this); // This will not work
//        });
        thisReferenceExample.execute();
    }

    public String toString() {
        return "This is the main ThisReferenceExample class instance";
    }
}
