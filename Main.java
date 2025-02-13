import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        double[] grades = {95, 87, 92};
        neStydent student = new neStydent("Maxim Galitskiy", grades);
        double average = student.calculateAverageGrade();
        String letterGrade = student.getLetterGrade();
        System.out.println("Average grade:" + average);
        System.out.println("Letter grade:" + letterGrade);
    }
    public static class neStydent {

        @Override
        public String toString() {
            return "neStydent{" +
                    "name='" + name + '\'' +
                    ", grades=" + Arrays.toString(grades) +
                    '}';
        }

        private String name;
        private double[] grades;
        private static final int NUM_GRADES = 3;
        public neStydent(String name, double[] grades) {
            this.name = name;
            this.grades = grades;
        }
        public String getName() {
            return name;
        }
        public void trueSetterName(String name) {
            this.name = name;
        }
        public double[] trueGetterGrades() {
            return grades;
        }
        public void setGrades(double[] grades) {
            this.grades = grades;
        }
        public double calculateAverageGrade() {
            double total = 0;
            for (int i = 0; i < NUM_GRADES; i++) {
                total += grades[i];
            }
            return total / NUM_GRADES;
        }
        public String getLetterGrade() {
            double average = calculateAverageGrade();

            if (average >= 90) {
                return "A";
            } else if (average >= 80) {
                return" B";
            } else if (average >= 70) {
                return "C";
            } else if (average >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }
}