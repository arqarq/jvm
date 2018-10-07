package pl.sdacademy.jvm.jmh;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

@State(value = Scope.Benchmark)
public class CollectionBenchmarkTest {
    private ArrayList<Integer> arrayList;
    private LinkedList<Integer> linkedList;
    private Integer[] array;

    public static void main(String[] args) throws Exception {
        /*org.openjdk.jmh.*/
        Main.main(args);
    }

    @Setup(value = Level.Trial)
    public void init() {
        arrayList = new ArrayList<>();
        linkedList = new LinkedList<>();

        int n = 1000000;
        int number = 0;
        for (; number < n; number++) {
            arrayList.add(number);
            linkedList.add(number);
        }

        Collections.shuffle(linkedList);
        Collections.shuffle(arrayList);
//        array = (Integer[]) arrayList.toArray();
        array = arrayList.toArray(new Integer[]{});
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 5, time = 1) // 5 iteracji rozgrzewkowych trwających 1 sekundę każda
    @Measurement(iterations = 5, time = 1) // 5 iteracji pomiarowych, każda trwająca 1 sekundę
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testArrayList(Blackhole blackhole) {
        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.print(arrayList.get(i));
            blackhole.consume(i);
        }
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 5, time = 1) // 5 iteracji rozgrzewkowych trwających 1 sekundę każda
    @Measurement(iterations = 5, time = 1) // 5 iteracji pomiarowych, każda trwająca 1 sekundę
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testArrayListForech(Blackhole blackhole) {
        for (Integer number : arrayList) {
//            System.out.print(arrayList.get(i));
            blackhole.consume(number);
        }
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 5, time = 1) // 5 iteracji rozgrzewkowych trwających 1 sekundę każda
    @Measurement(iterations = 5, time = 1) // 5 iteracji pomiarowych, każda trwająca 1 sekundę
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testLinkedList(Blackhole blackhole) {
        for (int i = 0; i < linkedList.size(); i++) {
//            System.out.print(linkedList.get(i));
            blackhole.consume(i);
        }
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 5, time = 1) // 5 iteracji rozgrzewkowych trwających 1 sekundę każda
    @Measurement(iterations = 5, time = 1) // 5 iteracji pomiarowych, każda trwająca 1 sekundę
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testLinkedListForeach(Blackhole blackhole) {
        for (Integer number : linkedList) {
//            System.out.print(linkedList.get(i));
            blackhole.consume(number);
        }
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 5, time = 1) // 5 iteracji rozgrzewkowych trwających 1 sekundę każda
    @Measurement(iterations = 5, time = 1) // 5 iteracji pomiarowych, każda trwająca 1 sekundę
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testArray(Blackhole blackhole) {
        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i]);
            blackhole.consume(i);
        }
    }

    @Benchmark
    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
    @Warmup(iterations = 5, time = 1) // 5 iteracji rozgrzewkowych trwających 1 sekundę każda
    @Measurement(iterations = 5, time = 1) // 5 iteracji pomiarowych, każda trwająca 1 sekundę
    @BenchmarkMode(value = Mode.AverageTime)
    @OutputTimeUnit(TimeUnit.MICROSECONDS)
    public void testArrayForeach(Blackhole blackhole) {
        for (int number : array) {
//            System.out.print(array[i]);
            blackhole.consume(number);
        }
    }
}