package com.example.thinkcreator.hangoutclone.model;

public class ChatList {
    private String mChatTitle;
    private String mChatText;
    private String mTimeDate;
    private final static int NO_IMAGE_RESOURCE = -1;
    private final static String NO_UNREAD = null;
    //Image Resource Id of the image
    private int mImageResourceId = NO_IMAGE_RESOURCE;
    private String mUnread = NO_UNREAD;

    public ChatList(String chatTitle, String chatText, String timeDate, int imageResourceId) {
        mChatTitle = chatTitle;
        mChatText = chatText;
        mTimeDate = timeDate;
        mImageResourceId = imageResourceId;
    }
    public ChatList(String chatTitle, String chatText, String timeDate, int imageResourceId, String unread) {
        mChatTitle = chatTitle;
        mChatText = chatText;
        mTimeDate = timeDate;
        mImageResourceId = imageResourceId;
        mUnread = unread;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "mChatTitle='" + mChatTitle + '\'' +
                ", mChatText='" + mChatText + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mUnread=" + mUnread +
                '}';
    }
    public String getmChatTitle() {
        return mChatTitle;
    }

    public void setmChatTitle(String mChatTitle) {
        this.mChatTitle = mChatTitle;
    }

    public String getmChatText() {
        return mChatText;
    }

    public void setmChatText(String mChatText) {
        this.mChatText = mChatText;
    }

    public String getmTimeDate() {
        return mTimeDate;
    }

    public void setmTimeDate(String mTimeDate) {
        this.mTimeDate = mTimeDate;
    }
    /**
     * @return image resource id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
    public String getmUnread(){return mUnread;}
    public boolean hasUnread(){return mUnread != NO_UNREAD;}
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_RESOURCE;
    }
}
