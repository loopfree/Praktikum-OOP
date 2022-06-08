class ListMap implements Map {

    private ListMapEntry first;

    public ListMap() {
        first = null;
    }

    /**
     * Menambahkan (key, value) ke dalam map
     * Melakukan overwrite jika sudah terdapat elemen dengan key yang sama.
     */
    public void set(String key, String value) {
        if(first == null) {
            first = new ListMapEntry(key, value);
            return;
        }
        ListMapEntry temp = first;
        boolean found = false;
        while(temp.getNext() != null) {
            if(temp.getKey().equals(key)) {
                found = true;
                break;
            }
            temp = temp.getNext();
        }
        if(found) {
            temp.setValue(value);
        } else {
            temp.setNext(new ListMapEntry(key, value));
        }
    }

    /**
     * Mengembalikan value yang tersimpan untuk key tertentu pada map
     * Mengembalikan NULL apabila map tidak mengandung key masukan.
     */
    public String get(String key) {
        ListMapEntry temp = first;
        while(temp != null) {
            if(temp.getKey().equals(key)) {
                return temp.getValue();
            }
            temp = temp.getNext();
        }
        return null;
    }

    /**
     * Menghitung jumlah elemen yang ada pada map
     */
    public int size() {
        int count = 0;
        ListMapEntry temp = first;
        while(temp != null) {
            temp = temp.getNext();
            count++;
        }
        return count;
    } 
}