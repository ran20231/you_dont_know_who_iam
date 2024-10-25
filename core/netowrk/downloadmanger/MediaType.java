package com.forsale.core.netowrk.downloadmanger;

import android.os.Environment;
import falcon.chat.entities.Message;
import kotlin.jvm.internal.o;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MediaType.kt */
/* loaded from: classes3.dex */
public final class MediaType {
    private static final /* synthetic */ a00.a $ENTRIES;
    private static final /* synthetic */ MediaType[] $VALUES;
    public static final MediaType IMAGE;
    public static final MediaType PDF;
    private final String directoryType;
    private final String extension;

    private static final /* synthetic */ MediaType[] $values() {
        return new MediaType[]{IMAGE, PDF};
    }

    static {
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        o.h(DIRECTORY_PICTURES, "DIRECTORY_PICTURES");
        IMAGE = new MediaType("IMAGE", 0, "jpg", DIRECTORY_PICTURES);
        String DIRECTORY_DOCUMENTS = Environment.DIRECTORY_DOCUMENTS;
        o.h(DIRECTORY_DOCUMENTS, "DIRECTORY_DOCUMENTS");
        PDF = new MediaType("PDF", 1, Message.PDF, DIRECTORY_DOCUMENTS);
        MediaType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private MediaType(String str, int i11, String str2, String str3) {
        this.extension = str2;
        this.directoryType = str3;
    }

    public static a00.a<MediaType> getEntries() {
        return $ENTRIES;
    }

    public static MediaType valueOf(String str) {
        return (MediaType) Enum.valueOf(MediaType.class, str);
    }

    public static MediaType[] values() {
        return (MediaType[]) $VALUES.clone();
    }

    public final String getDirectoryType() {
        return this.directoryType;
    }

    public final String getExtension() {
        return this.extension;
    }
}
