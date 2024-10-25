package com.forsale.adserver.view.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.forsale.analytics.commercial.CommercialItemDetailsSource;
import commercial.CommercialTabName;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;
/* compiled from: DetailsModel.kt */
/* loaded from: classes2.dex */
public final class DetailsModel implements Parcelable {
    public static final Parcelable.Creator<DetailsModel> CREATOR = new a();

    /* renamed from: y  reason: collision with root package name */
    public static final int f21067y = 8;

    /* renamed from: a  reason: collision with root package name */
    private final CommercialItemDetailsSource f21068a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailsIntention f21069b;

    /* renamed from: c  reason: collision with root package name */
    private final CommercialTabName f21070c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f21071d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Integer> f21072e;

    /* renamed from: f  reason: collision with root package name */
    private final Boolean f21073f;

    /* renamed from: g  reason: collision with root package name */
    private final Integer f21074g;

    /* renamed from: h  reason: collision with root package name */
    private final String f21075h;

    /* renamed from: i  reason: collision with root package name */
    private final Integer f21076i;

    /* renamed from: j  reason: collision with root package name */
    private final Integer f21077j;

    /* renamed from: x  reason: collision with root package name */
    private final Integer f21078x;

    /* compiled from: DetailsModel.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<DetailsModel> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final DetailsModel createFromParcel(Parcel parcel) {
            CommercialTabName valueOf;
            Integer valueOf2;
            Boolean valueOf3;
            Integer valueOf4;
            Integer valueOf5;
            Integer valueOf6;
            Integer valueOf7;
            o.i(parcel, "parcel");
            CommercialItemDetailsSource valueOf8 = CommercialItemDetailsSource.valueOf(parcel.readString());
            DetailsIntention valueOf9 = DetailsIntention.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = CommercialTabName.valueOf(parcel.readString());
            }
            if (parcel.readInt() == 0) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(parcel.readInt());
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            boolean z11 = false;
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            if (parcel.readInt() == 0) {
                valueOf3 = null;
            } else {
                if (parcel.readInt() != 0) {
                    z11 = true;
                }
                valueOf3 = Boolean.valueOf(z11);
            }
            if (parcel.readInt() == 0) {
                valueOf4 = null;
            } else {
                valueOf4 = Integer.valueOf(parcel.readInt());
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf5 = null;
            } else {
                valueOf5 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf6 = null;
            } else {
                valueOf6 = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() == 0) {
                valueOf7 = null;
            } else {
                valueOf7 = Integer.valueOf(parcel.readInt());
            }
            return new DetailsModel(valueOf8, valueOf9, valueOf, valueOf2, arrayList, valueOf3, valueOf4, readString, valueOf5, valueOf6, valueOf7);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final DetailsModel[] newArray(int i11) {
            return new DetailsModel[i11];
        }
    }

    public DetailsModel(CommercialItemDetailsSource source, DetailsIntention intention, CommercialTabName commercialTabName, Integer num, List<Integer> masterCatIds, Boolean bool, Integer num2, String str, Integer num3, Integer num4, Integer num5) {
        o.i(source, "source");
        o.i(intention, "intention");
        o.i(masterCatIds, "masterCatIds");
        this.f21068a = source;
        this.f21069b = intention;
        this.f21070c = commercialTabName;
        this.f21071d = num;
        this.f21072e = masterCatIds;
        this.f21073f = bool;
        this.f21074g = num2;
        this.f21075h = str;
        this.f21076i = num3;
        this.f21077j = num4;
        this.f21078x = num5;
    }

    public final CommercialTabName a() {
        return this.f21070c;
    }

    public final Integer b() {
        return this.f21071d;
    }

    public final DetailsIntention c() {
        return this.f21069b;
    }

    public final List<Integer> d() {
        return this.f21072e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.f21077j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailsModel)) {
            return false;
        }
        DetailsModel detailsModel = (DetailsModel) obj;
        if (this.f21068a == detailsModel.f21068a && this.f21069b == detailsModel.f21069b && this.f21070c == detailsModel.f21070c && o.d(this.f21071d, detailsModel.f21071d) && o.d(this.f21072e, detailsModel.f21072e) && o.d(this.f21073f, detailsModel.f21073f) && o.d(this.f21074g, detailsModel.f21074g) && o.d(this.f21075h, detailsModel.f21075h) && o.d(this.f21076i, detailsModel.f21076i) && o.d(this.f21077j, detailsModel.f21077j) && o.d(this.f21078x, detailsModel.f21078x)) {
            return true;
        }
        return false;
    }

    public final CommercialItemDetailsSource f() {
        return this.f21068a;
    }

    public final Integer g() {
        return this.f21078x;
    }

    public final Integer h() {
        return this.f21074g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = ((this.f21068a.hashCode() * 31) + this.f21069b.hashCode()) * 31;
        CommercialTabName commercialTabName = this.f21070c;
        int i11 = 0;
        if (commercialTabName == null) {
            hashCode = 0;
        } else {
            hashCode = commercialTabName.hashCode();
        }
        int i12 = (hashCode8 + hashCode) * 31;
        Integer num = this.f21071d;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int hashCode9 = (((i12 + hashCode2) * 31) + this.f21072e.hashCode()) * 31;
        Boolean bool = this.f21073f;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i13 = (hashCode9 + hashCode3) * 31;
        Integer num2 = this.f21074g;
        if (num2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num2.hashCode();
        }
        int i14 = (i13 + hashCode4) * 31;
        String str = this.f21075h;
        if (str == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str.hashCode();
        }
        int i15 = (i14 + hashCode5) * 31;
        Integer num3 = this.f21076i;
        if (num3 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num3.hashCode();
        }
        int i16 = (i15 + hashCode6) * 31;
        Integer num4 = this.f21077j;
        if (num4 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num4.hashCode();
        }
        int i17 = (i16 + hashCode7) * 31;
        Integer num5 = this.f21078x;
        if (num5 != null) {
            i11 = num5.hashCode();
        }
        return i17 + i11;
    }

    public final String i() {
        return this.f21075h;
    }

    public final Integer j() {
        return this.f21076i;
    }

    public final Boolean k() {
        return this.f21073f;
    }

    public String toString() {
        CommercialItemDetailsSource commercialItemDetailsSource = this.f21068a;
        DetailsIntention detailsIntention = this.f21069b;
        CommercialTabName commercialTabName = this.f21070c;
        Integer num = this.f21071d;
        List<Integer> list = this.f21072e;
        Boolean bool = this.f21073f;
        Integer num2 = this.f21074g;
        String str = this.f21075h;
        Integer num3 = this.f21076i;
        Integer num4 = this.f21077j;
        Integer num5 = this.f21078x;
        return "DetailsModel(source=" + commercialItemDetailsSource + ", intention=" + detailsIntention + ", commercialTabName=" + commercialTabName + ", commercialWeight=" + num + ", masterCatIds=" + list + ", isSourceSectionSelectedByUser=" + bool + ", sourceCarouselTotalItems=" + num2 + ", sourceCategoryFullPath=" + str + ", sourceItemOrder=" + num3 + ", positionCategoryId=" + num4 + ", sourceCarouselRowsCount=" + num5 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeString(this.f21068a.name());
        out.writeString(this.f21069b.name());
        CommercialTabName commercialTabName = this.f21070c;
        if (commercialTabName == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(commercialTabName.name());
        }
        Integer num = this.f21071d;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        List<Integer> list = this.f21072e;
        out.writeInt(list.size());
        for (Integer num2 : list) {
            out.writeInt(num2.intValue());
        }
        Boolean bool = this.f21073f;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.f21074g;
        if (num3 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num3.intValue());
        }
        out.writeString(this.f21075h);
        Integer num4 = this.f21076i;
        if (num4 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num4.intValue());
        }
        Integer num5 = this.f21077j;
        if (num5 == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num5.intValue());
        }
        Integer num6 = this.f21078x;
        if (num6 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(num6.intValue());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ DetailsModel(com.forsale.analytics.commercial.CommercialItemDetailsSource r15, com.forsale.adserver.view.models.DetailsIntention r16, commercial.CommercialTabName r17, java.lang.Integer r18, java.util.List r19, java.lang.Boolean r20, java.lang.Integer r21, java.lang.String r22, java.lang.Integer r23, java.lang.Integer r24, java.lang.Integer r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
            r14 = this;
            r0 = r26
            r1 = r0 & 2
            if (r1 == 0) goto La
            com.forsale.adserver.view.models.DetailsIntention r1 = com.forsale.adserver.view.models.DetailsIntention.ALL_SCREEN
            r4 = r1
            goto Lc
        La:
            r4 = r16
        Lc:
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L13
            r5 = r2
            goto L15
        L13:
            r5 = r17
        L15:
            r1 = r0 & 8
            if (r1 == 0) goto L20
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6 = r1
            goto L22
        L20:
            r6 = r18
        L22:
            r1 = r0 & 16
            if (r1 == 0) goto L2c
            java.util.List r1 = kotlin.collections.p.n()
            r7 = r1
            goto L2e
        L2c:
            r7 = r19
        L2e:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L34
            r12 = r2
            goto L36
        L34:
            r12 = r24
        L36:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L3c
            r13 = r2
            goto L3e
        L3c:
            r13 = r25
        L3e:
            r2 = r14
            r3 = r15
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.adserver.view.models.DetailsModel.<init>(com.forsale.analytics.commercial.CommercialItemDetailsSource, com.forsale.adserver.view.models.DetailsIntention, commercial.CommercialTabName, java.lang.Integer, java.util.List, java.lang.Boolean, java.lang.Integer, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
