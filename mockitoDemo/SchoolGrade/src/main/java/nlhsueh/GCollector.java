package nlhsueh;

public class GCollector implements GradeCollector {
	GradeDB db;

	/* 
	Given a classID, return an array storing students' average
	*/
	public int[] getGradeAverage(int classID) {
		int[][] g = db.getGrade(classID);
		assert (g != null);
		int[] avg = new int[g.length];

		for (int x : avg)
			x = 0;

		for (int i = 0; i < g.length; i++) {
			for (int j = 0; j < g[i].length; j++) {
				avg[i] += g[i][j];
			}
			avg[i] = avg[i] / avg.length;
		}
		return avg;
	}

	public void setDB(GradeDB db) {
		this.db = db;
	}
}
