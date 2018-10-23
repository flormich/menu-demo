package fr.formation.menudemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ActivityMenus extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

        //menu connexion : doit se cocher ou se décocher

        if (id == R.id.connex){
            if(item.isChecked()) {
                item.setChecked(false);
            }else {
                item.setChecked(true);
            }
            return true;
        }

        if (id == R.id.acti) {
            return true;
        }

        if (id == R.id.acti1){
            /* Créer un objet Intent*/
            Intent i = new Intent (this, Activite1.class);
            /*Lancer l'activité avec cet objet Intent*/
            startActivity(i);
            return true;
        }

        if (id == R.id.acti2){
            Intent i = new Intent (this, Activite2.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.acti3){
            Intent i = new Intent (this, Activite3.class);
            startActivity(i);
            return true;
        }

        if (id == R.id.actiP){
            return true;
        }

        if (id == R.id.param){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void SettingsActivity(MenuItem item) {
        Toast.makeText(this, "je part dans l'activité", Toast.LENGTH_SHORT).show();
    }


}
