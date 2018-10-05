package com.markm.criticalwakeup;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class EditAlarm extends AppCompatActivity {

    EditText aName;
    TextView sound;
    TextView crit;
    Button create;
    Spinner selSound;
    Spinner selCrit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edi_alarm);

        aName = findViewById(R.id.alarmName);

        sound = findViewById(R.id.sound);
        sound.setText("Sound:");

        crit = findViewById(R.id.level);
        crit.setText("Level:");

        create = findViewById(R.id.create);
        create.setText("Create Alarm");
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back();
            }
        });

        selSound = findViewById(R.id.soundSelect);
        ArrayAdapter<CharSequence> soundList = ArrayAdapter.createFromResource(EditAlarm.this, R.array.critLevel, R.layout.activity_edi_alarm);
        soundList.setDropDownViewResource(R.layout.activity_edi_alarm);
        selSound.setAdapter(soundList);

        selCrit = findViewById(R.id.critSelect);
        ArrayAdapter<CharSequence> critList = ArrayAdapter.createFromResource(EditAlarm.this, R.array.critLevel, R.layout.activity_edi_alarm);
        critList.setDropDownViewResource(R.layout.activity_edi_alarm);
        selCrit.setAdapter(critList);

    }

    public void back(){
        finish();
    }
}
