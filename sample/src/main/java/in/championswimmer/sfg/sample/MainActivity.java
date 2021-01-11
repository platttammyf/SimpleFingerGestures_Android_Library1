package in.championswimmer.sfg.sample;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.Toast;
import in.championswimmer.sfg.lib.SimpleFingerGestures;


public class MainActivity extends Activity {

    public static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView mv = (ImageView) findViewById(R.id.myview);

        SimpleFingerGestures sfg = new SimpleFingerGestures();
        sfg.setOn1FingerGestureListener(new SimpleFingerGestures.On1FingerGestureListener() {
            @Override
            public boolean onSwipeUp(long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped up", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onSwipeDown(long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped down", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onSwipeLeft(long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped left", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onSwipeRight(long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped right", Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        sfg.setOnMultiFingerGestureListener(new SimpleFingerGestures.OnMultiFingerGestureListener() {
            @Override
            public boolean onSwipeUp(int fingers, long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped "+ fingers + " up", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onSwipeDown(int fingers, long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped "+ fingers + " down", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onSwipeLeft(int fingers, long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped "+ fingers + " left", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onSwipeRight(int fingers, long gestureDuration) {
                Toast.makeText(getBaseContext(), "swiped "+ fingers + " right", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onPinch(int fingers, long gestureDuration) {
                Toast.makeText(getBaseContext(), "pinch", Toast.LENGTH_SHORT).show();
                return false;
            }

            @Override
            public boolean onUnpinch(int fingers, long gestureDuration) {
                Toast.makeText(getBaseContext(), "unpinch", Toast.LENGTH_SHORT).show();
                return false;
            }
        });



        mv.setOnTouchListener(sfg);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
