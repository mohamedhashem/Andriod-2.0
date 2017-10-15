package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditName extends AppCompatActivity implements View.OnClickListener {

    private Button buttonUpdateName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_name);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttonUpdateName=(Button)findViewById(R.id.buttonUpdateName);
    }
    @Override
    public void onClick(View view)
    {
        //if(view==buttonUpdateName)
    }
}
