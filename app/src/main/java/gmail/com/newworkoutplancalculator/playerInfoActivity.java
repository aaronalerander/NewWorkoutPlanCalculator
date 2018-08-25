package gmail.com.newworkoutplancalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class playerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_info);

        //BMR for Men = 66.47 + (13.7 * weight [kg]) + (5 * size [cm]) − (6.8 * age [years])

        Button playerCalculateBtn = (Button) findViewById(R.id.playerCalculateBtn);
        playerCalculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText pAgeEditText = (EditText) findViewById(R.id.pAgeEditText);
                EditText pWeightEditText = (EditText) findViewById(R.id.pWeightEditText);
                EditText pHeightEditText = (EditText) findViewById(R.id.pHeightEditText);
                TextView pbmrTextView = (TextView) findViewById(R.id.pbmrTextView);


                double pAge = Integer.parseInt(pAgeEditText.getText().toString());
                double pWeight = Integer.parseInt(pWeightEditText.getText().toString());
                double pHeight = Integer.parseInt(pHeightEditText.getText().toString());
                double pResult = 66.47 + (13.7 * pWeight) + (5 * pHeight) - (6.8 * pAge);
                pbmrTextView.setText(pResult + "");
            }
        });
    }
}
