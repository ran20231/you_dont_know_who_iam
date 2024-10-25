package com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.itemutils.ComposeViewPadding;
import com.forsale.app.utils.itemutils.TextHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: TextModel.kt */
/* loaded from: classes3.dex */
public final class TextModel implements Parcelable {
    public static final Parcelable.Creator<TextModel> CREATOR = new a();

    /* renamed from: d  reason: collision with root package name */
    public static final int f38005d = 8;

    /* renamed from: a  reason: collision with root package name */
    private final TextHolder f38006a;

    /* renamed from: b  reason: collision with root package name */
    private final ComposeViewPadding f38007b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38008c;

    /* compiled from: TextModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<TextModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final TextModel createFromParcel(Parcel parcel) {
            TextHolder createFromParcel;
            o.i(parcel, "parcel");
            ComposeViewPadding composeViewPadding = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = TextHolder.CREATOR.createFromParcel(parcel);
            }
            TextHolder textHolder = createFromParcel;
            if (parcel.readInt() != 0) {
                composeViewPadding = ComposeViewPadding.CREATOR.createFromParcel(parcel);
            }
            return new TextModel(textHolder, composeViewPadding, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final TextModel[] newArray(int i11) {
            return new TextModel[i11];
        }
    }

    public TextModel() {
        this(null, null, 0, 7, null);
    }

    public final ComposeViewPadding a() {
        return this.f38007b;
    }

    public final int b() {
        return this.f38008c;
    }

    public final TextHolder c() {
        return this.f38006a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextModel)) {
            return false;
        }
        TextModel textModel = (TextModel) obj;
        if (o.d(this.f38006a, textModel.f38006a) && o.d(this.f38007b, textModel.f38007b) && this.f38008c == textModel.f38008c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        TextHolder textHolder = this.f38006a;
        int i11 = 0;
        if (textHolder == null) {
            hashCode = 0;
        } else {
            hashCode = textHolder.hashCode();
        }
        int i12 = hashCode * 31;
        ComposeViewPadding composeViewPadding = this.f38007b;
        if (composeViewPadding != null) {
            i11 = composeViewPadding.hashCode();
        }
        return ((i12 + i11) * 31) + Integer.hashCode(this.f38008c);
    }

    public String toString() {
        TextHolder textHolder = this.f38006a;
        ComposeViewPadding composeViewPadding = this.f38007b;
        int i11 = this.f38008c;
        return "TextModel(text=" + textHolder + ", composeViewPadding=" + composeViewPadding + ", maxLines=" + i11 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        TextHolder textHolder = this.f38006a;
        if (textHolder == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textHolder.writeToParcel(out, i11);
        }
        ComposeViewPadding composeViewPadding = this.f38007b;
        if (composeViewPadding == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            composeViewPadding.writeToParcel(out, i11);
        }
        out.writeInt(this.f38008c);
    }

    public TextModel(TextHolder textHolder, ComposeViewPadding composeViewPadding, int i11) {
        this.f38006a = textHolder;
        this.f38007b = composeViewPadding;
        this.f38008c = i11;
    }

    public /* synthetic */ TextModel(TextHolder textHolder, ComposeViewPadding composeViewPadding, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? null : textHolder, (i12 & 2) != 0 ? null : composeViewPadding, (i12 & 4) != 0 ? 1 : i11);
    }
}
