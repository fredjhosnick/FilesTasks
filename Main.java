package filestasks;

import java.io.File;
import java.io.FileFilter;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileFilter mff = new MyFileFilter("doc");

		File folderoriginal = new File("folderoriginal");

		File foldercopy = new File("foldercopy");

		try {
			Copy.copyFolder(folderoriginal, foldercopy, mff);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		JOptionPane.showMessageDialog(null, "Copia finalizada", null, JOptionPane.INFORMATION_MESSAGE);

	}

}
