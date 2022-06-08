import java.lang.reflect.*;

public class LaptopTest {
	// Anda boleh menambahkan atribut yang diperlukan

	public Class<?> testClass;

	public LaptopTest(String className) {
		/**
		 * Memeriksa apakah ada kelas dengan nama className.
		 * Jika tidak, tuliskan "Tidak ada kelas dengan nama yang diberikan" (tanpa petik) ke layar
		 */
		try {
			Class<?> check = Class.forName(className);
			testClass = check;
		} catch(ClassNotFoundException e) {
			System.out.println("Tidak ada kelas dengan nama yang diberikan");
		}
	}

	public boolean testMethods() {
		Method[] checkMethod = testClass.getDeclaredMethods();
		if(checkMethod.length == 1) {
			if(!checkMethod[0].getName().equals("getRamSize")) {
				System.out.println("Nama method harus getRamSize");
				return false;
			}

			if(checkMethod[0].getReturnType() != Integer.class) {
				System.out.println("Tipe return method harus Integer");
				return false;
			}
		} else {
			System.out.println("Banyaknya method hanya boleh 1");
			return false;
		}
		return true;
		// Return true jika semua tes berhasil
		// Jika ada 1 yang salah, return false
	}

	public boolean testFields() {
		Field[] checkField = testClass.getDeclaredFields();
		if(checkField.length == 1) {
			if(!checkField[0].getName().equals("serialNumber")) {
				System.out.println("Nama field harus serialNumber");
				return false;
			}
			if(checkField[0].getType() != String.class) {
				System.out.println("Tipe field harus String");
				return false;
			}
		}else {
			System.out.println("Banyaknya method hanya boleh 1");
			return false;
		}
		// Return true jika semua tes berhasil
		// Jika ada 1 yang salah, return false
		return true;
	}
}