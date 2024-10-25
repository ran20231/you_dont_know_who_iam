package com.forsale.app.features.categories.user.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: UserProfileData.kt */
/* loaded from: classes2.dex */
public final class UserProfileData implements Parcelable {
    public static final a CREATOR = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f31153a;

    /* renamed from: b  reason: collision with root package name */
    private final String f31154b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31155c;

    /* renamed from: d  reason: collision with root package name */
    private final String f31156d;

    /* renamed from: e  reason: collision with root package name */
    private final Integer f31157e;

    /* renamed from: f  reason: collision with root package name */
    private final String f31158f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f31159g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f31160h;

    /* renamed from: i  reason: collision with root package name */
    private final String f31161i;

    /* compiled from: UserProfileData.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<UserProfileData> {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public UserProfileData createFromParcel(Parcel parcel) {
            o.i(parcel, "parcel");
            return new UserProfileData(parcel);
        }

        public final UserProfileData b(ListingUser listingUser, Integer num) {
            o.i(listingUser, "listingUser");
            return new UserProfileData(listingUser.getId(), listingUser.getName(), listingUser.getPhone(), listingUser.getImage(), num, listingUser.getMemberSince(), Integer.valueOf(listingUser.isFollowing()), Integer.valueOf(listingUser.getAllowFollow()), null, 256, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: c */
        public UserProfileData[] newArray(int i11) {
            return new UserProfileData[i11];
        }
    }

    public UserProfileData(long j11, String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5) {
        this.f31153a = j11;
        this.f31154b = str;
        this.f31155c = str2;
        this.f31156d = str3;
        this.f31157e = num;
        this.f31158f = str4;
        this.f31159g = num2;
        this.f31160h = num3;
        this.f31161i = str5;
    }

    public final Integer a() {
        return this.f31157e;
    }

    public final Integer b() {
        return this.f31160h;
    }

    public final long c() {
        return this.f31153a;
    }

    public final String d() {
        return this.f31156d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f31161i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserProfileData)) {
            return false;
        }
        UserProfileData userProfileData = (UserProfileData) obj;
        if (this.f31153a == userProfileData.f31153a && o.d(this.f31154b, userProfileData.f31154b) && o.d(this.f31155c, userProfileData.f31155c) && o.d(this.f31156d, userProfileData.f31156d) && o.d(this.f31157e, userProfileData.f31157e) && o.d(this.f31158f, userProfileData.f31158f) && o.d(this.f31159g, userProfileData.f31159g) && o.d(this.f31160h, userProfileData.f31160h) && o.d(this.f31161i, userProfileData.f31161i)) {
            return true;
        }
        return false;
    }

    public final String f() {
        return this.f31158f;
    }

    public final String g() {
        return this.f31154b;
    }

    public final String h() {
        return this.f31155c;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = Long.hashCode(this.f31153a) * 31;
        String str = this.f31154b;
        int i11 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i12 = (hashCode8 + hashCode) * 31;
        String str2 = this.f31155c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i13 = (i12 + hashCode2) * 31;
        String str3 = this.f31156d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i14 = (i13 + hashCode3) * 31;
        Integer num = this.f31157e;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i15 = (i14 + hashCode4) * 31;
        String str4 = this.f31158f;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i16 = (i15 + hashCode5) * 31;
        Integer num2 = this.f31159g;
        if (num2 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num2.hashCode();
        }
        int i17 = (i16 + hashCode6) * 31;
        Integer num3 = this.f31160h;
        if (num3 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num3.hashCode();
        }
        int i18 = (i17 + hashCode7) * 31;
        String str5 = this.f31161i;
        if (str5 != null) {
            i11 = str5.hashCode();
        }
        return i18 + i11;
    }

    public final Integer i() {
        return this.f31159g;
    }

    public String toString() {
        long j11 = this.f31153a;
        String str = this.f31154b;
        String str2 = this.f31155c;
        String str3 = this.f31156d;
        Integer num = this.f31157e;
        String str4 = this.f31158f;
        Integer num2 = this.f31159g;
        Integer num3 = this.f31160h;
        String str5 = this.f31161i;
        return "UserProfileData(id=" + j11 + ", name=" + str + ", phone=" + str2 + ", imageUrl=" + str3 + ", adId=" + num + ", memberSince=" + str4 + ", isFollowing=" + num2 + ", allowFollowing=" + num3 + ", maskedPhone=" + str5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        o.i(parcel, "parcel");
        parcel.writeLong(this.f31153a);
        parcel.writeString(this.f31154b);
        parcel.writeString(this.f31155c);
        parcel.writeString(this.f31156d);
        parcel.writeValue(this.f31157e);
        parcel.writeString(this.f31158f);
        parcel.writeValue(this.f31159g);
        parcel.writeValue(this.f31160h);
        parcel.writeString(this.f31161i);
    }

    public /* synthetic */ UserProfileData(long j11, String str, String str2, String str3, Integer num, String str4, Integer num2, Integer num3, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, str2, str3, num, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : num2, (i11 & 128) != 0 ? null : num3, (i11 & 256) != 0 ? null : str5);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public UserProfileData(android.os.Parcel r13) {
        /*
            r12 = this;
            java.lang.String r0 = "parcel"
            kotlin.jvm.internal.o.i(r13, r0)
            long r2 = r13.readLong()
            java.lang.String r4 = r13.readString()
            java.lang.String r5 = r13.readString()
            java.lang.String r6 = r13.readString()
            java.lang.Class r0 = java.lang.Integer.TYPE
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r13.readValue(r1)
            boolean r7 = r1 instanceof java.lang.Integer
            r8 = 0
            if (r7 == 0) goto L28
            java.lang.Integer r1 = (java.lang.Integer) r1
            r7 = r1
            goto L29
        L28:
            r7 = r8
        L29:
            java.lang.String r9 = r13.readString()
            java.lang.ClassLoader r1 = r0.getClassLoader()
            java.lang.Object r1 = r13.readValue(r1)
            boolean r10 = r1 instanceof java.lang.Integer
            if (r10 == 0) goto L3d
            java.lang.Integer r1 = (java.lang.Integer) r1
            r10 = r1
            goto L3e
        L3d:
            r10 = r8
        L3e:
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Object r0 = r13.readValue(r0)
            boolean r1 = r0 instanceof java.lang.Integer
            if (r1 == 0) goto L4d
            java.lang.Integer r0 = (java.lang.Integer) r0
            goto L4e
        L4d:
            r0 = r8
        L4e:
            java.lang.String r11 = r13.readString()
            r1 = r12
            r8 = r9
            r9 = r10
            r10 = r0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.user.profile.UserProfileData.<init>(android.os.Parcel):void");
    }
}
