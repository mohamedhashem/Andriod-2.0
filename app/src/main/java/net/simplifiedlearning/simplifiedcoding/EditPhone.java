package net.simplifiedlearning.simplifiedcoding;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditPhone extends AppCompatActivity implements View.OnClickListener {

    private Button buttonUpdatePhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_phone);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        buttonUpdatePhone=(Button)findViewById(R.id.buttonUpdatePhone);
    }

    @Override
    public void onClick(View view)
    {

        //if(view==buttonUpdatePhone)
    }
}
