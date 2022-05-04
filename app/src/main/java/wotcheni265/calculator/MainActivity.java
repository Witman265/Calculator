package wotcheni265.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText n1,n2;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        result = findViewById(R.id.reult);
    }

    public void add(View view) {
        double num1 = Double.parseDouble((n1.getText().toString()));
        double num2 = Double.parseDouble((n2.getText().toString()));

        int sum = (int)(num1 + num2);
        result.setText(String.valueOf(sum));
    }
}