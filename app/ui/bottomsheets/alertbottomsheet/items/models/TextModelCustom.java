package com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.o;
/* compiled from: TextModelCustom.kt */
/* loaded from: classes3.dex */
public final class TextModelCustom implements Parcelable {
    public static final Parcelable.Creator<TextModelCustom> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f38009d = 8;

    /* renamed from: a  reason: collision with root package name */
    private TextModel f38010a;

    /* renamed from: b  reason: collision with root package name */
    private String f38011b;

    /* renamed from: c  reason: collision with root package name */
    private TextModel f38012c;

    /* compiled from: TextModelCustom.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<TextModelCustom> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TextModelCustom createFromParcel(Parcel parcel) {
            TextModel createFromParcel;
            o.i(parcel, "parcel");
            Parcelable.Creator<TextModel> creator = TextModel.CREATOR;
            TextModel createFromParcel2 = creator.createFromParcel(parcel);
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = creator.createFromParcel(parcel);
            }
            return new TextModelCustom(createFromParcel2, readString, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final TextModelCustom[] newArray(int i11) {
            return new TextModelCustom[i11];
        }
    }

    public TextModelCustom(TextModel subTitle, String str, TextModel textModel) {
        o.i(subTitle, "subTitle");
        this.f38010a = subTitle;
        this.f38011b = str;
        this.f38012c = textModel;
    }

    public final String a() {
        return this.f38011b;
    }

    public final TextModel b() {
        return this.f38012c;
    }

    public final TextModel c() {
        return this.f38010a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        this.f38010a.writeToParcel(out, i11);
        out.writeString(this.f38011b);
        TextModel textModel = this.f38012c;
        if (textModel == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        textModel.writeToParcel(out, i11);
    }
}
