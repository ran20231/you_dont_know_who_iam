package com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.itemutils.ComposeViewPadding;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ImageModel.kt */
/* loaded from: classes3.dex */
public final class ImageModel implements Parcelable {
    public static final Parcelable.Creator<ImageModel> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f38003a;

    /* renamed from: b  reason: collision with root package name */
    private final ComposeViewPadding f38004b;

    /* compiled from: ImageModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ImageModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ImageModel createFromParcel(Parcel parcel) {
            ComposeViewPadding createFromParcel;
            o.i(parcel, "parcel");
            int readInt = parcel.readInt();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ComposeViewPadding.CREATOR.createFromParcel(parcel);
            }
            return new ImageModel(readInt, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ImageModel[] newArray(int i11) {
            return new ImageModel[i11];
        }
    }

    public ImageModel(int i11, ComposeViewPadding composeViewPadding) {
        this.f38003a = i11;
        this.f38004b = composeViewPadding;
    }

    public final ComposeViewPadding a() {
        return this.f38004b;
    }

    public final int b() {
        return this.f38003a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f38003a);
        ComposeViewPadding composeViewPadding = this.f38004b;
        if (composeViewPadding == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        composeViewPadding.writeToParcel(out, i11);
    }

    public /* synthetic */ ImageModel(int i11, ComposeViewPadding composeViewPadding, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i12 & 2) != 0 ? null : composeViewPadding);
    }
}
