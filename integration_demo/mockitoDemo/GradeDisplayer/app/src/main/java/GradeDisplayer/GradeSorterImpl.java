
package GradeDisplayer;

class GradeSorterImpl implements GradeSorter {
	public int[] sort(int[] grade) {
		int len = grade.length;
		int r = len-1; //round

		for (int i=1; i <= r; i++) {
			for (int j = 0; j<len-i; j++) {
				if (grade[j]>grade[j+1]) {
					int temp = grade[j];
					grade[j] = grade[j+1];
					grade[j+1] = temp;
				}
			}	
		}
		return grade;
	}
}


