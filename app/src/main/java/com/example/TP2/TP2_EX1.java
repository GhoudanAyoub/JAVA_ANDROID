package com.example.TP2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;

import com.example.tp1.R;

public class TP2_EX1 extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private EditText editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex1);
        editText = findViewById(R.id.editTextWebLink);
        editText2 = findViewById(R.id.editTextLocationLink);
        editText3 = findViewById(R.id.editTextShareLink);

        findViewById(R.id.buttonWeb).setOnClickListener(view -> {
            String url = editText.getText().toString();
            Uri webpage = Uri.parse(url);
            Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!");
            }
        });
        findViewById(R.id.buttonLocation).setOnClickListener(view -> {
            String loc = editText2.getText().toString();
            Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
            Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            } else {
                Log.d("ImplicitIntents", "Can't handle this intent!");
            }

        });
        findViewById(R.id.buttonShare).setOnClickListener(view -> {
            String txt = editText3.getText().toString();
            String mimeType = "text/plain";
            ShareCompat.IntentBuilder
                    .from(this)
                    .setType(mimeType)
                    .setChooserTitle(R.string.share_text_with)
                    .setText(txt)
                    .startChooser();
        });
    }
}