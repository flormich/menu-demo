package fr.formation.menudemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Activite1 extends ActivityMenus {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activite1);
    }

    public void changeActivity(View view) {
    }
}
