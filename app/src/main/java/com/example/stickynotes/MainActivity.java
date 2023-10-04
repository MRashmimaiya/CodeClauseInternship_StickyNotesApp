package com.example.stickynotes;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNote;
    private Button buttonAddNote;
    private LinearLayout linearLayoutNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNote = findViewById(R.id.editTextNote);
        buttonAddNote = findViewById(R.id.buttonAddNote);
        linearLayoutNotes = findViewById(R.id.linearLayoutNotes);

        buttonAddNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String noteText = editTextNote.getText().toString().trim();
                if (!noteText.isEmpty()) {
                    addNoteToLayout(noteText);
                    editTextNote.setText("");
                }
            }
        });
    }

    private void addNoteToLayout(String noteText) {
        TextView textViewNote = new TextView(this);
        textViewNote.setText(noteText);
        linearLayoutNotes.addView(textViewNote);
    }
}
