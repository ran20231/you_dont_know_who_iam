package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k0;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.MediaTypes;
import com.forsale.app.features.categories.listingdetails.buyerscreen.models.analytics.ItemArgs;
import com.forsale.app.features.categories.listingdetails.models.DetailsModel;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import z3.h;
/* compiled from: MediaDialogArgs.kt */
/* loaded from: classes2.dex */
public final class b implements h {

    /* renamed from: e  reason: collision with root package name */
    public static final a f26298e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    public static final int f26299f = 8;

    /* renamed from: a  reason: collision with root package name */
    private final MediaTypes f26300a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsModel f26301b;

    /* renamed from: c  reason: collision with root package name */
    private final ItemArgs f26302c;

    /* renamed from: d  reason: collision with root package name */
    private final ShareText f26303d;

    /* compiled from: MediaDialogArgs.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(Bundle bundle) {
            MediaTypes mediaTypes;
            DetailsModel detailsModel;
            ItemArgs itemArgs;
            o.i(bundle, "bundle");
            bundle.setClassLoader(b.class.getClassLoader());
            ShareText shareText = null;
            if (bundle.containsKey("media_type")) {
                if (!Parcelable.class.isAssignableFrom(MediaTypes.class) && !Serializable.class.isAssignableFrom(MediaTypes.class)) {
                    throw new UnsupportedOperationException(MediaTypes.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                mediaTypes = (MediaTypes) bundle.get("media_type");
            } else {
                mediaTypes = null;
            }
            if (bundle.containsKey("buyer_model")) {
                if (!Parcelable.class.isAssignableFrom(DetailsModel.class) && !Serializable.class.isAssignableFrom(DetailsModel.class)) {
                    throw new UnsupportedOperationException(DetailsModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                detailsModel = (DetailsModel) bundle.get("buyer_model");
            } else {
                detailsModel = null;
            }
            if (bundle.containsKey("item_args")) {
                if (!Parcelable.class.isAssignableFrom(ItemArgs.class) && !Serializable.class.isAssignableFrom(ItemArgs.class)) {
                    throw new UnsupportedOperationException(ItemArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                itemArgs = (ItemArgs) bundle.get("item_args");
            } else {
                itemArgs = null;
            }
            if (bundle.containsKey("share_text")) {
                if (!Parcelable.class.isAssignableFrom(ShareText.class) && !Serializable.class.isAssignableFrom(ShareText.class)) {
                    throw new UnsupportedOperationException(ShareText.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                shareText = (ShareText) bundle.get("share_text");
            }
            return new b(mediaTypes, detailsModel, itemArgs, shareText);
        }

        public final b b(k0 savedStateHandle) {
            MediaTypes mediaTypes;
            DetailsModel detailsModel;
            ItemArgs itemArgs;
            o.i(savedStateHandle, "savedStateHandle");
            ShareText shareText = null;
            if (savedStateHandle.e("media_type")) {
                if (!Parcelable.class.isAssignableFrom(MediaTypes.class) && !Serializable.class.isAssignableFrom(MediaTypes.class)) {
                    throw new UnsupportedOperationException(MediaTypes.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                mediaTypes = (MediaTypes) savedStateHandle.f("media_type");
            } else {
                mediaTypes = null;
            }
            if (savedStateHandle.e("buyer_model")) {
                if (!Parcelable.class.isAssignableFrom(DetailsModel.class) && !Serializable.class.isAssignableFrom(DetailsModel.class)) {
                    throw new UnsupportedOperationException(DetailsModel.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                detailsModel = (DetailsModel) savedStateHandle.f("buyer_model");
            } else {
                detailsModel = null;
            }
            if (savedStateHandle.e("item_args")) {
                if (!Parcelable.class.isAssignableFrom(ItemArgs.class) && !Serializable.class.isAssignableFrom(ItemArgs.class)) {
                    throw new UnsupportedOperationException(ItemArgs.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                itemArgs = (ItemArgs) savedStateHandle.f("item_args");
            } else {
                itemArgs = null;
            }
            if (savedStateHandle.e("share_text")) {
                if (!Parcelable.class.isAssignableFrom(ShareText.class) && !Serializable.class.isAssignableFrom(ShareText.class)) {
                    throw new UnsupportedOperationException(ShareText.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
                }
                shareText = (ShareText) savedStateHandle.f("share_text");
            }
            return new b(mediaTypes, detailsModel, itemArgs, shareText);
        }
    }

    public b() {
        this(null, null, null, null, 15, null);
    }

    public static final b fromBundle(Bundle bundle) {
        return f26298e.a(bundle);
    }

    public final DetailsModel a() {
        return this.f26301b;
    }

    public final ItemArgs b() {
        return this.f26302c;
    }

    public final MediaTypes c() {
        return this.f26300a;
    }

    public final ShareText d() {
        return this.f26303d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (o.d(this.f26300a, bVar.f26300a) && o.d(this.f26301b, bVar.f26301b) && o.d(this.f26302c, bVar.f26302c) && o.d(this.f26303d, bVar.f26303d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        MediaTypes mediaTypes = this.f26300a;
        int i11 = 0;
        if (mediaTypes == null) {
            hashCode = 0;
        } else {
            hashCode = mediaTypes.hashCode();
        }
        int i12 = hashCode * 31;
        DetailsModel detailsModel = this.f26301b;
        if (detailsModel == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = detailsModel.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        ItemArgs itemArgs = this.f26302c;
        if (itemArgs == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = itemArgs.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        ShareText shareText = this.f26303d;
        if (shareText != null) {
            i11 = shareText.hashCode();
        }
        return i14 + i11;
    }

    public String toString() {
        MediaTypes mediaTypes = this.f26300a;
        DetailsModel detailsModel = this.f26301b;
        ItemArgs itemArgs = this.f26302c;
        ShareText shareText = this.f26303d;
        return "MediaDialogArgs(mediaType=" + mediaTypes + ", buyerModel=" + detailsModel + ", itemArgs=" + itemArgs + ", shareText=" + shareText + ")";
    }

    public b(MediaTypes mediaTypes, DetailsModel detailsModel, ItemArgs itemArgs, ShareText shareText) {
        this.f26300a = mediaTypes;
        this.f26301b = detailsModel;
        this.f26302c = itemArgs;
        this.f26303d = shareText;
    }

    public /* synthetic */ b(MediaTypes mediaTypes, DetailsModel detailsModel, ItemArgs itemArgs, ShareText shareText, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : mediaTypes, (i11 & 2) != 0 ? null : detailsModel, (i11 & 4) != 0 ? null : itemArgs, (i11 & 8) != 0 ? null : shareText);
    }
}
