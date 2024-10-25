package com.forsale.app.ui.bottomsheets.alertbottomsheet.items.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.features.postad.PostAdDialogs;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: AlertModel.kt */
/* loaded from: classes3.dex */
public final class AlertModel implements Parcelable {
    public static final Parcelable.Creator<AlertModel> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    public static final int f37994i = 8;

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37995a;

    /* renamed from: b  reason: collision with root package name */
    private final PostAdDialogs f37996b;

    /* renamed from: c  reason: collision with root package name */
    private final ImageModel f37997c;

    /* renamed from: d  reason: collision with root package name */
    private final TextModel f37998d;

    /* renamed from: e  reason: collision with root package name */
    private final TextModel f37999e;

    /* renamed from: f  reason: collision with root package name */
    private final TextModelCustom f38000f;

    /* renamed from: g  reason: collision with root package name */
    private final ActionModel f38001g;

    /* renamed from: h  reason: collision with root package name */
    private final ActionModel f38002h;

    /* compiled from: AlertModel.kt */
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<AlertModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final AlertModel createFromParcel(Parcel parcel) {
            boolean z11;
            ImageModel createFromParcel;
            TextModel createFromParcel2;
            TextModel createFromParcel3;
            TextModelCustom createFromParcel4;
            ActionModel createFromParcel5;
            o.i(parcel, "parcel");
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z12 = z11;
            PostAdDialogs valueOf = PostAdDialogs.valueOf(parcel.readString());
            ActionModel actionModel = null;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
            } else {
                createFromParcel = ImageModel.CREATOR.createFromParcel(parcel);
            }
            ImageModel imageModel = createFromParcel;
            if (parcel.readInt() == 0) {
                createFromParcel2 = null;
            } else {
                createFromParcel2 = TextModel.CREATOR.createFromParcel(parcel);
            }
            TextModel textModel = createFromParcel2;
            if (parcel.readInt() == 0) {
                createFromParcel3 = null;
            } else {
                createFromParcel3 = TextModel.CREATOR.createFromParcel(parcel);
            }
            TextModel textModel2 = createFromParcel3;
            if (parcel.readInt() == 0) {
                createFromParcel4 = null;
            } else {
                createFromParcel4 = TextModelCustom.CREATOR.createFromParcel(parcel);
            }
            TextModelCustom textModelCustom = createFromParcel4;
            if (parcel.readInt() == 0) {
                createFromParcel5 = null;
            } else {
                createFromParcel5 = ActionModel.CREATOR.createFromParcel(parcel);
            }
            ActionModel actionModel2 = createFromParcel5;
            if (parcel.readInt() != 0) {
                actionModel = ActionModel.CREATOR.createFromParcel(parcel);
            }
            return new AlertModel(z12, valueOf, imageModel, textModel, textModel2, textModelCustom, actionModel2, actionModel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final AlertModel[] newArray(int i11) {
            return new AlertModel[i11];
        }
    }

    public AlertModel(boolean z11, PostAdDialogs dialogType, ImageModel imageModel, TextModel textModel, TextModel textModel2, TextModelCustom textModelCustom, ActionModel actionModel, ActionModel actionModel2) {
        o.i(dialogType, "dialogType");
        this.f37995a = z11;
        this.f37996b = dialogType;
        this.f37997c = imageModel;
        this.f37998d = textModel;
        this.f37999e = textModel2;
        this.f38000f = textModelCustom;
        this.f38001g = actionModel;
        this.f38002h = actionModel2;
    }

    public final ActionModel a() {
        return this.f38001g;
    }

    public final ActionModel b() {
        return this.f38002h;
    }

    public final TextModelCustom c() {
        return this.f38000f;
    }

    public final TextModel d() {
        return this.f37999e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final PostAdDialogs e() {
        return this.f37996b;
    }

    public final ImageModel f() {
        return this.f37997c;
    }

    public final TextModel g() {
        return this.f37998d;
    }

    public final boolean h() {
        return this.f37995a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f37995a ? 1 : 0);
        out.writeString(this.f37996b.name());
        ImageModel imageModel = this.f37997c;
        if (imageModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            imageModel.writeToParcel(out, i11);
        }
        TextModel textModel = this.f37998d;
        if (textModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textModel.writeToParcel(out, i11);
        }
        TextModel textModel2 = this.f37999e;
        if (textModel2 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textModel2.writeToParcel(out, i11);
        }
        TextModelCustom textModelCustom = this.f38000f;
        if (textModelCustom == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            textModelCustom.writeToParcel(out, i11);
        }
        ActionModel actionModel = this.f38001g;
        if (actionModel == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            actionModel.writeToParcel(out, i11);
        }
        ActionModel actionModel2 = this.f38002h;
        if (actionModel2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        actionModel2.writeToParcel(out, i11);
    }

    public /* synthetic */ AlertModel(boolean z11, PostAdDialogs postAdDialogs, ImageModel imageModel, TextModel textModel, TextModel textModel2, TextModelCustom textModelCustom, ActionModel actionModel, ActionModel actionModel2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(z11, postAdDialogs, (i11 & 4) != 0 ? null : imageModel, (i11 & 8) != 0 ? null : textModel, (i11 & 16) != 0 ? null : textModel2, (i11 & 32) != 0 ? null : textModelCustom, (i11 & 64) != 0 ? null : actionModel, (i11 & 128) != 0 ? null : actionModel2);
    }
}
