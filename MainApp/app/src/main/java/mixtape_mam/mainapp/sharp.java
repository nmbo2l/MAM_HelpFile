package mixtape_mam.mainapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class sharp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharp);
    }

    // sharp to chords
    public void gotoChords(View v) {
        Intent intent = new Intent(sharp.this, chords.class);
        startActivity(intent);
    }

    // sharp to notes
    public void gotoNotes(View v) {
        Intent intent = new Intent(sharp.this, notes.class);
        startActivity(intent);
    }

    // notes to main menu
    public void gotoMain(View v) {
        Intent intent = new Intent(sharp.this, MainActivity.class);
        startActivity(intent);
    }
}
