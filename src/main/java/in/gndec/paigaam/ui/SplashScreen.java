package in.gndec.paigaam.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

import in.gndec.paigaam.R;

/**
 * Created by gurnoor on 5/12/17.
 */

public class SplashScreen extends Activity {
    TextView splash_Text;
    ShimmerFrameLayout shimmer;
    // Splash screen timer
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        shimmer = findViewById(R.id.shimmer_view_container);
        shimmer.setDropoff(0.5f);
        shimmer.setAutoStart(true);

        splash_Text = findViewById(R.id.TextViewSplash);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreen.this, ConversationActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

}