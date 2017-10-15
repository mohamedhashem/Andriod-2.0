package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class welcome extends AppCompatActivity implements View.OnClickListener{
    private Button buttonRegNext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonRegNext =(Button) findViewById(R.id.buttonRegNext);

    }
    @Override
    public void onClick(View view)
    {
        if (view==buttonRegNext)
        {
            startActivity(new Intent(this,MainActivity.class));
        }

    }
}
