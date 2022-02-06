public class ReportCard {
    /**
     Метод принимает один целочисленный аргумент - результат теста и
     возвращает символ, A,B,C или D в зависимости от этого аргумента.
     */
    public static char convertGrades(int testResult) {
        char grade;
        if(testResult >= 90){
            grade = 'A';
        } else if (testResult >= 80){
            grade = 'B';
        } else if (testResult >= 70){
            grade = 'C';
        } else {
            grade = 'D';
        }
        return grade;
    }
}
