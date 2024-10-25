package com.forsale.app.datalayer.network.responses;

import up.c;
/* compiled from: UploadFileAttributeResponse.kt */
/* loaded from: classes2.dex */
public final class UploadFileAttributeResponse {
    public static final int $stable = 0;
    @c("file")
    private final String file;
    @c("image")
    private final String image;

    public UploadFileAttributeResponse(String str, String str2) {
        this.file = str;
        this.image = str2;
    }

    public final String getFile() {
        return this.file;
    }

    public final String getImage() {
        return this.image;
    }
}
