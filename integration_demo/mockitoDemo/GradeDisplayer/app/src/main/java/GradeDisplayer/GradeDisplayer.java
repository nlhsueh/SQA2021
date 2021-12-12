package GradeDisplayer;

import java.util.Scanner;

public class GradeDisplayer {
	GradeDB db;
	GradeCollector gradeCollector;
	GradeSorter gradeSorter;
	int classID;

	public GradeDisplayer(GradeDB db, GradeCollector collector, GradeSorter sorter) {
		this.db = db;
		this.gradeCollector = collector;
		this.gradeSorter = sorter;
	}

	public void setClassID(int cid) {
		this.classID = cid;
	}

	/* 
	* Given a classID, print all students' average
	* and print the average sortly
	*/
	public void go() {
		int[] g = gradeCollector.getGradeAverage(classID);
		assert (g != null) : "g is null";

		int[] sortedGrade = gradeSorter.sort(g);
		// assert sortedGrade != null : "sortedGrade is null";

		System.out.println("Grade book of class " + classID);
		int std = 1;
		for (int x : sortedGrade) {
			System.out.println("Student" + std + ", average:" + x);
			std++;
		}
	}
}

// return the grade average for each student in the class classID
// the return array g[i] is the average grade of student i
interface GradeCollector {
	int[] getGradeAverage(int classID);

	void setDB(GradeDB db);
}

// the return array g[i][j] is the grade of student i in the subject j
interface GradeDB {
	int[][] getGrade(int classID);
}

// will return a new grade array, sorted in incremental order
interface GradeSorter {
	int[] sort(int[] grade);
}
