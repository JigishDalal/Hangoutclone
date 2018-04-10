package com.example.thinkcreator.hangoutclone.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.thinkcreator.hangoutclone.R;
import com.example.thinkcreator.hangoutclone.model.ChatList;
import com.example.thinkcreator.hangoutclone.model.ViewHolder;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ViewHolder> {
    private List<ChatList> mChats;
    private Context mContext;
    public ChatAdapter(Context context, List<ChatList> chats){
        mChats=chats;
        mContext=context;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.row_item,viewGroup,false));
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final ChatList row = mChats.get(position);
        holder.mChatTitle.setText(row.getmChatTitle());
        holder.mChatText.setText(row.getmChatText());
        holder.mDateTime.setText(row.getmTimeDate());
        if (row.hasUnread()) {
            holder.mUnread.setText(String.valueOf(row.getmUnread()));
            holder.mUnread.setVisibility(View.VISIBLE);
        } else {
            holder.mUnread.setVisibility(View.INVISIBLE);
        }
        holder.mUnread.setText(String.valueOf(row.getmUnread()));
        if (row.hasImage()) {
            holder.mImageView.setImageResource(row.getImageResourceId());
            holder.mImageView.setVisibility(View.VISIBLE);
        } else {
            holder.mImageView.setVisibility(View.GONE);
        }

    }


    @Override
    public int getItemCount() {
        if (null == mChats) return 0;
        return mChats.size();

    }
}
