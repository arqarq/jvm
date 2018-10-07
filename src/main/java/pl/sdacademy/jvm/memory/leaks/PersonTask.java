package pl.sdacademy.jvm.memory.leaks;

import java.util.UUID;

public class PersonTask implements Runnable {
    private TaskManager cm;
    private int totalCustomersGenerated = 0;

    public PersonTask(TaskManager cm) {
        this.cm = cm;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep((1));
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            String name = UUID.randomUUID().toString();
            Task c = new Task(name);
            cm.addTask(c);
            totalCustomersGenerated++;
            cm.getNextTask();
            //System.out.println(totalCustomersGenerated);
        }
    }
}