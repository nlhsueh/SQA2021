
package GradeDisplayer;

class GradeDBImpl implements GradeDB {
	public int[][] getGrade(int classID) {
		int[][] grades;

		if (classID == 1) {
 			grades = new int[][] { { 90, 70, 80 }, { 100, 60, 70 }, { 50, 20, 30 } };
		}
		else if (classID == 2) {
 			grades = new int[][]  { { 100, 70, 100 }, { 100, 20, 90 }, { 20, 20, 30 } };
		}
		else {
			System.out.print("class ID ERROR");
		    grades = null;
		}
		return grades;
	}
}
