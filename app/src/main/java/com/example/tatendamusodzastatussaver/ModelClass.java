package com.example.tatendamusodzastatussaver;

import android.net.Uri;

public class ModelClass {
    String path,filenane;
    Uri uri;

    public ModelClass(String path, String filenane, Uri uri) {
        this.path = path;
        this.filenane = filenane;
        this.uri = uri;
    }

    public ModelClass() {
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilenane() {
        return filenane;
    }

    public void setFilenane(String filenane) {
        this.filenane = filenane;
    }

    public Uri getUri() {
        return uri;
    }

    public void setUri(Uri uri) {
        this.uri = uri;
    }

}
