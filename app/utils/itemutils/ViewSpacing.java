package com.forsale.app.utils.itemutils;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ViewSpacing.kt */
/* loaded from: classes3.dex */
public final class ViewSpacing implements Parcelable {
    public static final Parcelable.Creator<ViewSpacing> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final int f40322c = 8;

    /* renamed from: a  reason: collision with root package name */
    private ViewMargins f40323a;

    /* renamed from: b  reason: collision with root package name */
    private ViewPadding f40324b;

    /* compiled from: ViewSpacing.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ViewSpacing> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ViewSpacing createFromParcel(Parcel parcel) {
            ViewMargins createFromParcel;
            o.i(parcel, "parcel");
            ViewPadding viewPadding = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ViewMargins.CREATOR.createFromParcel(parcel);
            }
            ViewMargins viewMargins = createFromParcel;
            if (parcel.readInt() != 0) {
                viewPadding = ViewPadding.CREATOR.createFromParcel(parcel);
            }
            return new ViewSpacing(viewMargins, viewPadding);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ViewSpacing[] newArray(int i11) {
            return new ViewSpacing[i11];
        }
    }

    public ViewSpacing() {
        this(null, null, 3, null);
    }

    public final ViewMargins a() {
        return this.f40323a;
    }

    public final ViewPadding b() {
        return this.f40324b;
    }

    public final void c(ViewMargins viewMargins) {
        this.f40323a = viewMargins;
    }

    public final void d(ViewPadding viewPadding) {
        this.f40324b = viewPadding;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ViewSpacing)) {
            return false;
        }
        ViewSpacing viewSpacing = (ViewSpacing) obj;
        if (o.d(this.f40323a, viewSpacing.f40323a) && o.d(this.f40324b, viewSpacing.f40324b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        ViewMargins viewMargins = this.f40323a;
        int i11 = 0;
        if (viewMargins == null) {
            hashCode = 0;
        } else {
            hashCode = viewMargins.hashCode();
        }
        int i12 = hashCode * 31;
        ViewPadding viewPadding = this.f40324b;
        if (viewPadding != null) {
            i11 = viewPadding.hashCode();
        }
        return i12 + i11;
    }

    public String toString() {
        ViewMargins viewMargins = this.f40323a;
        ViewPadding viewPadding = this.f40324b;
        return "ViewSpacing(viewMargins=" + viewMargins + ", viewPadding=" + viewPadding + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        ViewMargins viewMargins = this.f40323a;
        if (viewMargins == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            viewMargins.writeToParcel(out, i11);
        }
        ViewPadding viewPadding = this.f40324b;
        if (viewPadding == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        viewPadding.writeToParcel(out, i11);
    }

    public ViewSpacing(ViewMargins viewMargins, ViewPadding viewPadding) {
        this.f40323a = viewMargins;
        this.f40324b = viewPadding;
    }

    public /* synthetic */ ViewSpacing(ViewMargins viewMargins, ViewPadding viewPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : viewMargins, (i11 & 2) != 0 ? null : viewPadding);
    }
}
