package GradeDisplayer;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.ArrayList;

/**
 Now the Sorted is implemented (GradeSorterImpl), we test it.
*/
public class SorterTest {

	@Test
	public void test1() {
		int[] avg = {20, 100, 89};

		// 以下兩行其實不需要（不需要 mock)
		GradeCollector gradeCollector = mock(GradeCollector.class);
		when(gradeCollector.getGradeAverage(01)).thenReturn(avg);

		GradeSorter gradeSorter = new GradeSorterImpl();
		int[] realSorted = gradeSorter.sort(avg);
		int[] expectedSorted = { 20, 89, 100 };

		assertArrayEquals(expectedSorted, realSorted);
	}

	@Test
	public void test2() {
		int[] avg = {100, 89, 20};

		GradeSorter gradeSorter = new GradeSorterImpl();
		int[] realSorted = gradeSorter.sort(avg);
		int[] expectedSorted = { 20, 89, 100 };

		assertArrayEquals(expectedSorted, realSorted);
	}

	@Test
	public void test3() {
		int[] avg = {20, 89, 100};

		GradeSorter gradeSorter = new GradeSorterImpl();
		int[] realSorted = gradeSorter.sort(avg);
		int[] expectedSorted = { 20, 89, 100 };

		assertArrayEquals(expectedSorted, realSorted);
	}

}