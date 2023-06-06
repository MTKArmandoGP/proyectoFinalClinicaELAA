package com.example.clinicaelaa_finalproject;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;


public class pantalla_principal_usuarios_activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {



    private int selectedTab=1;
    private DrawerLayout drawerLayout;

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

            Toolbar toolbar=findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);

            drawerLayout=findViewById(R.id.drawer_layout);
            NavigationView navigationView=findViewById(R.id.nav_view);
            navigationView.setNavigationItemSelectedListener(this);

            ActionBarDrawerToggle toggle= new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open_nav,R.string.close_nav);
            drawerLayout.addDrawerListener(toggle);
            toggle.syncState();



            if(savedInstanceState==null){
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutUsuarios,new HomeFragment_Usuarios()).commit();
                navigationView.setCheckedItem(R.id.nav_home);
            }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.nav_home:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutUsuarios,new HomeFragment_Usuarios()).commit();
                break;
            case R.id.nav_medicine:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutUsuarios,new MedicineFragment_Usuarios()).commit();
                break;
            case R.id.nav_dates:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutUsuarios,new DatesFragment_Usuarios()).commit();
                break;
            case R.id.nav_recipes:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutUsuarios,new RecipesFragment_Usuarios()).commit();
                break;
            case R.id.nav_settings:
                getSupportFragmentManager().beginTransaction().replace(R.id.frameLayoutUsuarios,new SettingsFragment_Usuarios()).commit();
                break;
            case R.id.nav_herramientas:
                Intent intent = new Intent(this, Herramientas_activity.class);
                startActivity(intent);
                break;
            case R.id.nav_logout:
                cerrarSesion();
                break;
        }

        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed(){
            if(drawerLayout.isDrawerOpen(GravityCompat.START)){
                drawerLayout.closeDrawer(GravityCompat.START);
            }else{
                super.onBackPressed();
            }
    }


    private void cerrarSesion() {
        // Aquí realiza las acciones necesarias para cerrar la sesión, como limpiar las preferencias o eliminar los datos de inicio de sesión.

        // Limpiar preferencias
        SharedPreferences preferences = getSharedPreferences("preferenciasLogin", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.clear();
        editor.apply();

        // Lanzar la actividad de inicio de sesión
        Intent intent = new Intent(this, Login_Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
        finish(); // Finalizar la actividad actual para evitar volver atrás con el botón de retroceso
    }

}