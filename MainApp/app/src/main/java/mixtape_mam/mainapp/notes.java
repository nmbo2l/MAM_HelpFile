package mixtape_mam.mainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class notes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
    }

    // notes to chords
    public void gotoChords(View v) {
        Intent intent = new Intent(notes.this, chords.class);
        startActivity(intent);
    }

    // notes to sharp chords
    public void gotoSharp(View v) {
        Intent intent = new Intent(notes.this, sharp.class);
        startActivity(intent);
    }

    // notes to main menu
    public void gotoMain(View v) {
        Intent intent = new Intent(notes.this, MainActivity.class);
        startActivity(intent);
    }
}
