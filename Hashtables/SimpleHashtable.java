public class SimpleHashtable {

    private Car[] hashtable;

    public SimpleHashtable() {
        hashtable = new Car[10];
    }
    
    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void pushCar (String key, Car car) {
        int hashedKey = hashKey(key);

        if (hashtable[hashedKey] != null) {
            System.out.println("Sorry the specified key is already occupied");
        }

        else {
            hashtable[hashedKey] = car;
        }
    }

    public Car getCar (String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];
    }

    public void printHashtable() {
        for (int i = 0;i < hashtable.length;i++) {
            System.out.println(hashtable[i]);
        }
    }
}