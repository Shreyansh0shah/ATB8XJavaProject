package sept.exe_16092024;

public class Lab052 {
    public static void main(String[] args) {
        // 1 function type 1
        function_type1();
        //2 function type 2
        int age = function_type2();
        System.out.println(age);
        //function type 3
        function_type3("shah", "shreyansh", 21);

        // 4 function type 4
        int result = function_type4(2, 3);
        System.out.println(result);
    }
        // 1.without parameter and without return type
        public static void function_type1() {
            System.out.println("1.without parameter and without return type");
        }
        //2. without parameters but with return type
        public static int function_type2() {
            System.out.println("2.without parameter but with return type");
            return 21;
        }
        //3. with parameter and without return type
        public static void function_type3(String name,String firstname, int age){
            System.out.println("3.with parameter and without return type");
            System.out.println(name +" " +firstname+" "+ age );
        }
        //4.with parameters and with return type
        public static int function_type4(int a,int b){
            System.out.println("4.with parameter and with return type");
            return a+b;
        }

    }


