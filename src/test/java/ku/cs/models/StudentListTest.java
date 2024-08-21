package ku.cs.models;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentListTest {

    @Test
    void findStudentById() {
        StudentList list = new StudentList();
        list.addNewStudent("xxx","xxx");
        list.addNewStudent("yyy","yyy");
        assertEquals(list.getStudents(),list.findStudentById("xxx"));
    }

    @Test
    void giveScoreToId() {
        StudentList list1 = new StudentList();
        list1.addNewStudent("xxx","xxx");
        list1.addNewStudent("yyy","yyy");
        list1.giveScoreToId("xxx",50);
        assertEquals(50,list1.findStudentById("xxx").getScore());
    }

    @Test
    void viewGradeOfId() {
        StudentList list2 = new StudentList();
        list2.addNewStudent("xxx","xxx");
        list2.addNewStudent("yyy","yyy");
        list2.giveScoreToId("xxx",50);
        assertEquals("D",list2.viewGradeOfId("xxx"));
    }

    @Test
    void getStudents() {
        StudentList list2 = new StudentList();
        list2.addNewStudent("xxx","xxx");
        list2.addNewStudent("yyy","yyy");
        Student a = new Student("xxx","xxx");
        Student b = new Student("yyy","yyy");
        ArrayList<Student> testList = new ArrayList<>();
        testList.add(a);
        testList.add(b);
        assertEquals(testList,list2.getStudents());
    }
}