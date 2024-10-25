package com.forsale.app.utils.itemutils;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import wz.e;
import wz.h;
/* compiled from: TextHolder.kt */
/* loaded from: classes3.dex */
public final class TextHolder implements Parcelable {
    public static final Parcelable.Creator<TextHolder> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final int f40296f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final Integer f40297a;

    /* renamed from: b  reason: collision with root package name */
    private final LocalizedText f40298b;

    /* renamed from: c  reason: collision with root package name */
    private final List<Object> f40299c;

    /* renamed from: d  reason: collision with root package name */
    private final h f40300d;

    /* renamed from: e  reason: collision with root package name */
    private final h f40301e;

    /* compiled from: TextHolder.kt */
    /* loaded from: classes3.dex */
    public static final class LocalizedText implements Parcelable {
        public static final Parcelable.Creator<LocalizedText> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f40302c = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f40303a;

        /* renamed from: b  reason: collision with root package name */
        private final String f40304b;

        /* compiled from: TextHolder.kt */
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<LocalizedText> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final LocalizedText createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new LocalizedText(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final LocalizedText[] newArray(int i11) {
                return new LocalizedText[i11];
            }
        }

        public LocalizedText(String str, String str2) {
            this.f40303a = str;
            this.f40304b = str2;
        }

        public final String a() {
            return this.f40303a;
        }

        public final String b() {
            return this.f40304b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LocalizedText)) {
                return false;
            }
            LocalizedText localizedText = (LocalizedText) obj;
            if (o.d(this.f40303a, localizedText.f40303a) && o.d(this.f40304b, localizedText.f40304b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            String str = this.f40303a;
            int i11 = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i12 = hashCode * 31;
            String str2 = this.f40304b;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            return i12 + i11;
        }

        public String toString() {
            String str = this.f40303a;
            String str2 = this.f40304b;
            return "LocalizedText(textAr=" + str + ", textEn=" + str2 + ")";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f40303a);
            out.writeString(this.f40304b);
        }
    }

    /* compiled from: TextHolder.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<TextHolder> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TextHolder createFromParcel(Parcel parcel) {
            Integer valueOf;
            LocalizedText createFromParcel;
            o.i(parcel, "parcel");
            ArrayList arrayList = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = LocalizedText.CREATOR.createFromParcel(parcel);
            }
            LocalizedText localizedText = createFromParcel;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList2.add(parcel.readValue(TextHolder.class.getClassLoader()));
                }
                arrayList = arrayList2;
            }
            return new TextHolder(valueOf, localizedText, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final TextHolder[] newArray(int i11) {
            return new TextHolder[i11];
        }
    }

    /* compiled from: TextHolder.kt */
    /* loaded from: classes3.dex */
    static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f40308a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(l function) {
            o.i(function, "function");
            this.f40308a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f40308a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40308a.invoke(obj);
        }
    }

    public TextHolder() {
        this(null, null, null, 7, null);
    }

    public final z<List<Object>> c() {
        return (z) this.f40301e.getValue();
    }

    public final Integer d() {
        return this.f40297a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final z<String> e() {
        return (z) this.f40300d.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextHolder)) {
            return false;
        }
        TextHolder textHolder = (TextHolder) obj;
        if (o.d(this.f40297a, textHolder.f40297a) && o.d(this.f40298b, textHolder.f40298b) && o.d(this.f40299c, textHolder.f40299c)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        Integer num = this.f40297a;
        int i11 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i12 = hashCode * 31;
        LocalizedText localizedText = this.f40298b;
        if (localizedText == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = localizedText.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        List<Object> list = this.f40299c;
        if (list != null) {
            i11 = list.hashCode();
        }
        return i13 + i11;
    }

    public String toString() {
        Integer num = this.f40297a;
        LocalizedText localizedText = this.f40298b;
        List<Object> list = this.f40299c;
        return "TextHolder(textResource=" + num + ", textString=" + localizedText + ", textArgs=" + list + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        Integer num = this.f40297a;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        LocalizedText localizedText = this.f40298b;
        if (localizedText == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            localizedText.writeToParcel(out, i11);
        }
        List<Object> list = this.f40299c;
        if (list == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(list.size());
        for (Object obj : list) {
            out.writeValue(obj);
        }
    }

    public TextHolder(Integer num, LocalizedText localizedText, List<? extends Object> list) {
        this.f40297a = num;
        this.f40298b = localizedText;
        this.f40299c = list;
        this.f40300d = c.a(new TextHolder$titleTxt$2(this));
        this.f40301e = c.a(new TextHolder$args$2(this));
    }

    public /* synthetic */ TextHolder(Integer num, LocalizedText localizedText, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : num, (i11 & 2) != 0 ? null : localizedText, (i11 & 4) != 0 ? null : list);
    }
}
