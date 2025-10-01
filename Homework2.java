import java.util.Scanner;

class Student {
    private String studentId;
    private String name;
    private String major;
    private String phoneNumber;


    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public String getFormattedPhoneNumber() {
        if (phoneNumber != null && phoneNumber.length() == 11) {
            return phoneNumber.substring(0, 3) + "-" +
                    phoneNumber.substring(3, 7) + "-" +
                    phoneNumber.substring(7);
        }
        return phoneNumber;
    }


    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setPhoneNumber(String phoneNumber) {
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

            students[i].setStudentId(scanner.next());
            students[i].setName(scanner.next());
            students[i].setMajor(scanner.next());
            students[i].setPhoneNumber(scanner.next());
        }

        System.out.println("\n입력된 학생들의 정보는 다음과 같습니다.");

        String[] ordinals = {"첫번째", "두번째", "세번째"};

        for (int i = 0; i < students.length; i++) {
            System.out.println(ordinals[i] + " 학생: " +
                    students[i].getStudentId() + " " +
                    students[i].getName() + " " +
                    students[i].getMajor() + " " +
                    students[i].getFormattedPhoneNumber());
        }

        scanner.close();
    }
}