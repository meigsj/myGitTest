package tcss450.uw.edu.aboutme;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void textActivityStart(View view) {
        Intent intent = new Intent(this, textActivity.class);
        startActivity(intent);
    }

    public void imageActivityStart(View view) {
        Intent intent = new Intent(this, imageActivity.class);
        startActivity(intent);
    }

    public void openWebPage(View view) {
        Uri webpage = Uri.parse("http://developer.android.com/index.html");
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        startActivity(intent);
    }

    public void toasterPopper(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Better with Butter";
        int duration = Toast.LENGTH_SHORT;

        Toast toast =  Toast.makeText(context,text,duration);
        toast.show();
    }


    public void dialogBoxOpen(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.choice);
        builder.setNegativeButton(R.string.apple_choice, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        builder.setPositiveButton(R.string.android_choice, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        AlertDialog dialog = builder.create();

        dialog.show();
    }

}
