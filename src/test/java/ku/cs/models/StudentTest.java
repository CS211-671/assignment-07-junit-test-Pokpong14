package ku.cs.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getId() {
        Student a = new Student("xxxxxxxxxx","xxx");
        assertEquals("xxxxxxxxxx",a.getId());
    }

    @Test
    void getName() {
        Student b = new Student("xxxxxxxxxx","xx");
        assertEquals("xx",b.getName());
    }

    @Test
    void getScore() {
        Student c = new Student("xxxxxxxxxx","xx",50);
        assertEquals(50,c.getScore());
    }

    @Test
    void changeName() {
        Student d = new Student("xxxxxxxxxx","xx");
        d.changeName("yyy");
        assertEquals("yyy",d.getName());
    }

    @Test
    void addScore() {
        Student e = new Student("xxxxxxxxxx","xx");
        e.addScore(50);
        assertEquals(50,e.getScore());
    }

    @Test
    void grade() {
        Student f = new Student("xxxxxxxxxx","xx",50);
        assertEquals("D",f.grade());

    }

    @Test
    void isId() {
        Student g = new Student("xxxxxxxxxx","xx");
        assertEquals(true ,g.isId("xxxxxxxxxx") );
    }
}