package sg.edu.rp.c346.id21018193.demosimpleclick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText et;
    TextView tv;
    ToggleButton tbtn;
    RadioGroup rgGender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn1);
        et = findViewById(R.id.txt1);
        tv = findViewById(R.id.txtvw1);
        tbtn = findViewById(R.id.tbtn);
        rgGender = findViewById(R.id.rgroupgender);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Handle button click event here
                String txt = et.getText().toString();
                tv.setText(txt);

                Toast.makeText(MainActivity.this, txt, Toast.LENGTH_SHORT).show();

            }
        });

        tbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tbtn.isChecked()){
                    boolean isChecked;
                }
                else{
                    void setChecked = boolean checked;
                }
            }
        });

        rgGender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = et.getText().toString();
                int checkedRadioId = rgGender.getCheckedRadioButtonId();
                if(checkedRadioId == R.id.rbtn){
                    // Write the code when male selected

                }
                else{
                    // Write the code when female selected

                }
                tv.setText(txt);
            }
        });

    }


}