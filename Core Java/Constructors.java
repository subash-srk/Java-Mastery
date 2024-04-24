class Human{
    private int age;
    private String name;

    Human(){
        age = 20;
        name = "Ari";
    }
    public Human(int a, String n){
        age = a;
        name = n;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}


public class Constructors {
    public static void main(String[] args) {
        Human h1 = new Human();
        // h1.setAge(21);
        // h1.setName("Subash");
        Human h2 = new Human(19, "Dua");
        System.out.println(h1.getName() +" : "+ h1.getAge());
        System.out.println(h2.getName() +" : "+ h2.getAge());
    }
}
