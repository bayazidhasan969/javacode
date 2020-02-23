public class Student {
    String name;
    int id;
    static String versity="uits";
    
    /* 
    static variable are related with class not to object
    static variable does not create memory for storage.it using class
    */
    
    Student(String n,int i){
        name=n;
        id=i;
    }
    void displays(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("university : "+versity);
        System.out.println();
    }
    public static void main(String[] args) {
        Student s1=new Student("bayazid",28);
        Student s2=new Student("hasan",28);
        s1.displays();
        s2.displays();
    }
 
}
