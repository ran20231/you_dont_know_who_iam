package com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.utils.itemutils.ComposeViewPadding;
import com.forsale.app.utils.itemutils.TextHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: ActionModel.kt */
/* loaded from: classes3.dex */
public final class ActionModel implements Parcelable {
    public static final Parcelable.Creator<ActionModel> CREATOR = new a();

    /* renamed from: c  reason: collision with root package name */
    public static final int f37991c = 8;

    /* renamed from: a  reason: collision with root package name */
    private final TextHolder f37992a;

    /* renamed from: b  reason: collision with root package name */
    private final ComposeViewPadding f37993b;

    /* compiled from: ActionModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ActionModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final ActionModel createFromParcel(Parcel parcel) {
            ComposeViewPadding createFromParcel;
            o.i(parcel, "parcel");
            TextHolder createFromParcel2 = TextHolder.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ComposeViewPadding.CREATOR.createFromParcel(parcel);
            }
            return new ActionModel(createFromParcel2, createFromParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final ActionModel[] newArray(int i11) {
            return new ActionModel[i11];
        }
    }

    public ActionModel(TextHolder actionText, ComposeViewPadding composeViewPadding) {
        o.i(actionText, "actionText");
        this.f37992a = actionText;
        this.f37993b = composeViewPadding;
    }

    public final TextHolder a() {
        return this.f37992a;
    }

    public final ComposeViewPadding b() {
        return this.f37993b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionModel)) {
            return false;
        }
        ActionModel actionModel = (ActionModel) obj;
        if (o.d(this.f37992a, actionModel.f37992a) && o.d(this.f37993b, actionModel.f37993b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.f37992a.hashCode() * 31;
        ComposeViewPadding composeViewPadding = this.f37993b;
        if (composeViewPadding == null) {
            hashCode = 0;
        } else {
            hashCode = composeViewPadding.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        TextHolder textHolder = this.f37992a;
        ComposeViewPadding composeViewPadding = this.f37993b;
        return "ActionModel(actionText=" + textHolder + ", composeViewPadding=" + composeViewPadding + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        this.f37992a.writeToParcel(out, i11);
        ComposeViewPadding composeViewPadding = this.f37993b;
        if (composeViewPadding == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        composeViewPadding.writeToParcel(out, i11);
    }

    public /* synthetic */ ActionModel(TextHolder textHolder, ComposeViewPadding composeViewPadding, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(textHolder, (i11 & 2) != 0 ? null : composeViewPadding);
    }
}
