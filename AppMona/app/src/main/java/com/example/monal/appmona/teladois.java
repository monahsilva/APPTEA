package com.example.monal.appmona;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;

public class teladois extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teladois);
        mostrarLogin();
    }

    private void mostrarLogin() {
            Intent intent = new Intent(teladois.this,
                    Activity.class);
            startActivity(intent);
            finish();
        }

    }

