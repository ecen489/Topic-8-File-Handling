package edu.tamu.ece.t8_files;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] words = new String[4];

        Scanner scan = new Scanner(getResources().openRawResource(R.raw.words));

        int i = 0;
        while(scan.hasNextLine()){
            String line=scan.nextLine();
            words[i]=line;
            i++;
        }
        scan.close();

        //attach refeerence list to mylist
        ListView list = (ListView) findViewById(R.id.mylist);

        //Create adapter and attach to WORDS
        ArrayAdapter<String> myadapter= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,words);

        //Use myadapter as input to list
        list.setAdapter(myadapter);
    }
}