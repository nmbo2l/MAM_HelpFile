package mixtape_mam.mainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class chords extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chords);
    }

    // chords to sharp chords
    public void gotoSharp(View v) {
        Intent intent = new Intent(chords.this, sharp.class);
        startActivity(intent);
    }

    // chords to notes
    public void gotoNotes(View v) {
        Intent intent = new Intent(chords.this, notes.class);
        startActivity(intent);
    }

    // notes to main menu
    public void gotoMain(View v) {
        Intent intent = new Intent(chords.this, MainActivity.class);
        startActivity(intent);
    }
}
