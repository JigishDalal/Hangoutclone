package com.example.thinkcreator.hangoutclone;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.DividerItemDecoration;
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

import com.example.thinkcreator.hangoutclone.Adapter.ChatAdapter;
import com.example.thinkcreator.hangoutclone.model.ChatList;
import com.github.clans.fab.FloatingActionMenu;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    FloatingActionMenu plus;
    com.github.clans.fab.FloatingActionButton message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        fab button




//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

//        navigation drawer
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        final List<ChatList> chats = new ArrayList<>();

        chats.add(new ChatList("Tajesh","hello world","now",R.drawable.images));
        chats.add(new ChatList("Jhon","What's up?","32 min",R.drawable.images2));
        chats.add(new ChatList("Suraj","hello android","9:00 AM",R.drawable.images2));
        chats.add(new ChatList("Alexa","Hello","5 Mar",R.drawable.images3));
        chats.add(new ChatList("Ashish","Happy Birthday, db","5 Mar",R.drawable.images2));
        chats.add(new ChatList("Krishna ","Hi, What's up?","3 Feb",R.drawable.images));
        chats.add(new ChatList("Karan","Hi, What's up?","Jan 11",R.drawable.images));
        chats.add(new ChatList("Yash","Hi, What's up?","12:00 AM",R.drawable.images));
        chats.add(new ChatList("Rahane","Hi, What's up?","12:00 AM",R.drawable.images));
        chats.add(new ChatList("Ram","Hi, What's up?","12:00 AM",R.drawable.images2));
        chats.add(new ChatList("Yash","Hi, What's up?","12:00 AM",R.drawable.images2));
        chats.add(new ChatList("Riya","Hi, What's up?","12:00 AM",R.drawable.images3));
        chats.add(new ChatList("Krishna","Hi, What's up?","12:00 AM",R.drawable.images2));
        chats.add(new ChatList("Kanu","Hi, What's up?","9:00 AM",R.drawable.images));
        ChatAdapter itemsAdapter = new ChatAdapter(this, chats);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rey_chatlist);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
//        recyclerView.addItemDecoration(new DividerItemDecoration(getApplicationContext(),DividerItemDecoration.VERTICAL));
        recyclerView.setAdapter(itemsAdapter);
//        itemsAdapter.notifyDataSetChanged();




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
        getMenuInflater().inflate(R.menu.main, menu);
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

        if (id == R.id.nav_status) {
            // Handle the camera action
        } else if (id == R.id.nav_snooze) {

        } else if (id == R.id.Invites) {

        } else if (id == R.id.Archiveve) {

        } else if (id == R.id.Setting) {

        } else if (id == R.id.help) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
