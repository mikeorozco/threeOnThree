package stats.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int myCurrentAttempts =0;
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
//            int currentAttempts = Integer.parseInt(attemptsTV.getText().toString());
            public void onClick( View v) {
//                currentAttempts += 1;
                myCurrentAttempts += 1;//currentAttempts;
                attemptsTV.setText(Integer.toString(myCurrentAttempts));
            }
        });


        Button fga2MinusT1P1 = (Button) findViewById(R.id.buttonFGA2MinusT1P1);
        fga2MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGATotalT1P1);
            int currentAttempts = Integer.parseInt(attemptsTV.getText().toString());
            public void onClick( View v) {
//                currentAttempts -= 1;
                myCurrentAttempts -= 1;//currentAttempts;
                attemptsTV.setText(Integer.toString(myCurrentAttempts));
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


//item    public void incrementTotalByOne(View view) {
//
//        TextView attemptsField = (TextView) findViewById(R.id.textViewPFGATotalT1P1);
//        int currentAttempts = Integer.parseInt(attemptsField.getText().toString());
//
//        attemptsField.setText(currentAttempts + 1);
//
//        EditText milestoDestField = (EditText) findViewById(R.id.milesLeftET);
//        EditText speedField = (EditText) findViewById(R.id.speedET);
//
//
//        Double miles = Double.parseDouble(milestoDestField.getText().toString());
//        Double spd = Double.parseDouble(speedField.getText().toString());
//
//        Double timeLeft = miles / spd;
//
//        int minutesLeft = (int) ((timeLeft % 1) * 60) ;
//        int hoursLeft = (int) (timeLeft - (timeLeft % 1));
//
//
//
//        Toast.makeText(getApplicationContext(), hoursLeft + " hours, " + minutesLeft + " minutes left", Toast.LENGTH_LONG).show();
//    }

}