package bd.edu.nww.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String userName;
    TextView tvShowName;
    Button btn_login;
    EditText edtUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = findViewById(R.id.edt_userName);
        btn_login = findViewById(R.id.btn_login);
        tvShowName = findViewById(R.id.textView_showName);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userName = edtUserName.getText().toString();
                tvShowName.setText(userName);
                Toast.makeText(MainActivity.this, userName, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
