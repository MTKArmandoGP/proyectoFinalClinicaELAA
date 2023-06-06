package com.example.clinicaelaa_finalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.navigation.NavigationView;

public class Herramientas_activity extends AppCompatActivity {

    private int selectedTab=1;
    private DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_herramientas);

        final LinearLayout calculatorLayout= findViewById(R.id.calculatorLayout);
        final LinearLayout tasksLayout=findViewById(R.id.tasksLayout);
        final LinearLayout conversorLayout=findViewById(R.id.conversorLayout);
        final LinearLayout bottom=findViewById(R.id.bottom_herramientas);

        final LottieAnimationView calculatorView=findViewById(R.id.calculatorView);
        final LottieAnimationView tasksView=findViewById(R.id.tasksView);
        final LottieAnimationView conversorView=findViewById(R.id.conversorView);

        final TextView calculatorTxt=findViewById(R.id.calculatorTxt);
        final TextView tasksTxt=findViewById(R.id.tasksTxt);
        final TextView conversorTxt=findViewById(R.id.conversorTxt);

        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutHerramientas,Calculadora_Fragment.class,null)
                .commit();

        calculatorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutHerramientas,Calculadora_Fragment.class,null)
                        .commit();
                if(selectedTab!=1){

                    bottom.setBackgroundResource(R.color.home);

                    //Se colocan invisibles los textos
                    tasksTxt.setVisibility(View.GONE);
                    conversorTxt.setVisibility(View.GONE);

                    //Se cancelan las animaciones
                    tasksView.cancelAnimation();
                    conversorView.cancelAnimation();

                    //Se quitan los fondos de cada uno de los linear layout
                    tasksLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    conversorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                    //Se destaca el elemento seleccionado
                    calculatorLayout.setBackgroundResource(R.drawable.background_item_menu);
                    calculatorTxt.setVisibility(View.VISIBLE);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    calculatorLayout.startAnimation(scaleAnimation);
                    calculatorView.playAnimation();

                    selectedTab=1;

                }
            }
        });
        tasksLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutHerramientas,Tareas_Fragment.class,null)
                        .commit();

                if(selectedTab!=2){

                    bottom.setBackgroundResource(R.color.medicine);

                    //Se colocan invisibles los textos
                    calculatorTxt.setVisibility(View.GONE);
                    conversorTxt.setVisibility(View.GONE);

                    //Se cancelan las animaciones
                    calculatorView.cancelAnimation();
                    conversorView.cancelAnimation();

                    //Se quitan los fondos de cada uno de los linear layout
                    calculatorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    conversorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                    //Se destaca el elemento seleccionado
                    tasksLayout.setBackgroundResource(R.drawable.background_item_medicine);
                    tasksTxt.setVisibility(View.VISIBLE);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    tasksLayout.startAnimation(scaleAnimation);
                    tasksView.playAnimation();

                    selectedTab=2;

                }

            }
        });
        conversorLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutHerramientas,Conversor_Fragment.class,null)
                        .commit();

                if(selectedTab!=3){

                    bottom.setBackgroundResource(R.color.dates);

                    //Se colocan invisibles los textos
                    calculatorTxt.setVisibility(View.GONE);
                    tasksTxt.setVisibility(View.GONE);

                    //Se cancelan las animaciones
                    calculatorView.cancelAnimation();
                    tasksView.cancelAnimation();

                    //Se quitan los fondos de cada uno de los linear layout
                    calculatorLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                    tasksLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                    //Se destaca el elemento seleccionado
                    conversorLayout.setBackgroundResource(R.drawable.background_item_dates);
                    conversorTxt.setVisibility(View.VISIBLE);
                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);
                    conversorLayout.startAnimation(scaleAnimation);
                    conversorView.playAnimation();

                    selectedTab=3;

                }

            }
        });



    }

}