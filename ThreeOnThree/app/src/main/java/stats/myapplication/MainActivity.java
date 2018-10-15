package stats.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int current2PtAttempts = 0;
    int current2PtMade = 0;
    private final String TAG = "MainActivity class";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button fga2PlusT1P1 = (Button) findViewById(R.id.buttonFGA2PlusT1P1);
        fga2PlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGATotalT1P1);

            public void onClick(View v) {
                current2PtAttempts += 1;
                attemptsTV.setText(Integer.toString(current2PtAttempts));
            }
        });


        Button fga2MinusT1P1 = (Button) findViewById(R.id.buttonFGA2MinusT1P1);
        fga2MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGATotalT1P1);

            public void onClick(View v) {
                current2PtAttempts -= 1;
                attemptsTV.setText(Integer.toString(current2PtAttempts));
            }
        });

        Button fgm2PlusT1P1 = (Button) findViewById(R.id.buttonFGM2PlusT1P1);
        fgm2PlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFGMTotalT1P1);
            public void onClick( View v) {
                current2PtMade += 1;
                madeTV.setText(Integer.toString(current2PtMade));
            }
        });


        Button fgm2MinusT1P1 = (Button) findViewById(R.id.buttonFGM2MinusT1P1);
        fgm2MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFGMTotalT1P1);
            public void onClick( View v) {
                current2PtMade -= 1;
                madeTV.setText(Integer.toString(current2PtMade));
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}