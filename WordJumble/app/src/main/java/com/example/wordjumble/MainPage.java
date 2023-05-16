package com.example.wordjumble;

import android.app.Dialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainPage extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,play_again;
    private String textWord,textClue;
    private String temp1="",temp2="";
    private TextView gb;
    private ArrayList<Character> elements = new ArrayList<>();
    private int index,lives=3;
    private Button reset,check;
    private ImageView info,heart1,heart2,heart3;
    int score = 0;

    public int highscore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.gamemusicsfx);
        music.start();

        //Transferring strings from MainActivity
        Intent i = getIntent();
        textWord = i.getStringExtra("str1");
        textClue = i.getStringExtra("str2");

        int i1 = 0;

        while(i1<textWord.length()){
            elements.add(textWord.charAt(i1));
            i1++;
        }
        while(i1<16){
            Random rand = new Random();
            char alpha = (char) (rand.nextInt(26)+'a');
            elements.add(alpha);
            i1++;
        }

        Collections.shuffle(elements);
        Assign();

        gb.setText(temp1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                inputLetter(b1);b1.setClickable(false);
                b1.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b1.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b2);b2.setClickable(false);
                b2.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b2.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b3);b3.setClickable(false);
                b3.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b3.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b4);b4.setClickable(false);
                b4.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b4.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b5);b5.setClickable(false);
                b5.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b5.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b6);b6.setClickable(false);
                b6.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b6.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();}
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b7);b7.setClickable(false);
                b7.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b7.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b8);b8.setClickable(false);
                b8.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b8.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();}
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b9);b9.setClickable(false);
                b9.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b9.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b10);b10.setClickable(false);
                b10.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b10.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b11);b11.setClickable(false);
                b11.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b11.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();}
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b12);b12.setClickable(false);
                b12.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b12.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();}
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b13);b13.setClickable(false);
                b13.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b13.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();}
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b14);b14.setClickable(false);
                b14.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b14.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();}
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b15);b15.setClickable(false);
                b15.setBackgroundResource(R.drawable.clicked);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b15.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {inputLetter(b16);b16.setClickable(false);
                b16.setBackgroundResource(R.drawable.clicked);
                AnimationUtils.loadAnimation(MainPage.this, R.anim.fade);
                Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
                b16.startAnimation(animation1);
                MediaPlayer music = MediaPlayer.create(MainPage.this, R.raw.interfacesfx);
                music.start();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainPage.this, "Letters have been shuffled", Toast.LENGTH_SHORT).show();
                temp1 = "";
                for (int a=0;a<textWord.length();a++){temp1=temp1+"_ ";}
                gb.setText(temp1);
                selectUnselect();
                bgchange(b1);
                bgchange(b2);
                bgchange(b3);
                bgchange(b4);
                bgchange(b5);
                bgchange(b6);
                bgchange(b7);
                bgchange(b8);
                bgchange(b9);
                bgchange(b10);
                bgchange(b11);
                bgchange(b12);
                bgchange(b13);
                bgchange(b14);
                bgchange(b15);
                bgchange(b16);
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showCustomDialog();
                bgchange(b1);
                bgchange(b2);
                bgchange(b3);
                bgchange(b4);
                bgchange(b5);
                bgchange(b6);
                bgchange(b7);
                bgchange(b8);
                bgchange(b9);
                bgchange(b10);
                bgchange(b11);
                bgchange(b12);
                bgchange(b13);
                bgchange(b14);
                bgchange(b15);
                bgchange(b16);
            }
        });
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreCount();
            }
        });
    }

    private void bgchange(Button b){
        b.setBackgroundResource(R.drawable.button);
    }

    private void scoreCount() {

        temp2=temp1;
        while(temp2.contains(" ")){
            temp2=temp2.replace(" ","");
        }
        if(!(temp1.contains("_"))){
            if(temp2.equals(textWord.toLowerCase())){
                Toast.makeText(this, "Your Guess is correct", Toast.LENGTH_SHORT).show();
                if(lives==3){
                    score=score+500;
                }
                else if(lives==2){
                    score+=300;
                }
                else{
                    score+=200;
                }
                showDialog1(score);
            }
            else if(lives==3){
                Collections.shuffle(elements);
                change();
                heart3.setImageResource(R.drawable.ic_grayheart_foreground);
                Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                lives-=1;
            }
            else if(lives==2){
                Collections.shuffle(elements);
                change();
                Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                heart2.setImageResource(R.drawable.ic_grayheart_foreground);
                lives-=1;
            }
            else if(lives==1) {
                Collections.shuffle(elements);
                change();
                Toast.makeText(this, "Your guess is wrong", Toast.LENGTH_SHORT).show();
                heart1.setImageResource(R.drawable.ic_grayheart_foreground);
                lives -= 1;
                showDialog1(score);
            }
        }else{
            Toast.makeText(this, "Enter the right number of characters", Toast.LENGTH_SHORT).show();
        }

    }

    public void PlayBackgroundSound(View v) {
        Intent intent = new Intent(MainPage.this, bgm.class);
        startService(intent);
    }
    private void change() {
        b1.setText(elements.get(0).toString());b1.setClickable(true);
        b2.setText(elements.get(1).toString());b2.setClickable(true);
        b3.setText(elements.get(2).toString());b3.setClickable(true);
        b4.setText(elements.get(3).toString());b4.setClickable(true);
        b5.setText(elements.get(4).toString());b5.setClickable(true);
        b6.setText(elements.get(5).toString());b6.setClickable(true);
        b7.setText(elements.get(6).toString());b7.setClickable(true);
        b8.setText(elements.get(7).toString());b8.setClickable(true);
        b9.setText(elements.get(8).toString());b9.setClickable(true);
        b10.setText(elements.get(9).toString());b10.setClickable(true);
        b11.setText(elements.get(10).toString());b11.setClickable(true);
        b12.setText(elements.get(11).toString());b12.setClickable(true);
        b13.setText(elements.get(12).toString());b13.setClickable(true);
        b14.setText(elements.get(13).toString());b14.setClickable(true);
        b15.setText(elements.get(14).toString());b15.setClickable(true);
        b16.setText(elements.get(15).toString());b16.setClickable(true);
        temp1 = "";
        for (int k=0;k<textWord.length();k++){
            temp1 = temp1 + "_ ";
            gb.setText(temp1);
        }
        score = 0;
    }

    private void inputLetter(Button txt){
        if(temp1.contains("_ ")){
            index = temp1.indexOf('_');
            temp1 = temp1.substring(0,index) + txt.getText().toString() + temp1.substring(index+1,temp1.length());
            gb.setText(temp1);
        }
        else{
            Toast.makeText(this, "MAX LENGTH", Toast.LENGTH_SHORT).show();
        }
    }

    public void showDialog1(int score){
        final Dialog dialog = new Dialog(MainPage.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.popup1);
        TextView txt = dialog.findViewById(R.id.popup1);
        txt.setText("Your Score : "+Integer.toString(score));
        Button btn1 = dialog.findViewById(R.id.home);
        Button btn2 = dialog.findViewById(R.id.playagain);
        dialog.show();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainPage.this,MainActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playAgain();
                dialog.dismiss();
            }
        });

    }

    private void showCustomDialog(){
        final Dialog dialog = new Dialog(MainPage.this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.popup);
        TextView txt = dialog.findViewById(R.id.popup);
        Button btn = dialog.findViewById(R.id.okay);
        txt.setText(textClue);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }

    private void Assign(){
        //Assigning values for all the buttons
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        check = (Button) findViewById(R.id.check);
        reset = (Button) findViewById(R.id.reset);
        play_again = (Button) findViewById(R.id.playagain);

        info = findViewById(R.id.information);
        heart1 = findViewById(R.id.hrt1);
        heart2 = findViewById(R.id.hrt2);
        heart3 = findViewById(R.id.hrt3);
        gb = findViewById(R.id.guessbox);
        change();
    }

    private void selectUnselect(){
        b1.setClickable(true);
        b2.setClickable(true);
        b3.setClickable(true);
        b4.setClickable(true);
        b5.setClickable(true);
        b6.setClickable(true);
        b7.setClickable(true);
        b8.setClickable(true);
        b9.setClickable(true);
        b10.setClickable(true);
        b11.setClickable(true);
        b12.setClickable(true);
        b13.setClickable(true);
        b14.setClickable(true);
        b15.setClickable(true);
        b16.setClickable(true);
    }

    private void playAgain(){
        lives = 3;
        heart1.setImageResource(R.drawable.ic_yellowheart_background);
        heart2.setImageResource(R.drawable.ic_yellowheart_background);
        heart3.setImageResource(R.drawable.ic_yellowheart_background);
        change();
    }

}

