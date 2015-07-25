package com.example.lwaziprusent.slidingmenu;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends SherlockActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Get the view from activity_main.xml
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // First Menu Button
        menu.add("Help")
                .setOnMenuItemClickListener(this.helpButtonClickListener)
                .setIcon(R.drawable.help_button) // Set the menu icon
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        // Second Menu Button
        menu.add("Like")
                .setOnMenuItemClickListener(this.likeButtonClickListener)
                .setIcon(R.drawable.like_button) // Set the menu icon
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        // Third Menu Button
        menu.add("Exit")
                .setOnMenuItemClickListener(this.exitButtonClickListener)
                .setShowAsAction(MenuItem.SHOW_AS_ACTION_IF_ROOM);

        return super.onCreateOptionsMenu(menu);
    }

    // Capture first menu button click
    OnMenuItemClickListener helpButtonClickListener = new OnMenuItemClickListener() {

        public boolean onMenuItemClick(MenuItem item) {

            // Create a simple toast message
            Toast.makeText(MainActivity.this, "Help Button", Toast.LENGTH_SHORT)
                    .show();

            // Do something else
            return false;
        }
    };

    // Capture second menu button click
    OnMenuItemClickListener likeButtonClickListener = new OnMenuItemClickListener() {

        public boolean onMenuItemClick(MenuItem item) {
            // Create a simple toast message
            Toast.makeText(MainActivity.this, "Like Button", Toast.LENGTH_SHORT)
                    .show();

            // Do something else
            return false;
        }
    };

    // Capture third menu button click
    OnMenuItemClickListener exitButtonClickListener = new OnMenuItemClickListener() {

        public boolean onMenuItemClick(MenuItem item) {
            // Create a simple toast message
            Toast.makeText(MainActivity.this, "Exit Button", Toast.LENGTH_SHORT)
                    .show();

            // Do something else
            return false;
        }
    };
}