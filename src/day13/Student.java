package day13;


    public class Student {
        private final String firstName;
        private final String LastName;
        private final double GPA;

        public Student(String firstName, String lastName, double GPA) {
            this.firstName = firstName;
            this.LastName = lastName;
            this.GPA = GPA;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public double getGPA() {
            return GPA;
        }

        @Override
        public String toString() {
            return this.firstName + " " + this.LastName + " " + this.GPA;
        }
    }

