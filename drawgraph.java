
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class drawgraph {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		try {
			FileWriter myWriter = new FileWriter("harmony.txt");
			myWriter.write("graph harmony {\n" + //
					"\tfontname=\"Helvetica,Arial,sans-serif\"\n" + //
					"\tnode [fontname=\"Helvetica,Arial,sans-serif\"]\n" + //
					"\tedge [fontname=\"Helvetica,Arial,sans-serif\"]\n" + //
					"\trankdir=LR;\n" + //
					"\tnode [shape = circle];");
			for (int i = 0; i < m; i++) {
				int u = s.nextInt();
				int v = s.nextInt();
				String c;
				if (s.nextInt() == 1) {

					c = "[label=\"conflict\",fontcolor=\"red\",color=\"red\"]";
				} else {

					c = "[label=\"harmony\",fontcolor=\"blue\",color=\"blue\"]";
				}
				myWriter.write("\"" + u + "\" -- \"" + v + "\"" + c + ";\n");
			}
			myWriter.write("}");
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
