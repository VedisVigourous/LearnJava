public class Ch08_39_4_StaticBlock_n_InnerClass {
    static int a = 10;
    static int b;

    static {
        System.out.println("Static Block accessed");
        b = a * 5;
    }

    public static void main(String[] args) {
        Ch08_39_4_StaticBlock_n_InnerClass obj = new Ch08_39_4_StaticBlock_n_InnerClass();
        System.out.println(Ch08_39_4_StaticBlock_n_InnerClass.b);

        /* =======================================
           NOTE: The first object created automatically executes the static block
                 - From second object the static block is not automatically executed!
           =======================================
         */

        Ch08_39_4_StaticBlock_n_InnerClass obj2 = new Ch08_39_4_StaticBlock_n_InnerClass();
        // Static execution takes place on creation of second object!


        System.out.println();


        /* ====================================================================================================
            NOTE: Only INNER Classes are allowed to be static the outermost class are not allowed to be static
           ====================================================================================================
         */

        // Running 1.
        Class1 obj1Cl1 = new Class1("Ved");
        Class1 obj2Cl1 = new Class1("Vedant");

        System.out.println(obj1Cl1.name);
        System.out.println(obj2Cl1.name);

        /* Both updates the variable having the same memory reference linked to static class only object */


        System.out.println();


        // Running 2.
        Class2 obj1Cl2 = new Class2("Ved");
        Class2 obj2Cl2 = new Class2("Vedant");

        System.out.println(obj1Cl2.name);
        System.out.println(obj2Cl2.name);

        /* Outputs different value as with each object new memory is allocated to the static class's method */


        /* ----------------------------------------------------------------------------------------------
            NOTE: Static means an allotted single object
            ------------------------------------------------------------------------------------------ */
    }

    /* 1. A static member made in inner class is updated for all if  more than one object is made as it has a single memory
          reference linked to a class!  */

    static class Class1 {
        static String name;

        public Class1(String name) {
            Class1.name = name;
        }
    }


    /* 2. Non-Static property in a static class -> creates different memory address for each property hence output different values */

    static class Class2 {
        String name;

        public Class2(String name){
            this.name = name;
        }
    }
}
