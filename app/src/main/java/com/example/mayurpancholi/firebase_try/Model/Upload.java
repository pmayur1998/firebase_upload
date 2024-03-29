package com.example.mayurpancholi.firebase_try.Model;

import com.google.firebase.database.Exclude;

/**
 * Created by mayurpancholi on 17-06-2019.
 */

public class Upload
    {
        private String mName;
        private String mImageUrl;
        private String mKey;

        public Upload() {
            //empty constructor needed
        }

        public Upload(String name, String imageUrl) {
            if (name.trim().equals("")) {
                name = "No Name";
            }

            mName = name;
            mImageUrl = imageUrl;
        }

        public String getName() {
            return mName;
        }

        public void setName(String name) {
            mName = name;
        }

        public String getImageUrl() {
            return mImageUrl;
        }

        public void setImageUrl(String imageUrl) {
            mImageUrl = imageUrl;
        }

        @Exclude
        public String getKey() {
            return mKey;
        }

        @Exclude
        public void setKey(String key) {
            mKey = key;
        }
}


