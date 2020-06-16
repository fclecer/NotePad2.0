//1. 实现Runnable接口
public class TestRunnable implements Runnable{

    //2.实现run()方法
    @Override
    public void run() {
        for(int i=0;i<20;i++){
            System.out.println("多线程"+i);
        }
    }
}

class Test{

    public static void main(String[] args) {
        //3. 创建线程类对象
        TestRunnable run = new TestRunnable();
        //4. 创建Thread类,传入实现Runnable接口的对象
        Thread thread = new Thread(run);
        System.out.println(thread.getState());
    }
}
public class TestPriority extends Thread{

    @Override
    public void run() {
        super.run();
    }

    public static void main(String[] args) {
        System.out.println("最高优先级:"+Thread.MAX_PRIORITY);
        System.out.println("最低优先级:"+Thread.MIN_PRIORITY);
        System.out.println("默认优先级:"+Thread.NORM_PRIORITY);
        //查看当前main线程的优先级
        Thread t = Thread.currentThread();
        // 将main线程优先级设为 6
        System.out.println("main线程优先级:"+t.getPriority());

        TestPriority t2 = new TestPriority();
        t2.setPriority(6);
        System.out.println("t2线程优先级:"+t2.getPriority());
    }
}
public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}
public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}public class Animal {

    public static void runOne(List<Animal> list){
        for (Animal animal : list) {
            System.out.println(animal);
        }
    }

    public static void runTwo(List<? super Dog> list){
        for (Object animal : list) {
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
    }
}
class Dog extends Animal{}
