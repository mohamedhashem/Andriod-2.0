package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditEmail extends AppCompatActivity implements View.OnClickListener{
    private Button  buttonUpdateEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_email);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttonUpdateEmail=(Button)findViewById(R.id.buttonUpdateEmail);
    }
    @Override
    public void onClick(View view)
    {
        //if(view==buttonUpdateEmail)
    }
}
