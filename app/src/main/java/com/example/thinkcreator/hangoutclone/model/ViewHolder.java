package com.example.thinkcreator.hangoutclone.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.thinkcreator.hangoutclone.R;

public class ViewHolder extends RecyclerView.ViewHolder  {
    public  TextView mChatTitle;
    public  TextView mChatText;
    public  ImageView mImageView;
    public  TextView mDateTime;
    public  TextView mUnread;

    public ViewHolder(View view) {
        super(view);
        mChatTitle = (TextView) view.findViewById(R.id.chat_title);
        mChatText = (TextView) view.findViewById(R.id.chat_text);
        mImageView = (ImageView) view.findViewById(R.id.avatar);
        mDateTime = (TextView) view.findViewById(R.id.date_time);
        mUnread = (TextView) view.findViewById(R.id.unread);
    }


}
