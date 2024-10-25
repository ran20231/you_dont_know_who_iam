package com.forsale.app.utils;

import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import okhttp3.MediaType;
/* compiled from: FileExtensions.kt */
/* loaded from: classes3.dex */
public final class o {
    public static final void a(File file, InputStream inputStream) {
        kotlin.jvm.internal.o.i(file, "<this>");
        kotlin.jvm.internal.o.i(inputStream, "inputStream");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            e00.a.b(inputStream, fileOutputStream, 0, 2, null);
            e00.b.a(fileOutputStream, null);
            e00.b.a(inputStream, null);
        } finally {
        }
    }

    public static final MediaType b(File file, String defaultExtension) {
        String mimeTypeFromExtension;
        kotlin.jvm.internal.o.i(file, "<this>");
        kotlin.jvm.internal.o.i(defaultExtension, "defaultExtension");
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
        if (fileExtensionFromUrl != null && (mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl)) != null) {
            return MediaType.Companion.parse(mimeTypeFromExtension);
        }
        return null;
    }
}
