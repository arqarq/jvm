package pl.sdacademy.jvm.jmh;

import org.openjdk.jmh.Main;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.HashMap;

public class BenchmarkTest {
    public static void main(String[] args) throws Exception {
        /*org.openjdk.jmh.*/
        Main.main(args);
    }

    //    @Benchmark
    public void invalidJMHMethod() { // jak nie zwraca to invalid
        int a = 0;
        int b = 105;

        int c = a + b;
    }

    //    @Benchmark
    public int invalidJMHMethod1() { // jak coś zwraca to nie jest invalid
        int a = 0;
        int b = 105;

        int c = a + b;
        return c;
    }

    //    @Benchmark
    public void invalidJMHMethod1(Blackhole blackhole) { // nie wywali
        int a = 0;
        int b = 105;

        int c = a + b;
        blackhole.consume(c);
    }

//    @Benchmark
//    @Fork(value = 1) // test powtarzamy tylko dla jednego procesu
//    @Warmup(iterations = 5, time = 1) // jedna iteracja rozgrzewkowa trwająca 2 sekundy
//    @Measurement(iterations = 10, time = 1) // dwie iteracje pomiarowe, każda trwające 2 sekundy
//    @BenchmarkMode(value = Mode.Throughput)
    public int benchmarkSetup(MyState myState) throws InterruptedException {
        Math.log(myState.PI);
        return 0;
    }

    /**
     * State - gdy nasze funkcje operują na danych i chcemy je przygotować - nie chcemy jednak brać czasu przygotowania do pomiarów.
     * W takim wypadku tworzymy klase i dodajemy adnotacje State
     */
    @State(Scope.Thread)
    public static class MyState {
        public static int COUNT = 100;

        @Param({"100", "200", "300", "500", "1000"})
        public int iterations;
        public double PI = Math.PI;
        public String password = "4v3rys3kur3p455w0rd";
        public HashMap<String, String> outMap;

        @Setup(Level.Invocation)
        public void setUp() {
            outMap = new HashMap<>();
        }
    }
}