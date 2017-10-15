package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewToDo;
    private Spinner spinner;
    //For adding data we need adapter
    ArrayAdapter<CharSequence> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //if the user is not logged in
        //starting the login activity
        if (!SharedPrefManager.getInstance(this).isLoggedIn()) {
            finish();
            startActivity(new Intent(this, LoginActivity.class));
        }

        //DECLARE TEXTVIEW OF WHAT ARE YOU GOING TO DO
        textViewToDo = (TextView) findViewById(R.id.textViewToDo);
        //initialize the spinner
        spinner = (Spinner) findViewById(R.id.spinner);
        //initialize array adapter
        adapter = ArrayAdapter.createFromResource(this, R.array.Sensor_names, R.layout.support_simple_spinner_dropdown_item);
        //specify the layout for each droplist spinner
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //add this adapter for this spinner
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 0)
                    startActivity(new Intent(ProfileActivity.this, AltraTop.class));
                if (i == 1)
                    startActivity(new Intent(ProfileActivity.this, AltraBottom.class));
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        //when the user presses logout button
        //calling the logout method
        /*findViewById(R.id.buttonLogout).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                SharedPrefManager.getInstance(getApplicationContext()).logout();
            }
        });*/
    }

    //DECLARE MENU BAR
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.exit,menu);
        return super.onCreateOptionsMenu(menu);
    }

    //FOR CHOOSE WHAT TO DO WHEN SELECT LOGOUT ICON AND SETTING ICON
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.Exitapp:
                //SharedPrefManager.getInstance(this).logout();
                finish();
                SharedPrefManager.getInstance(getApplicationContext()).logout();
                break;
            case R.id.Setting:
                //  Toast.makeText(this, "You clicked settings", Toast.LENGTH_LONG).show();
                startActivity(new Intent(this,Setting.class));
                break;
        }
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view == textViewToDo)
            startActivity(new Intent(this, ToDoList.class));
    }

}