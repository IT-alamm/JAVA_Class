// package Constructor;

// package Constructor;
public class Student{
    String name;
    int id;
    int age;

   public Student(String n, int i, int a){

       name = n;
       id = i;
       age = a;


   }

   public static void main(String[] args) {
       Student o1 = new Student("Alam",101, 25);
       Student o2 = new Student("Mahtab",105, 23);

        // tsk1: Which student object is younger
       if(o1.age < o2.age){
           System.out.println("O1 is older");
       }
       else{
           System.out.println("O2 is younger");
       }
            // tsk2: Which student object has greater id
       if(o1.id > o2.id){
        System.out.println("o1 object has greater id ");
       }
       else{
        System.out.println("o2 object has greater id ");
       }

      
        

   }
}