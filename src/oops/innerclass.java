package oops;

//extend topic of oops 2
public class innerclass {
    //test is static as innerclass class is outerclass
    static class test {
           String name;
        public test(String name) {
            this.name = name;
        }
    }
    //as statics are class level they are resolved during compile time
// main and test doesnt depend upon the objects of innerclasses as they both are static
       public static void main(String[] args) {
         test a= new test("sad");
           test b= new test("sd");

           System.out.println(a.name);
           System.out.println(b.name);

    }
}
//this cant be static as this is the outside class and has no outer class above it
//static class A{
//
//}
