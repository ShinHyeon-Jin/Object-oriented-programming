import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String major;
    int phoneNumber;


    int getStudentId() {
        return studentId;
    }

    String getName() {
        return name;
    }

    String getMajor() {
        return major;
    }

    String getFormattedPhoneNumber() {
        String tempPhoneNumber = Integer.toString(phoneNumber);
        return tempPhoneNumber = ("0"+tempPhoneNumber.substring(0,2)+"-"+
                tempPhoneNumber.substring(2,6)+"-"+tempPhoneNumber.substring(6));
    }


    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}


public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[3];

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            students[i] = new Student();

            students[i].setStudentId(Integer.parseInt(scanner.next()));
            students[i].setName(scanner.next());
            students[i].setMajor(scanner.next());
            students[i].setPhoneNumber(Integer.parseInt(scanner.next()));
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");


        System.out.println("첫번째 학생: " +
                students[0].getStudentId() + " " +
                students[0].getName() + " " +
                students[0].getMajor() + " " +
                students[0].getFormattedPhoneNumber());

        System.out.println("두번째 학생: " +
                students[1].getStudentId() + " " +
                students[1].getName() + " " +
                students[1].getMajor() + " " +
                students[1].getFormattedPhoneNumber());

        System.out.println("세번째 학생: " +
                students[2].getStudentId() + " " +
                students[2].getName() + " " +
                students[2].getMajor() + " " +
                students[2].getFormattedPhoneNumber());
    }
}
