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
    public static final String EXTRA_REPLY = "com.doubl3.manageiocome.userlist.REPLY";
    private EditText mEditUserView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_user);
        mEditUserView = findViewById(R.id.edit_user);

        final Button btn = findViewById(R.id.button_save);
        btn.setOnClickListener(view -> {
            Intent replyIntent = new Intent();
            if(TextUtils.isEmpty(mEditUserView.getText())){
                setResult(RESULT_CANCELED, replyIntent);
            }
            else{
                String word = mEditUserView.getText().toString();
                replyIntent.putExtra(EXTRA_REPLY, word);
                setResult(RESULT_OK, replyIntent);
            }
            finish();
        });
    }
}
