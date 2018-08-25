package gmail.com.newworkoutplancalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class genderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        //opens player info activity
        Button playerBtn = (Button)findViewById(R.id.playerBtn);
        playerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playerIntent = new Intent (getApplicationContext(), playerInfoActivity.class);
                startActivity(playerIntent);


            }
        });

        //opens shorty info activity
        Button shortyBtn = (Button)findViewById(R.id.shortyBtn);
        shortyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shortyIntent = new Intent (getApplicationContext(), shortyInfoActivity.class);
                startActivity(shortyIntent);
            }
        });
    }
}
