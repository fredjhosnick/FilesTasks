package filestasks;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Copy {

	public static void copyfile(File original, File copy) {
		if (original == null || copy == null) {
			throw new IllegalArgumentException();
		}

		try {
			InputStream in = new FileInputStream(original);
			OutputStream out = new FileOutputStream(copy);

			byte[] buffer = new byte[1024];
			int dates;

			for (; (dates = in.read(buffer)) > 0;) {

				out.write(buffer, 0, dates);

			}
			in.close();
			out.close();

			System.out.println("Is coping " + original.toString());
		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	public static void copyFolder(File folderoriginal, File foldercopy, FileFilter mff) throws IOException {
		if (folderoriginal == null || foldercopy == null || mff == null) {
			throw new IllegalArgumentException("null file pointer");
		}

		File[] files = folderoriginal.listFiles(mff);
		for (File file : files) {
			copyfile(file, new File(foldercopy, file.getName()));
		}

	}

}
