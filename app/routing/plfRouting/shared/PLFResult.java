package com.forsale.app.routing.plfRouting.shared;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: PLFResult.kt */
/* loaded from: classes2.dex */
public final class PLFResult implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f37814a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f37815b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37816c;

    /* renamed from: d  reason: collision with root package name */
    private final String f37817d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f37812e = new a(null);
    public static final Parcelable.Creator<PLFResult> CREATOR = new b();

    /* renamed from: f  reason: collision with root package name */
    public static final int f37813f = 8;

    /* compiled from: PLFResult.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PLFResult a(Intent intent) {
            boolean z11;
            boolean z12;
            String str;
            boolean z13 = false;
            if (intent != null) {
                z11 = intent.getBooleanExtra("IS_SUCCESS", false);
            } else {
                z11 = false;
            }
            if (intent != null) {
                z12 = intent.getBooleanExtra("ATTEMPT_ABUSE", false);
            } else {
                z12 = false;
            }
            if (intent != null) {
                str = intent.getStringExtra("navigatingDeepLink");
            } else {
                str = null;
            }
            if (intent != null) {
                z13 = intent.getBooleanExtra("MEDIA_UPLOAD_FAILED", false);
            }
            return new PLFResult(z12, z11, z13, str);
        }
    }

    /* compiled from: PLFResult.kt */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<PLFResult> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final PLFResult createFromParcel(Parcel parcel) {
            boolean z11;
            boolean z12;
            o.i(parcel, "parcel");
            boolean z13 = true;
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() == 0) {
                z13 = false;
            }
            return new PLFResult(z11, z12, z13, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final PLFResult[] newArray(int i11) {
            return new PLFResult[i11];
        }
    }

    public PLFResult() {
        this(false, false, false, null, 15, null);
    }

    public final boolean a() {
        return this.f37814a;
    }

    public final String b() {
        return this.f37817d;
    }

    public final boolean c() {
        return this.f37816c;
    }

    public final boolean d() {
        return this.f37815b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PLFResult)) {
            return false;
        }
        PLFResult pLFResult = (PLFResult) obj;
        if (this.f37814a == pLFResult.f37814a && this.f37815b == pLFResult.f37815b && this.f37816c == pLFResult.f37816c && o.d(this.f37817d, pLFResult.f37817d)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public int hashCode() {
        int hashCode;
        boolean z11 = this.f37814a;
        int i11 = 1;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i12 = r02 * 31;
        ?? r22 = this.f37815b;
        int i13 = r22;
        if (r22 != 0) {
            i13 = 1;
        }
        int i14 = (i12 + i13) * 31;
        boolean z12 = this.f37816c;
        if (!z12) {
            i11 = z12 ? 1 : 0;
        }
        int i15 = (i14 + i11) * 31;
        String str = this.f37817d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i15 + hashCode;
    }

    public String toString() {
        boolean z11 = this.f37814a;
        boolean z12 = this.f37815b;
        boolean z13 = this.f37816c;
        String str = this.f37817d;
        return "PLFResult(attemptAbuse=" + z11 + ", isSuccess=" + z12 + ", mediaUploadingFailed=" + z13 + ", deepLinkToNavigateTo=" + str + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeInt(this.f37814a ? 1 : 0);
        out.writeInt(this.f37815b ? 1 : 0);
        out.writeInt(this.f37816c ? 1 : 0);
        out.writeString(this.f37817d);
    }

    public PLFResult(boolean z11, boolean z12, boolean z13, String str) {
        this.f37814a = z11;
        this.f37815b = z12;
        this.f37816c = z13;
        this.f37817d = str;
    }

    public /* synthetic */ PLFResult(boolean z11, boolean z12, boolean z13, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? null : str);
    }
}
