import java.util.*;

public class SampleJavaProgram {


    public static void main(String args[]) {


        //1. Provide duplicate count and remove the duplicate in the output and sort it into descending order.

        int[] arr = {10, 10, 2, 2, 3, 1, 5, 5, 7, 2, 3, 1};
        int duplicateCount = 0;

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {

            if (!integerArrayList.contains(arr[i])) {
                integerArrayList.add(arr[i]);
            } else {
                duplicateCount++;
            }
        }

        //System.out.println("duplicate count: " + duplicateCount);
        Collections.sort(integerArrayList);

       // integerArrayList.forEach(x -> System.out.println(x));



        //2.Find the smallest number and position of smallest integer number.

        int[] intArray = {4, 3, 6, 8, 2, 9, 1};
        int smallestNumberPosition = 0;
        int smallestNumber = intArray[0];

        for (int i = 0; i < intArray.length; i++) {
            if (smallestNumber > intArray[i]) {
                smallestNumber = intArray[i];
                smallestNumberPosition = i;
            }
        }


        //System.out.println("smallest number:"+ smallestNumber);
        //System.out.println("smallest number position:"+ smallestNumberPosition);


        //3. Count the words in string
        String s = "   You can do it. Nothing is impossible.";
        String[] stringArr= s.stripLeading().split("\\s");
       // System.out.println("Word count in given String: " + stringArr.length);


        //4. Intersection of two integer array.

        List<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        List<Integer> array2 = new ArrayList<>(Arrays.asList(7, 6, 4, 5, 8));

        ArrayList<Integer> intersectionArrayList = new ArrayList<>();

        for (int i = 0; i < array1.size(); i++) {
            for (int j = 0; j < array2.size(); j++) {
                if (array1.get(i) == array2.get(j)) {
                    intersectionArrayList.add(array1.get(i));
                }
            }
        }


        //intersectionArrayList.forEach(x -> System.out.println(x));


        //5. Sort the employee arraylist

        Employee e1 = new Employee(1, "anm", 30);
        Employee e2 = new Employee(2, "aaa", 20);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(e1);
        employeeArrayList.add(e2);

        //Sort based on employee age
        Collections.sort(employeeArrayList, new EmployeeAgeComparator());

        //Sort based on employee name
        Collections.sort(employeeArrayList, new EmployeeNameComparator());


       // employeeArrayList.forEach(emp -> System.out.println("Id:" + emp.getId() + " name: " + emp.getName() + " age:" + emp.getAge()));



        ValidMethodWithNoParameter methodWithNoParameter = () ->System.out.println("Hello");
        methodWithNoParameter.printMethod();

        ValidMethodWithOneInputParameter methodWithOneInputParameter = (inputParam) ->System.out.println("Hello " + inputParam);
        methodWithOneInputParameter.printMethod1("ABC");


        ValidMethodWithTwoParameter methodWithTwoParameter = (one, two) -> System.out.println("Hello " + one + " " + two);

        methodWithTwoParameter.printMethod2("ABC", "XYZ");

        ValidMethodWithTwoParametersAndReturn methodWithTwoParametersAndReturn = (a, b) -> a + b;

        //System.out.println(methodWithTwoParametersAndReturn.printMethod3(2, 6));




        //Reverse a String

        String s1 = "Hello";
        String reverseString = "";

        int stringLength = s1.length();

        for (int i = stringLength - 1; i >= 0; i--) {
            reverseString = reverseString + s1.charAt(i);
        }

        //System.out.println(reverseString);


        //Find if String is palindrome

        String s2 = "Radar";
        String reverseString1 = "";

        for (int i = s2.length() - 1; i >= 0; i--) {
            reverseString1 = reverseString1 + s2.charAt(i);
        }

        if (reverseString1.equalsIgnoreCase(s2)) {
            System.out.println("String is palindrome");
        } else
            System.out.println("String is not palindrome");

    }


}
