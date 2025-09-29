public class Person {
        public String name;
        private String gender;
        public int age;

        public Person(String name, String gender) {
            this.name = name;
            this.gender = gender;
            this.age = 0;
            System.out.printf("Student %s has been created \n", this.name);
        }


        public String introduceSelf(){
            return ("Hi my name is " + this.name);
        }

        public String celebrateBirthday(){
            this.age += 1;
            return (this.name + " is now " + this.age);

        }

    }
