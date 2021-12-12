package GradeDisplayer;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

/*
 * GradeCollector is developed and integrated, we need the mock for GradeDB
 */
public class AverageTest {

	@Test
	public void test1() {
		int[][] mockClass01DB = { { 90, 70, 80 }, { 20, 60, 70 }, { 100, 50, 30 } };
		GradeDB db = mock(GradeDB.class);
		GradeCollector gradeCollector = new GCollectorImpl();
		gradeCollector.setDB(db);

		when(db.getGrade(1)).thenReturn(mockClass01DB);

		int[] avg = gradeCollector.getGradeAverage(01);
		int[] expectedGrade = { 80, 50, 60 };

		assertArrayEquals(expectedGrade, avg);
	}

	@Test
	public void test2() {
		int[][] mockClass01DB = { { 0, 0, 0 }, { 1, 2, 3 }, { 10, 20, 30 } };
		GradeDB db = mock(GradeDB.class);
		GradeCollector gradeCollector = new GCollectorImpl();
		gradeCollector.setDB(db);

		when(db.getGrade(1)).thenReturn(mockClass01DB);

		int[] avg = gradeCollector.getGradeAverage(01);
		int[] expectedGrade = { 0, 2, 20 };

		assertArrayEquals(expectedGrade, avg);
	}

}