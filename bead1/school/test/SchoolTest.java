package school.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import java.beans.Transient;
import school.schedule.Schedule;
import school.subject.*;

public class SchoolTest{
    Schedule s1, s2, s3, s4;
    //Ebben a @BeforeEach annotációjú beforeEach metódus töltse fel a scheduleX.txt használatával a Schedule elemtípusú schedules tömb négy elemét, ahol X értéke 4, 5, 6 és 7.
    //A fájlokat úgy kell elkészíteni, hogy az Xedik évfolyamnak megfelelő kitöltésűek legyenek, és naponta X óra legyen bennük.
    @BeforeEach
    public void beforeEach(){
        s1 = new Schedule("school/test/schedule4.txt");
        s2 = new Schedule("school/test/schedule5.txt");
        s3 = new Schedule("school/test/schedule6.txt");
        s4 = new Schedule("school/test/schedule7.txt");
    }

    //classesPerDay: mind a négy betöltött órarend helyes getClassesPerDay értéket mutat
    @Test
    public void classesPerDayTest(){
        assertEquals(4, s1.getClassesPerDay());
        assertEquals(5, s2.getClassesPerDay());
        assertEquals(6, s3.getClassesPerDay());
        assertEquals(7, s4.getClassesPerDay());
    }

    //scheduledClassType: mind a négy betöltött órarendből legalább egy esetben tesztelendő, hogy egy megadott napon egy megadott időben az akkor tartott óra típusa (SubjectType) megfelelő-e
    @Test
    public void subjectTypeTest(){
        assertEquals(SubjectType.HUMANITY, s1.get(1,1).getSubjectType());
        assertEquals(SubjectType.HUMANITY, s2.get(1,1).getSubjectType());
        assertEquals(SubjectType.SCIENCE,  s3.get(1,1).getSubjectType());
        assertEquals(SubjectType.SCIENCE,  s4.get(1,1).getSubjectType());
    }

    //suitable: mind a négy betöltött órarend esetén isSuitableForYear a megfelelő évvel igazat ad
    @Test
    public void suitableTest(){
        assertEquals(true, s1.isSuitableForYear(4));
        assertEquals(true, s2.isSuitableForYear(5));
        assertEquals(true, s3.isSuitableForYear(6));
        assertEquals(true, s4.isSuitableForYear(7));
    }

    //notSuitable: a három utóbbi órarend esetén isSuitableForYear az eggyel korábbi évvel hamisat ad
    @Test
    public void notSuitableTest(){
        assertEquals(false, s2.isSuitableForYear(4));
        assertEquals(false, s3.isSuitableForYear(5));
        assertEquals(false, s4.isSuitableForYear(6));
    }

    //invalidName: az abcdefg.txt fájlnévvel meghívott Schedule kiváltja az IllegalArgumentException kivételt
    @Test
    void invalidNameTest() {
        IllegalArgumentException exc =
            assertThrows(IllegalArgumentException.class,
                () -> {
                   new Schedule("abcdefg.txt");
                });
        assertEquals("Illegal file name. Must start with schedule keyword.", exc.getMessage());
    }
    
    //shortContent: a scheduleShort.txt fájlnévvel meghívott Schedule kiváltja az IllegalStateException kivételt, ahol a fájlban egyetlen sor van, amelynek 1 a tartalma   
    @Test
    void shortContentTest(){
        IllegalStateException exc =
            assertThrows(IllegalStateException.class,
                () -> {
                    new Schedule("school/test/scheduleShort.txt");
                });
        assertEquals("Not enough days provided.", exc.getMessage());
    }
}