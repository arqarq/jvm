package pl.sdacademy.jvm.config;

public class JvmConfig {
    public static void main(String[] args) {
        System.out.println(System.getProperty("java.vm.name"));
        System.out.println(System.getProperty("java.home"));
        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.specification.vendor"));
    }
}