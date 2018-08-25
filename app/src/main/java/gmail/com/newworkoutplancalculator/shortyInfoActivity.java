package gmail.com.newworkoutplancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class shortyInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shorty_info);

        //BMR for Women = 655.1 + (9.6 * weight [kg]) + (1.8 * size [cm]) − (4.7 * age [years])

        Button shortyCalculateBtn = (Button) findViewById(R.id.shortyCalculateBtn);
        shortyCalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText sAgeEditText = (EditText) findViewById(R.id.sAgeEditText);
                EditText sWeightEditText = (EditText) findViewById(R.id.sWeightEditText);
                EditText sHeightEditText = (EditText) findViewById(R.id.sHeightEditText);
                TextView sbmrTextView = (TextView) findViewById(R.id.sbmrTextView);


                double sAge = Integer.parseInt(sAgeEditText.getText().toString());
                double sWeight = Integer.parseInt(sWeightEditText.getText().toString());
                double sHeight = Integer.parseInt(sHeightEditText.getText().toString());
                double sResult = 655.1 + (9.6 * sWeight) + (1.8 * sHeight) - (4.7 * sAge);
                sbmrTextView.setText(sResult + "");
    }

});}}
