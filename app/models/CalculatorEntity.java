package com.forsale.app.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.datalayer.network.responses.Bundle;
import com.github.mikephil.charting.utils.Utils;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.o;
/* compiled from: CalculatorEntity.kt */
/* loaded from: classes2.dex */
public final class CalculatorEntity implements Parcelable {
    public static final Parcelable.Creator<CalculatorEntity> CREATOR = new a();

    /* renamed from: z  reason: collision with root package name */
    public static final int f37575z = 8;

    /* renamed from: a  reason: collision with root package name */
    private final float f37576a;

    /* renamed from: b  reason: collision with root package name */
    private final float f37577b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f37578c;

    /* renamed from: d  reason: collision with root package name */
    private final float f37579d;

    /* renamed from: e  reason: collision with root package name */
    private final float f37580e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Addon> f37581f;

    /* renamed from: g  reason: collision with root package name */
    private final String f37582g;

    /* renamed from: h  reason: collision with root package name */
    private final Integer f37583h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f37584i;

    /* renamed from: j  reason: collision with root package name */
    private final Bundle f37585j;

    /* renamed from: x  reason: collision with root package name */
    private final int f37586x;

    /* renamed from: y  reason: collision with root package name */
    private final boolean f37587y;

    /* compiled from: CalculatorEntity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<CalculatorEntity> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final CalculatorEntity createFromParcel(Parcel parcel) {
            boolean z11;
            Integer valueOf;
            boolean z12;
            boolean z13;
            o.i(parcel, "parcel");
            float readFloat = parcel.readFloat();
            float readFloat2 = parcel.readFloat();
            if (parcel.readInt() != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 != readInt; i11++) {
                arrayList.add(Addon.CREATOR.createFromParcel(parcel));
            }
            String readString = parcel.readString();
            Bundle bundle = null;
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(parcel.readInt());
            }
            if (parcel.readInt() != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (parcel.readInt() != 0) {
                bundle = Bundle.CREATOR.createFromParcel(parcel);
            }
            Bundle bundle2 = bundle;
            int readInt2 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            return new CalculatorEntity(readFloat, readFloat2, z11, readFloat3, readFloat4, arrayList, readString, valueOf, z12, bundle2, readInt2, z13);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final CalculatorEntity[] newArray(int i11) {
            return new CalculatorEntity[i11];
        }
    }

    public CalculatorEntity(float f11, float f12, boolean z11, float f13, float f14, List<Addon> addons, String currency, Integer num, boolean z12, Bundle bundle, int i11, boolean z13) {
        o.i(addons, "addons");
        o.i(currency, "currency");
        this.f37576a = f11;
        this.f37577b = f12;
        this.f37578c = z11;
        this.f37579d = f13;
        this.f37580e = f14;
        this.f37581f = addons;
        this.f37582g = currency;
        this.f37583h = num;
        this.f37584i = z12;
        this.f37585j = bundle;
        this.f37586x = i11;
        this.f37587y = z13;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CalculatorEntity b(CalculatorEntity calculatorEntity, float f11, float f12, boolean z11, float f13, float f14, List list, String str, Integer num, boolean z12, Bundle bundle, int i11, boolean z13, int i12, Object obj) {
        float f15;
        float f16;
        boolean z14;
        float f17;
        float f18;
        List<Addon> list2;
        String str2;
        Integer num2;
        boolean z15;
        Bundle bundle2;
        int i13;
        boolean z16;
        if ((i12 & 1) != 0) {
            f15 = calculatorEntity.f37576a;
        } else {
            f15 = f11;
        }
        if ((i12 & 2) != 0) {
            f16 = calculatorEntity.f37577b;
        } else {
            f16 = f12;
        }
        if ((i12 & 4) != 0) {
            z14 = calculatorEntity.f37578c;
        } else {
            z14 = z11;
        }
        if ((i12 & 8) != 0) {
            f17 = calculatorEntity.f37579d;
        } else {
            f17 = f13;
        }
        if ((i12 & 16) != 0) {
            f18 = calculatorEntity.f37580e;
        } else {
            f18 = f14;
        }
        if ((i12 & 32) != 0) {
            list2 = calculatorEntity.f37581f;
        } else {
            list2 = list;
        }
        if ((i12 & 64) != 0) {
            str2 = calculatorEntity.f37582g;
        } else {
            str2 = str;
        }
        if ((i12 & 128) != 0) {
            num2 = calculatorEntity.f37583h;
        } else {
            num2 = num;
        }
        if ((i12 & 256) != 0) {
            z15 = calculatorEntity.f37584i;
        } else {
            z15 = z12;
        }
        if ((i12 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            bundle2 = calculatorEntity.f37585j;
        } else {
            bundle2 = bundle;
        }
        if ((i12 & 1024) != 0) {
            i13 = calculatorEntity.f37586x;
        } else {
            i13 = i11;
        }
        if ((i12 & RecyclerView.l.FLAG_MOVED) != 0) {
            z16 = calculatorEntity.f37587y;
        } else {
            z16 = z13;
        }
        return calculatorEntity.a(f15, f16, z14, f17, f18, list2, str2, num2, z15, bundle2, i13, z16);
    }

    private final double r() {
        double d11 = this.f37576a;
        ArrayList<Addon> arrayList = new ArrayList();
        for (Object obj : this.f37581f) {
            if (!((Addon) obj).getIncludedInBundle()) {
                arrayList.add(obj);
            }
        }
        double d12 = Utils.DOUBLE_EPSILON;
        for (Addon addon : arrayList) {
            d12 += addon.getPrice();
        }
        return d11 + d12;
    }

    public final CalculatorEntity a(float f11, float f12, boolean z11, float f13, float f14, List<Addon> addons, String currency, Integer num, boolean z12, Bundle bundle, int i11, boolean z13) {
        o.i(addons, "addons");
        o.i(currency, "currency");
        return new CalculatorEntity(f11, f12, z11, f13, f14, addons, currency, num, z12, bundle, i11, z13);
    }

    public final List<Addon> c() {
        return this.f37581f;
    }

    public final List<Float> d() {
        int y11;
        ArrayList<Addon> arrayList = new ArrayList();
        for (Object obj : this.f37581f) {
            if (!((Addon) obj).getIncludedInBundle()) {
                arrayList.add(obj);
            }
        }
        y11 = s.y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        for (Addon addon : arrayList) {
            arrayList2.add(Float.valueOf(addon.getPrice()));
        }
        return arrayList2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f37586x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalculatorEntity)) {
            return false;
        }
        CalculatorEntity calculatorEntity = (CalculatorEntity) obj;
        if (Float.compare(this.f37576a, calculatorEntity.f37576a) == 0 && Float.compare(this.f37577b, calculatorEntity.f37577b) == 0 && this.f37578c == calculatorEntity.f37578c && Float.compare(this.f37579d, calculatorEntity.f37579d) == 0 && Float.compare(this.f37580e, calculatorEntity.f37580e) == 0 && o.d(this.f37581f, calculatorEntity.f37581f) && o.d(this.f37582g, calculatorEntity.f37582g) && o.d(this.f37583h, calculatorEntity.f37583h) && this.f37584i == calculatorEntity.f37584i && o.d(this.f37585j, calculatorEntity.f37585j) && this.f37586x == calculatorEntity.f37586x && this.f37587y == calculatorEntity.f37587y) {
            return true;
        }
        return false;
    }

    public final Bundle f() {
        return this.f37585j;
    }

    public final String g() {
        return this.f37582g;
    }

    public final float h() {
        return this.f37579d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode;
        int hashCode2 = ((Float.hashCode(this.f37576a) * 31) + Float.hashCode(this.f37577b)) * 31;
        boolean z11 = this.f37578c;
        int i11 = 1;
        int i12 = z11;
        if (z11 != 0) {
            i12 = 1;
        }
        int hashCode3 = (((((((((hashCode2 + i12) * 31) + Float.hashCode(this.f37579d)) * 31) + Float.hashCode(this.f37580e)) * 31) + this.f37581f.hashCode()) * 31) + this.f37582g.hashCode()) * 31;
        Integer num = this.f37583h;
        int i13 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i14 = (hashCode3 + hashCode) * 31;
        boolean z12 = this.f37584i;
        int i15 = z12;
        if (z12 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        Bundle bundle = this.f37585j;
        if (bundle != null) {
            i13 = bundle.hashCode();
        }
        int hashCode4 = (((i16 + i13) * 31) + Integer.hashCode(this.f37586x)) * 31;
        boolean z13 = this.f37587y;
        if (!z13) {
            i11 = z13 ? 1 : 0;
        }
        return hashCode4 + i11;
    }

    public final boolean i() {
        return this.f37584i;
    }

    public final boolean j() {
        if (this.f37578c && this.f37579d >= this.f37576a) {
            return true;
        }
        return false;
    }

    public final float k() {
        return this.f37576a;
    }

    public final boolean l() {
        return this.f37578c;
    }

    public final Integer m() {
        return this.f37583h;
    }

    public final float n() {
        return this.f37580e;
    }

    public final double o() {
        if (j()) {
            boolean isEmpty = d().isEmpty();
            double d11 = Utils.DOUBLE_EPSILON;
            if (isEmpty) {
                return Utils.DOUBLE_EPSILON;
            }
            ArrayList<Addon> arrayList = new ArrayList();
            for (Object obj : this.f37581f) {
                if (!((Addon) obj).getIncludedInBundle()) {
                    arrayList.add(obj);
                }
            }
            for (Addon addon : arrayList) {
                d11 += addon.getPrice();
            }
            return d11;
        }
        return r();
    }

    public final float p() {
        return this.f37577b;
    }

    public final boolean q() {
        return this.f37587y;
    }

    public final boolean s() {
        if (this.f37580e >= this.f37576a) {
            return true;
        }
        return false;
    }

    public final boolean t() {
        if (this.f37580e == 0.0f) {
            return true;
        }
        return false;
    }

    public String toString() {
        float f11 = this.f37576a;
        float f12 = this.f37577b;
        boolean z11 = this.f37578c;
        float f13 = this.f37579d;
        float f14 = this.f37580e;
        List<Addon> list = this.f37581f;
        String str = this.f37582g;
        Integer num = this.f37583h;
        boolean z12 = this.f37584i;
        Bundle bundle = this.f37585j;
        int i11 = this.f37586x;
        boolean z13 = this.f37587y;
        return "CalculatorEntity(listingCost=" + f11 + ", repostPrice=" + f12 + ", listingIsDeductibleFromFreeCredit=" + z11 + ", freeCredit=" + f13 + ", premiumCredit=" + f14 + ", addons=" + list + ", currency=" + str + ", planId=" + num + ", hasEnoughCredit=" + z12 + ", bundle=" + bundle + ", autoRepostExtendPeriod=" + i11 + ", showBundleAutoRepostHint=" + z13 + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        o.i(out, "out");
        out.writeFloat(this.f37576a);
        out.writeFloat(this.f37577b);
        out.writeInt(this.f37578c ? 1 : 0);
        out.writeFloat(this.f37579d);
        out.writeFloat(this.f37580e);
        List<Addon> list = this.f37581f;
        out.writeInt(list.size());
        for (Addon addon : list) {
            addon.writeToParcel(out, i11);
        }
        out.writeString(this.f37582g);
        Integer num = this.f37583h;
        if (num == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(num.intValue());
        }
        out.writeInt(this.f37584i ? 1 : 0);
        Bundle bundle = this.f37585j;
        if (bundle == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            bundle.writeToParcel(out, i11);
        }
        out.writeInt(this.f37586x);
        out.writeInt(this.f37587y ? 1 : 0);
    }
}
