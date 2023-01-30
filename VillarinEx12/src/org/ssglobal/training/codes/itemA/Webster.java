package org.ssglobal.training.codes.itemA;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Webster {
	
	private List<String> wordsList = new ArrayList<>();

    private void transferWordToList() {
        try {
            FileReader fr = new FileReader("./src/files/war_and_peace.txt");
            BufferedReader br = new BufferedReader(fr);

            String line = br.readLine();
            while (!(line == null)) {
            	wordsList.add(line);
                line = br.readLine();
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getUniqueWords(String words) {
        transferWordToList();
        int uniqueWordsCounter = 0;

        for (String word : wordsList) {
            if (word.contains(words)) {
                uniqueWordsCounter++;
            }
        }
        return uniqueWordsCounter;
    }
}
