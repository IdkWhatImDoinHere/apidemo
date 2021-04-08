package com.example.apidemo;

public class PostPojo {

        private float UserId;
        private float id;
        private String title;
        private String body;


        // Getter Methods

        public float getUserId() {
            return UserId;
        }

        public float getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getBody() {
            return body;
        }

        // Setter Methods

        public void setUserId(float UserId) {
            this.UserId = UserId;
        }

        public void setId(float id) {
            this.id = id;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setBody(String body) {
            this.body = body;
        }

}
