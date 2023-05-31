package com.example.clinicaelaa_finalproject;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class pantalla_principal_usuarios_activity extends AppCompatActivity {



    private int selectedTab=1;

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla_principal_usuarios);

            //Enlace de cada uno de los LinearLayouts necesarios
            final LinearLayout homeLayout= findViewById(R.id.homeLayout);
            final LinearLayout medicineLayout=findViewById(R.id.medicineLayout);
            final LinearLayout datesLayout=findViewById(R.id.datesLayout);
            final LinearLayout recipesLayout=findViewById(R.id.recipesLayout);
            final LinearLayout settingsLayout=findViewById(R.id.settingsLayout);
            final LinearLayout bottom=findViewById(R.id.bottom);

            //Enlace de cada uno de las vistas de Lottie
            final LottieAnimationView medicineView=findViewById(R.id.medicineView);
            final LottieAnimationView datesView=findViewById(R.id.datesView);
            final LottieAnimationView homeanimationView=findViewById(R.id.homeanimationView);
            final LottieAnimationView recipesView=findViewById(R.id.recipesView);
            final LottieAnimationView settingsView=findViewById(R.id.settingsView);

            //Enlace de cada uno de los campos de texto del menú
            final TextView medicineTxt=findViewById(R.id.medicineTxt);
            final TextView datesTxt=findViewById(R.id.datesTxt);
            final TextView homeTxt=findViewById(R.id.homeTxt);
            final TextView recipesTxt=findViewById(R.id.recipesTxt);
            final TextView settingsTxt=findViewById(R.id.settingsTxt);

            getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutUsuarios,HomeFragment_Usuarios.class,null)
                    .commit();

            homeLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutUsuarios,HomeFragment_Usuarios.class,null)
                            .commit();
                    if(selectedTab!=1){

                        bottom.setBackgroundResource(R.color.home);

                        //Se colocan invisibles los textos
                        medicineTxt.setVisibility(View.GONE);
                        datesTxt.setVisibility(View.GONE);
                        recipesTxt.setVisibility(View.GONE);
                        settingsTxt.setVisibility(View.GONE);

                        //Se cancelan las animaciones
                        medicineView.cancelAnimation();
                        datesView.cancelAnimation();
                        recipesView.cancelAnimation();
                        settingsView.cancelAnimation();

                        //Se quitan los fondos de cada uno de los linear layout
                        medicineLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        recipesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        datesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                        //Se destaca el elemento seleccionado
                        homeLayout.setBackgroundResource(R.drawable.background_item_menu);
                        homeTxt.setVisibility(View.VISIBLE);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                        scaleAnimation.setDuration(200);
                        scaleAnimation.setFillAfter(true);
                        homeLayout.startAnimation(scaleAnimation);
                        homeanimationView.playAnimation();

                        selectedTab=1;

                    }

                }
            });

            medicineLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutUsuarios,MedicineFragment_Usuarios.class,null)
                            .commit();

                    if(selectedTab!=2){

                        bottom.setBackgroundResource(R.color.medicine);

                        //Se colocan invisibles los textos
                        homeTxt.setVisibility(View.GONE);
                        datesTxt.setVisibility(View.GONE);
                        recipesTxt.setVisibility(View.GONE);
                        settingsTxt.setVisibility(View.GONE);

                        //Se cancelan las animaciones
                        homeanimationView.cancelAnimation();
                        datesView.cancelAnimation();
                        recipesView.cancelAnimation();
                        settingsView.cancelAnimation();

                        //Se quitan los fondos de cada uno de los linear layout
                        homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        recipesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        datesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                        //Se destaca el elemento seleccionado
                        medicineLayout.setBackgroundResource(R.drawable.background_item_medicine);
                        medicineTxt.setVisibility(View.VISIBLE);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                        scaleAnimation.setDuration(200);
                        scaleAnimation.setFillAfter(true);
                        medicineLayout.startAnimation(scaleAnimation);
                        medicineView.playAnimation();

                        selectedTab=2;

                    }

                }
            });

            datesLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutUsuarios,DatesFragment_Usuarios.class,null)
                            .commit();

                    if(selectedTab!=3){

                        bottom.setBackgroundResource(R.color.dates);

                        //Se colocan invisibles los textos
                        homeTxt.setVisibility(View.GONE);
                        medicineTxt.setVisibility(View.GONE);
                        recipesTxt.setVisibility(View.GONE);
                        settingsTxt.setVisibility(View.GONE);

                        //Se cancelan las animaciones
                        homeanimationView.cancelAnimation();
                        medicineView.cancelAnimation();
                        recipesView.cancelAnimation();
                        settingsView.cancelAnimation();

                        //Se quitan los fondos de cada uno de los linear layout
                        homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        recipesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        medicineLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                        //Se destaca el elemento seleccionado
                        datesLayout.setBackgroundResource(R.drawable.background_item_dates);
                        datesTxt.setVisibility(View.VISIBLE);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                        scaleAnimation.setDuration(200);
                        scaleAnimation.setFillAfter(true);
                        datesLayout.startAnimation(scaleAnimation);
                        datesView.playAnimation();

                        selectedTab=3;

                    }

                }
            });

            recipesLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutUsuarios,RecipesFragment_Usuarios.class,null)
                            .commit();

                    if(selectedTab!=4){

                        bottom.setBackgroundResource(R.color.recipes);

                        //Se colocan invisibles los textos
                        homeTxt.setVisibility(View.GONE);
                        medicineTxt.setVisibility(View.GONE);
                        datesTxt.setVisibility(View.GONE);
                        settingsTxt.setVisibility(View.GONE);

                        //Se cancelan las animaciones
                        homeanimationView.cancelAnimation();
                        medicineView.cancelAnimation();
                        datesView.cancelAnimation();
                        settingsView.cancelAnimation();

                        //Se quitan los fondos de cada uno de los linear layout
                        homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        datesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        settingsLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        medicineLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                        //Se destaca el elemento seleccionado
                        recipesLayout.setBackgroundResource(R.drawable.background_item_recipes);
                        recipesTxt.setVisibility(View.VISIBLE);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                        scaleAnimation.setDuration(200);
                        scaleAnimation.setFillAfter(true);
                        recipesLayout.startAnimation(scaleAnimation);
                        recipesView.playAnimation();

                        selectedTab=4;

                    }

                }
            });


            settingsLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.frameLayoutUsuarios,SettingsFragment_Usuarios.class,null)
                            .commit();

                    if(selectedTab!=5){

                        bottom.setBackgroundResource(R.color.settings);

                        //Se colocan invisibles los textos
                        homeTxt.setVisibility(View.GONE);
                        medicineTxt.setVisibility(View.GONE);
                        datesTxt.setVisibility(View.GONE);
                        recipesTxt.setVisibility(View.GONE);

                        //Se cancelan las animaciones
                        homeanimationView.cancelAnimation();
                        medicineView.cancelAnimation();
                        datesView.cancelAnimation();
                        recipesView.cancelAnimation();

                        //Se quitan los fondos de cada uno de los linear layout
                        homeLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        datesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        recipesLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));
                        medicineLayout.setBackgroundColor(getResources().getColor(android.R.color.transparent));


                        //Se destaca el elemento seleccionado
                        settingsLayout.setBackgroundResource(R.drawable.background_item_settings);
                        settingsTxt.setVisibility(View.VISIBLE);
                        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f,1.0f,1.f,1f, Animation.RELATIVE_TO_SELF,0.0f,Animation.RELATIVE_TO_SELF,0.0f);
                        scaleAnimation.setDuration(200);
                        scaleAnimation.setFillAfter(true);
                        settingsLayout.startAnimation(scaleAnimation);
                        settingsView.playAnimation();

                        selectedTab=5;

                    }

                }
            });

    }


}