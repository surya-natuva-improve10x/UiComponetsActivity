package com.improve10x.uicomponentsactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;

public class MixedwidgetsActivity extends AppCompatActivity {
    Button submitBtn;
    Button seekbarBtn;
    SeekBar seekbarSb;
    TextView progressTxt;
    RatingBar ratingRb;
    Button ratingBtn ;
    Button datepickerBtn;
    DatePicker datePickerDp;
    TimePicker timePickerTp;
    Button timepickerBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mixedwidgets);
        handleText();
        handleSeekbarBtn();
        handleSumbitBtn();
        handleRatingbarBtn();
        handleDateBtn();
        handleTimeBtn();
        handleHideComponets();
    }

    private void handleHideComponets() {
        seekbarSb.setVisibility(View.GONE);
        ratingRb.setVisibility(View.GONE);
        submitBtn.setVisibility(View.GONE);
        progressTxt.setVisibility(View.GONE);
        timePickerTp.setVisibility(View.GONE);
        datePickerDp.setVisibility(View.GONE);
    }

    private void handleTimeBtn() {
        timepickerBtn.setOnClickListener(v -> {
            timePickerTp.setIs24HourView(true);
            timePickerTp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            ratingRb.setVisibility(View.GONE);
            datePickerDp.setVisibility(View.GONE);

        });
    }
    private void handleRatingbarBtn(){
        ratingBtn.setOnClickListener(view -> {
            ratingRb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            datePickerDp.setVisibility(View.GONE);
            timePickerTp.setVisibility(View.GONE);

        });
    }

    private void handleDateBtn() {
        datepickerBtn.setOnClickListener(v -> {
            datePickerDp.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            seekbarSb.setVisibility(View.GONE);
            ratingRb.setVisibility(View.GONE);
            timePickerTp.setVisibility(View.GONE);
        });
    }

    private void handleSumbitBtn() {
        submitBtn.setOnClickListener(v -> {
           if (seekbarSb.getVisibility()== View.VISIBLE){
               int progress = seekbarSb.getProgress();
               progressTxt.setText(progress + " ");
           }
           if(ratingRb.getVisibility() == View.VISIBLE){
               String rating = String.valueOf(ratingRb.getRating());
               progressTxt.setText(rating);
           }
           if(datePickerDp.isShown() == true){
               String date = String.valueOf(datePickerDp.getDayOfMonth());
               String month = String.valueOf(datePickerDp.getDayOfMonth()+1);
               String year = String.valueOf(datePickerDp.getYear());
               progressTxt.setText(date  + " :" + month + ": " +year);
           }
           if (timePickerTp.isShown()== true){
               String hour = String.valueOf(timePickerTp.getCurrentHour());
               String minutes = String.valueOf(timePickerTp.getCurrentMinute());
               progressTxt.setText(hour + ": " + minutes);
           }

        });

    }

    private void handleSeekbarBtn() {
        seekbarBtn.setOnClickListener(v -> {
            seekbarSb.setVisibility(View.VISIBLE);
            submitBtn.setVisibility(View.VISIBLE);
            progressTxt.setText("");
            progressTxt.setVisibility(View.VISIBLE);
            ratingRb.setVisibility(View.GONE);
            datePickerDp.setVisibility(View.GONE);
            timePickerTp.setVisibility(View.GONE);
        });
    }


    private void handleText() {
        seekbarBtn = findViewById(R.id.seekbar_btn);
        seekbarSb = findViewById(R.id.seekbar_sb);
        submitBtn = findViewById(R.id.sumbit_btn);
        progressTxt = findViewById(R.id.progress_txt);
        ratingRb = findViewById(R.id.ratingbar_rb);
        ratingBtn = findViewById(R.id.ratingbar_btn);
        datePickerDp = findViewById(R.id.datepicker_dp);
        datepickerBtn = findViewById(R.id.datepicker_btn);
        timepickerBtn = findViewById(R.id.timepicker_btn);
        timePickerTp = findViewById(R.id.timepicker_tp);



    }
}


