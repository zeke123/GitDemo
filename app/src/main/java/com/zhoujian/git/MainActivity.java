package com.zhoujian.git;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showMethod();
    }

    private void showMethod()
    {

        Toast.makeText(this, "测试一", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试二", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "测试五", Toast.LENGTH_SHORT).show();
    }
}
