import java.util.*;
import java.lang.reflect.*;

public class Injector {
    private List<Object> dependencies;

    Injector() {
        dependencies = new ArrayList<>();
    }

    // Menerima sebuah definisi dependencies
    // yang berupa sebuah instansiasi kelas
    // Catatan: Injector bisa menampung lebih dari 1 dependency,
    //          jadi injector bisa menginject banyak sekaligus.
    //          Jika ada 2 objek dengan kelas yang sama,
    //          inject dengan object terakhir yang di add ke daftar dependency
    void addDependencies(Object object) {
        dependencies.removeIf(dependency -> (dependency.getClass() == object.getClass()));

        dependencies.add(object);
    }

    /*
    Menginjeksi dependencies yang telah dibuat ke dalam objek
    Injeksi dilakukan dengan mengacu pada dependencies yang ditambah
    pada method addDependencies.

    Setiap field di object yang diinject, bila kelasnya
    sudah ditambahkan sebagai dependency, maka akan diset sebagai
    object yang sudah di add didependency.
    */
    void inject(Object object) throws Exception {
        Class objectClass = object.getClass();
        for (Field field : objectClass.getDeclaredFields()) {
            field.setAccessible(true);
            for (Object dependency : dependencies) {
                if (field.getType() == dependency.getClass()) {
                    field.set(object, dependency);
                    break;
                }
            }
        }
    }
}