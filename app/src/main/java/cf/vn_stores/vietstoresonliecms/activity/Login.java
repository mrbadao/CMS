package cf.vn_stores.vietstoresonliecms.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import cf.vn_stores.vietstoresonliecms.R;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_login);
    }
}
