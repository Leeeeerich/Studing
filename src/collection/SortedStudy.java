package collection;

import java.util.*;

public class SortedStudy {

    public SortedStudy() {
        sortedStudy();
    }


    private void sortedStudy() {
        Random random = new Random();
        MyComparator myComparator = new MyComparator();
        List<Person> set = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Person person = new Person(random.nextInt(100), "VotTak");
            set.add(person);
        }

        int i = 0;
        Collections.sort(set, myComparator);
        for (Person p : set) {


            System.out.println(i++);
            System.out.println("Age = " + p.getAge());
            System.out.println("Name = " + p.getName());
        }

    }
}

    class MyComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getAge() - o2.getAge();
        }

    }

    class Person {
        int age;
        String name;

        public Person(int age, String name) {
            this.age = age;
            this.name = name;
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