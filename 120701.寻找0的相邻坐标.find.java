package pac;

public class Findzero {
	void findZero(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_Zero("+i+","+j+")");
					return;
				}
			}
		}
	}
	
	void R_left(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_left("+i+","+(j-1)+")");
					return;
				}
			}
		}
	}
	
	void R_right(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_right("+i+","+(j+1)+")");
					return;
				}
			}
		}
	}
	
	void R_up(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_left("+(i-1)+","+j+")");
					return;
				}
			}
		}
	}
	
	void R_down(int array2d[][]){
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[i].length; j++) {
				if (array2d[i][j] == 0) {
					System.out.println("R_left("+(i+1)+","+j+")");
					return;
				}
			}
		}
	}
}
