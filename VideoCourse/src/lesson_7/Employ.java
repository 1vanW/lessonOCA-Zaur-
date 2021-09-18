package lesson_7;

public class Employ {
       private double salary;
       public String surname;
       int id;

     public void showId(){
         System.out.println(id);
       }

     public void showSurname(){
         System.out.println(surname);
     }

     public void showSalary(){
         System.out.println(salary);
     }





        public Employ(double salary2,String surname2,int id2 ){
         salary = salary2;
         surname = surname2;
         id = id2;
        }
        private Employ(double salary2){
         salary = salary2;
        }
        public Employ(String surname2, int id2){
         surname = surname2;
         id = id2;
        }

    public static void main(String[] args) {
           Employ emp = new Employ(500);
           System.out.println(emp.salary);


    }



}
