package net.simplifiedlearning.simplifiedcoding;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EditProfile extends AppCompatActivity implements View.OnClickListener {

    TextView editfirstname, editlastname, editEmail,editPhone,editAddress,editAge,editPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_profile);



        editfirstname = (TextView) findViewById(R.id.editfirstname);
        editlastname = (TextView) findViewById(R.id.editlastname);
        editEmail = (TextView) findViewById(R.id.editEmail);
        editPhone = (TextView) findViewById(R.id.editPhone);
        editAddress = (TextView) findViewById(R.id.editAddress);
        editPassword=(TextView)findViewById(R.id.editPassword);
        editAge= (TextView) findViewById(R.id.editAge);


        //getting the current user
        User user = SharedPrefManager.getInstance(this).getUser();

        //setting the values to the textviews
        editfirstname.setText(user.getUsername());
        editlastname.setText(user.getLast_name());
        editEmail.setText(user.getEmail());
        editPhone.setText(user.getPhone());
        editAge.setText(user.getAge());
        editAddress.setText(user.getAddress());

    }
    @Override
    public void onClick(View view)
    {
        if(view==editfirstname)
            startActivity(new Intent(getApplicationContext(),EditName.class));
        if(view==editlastname)
            startActivity(new Intent(getApplicationContext(),EditName.class));
        if(view==editEmail)
            startActivity(new Intent(getApplicationContext(),EditEmail.class));
        if(view==editPassword)
            startActivity(new Intent(getApplicationContext(),EditPassword.class));
        if(view==editPhone)
            startActivity(new Intent(getApplicationContext(),EditPhone.class));
        if(view==editAddress)
            startActivity(new Intent(getApplicationContext(),EditAddress.class));
        if(view==editAge)
            startActivity(new Intent(getApplicationContext(),EditAge.class));
    }
}
