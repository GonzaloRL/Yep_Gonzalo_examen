package com.example.gonzalo.yep_gonzalo;

import android.test.ActivityInstrumentationTestCase2;
import android.test.TouchUtils;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Gonzalo on 08/03/2016.
 */
public class MyTest extends ActivityInstrumentationTestCase2<LoginActivity> {
    private LoginActivity actividad;

    private Button login;

    public MyTest(String pkg, Class<LoginActivity> activityClass) {
        super(pkg, activityClass);
    }
    public MyTest(){
        super(LoginActivity.class);
    }
    protected void setUp() throws Exception{
        super.setUp();
        actividad = getActivity();
        login = (Button) actividad.findViewById(R.id.loginButton);
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testLoginValues() {

        // now on Add button
        TouchUtils.clickView(this, login);

        assertNotNull("El usuario esta logueado...");

    }
}

