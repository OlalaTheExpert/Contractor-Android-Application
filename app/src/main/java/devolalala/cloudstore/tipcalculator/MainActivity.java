package devolalala.cloudstore.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    EditText laborCost;
    EditText materialcost;
    TextView textViewsubtotal;
    TextView textViewTotal;
    TextView textViewTax;
    Button btncalculate;

    double lCost,mCost,sum, tax, total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        laborCost = (EditText)findViewById(R.id.laborCost);
        materialcost = (EditText)findViewById(R.id.materialcost);
        textViewsubtotal = (TextView)findViewById(R.id.textViewsubtotal);
        textViewTotal = (TextView)findViewById(R.id.textViewTotal);
        textViewTax = (TextView)findViewById(R.id.textViewTax);
        btncalculate = (Button)findViewById(R.id.btncalculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                lCost = Double.parseDouble(laborCost.getText().toString());
                mCost = Double.parseDouble(materialcost.getText().toString());
                sum = lCost + mCost;
                tax = sum * (0.05);
                total=sum-tax;
                textViewsubtotal.setText(Double.toString(sum));
                textViewTax.setText(Double.toString(tax));
                textViewTotal.setText(Double.toString(total));
            }
        });
 }


}