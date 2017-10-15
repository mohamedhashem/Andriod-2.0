package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditPassword extends AppCompatActivity  implements View.OnClickListener{

    private Button  buttonUpdatePassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_password);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonUpdatePassword=(Button)findViewById(R.id.buttonUpdatePassword);
    }

    @Override
    public void onClick(View view)
    {

        //if(view==buttonUpdatePassword)
    }
}
