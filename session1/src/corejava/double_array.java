package corejava;

public class double_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String table[][] = new String[3][2];
table[0][0]	= "chacha";	
table[0][1]	= "facha";			
table[1][0]	= "kacha";			
table[1][1]	= "dacha";			
table[2][0]	= "sacha";	
table[2][1]	= "nacha";
int rownum=table.length;
int columnum=table[0].length;

for(int i=0;i<rownum;i++) {
	for (int j =0; j<columnum; j++) {
		System.out.println(table[i][j]);
	}
}

	}

}
