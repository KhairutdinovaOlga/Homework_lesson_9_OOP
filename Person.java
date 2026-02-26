public class Person {

        private String name;
        private int age;
        private String gender;

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public String getName() {
            if (gender == "M") {
                return "Mr." + name;
            } else {
                return "Ms." + name;
            }
        }
    }


