package GradeDisplayer;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
 * Only the GradeDisplayer class is developed, others are not. 
 * So we create the mock to test the GradeDisplayer is okay. 
 * ==> Please see the report/index.html
 */
public class GadeDisplayerTest {
	GradeDB db;
	GradeCollector gradeCollector;
	GradeSorter gradeSorter;
	int classID;

	@BeforeEach
	public void setup() {
		classID = 1;
		int[][] mockClass01DB = { { 90, 70, 80 }, { 100, 60, 70 }, { 50, 20, 30 } };
		int[] mockGrade = { 80, 50, 60 };
		int[] sortedGrade = { 50, 60, 80 };

		db = mock(GradeDB.class);
		gradeCollector = mock(GradeCollector.class);
		gradeSorter = mock(GradeSorter.class);

		when(db.getGrade(1)).thenReturn(mockClass01DB);
		when(gradeCollector.getGradeAverage(01)).thenReturn(mockGrade);
		when(gradeSorter.sort(mockGrade)).thenReturn(sortedGrade);
	}

	@Test
	public void test() {
		GradeDisplayer display = new GradeDisplayer(db, gradeCollector, gradeSorter);
		display.setClassID(classID);
		display.go();
	}
}	