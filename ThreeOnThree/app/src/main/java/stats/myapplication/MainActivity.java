package stats.myapplication;

import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    int current2PtAttempts = 0;
    int current2PtMade = 0;
    int current3PtAttempts = 0;
    int current3PtMade = 0;
    int currentFTAttempts = 0;
    int currentFTMade = 0;
    int currentAssists = 0;
    int currentBlocks = 0;
    int currentRebounds = 0;
    int currentSteals = 0;
    int totalPoints = 0;

    private final String TAG = "MainActivity class";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button fga2PlusT1P1 = (Button) findViewById(R.id.buttonFGA2PlusT1P1);
        fga2PlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGA2TotalT1P1);

            public void onClick(View v) {
                current2PtAttempts += 1;
                attemptsTV.setText(Integer.toString(current2PtAttempts));
            }
        });

        Button fga2MinusT1P1 = (Button) findViewById(R.id.buttonFGA2MinusT1P1);
        fga2MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGA2TotalT1P1);

            public void onClick(View v) {
                current2PtAttempts -= 1;
                attemptsTV.setText(Integer.toString(current2PtAttempts));
            }
        });

        Button fgm2PlusT1P1 = (Button) findViewById(R.id.buttonFGM2PlusT1P1);
        fgm2PlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFGM2TotalT1P1);

            public void onClick(View v) {
                current2PtMade += 1;
                madeTV.setText(Integer.toString(current2PtMade));
                calcTotalPoints();
            }
        });

        Button fgm2MinusT1P1 = (Button) findViewById(R.id.buttonFGM2MinusT1P1);
        fgm2MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFGM2TotalT1P1);

            public void onClick(View v) {
                current2PtMade -= 1;
                madeTV.setText(Integer.toString(current2PtMade));
                calcTotalPoints();
            }
        });
//---------------------------------------------------------------------------------
        Button fga3PlusT1P1 = (Button) findViewById(R.id.buttonFGA3PlusT1P1);
        fga3PlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGA3TotalT1P1);

            public void onClick(View v) {
                current3PtAttempts += 1;
                attemptsTV.setText(Integer.toString(current3PtAttempts));
            }
        });

        Button fga3MinusT1P1 = (Button) findViewById(R.id.buttonFGA3MinusT1P1);
        fga3MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFGA3TotalT1P1);

            public void onClick(View v) {
                current3PtAttempts -= 1;
                attemptsTV.setText(Integer.toString(current3PtAttempts));
            }
        });

        Button fgm3PlusT1P1 = (Button) findViewById(R.id.buttonFGM3PlusT1P1);
        fgm3PlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFGM3TotalT1P1);

            public void onClick(View v) {
                current3PtMade += 1;
                madeTV.setText(Integer.toString(current3PtMade));
                calcTotalPoints();
            }
        });

        Button fgm3MinusT1P1 = (Button) findViewById(R.id.buttonFGM3MinusT1P1);
        fgm3MinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFGM3TotalT1P1);
            public void onClick( View v) {
                current3PtMade -= 1;
                madeTV.setText(Integer.toString(current3PtMade));
                calcTotalPoints();
            }
        });

//---------------------------------------------------------------------------------
        Button ftaPlusT1P1 = (Button) findViewById(R.id.buttonFTAPlusT1P1);
        ftaPlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFTATotalT1P1);

            public void onClick(View v) {
                currentFTAttempts += 1;
                attemptsTV.setText(Integer.toString(currentFTAttempts));
            }
        });

        Button ftaMinusT1P1 = (Button) findViewById(R.id.buttonFTAMinusT1P1);
        ftaMinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView attemptsTV = (TextView) findViewById(R.id.textViewFTATotalT1P1);

            public void onClick(View v) {
                currentFTAttempts -= 1;
                attemptsTV.setText(Integer.toString(currentFTAttempts));
            }
        });

        Button ftmPlusT1P1 = (Button) findViewById(R.id.buttonFTMPlusT1P1);
        ftmPlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFTMTotalT1P1);
            public void onClick( View v) {
                currentFTMade += 1;
                madeTV.setText(Integer.toString(currentFTMade));
                calcTotalPoints();
            }
        });

        Button ftmMinusT1P1 = (Button) findViewById(R.id.buttonFTMMinusT1P1);
        ftmMinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView madeTV = (TextView) findViewById(R.id.textViewFTMTotalT1P1);
            public void onClick( View v) {
                currentFTMade -= 1;
                madeTV.setText(Integer.toString(currentFTMade));
                calcTotalPoints();
            }
        });
        //------------------------cc---------------------------------------------------------
        Button assistsPlusT1P1 = (Button) findViewById(R.id.buttonAssistsPlusT1P1);
        assistsPlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView assistsTV = (TextView) findViewById(R.id.textViewAssistsTotalT1P1);

            public void onClick(View v) {
                currentAssists += 1;
                assistsTV.setText(Integer.toString(currentAssists));
                //calcAssists();
            }
        });

        Button assistsMinusT1P1 = (Button) findViewById(R.id.buttonAssistsMinusT1P1);
        assistsMinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView assistsTV = (TextView) findViewById(R.id.textViewAssistsTotalT1P1);

            public void onClick(View v) {
                currentAssists -= 1;
                assistsTV.setText(Integer.toString(currentAssists));
                //calcAssists();
            }
        });

        Button blocksPlusT1P1 = (Button) findViewById(R.id.buttonBlocksPlusT1P1);
        blocksPlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView blocksTV = (TextView) findViewById(R.id.textViewBlocksTotalT1P1);
            public void onClick( View v) {
                currentBlocks += 1;
                blocksTV.setText(Integer.toString(currentBlocks));
                //calcBlocks();
            }
        });

        Button blocksMinusT1P1 = (Button) findViewById(R.id.buttonBlocksMinusT1P1);
        blocksMinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView blocksTV = (TextView) findViewById(R.id.textViewBlocksTotalT1P1);
            public void onClick( View v) {
                currentBlocks -= 1;
                blocksTV.setText(Integer.toString(currentBlocks));
                //calcBlocks();
            }
        });

        //---------------------------------------------------------------------------------
        Button reboundsPlusT1P1 = (Button) findViewById(R.id.buttonReboundsPlusT1P1);
        reboundsPlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView reboundsTV = (TextView) findViewById(R.id.textViewReboundsTotalT1P1);

            public void onClick(View v) {
                currentRebounds += 1;
                reboundsTV.setText(Integer.toString(currentRebounds));
                //calcRebounds();
            }
        });

        Button reboundsMinusT1P1 = (Button) findViewById(R.id.buttonReboundsMinusT1P1);
        reboundsMinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView reboundsTV = (TextView) findViewById(R.id.textViewReboundsTotalT1P1);

            public void onClick(View v) {
                currentRebounds -= 1;
                reboundsTV.setText(Integer.toString(currentRebounds));
                //calcRebounds();
            }
        });

        Button stealsPlusT1P1 = (Button) findViewById(R.id.buttonStealsPlusT1P1);
        stealsPlusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView stealsTV = (TextView) findViewById(R.id.textViewStealsTotalT1P1);
            public void onClick( View v) {
                currentSteals += 1;
                stealsTV.setText(Integer.toString(currentSteals));
                //calcSteals();
            }
        });

        Button stealsMinusT1P1 = (Button) findViewById(R.id.buttonStealsMinusT1P1);
        stealsMinusT1P1.setOnClickListener(new View.OnClickListener() {

            TextView stealsTV = (TextView) findViewById(R.id.textViewStealsTotalT1P1);
            public void onClick( View v) {
                currentSteals -= 1;
                stealsTV.setText(Integer.toString(currentSteals));
                //calcSteals();
            }
        });
    }

    private void calcTotalPoints() {
        int totalPoints = 0;
        totalPoints = (current2PtMade * 2) + (current3PtMade * 3) + currentFTMade;
        TextView totalPointsField = (TextView) findViewById(R.id.textViewTotalPointsT1P1);
        totalPointsField.setText(Integer.toString(totalPoints));
    }

    private void calculateOtherStats() {
        TextView assists = (TextView) findViewById(R.id.textView);
        x.setText(Integer.toString(());

        TextView x = (TextView) findViewById(R.id.x);
        x.setText(Integer.toString(());

        TextView x = (TextView) findViewById(R.id.x);
        x.setText(Integer.toString(());

        TextView x = (TextView) findViewById(R.id.x);
        x.setText(Integer.toString(());
    }

//    private void calcAssists() {
//
//    }
//
//    private void calcBlocks() {
//
//    }
//
//    private void calcRebounds() {
//
//    }
//
//    private void calcSteals() {
//
//    }

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