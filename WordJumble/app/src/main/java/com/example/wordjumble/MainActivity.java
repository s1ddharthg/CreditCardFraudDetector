package com.example.wordjumble;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private EditText word, clue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        word = findViewById(R.id.editWord);
        clue = findViewById(R.id.editClue);
        button = (Button) findViewById(R.id.startButton);
        MediaPlayer music = MediaPlayer.create(MainActivity.this, R.raw.gamemusicsfx);
        music.start();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (word.getText().toString().length() > 0 && clue.getText().toString().length() > 0) {
                    openMainPage();
                } else {
                    Toast.makeText(MainActivity.this, "Enter word and clue", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void openMainPage() {
        Bundle bundle = new Bundle();
        bundle.putString("str1", word.toString());
        bundle.putString("str2", clue.toString());
        Intent intent = new Intent(MainActivity.this, MainPage.class);
        intent.putExtra("str1", word.getText().toString());
        intent.putExtra("str2", clue.getText().toString());
        startActivity(intent);

    }

    public void PlayBackgroundSound(View v) {
        Intent intent = new Intent(MainActivity.this, bgm.class);
        startService(intent);
    }
}