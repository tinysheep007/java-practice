package Human;

public class Worker extends Person {

    String job;

    public Worker(int age, String name, String gender, String job){
        super(age, name, gender);
        this.job = job;
    }

    public void work(){
        System.out.println("Worker name: "+ name + " job: "+ job);
    }
}
