package pl.sdacademy.jvm.memory.leaks;

public class Task {
    private int id;
    private String name;

    public Task(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "Task: " + id + " : " + name;
    }
}