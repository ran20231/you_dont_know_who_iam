package com.forsale.app.datalayer.network.responses;

import kotlin.jvm.internal.o;
import up.c;
/* compiled from: UploadImageResponse.kt */
/* loaded from: classes2.dex */
public final class UploadImageResponse {
    public static final int $stable = 0;
    @c("image")
    private final String image;

    public UploadImageResponse(String image) {
        o.i(image, "image");
        this.image = image;
    }

    public static /* synthetic */ UploadImageResponse copy$default(UploadImageResponse uploadImageResponse, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = uploadImageResponse.image;
        }
        return uploadImageResponse.copy(str);
    }

    public final String component1() {
        return this.image;
    }

    public final UploadImageResponse copy(String image) {
        o.i(image, "image");
        return new UploadImageResponse(image);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof UploadImageResponse) && o.d(this.image, ((UploadImageResponse) obj).image)) {
            return true;
        }
        return false;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.image.hashCode();
    }

    public String toString() {
        String str = this.image;
        return "UploadImageResponse(image=" + str + ")";
    }
}
