package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import androidx.compose.runtime.c;
import falcon.chat.entities.Message;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import t9.q0;
import yj.d;
/* compiled from: FilePreview.kt */
/* loaded from: classes2.dex */
public final class FileMetaData implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final String f26886a;

    /* renamed from: b  reason: collision with root package name */
    private final String f26887b;

    /* renamed from: c  reason: collision with root package name */
    private final FileType f26888c;

    /* renamed from: d  reason: collision with root package name */
    private final String f26889d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FilePreview.kt */
    /* loaded from: classes2.dex */
    public static final class FileType {
        private static final /* synthetic */ a00.a $ENTRIES;
        private static final /* synthetic */ FileType[] $VALUES;
        public static final a Companion;
        public static final FileType PDF = new FileType("PDF", 0);
        public static final FileType JPEG = new FileType("JPEG", 1);
        public static final FileType PNG = new FileType("PNG", 2);
        public static final FileType Other = new FileType("Other", 3);

        /* compiled from: FilePreview.kt */
        /* loaded from: classes2.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final FileType a(String value) {
                boolean L;
                boolean L2;
                boolean L3;
                o.i(value, "value");
                L = StringsKt__StringsKt.L(value, Message.PDF, true);
                if (!L) {
                    L2 = StringsKt__StringsKt.L(value, "jpeg", true);
                    if (!L2) {
                        L3 = StringsKt__StringsKt.L(value, "png", true);
                        if (L3) {
                            return FileType.PNG;
                        }
                        return FileType.Other;
                    }
                    return FileType.JPEG;
                }
                return FileType.PDF;
            }
        }

        private static final /* synthetic */ FileType[] $values() {
            return new FileType[]{PDF, JPEG, PNG, Other};
        }

        static {
            FileType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            Companion = new a(null);
        }

        private FileType(String str, int i11) {
        }

        public static a00.a<FileType> getEntries() {
            return $ENTRIES;
        }

        public static FileType valueOf(String str) {
            return (FileType) Enum.valueOf(FileType.class, str);
        }

        public static FileType[] values() {
            return (FileType[]) $VALUES.clone();
        }
    }

    /* compiled from: FilePreview.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f26890a;

        static {
            int[] iArr = new int[FileType.values().length];
            try {
                iArr[FileType.PDF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileType.JPEG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FileType.PNG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FileType.Other.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f26890a = iArr;
        }
    }

    public FileMetaData() {
        this(null, null, null, null, 15, null);
    }

    public final String a() {
        return this.f26889d;
    }

    public final String b() {
        return this.f26886a;
    }

    public final String c() {
        return this.f26887b;
    }

    public final int d() {
        int i11 = a.f26890a[this.f26888c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return -1;
                    }
                    throw new NoWhenBranchMatchedException();
                }
                return q0.M2;
            }
            return q0.E2;
        }
        return q0.K2;
    }

    public final long e(androidx.compose.runtime.a aVar, int i11) {
        long g11;
        aVar.C(-1691517273);
        if (c.I()) {
            c.U(-1691517273, i11, -1, "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData.<get-thumbIConTint> (FilePreview.kt:165)");
        }
        int i12 = a.f26890a[this.f26888c.ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        aVar.C(1458769695);
                        g11 = dk.a.f54291a.a(aVar, dk.a.f54292b).g().c(aVar, d.f76453b);
                        aVar.S();
                    } else {
                        aVar.C(1458762933);
                        aVar.S();
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    aVar.C(1458769623);
                    g11 = dk.a.f54291a.a(aVar, dk.a.f54292b).i().g(aVar, d.f76453b);
                    aVar.S();
                }
            } else {
                aVar.C(1458769552);
                g11 = dk.a.f54291a.a(aVar, dk.a.f54292b).f().g(aVar, d.f76453b);
                aVar.S();
            }
        } else {
            aVar.C(1458769480);
            g11 = dk.a.f54291a.a(aVar, dk.a.f54292b).d().g(aVar, d.f76453b);
            aVar.S();
        }
        if (c.I()) {
            c.T();
        }
        aVar.S();
        return g11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FileMetaData)) {
            return false;
        }
        FileMetaData fileMetaData = (FileMetaData) obj;
        if (o.d(this.f26886a, fileMetaData.f26886a) && o.d(this.f26887b, fileMetaData.f26887b) && this.f26888c == fileMetaData.f26888c && o.d(this.f26889d, fileMetaData.f26889d)) {
            return true;
        }
        return false;
    }

    public final FileType f() {
        return this.f26888c;
    }

    public int hashCode() {
        return (((((this.f26886a.hashCode() * 31) + this.f26887b.hashCode()) * 31) + this.f26888c.hashCode()) * 31) + this.f26889d.hashCode();
    }

    public String toString() {
        String str = this.f26886a;
        String str2 = this.f26887b;
        FileType fileType = this.f26888c;
        String str3 = this.f26889d;
        return "FileMetaData(name=" + str + ", size=" + str2 + ", type=" + fileType + ", image=" + str3 + ")";
    }

    public FileMetaData(String name, String size, FileType type, String image) {
        o.i(name, "name");
        o.i(size, "size");
        o.i(type, "type");
        o.i(image, "image");
        this.f26886a = name;
        this.f26887b = size;
        this.f26888c = type;
        this.f26889d = image;
    }

    public /* synthetic */ FileMetaData(String str, String str2, FileType fileType, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? FileType.Other : fileType, (i11 & 8) != 0 ? "" : str3);
    }
}
