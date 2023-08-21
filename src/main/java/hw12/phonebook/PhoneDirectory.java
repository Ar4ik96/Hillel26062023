package hw12.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneDirectory {
    private List<Entry> entries;

    public PhoneDirectory() {
        entries = new ArrayList<>();
    }

    public void add(Entry entry) {
        entries.add(entry);
    }

    public Entry find(String name) {
        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                return entry;
            }
        }
        return null;
    }

    public List<Entry> findAll(String name) {
        List<Entry> foundEntries = new ArrayList<>();
        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                foundEntries.add(entry);
            }
        }
        return foundEntries.isEmpty() ? null : foundEntries;
    }
}