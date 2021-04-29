package hu.nive.ujratervezes.io.phonebook;

import java.io.*;
import java.util.Map;

public class Phonebook {

    public void exportPhonebook(Map<String, String> contacts, String output) {
        try {
            if (output == null || contacts == null)
                throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }
        File file = new File(output);
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                String name = entry.getKey();
                String phoneNumber = entry.getValue();
                String line = name + ": " + phoneNumber;
                bufferedWriter.write(line + "\n");
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}