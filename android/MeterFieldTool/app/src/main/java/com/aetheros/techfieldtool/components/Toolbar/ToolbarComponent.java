// Copyright (c) Aetheros, Inc.  See COPYRIGHT

package com.aetheros.techfieldtool.components.Toolbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.aetheros.techfieldtool.R;

/**
 * Aetheros branded toolbar includes the company logo, title and menu button.
 *
 * @author Sebastian Babb
 */
public class ToolbarComponent extends LinearLayout {
    public String mTitle;
    public String mSubtitle;
    public TextView mTitleTextView;
    public TextView mSubtitleTextView;
    public Boolean mBackButton;
    public ImageButton mBackButtonView;

    /**
     * @param context
     * @param attrs
     */
    public ToolbarComponent(Context context, AttributeSet attrs) {
        super(context, attrs);

        // Inflate the layout xml and create references to its child views.
        inflate(context, R.layout.component_toolbar, this);

        mTitleTextView = findViewById(R.id.title);
        mSubtitleTextView = findViewById(R.id.subtitle);
        mBackButtonView = findViewById(R.id.back_button);

        mBackButtonView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)context).finish();
            }
        });

        // Extract the attributes set in the layout instantiating this view component.
        // This is a shared resource - do not forget to recycle it when you are done.
        TypedArray arr = context.getTheme().obtainStyledAttributes(
                attrs, R.styleable.ComponentToolbar, 0, 0
        );

        try {
            // If a title was set via an xml attribute in a layout, set it.
            mTitle = arr.getString(R.styleable.ComponentToolbar_title);
            mSubtitle = arr.getString(R.styleable.ComponentToolbar_title);

            // Check if a back button was set in the xml layout.  Default to false - no back button.
            mBackButton = arr.getBoolean(R.styleable.ComponentToolbar_backButton, false);

            if(mTitle != null) {
                this.setTitle(mTitle);
            }

            if(mBackButton) {
                this.showBackButton();
            }
        } finally {
            // Clean up.
            arr.recycle();
        }
    }

    /**
     * Set the title text in the toolbar.
     *
     * @param title The text to display.
     */
    public void setTitle(String title) {
        mTitle = title;
        mTitleTextView.setText(mTitle);
        invalidate();
        requestLayout();
    }

    /**
     * Get the title displayed in the toolbar.
     *
     * @return The current title.
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Set the subtitle text in the toolbar.
     *
     * @param subtitle The text to display.
     */
    public void setSubtitle(String subtitle) {
        mSubtitle = subtitle;
        mSubtitleTextView.setText(mSubtitle);
        invalidate();
        requestLayout();
    }

    /**
     * Get the subtitle displayed in the toolbar.
     *
     * @return The current subtitle.
     */
    public String getSubtitle() {
        return mSubtitle;
    }

    /**
     * Show the back button in the toolbar.
     */
    private void showBackButton() {
        mBackButtonView.setVisibility(VISIBLE);
    }
}
