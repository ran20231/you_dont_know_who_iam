package com.forsale.app.features.categories.normal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: SubCategoryAnalyticsSource.kt */
/* loaded from: classes2.dex */
public abstract class SubCategoryAnalyticsSource implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final String f31072a;

    /* compiled from: SubCategoryAnalyticsSource.kt */
    /* loaded from: classes2.dex */
    public static final class VerticalPage extends SubCategoryAnalyticsSource {
        public static final Parcelable.Creator<VerticalPage> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f31073c = 8;

        /* renamed from: b  reason: collision with root package name */
        private final String f31074b;

        /* compiled from: SubCategoryAnalyticsSource.kt */
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<VerticalPage> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final VerticalPage createFromParcel(Parcel parcel) {
                o.i(parcel, "parcel");
                return new VerticalPage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final VerticalPage[] newArray(int i11) {
                return new VerticalPage[i11];
            }
        }

        public VerticalPage() {
            this(null, 1, null);
        }

        @Override // com.forsale.app.features.categories.normal.SubCategoryAnalyticsSource
        public String b() {
            return this.f31074b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            o.i(out, "out");
            out.writeString(this.f31074b);
        }

        public VerticalPage(String str) {
            super("Vertical Page", null);
            this.f31074b = str;
        }

        public /* synthetic */ VerticalPage(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }
    }

    public /* synthetic */ SubCategoryAnalyticsSource(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f31072a;
    }

    public abstract String b();

    private SubCategoryAnalyticsSource(String str) {
        this.f31072a = str;
    }
}
