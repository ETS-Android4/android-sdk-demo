package com.helpcrunch.helpcrunchdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.helpcrunch.library.ui.HelpCrunchChatExtraKeys;
import com.helpcrunch.library.ui.HelpCrunchChatFragment;
import com.helpcrunch.library.ui.design.HelpCrunchDesign;

public class PlainChatActivity extends AppCompatActivity {
    private HelpCrunchChatFragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plain_chat);

        Bundle bundle = new Bundle();
        bundle.putBoolean(HelpCrunchChatExtraKeys.REQUEST_NAME, false);
        bundle.putInt(HelpCrunchChatExtraKeys.DESIGN, HelpCrunchDesign.MODERN);
        bundle.putBoolean(HelpCrunchChatExtraKeys.TOOLBAR_VISIBILITY, false);

        mFragment = HelpCrunchChatFragment.newInstance(getIntent().getExtras());
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, mFragment)
                .commit();
    }
}
