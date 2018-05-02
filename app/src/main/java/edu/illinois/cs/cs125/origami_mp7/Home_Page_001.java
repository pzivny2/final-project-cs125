package edu.illinois.cs.cs125.origami_mp7;

import android.app.Fragment;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class Home_Page_001 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
//    RecyclerView recyclerView;
//    String[] Items = {"1", "2", "3"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home__page_001);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

//        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(new Adapter(this, Items));

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home__page_001, menu);
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

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.app.FragmentManager fragmentManager = getFragmentManager();

        if (id == R.id.nav_first_layout) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new FirstFragment())
                    .commit();
        } else if (id == R.id.nav_second_layout) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new SecondFragment())
                    .commit();
        } else if (id == R.id.nav_third_layout) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new ThirdFragment())
                    .commit();
        } else if (id == R.id.nav_fourth_layout) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new FourthFragment())
                    .commit();
        } else if (id == R.id.nav_fifth_layout) {
            fragmentManager.beginTransaction()
                    .replace(R.id.content_frame, new FifthFragment())
                    .commit();
//        } else if (id == R.id.nav_manage) {

//        } else if (id == R.id.nav_share) {
//
//        } else if (id == R.id.nav_send) {
//
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    /**
     * Simple Origami Video
     */

    public void craneVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=KfnyopxdJXQ"));
        startActivity(browserIntent);
    }

    public void catBookmarkVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=beX_g5L4t9U"));
        startActivity(browserIntent);
    }

    public void butterflyVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=CbUGg7CDdc4"));
        startActivity(browserIntent);
    }

    public void elephantBookmarkVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=w-M4u3oQqdA&t=3s"));
        startActivity(browserIntent);
    }

    public void boatVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=BM6G_QLxkCE"));
        startActivity(browserIntent);
    }

    public void alienVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=_gQurMRSjzY&t=2s"));
        startActivity(browserIntent);
    }

    public void catVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=aBC7bHHeLdU&t=2s"));
        startActivity(browserIntent);
    }


    /**
     * Intermediate Origami videos
     * @param view
     */

    public void yodaVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=U5B71d1OR_M"));
        startActivity(browserIntent);
    }

    public void pterodactylVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=mc2p4QuORbU"));
        startActivity(browserIntent);
    }

    public void dinosaurVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=9rOTQIuKolc"));
        startActivity(browserIntent);
    }

    public void penguin2Video(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=k_W8IiOytM4"));
        startActivity(browserIntent);
    }

    public void pentagonRoseVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=8YMgbtX7FZ8"));
        startActivity(browserIntent);
    }

    public void rabbitVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=kOeX5kuW2gQ"));
        startActivity(browserIntent);
    }

    public void treeFrogVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=yemuGjk-Qyo"));
        startActivity(browserIntent);
    }

    /**
     * Action Origami videos
     */

    public void hexVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=vHqascRzhOg"));
        startActivity(browserIntent);
    }

    public void magicBallVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=VgXwSdJNks8"));
        startActivity(browserIntent);
    }

    public void jacobsLadderVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=ykL0Tt7jdYY"));
        startActivity(browserIntent);
    }

    public void fireworksVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=z0-mlZvJD-E"));
        startActivity(browserIntent);
    }

    public void springIntoActionVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=aul0SzPVsls"));
        startActivity(browserIntent);
    }

    public void springVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=ZDs97UoCVgE"));
        startActivity(browserIntent);
    }

    public void transformingStarVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=n01fsCDWAUc"));
        startActivity(browserIntent);
    }

    public void spinnyThingVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=LZ0Ik0zFUL4"));
        startActivity(browserIntent);
    }

    public void otherFireworkVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=jQmG6kf2-bw"));
        startActivity(browserIntent);
    }

    public void birthdayPopUpCardVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=QxsJ5M_uQKI"));
        startActivity(browserIntent);
    }

    /**
     * Modular Origami Videos
     */

    public void tetrahedronVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=aT2UHxA4uRY"));
        startActivity(browserIntent);
    }

    public void swanVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=k9fD3L2cmIk"));
        startActivity(browserIntent);
    }

    public void curlythingVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=lm2JEhBvxCg"));
        startActivity(browserIntent);
    }

    public void spikyballVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=xhqY2p3kV1g"));
        startActivity(browserIntent);
    }

    public void popupballVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=LrvOfQ5RG3A"));
        startActivity(browserIntent);
    }

    public void turnythingVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=4iDRIRjzL1w"));
        startActivity(browserIntent);
    }

    public void phizzVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=e-BZGxwycUQ"));
        startActivity(browserIntent);
    }

    public void christmasstarVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=xKmgqv8N3-4"));
        startActivity(browserIntent);
    }

    public void ninjastarVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=KG62H5QaD2o"));
        startActivity(browserIntent);
    }

    public void transformingroseVideo(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com/watch?v=BXwjLkNXJsQ"));
        startActivity(browserIntent);
    }
}
