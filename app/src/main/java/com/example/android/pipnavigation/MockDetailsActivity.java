/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.pipnavigation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Mocks a details activity, showing information about a video before a user chooses to watch it.
 */
public class MockDetailsActivity extends AppCompatActivity {

    public static Intent createIntent(Context context) {
        return new Intent(context, MockDetailsActivity.class);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mock_navigation);

        TextView titleView = findViewById(R.id.title);
        titleView.setText(getString(R.string.details));

        Button nextButton = findViewById(R.id.next_button);
        nextButton.setVisibility(View.GONE);

        Button watchButton = findViewById(R.id.watch_button);
        watchButton.setText(R.string.watch_movie);
        watchButton.setOnClickListener(
                view -> startActivity(WatchActivity.createIntent(view.getContext())));
    }
}
