package study.vv.random18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }
    public void plus(View v) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.out);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        result.setText(Integer.parseInt(snum1) + Integer.parseInt(snum2) + "");
    }

    public void minus(View view) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.out);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        result.setText(Integer.parseInt(snum1) - Integer.parseInt(snum2) + "");
    }

    public void multiplication(View view) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.out);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        result.setText(Integer.parseInt(snum1) * Integer.parseInt(snum2) + "");
    }

    public void division(View view) {
        EditText num1 = (EditText) findViewById(R.id.num1);
        EditText num2 = (EditText) findViewById(R.id.num2);
        TextView result = (TextView) findViewById(R.id.out);
        String snum1 = num1.getText().toString();
        String snum2 = num2.getText().toString();
        result.setText(Integer.parseInt(snum1) / Integer.parseInt(snum2) + "");
    }
}
