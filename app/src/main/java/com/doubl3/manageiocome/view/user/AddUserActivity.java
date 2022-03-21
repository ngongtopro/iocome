package com.doubl3.manageiocome.view.user;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;

import com.doubl3.manageiocome.R;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class AddUserActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY_HO = "com.example.android.wordlistsql.REPLY.HO";
    public static final String EXTRA_REPLY_TEN = "com.example.android.wordlistsql.REPLY.TEN";

    private EditText mEditHoView;
    private EditText mEditTenView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_user);
        mEditHoView = findViewById(R.id.edit_ho);
        mEditTenView = findViewById(R.id.edit_ten);

        final Button button = findViewById(R.id.button_save);
        button.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if (TextUtils.isEmpty(mEditHoView.getText()) || TextUtils.isEmpty(mEditTenView.getText())) {
                setResult(RESULT_CANCELED, replyIntent);
            } else {
                String ho = mEditHoView.getText().toString();
                String ten = mEditTenView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY_HO, ho);
                replyIntent.putExtra(EXTRA_REPLY_TEN, ten);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}
