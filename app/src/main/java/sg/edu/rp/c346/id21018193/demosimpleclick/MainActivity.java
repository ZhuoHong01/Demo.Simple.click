package sg.edu.rp.c346.id21018193.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        txt = findViewById(R.id.txt1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Handle button click event here
                String txt = txt1.getText().toString();
                Toast.makeText(MainActivity.this, "The Button has been clicked", Toast.LENGTH_SHORT).show();

            }
        });



    }


}