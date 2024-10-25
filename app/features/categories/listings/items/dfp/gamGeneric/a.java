package com.forsale.app.features.categories.listings.items.dfp.gamGeneric;

import com.forsale.app.features.categories.listings.ListingsTypes;
import com.google.android.gms.ads.AdSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
/* compiled from: GAMTypes.kt */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f30671a;

    /* renamed from: b  reason: collision with root package name */
    private final AdSize f30672b;

    /* compiled from: GAMTypes.kt */
    /* renamed from: com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0335a extends a {

        /* renamed from: c  reason: collision with root package name */
        private final String f30673c;

        /* renamed from: d  reason: collision with root package name */
        private final AdSize f30674d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f30675e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f30676f;

        /* renamed from: g  reason: collision with root package name */
        private final Integer f30677g;

        /* renamed from: h  reason: collision with root package name */
        private final fj.a f30678h;

        public /* synthetic */ C0335a(String str, AdSize adSize, boolean z11, Integer num, Integer num2, fj.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, adSize, (i11 & 4) != 0 ? false : z11, num, num2, aVar);
        }

        @Override // com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a
        public AdSize a() {
            return this.f30674d;
        }

        @Override // com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a
        public String b() {
            return this.f30673c;
        }

        public final Integer c() {
            return this.f30676f;
        }

        public final Integer d() {
            return this.f30677g;
        }

        public final fj.a e() {
            return this.f30678h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0335a)) {
                return false;
            }
            C0335a c0335a = (C0335a) obj;
            if (o.d(this.f30673c, c0335a.f30673c) && o.d(this.f30674d, c0335a.f30674d) && this.f30675e == c0335a.f30675e && o.d(this.f30676f, c0335a.f30676f) && o.d(this.f30677g, c0335a.f30677g) && o.d(this.f30678h, c0335a.f30678h)) {
                return true;
            }
            return false;
        }

        public final boolean f() {
            return this.f30675e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = ((this.f30673c.hashCode() * 31) + this.f30674d.hashCode()) * 31;
            boolean z11 = this.f30675e;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode3 + i11) * 31;
            Integer num = this.f30676f;
            int i13 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i14 = (i12 + hashCode) * 31;
            Integer num2 = this.f30677g;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i15 = (i14 + hashCode2) * 31;
            fj.a aVar = this.f30678h;
            if (aVar != null) {
                i13 = aVar.hashCode();
            }
            return i15 + i13;
        }

        public String toString() {
            String str = this.f30673c;
            AdSize adSize = this.f30674d;
            boolean z11 = this.f30675e;
            Integer num = this.f30676f;
            Integer num2 = this.f30677g;
            fj.a aVar = this.f30678h;
            return "GAMBanner(adUnitId=" + str + ", adSize=" + adSize + ", isLastGam=" + z11 + ", categoryId=" + num + ", disId=" + num2 + ", gamContentMapping=" + aVar + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0335a(String adUnitId, AdSize adSize, boolean z11, Integer num, Integer num2, fj.a aVar) {
            super(adUnitId, adSize, null);
            o.i(adUnitId, "adUnitId");
            o.i(adSize, "adSize");
            this.f30673c = adUnitId;
            this.f30674d = adSize;
            this.f30675e = z11;
            this.f30676f = num;
            this.f30677g = num2;
            this.f30678h = aVar;
        }
    }

    /* compiled from: GAMTypes.kt */
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: c  reason: collision with root package name */
        private final String f30679c;

        /* renamed from: d  reason: collision with root package name */
        private final AdSize f30680d;

        /* renamed from: e  reason: collision with root package name */
        private final Integer f30681e;

        /* renamed from: f  reason: collision with root package name */
        private final Integer f30682f;

        /* renamed from: g  reason: collision with root package name */
        private final fj.a f30683g;

        /* renamed from: h  reason: collision with root package name */
        private final ListingsTypes f30684h;

        /* renamed from: i  reason: collision with root package name */
        private final int f30685i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String adUnitId, AdSize adSize, Integer num, Integer num2, fj.a aVar, ListingsTypes listingType, int i11) {
            super(adUnitId, adSize, null);
            o.i(adUnitId, "adUnitId");
            o.i(adSize, "adSize");
            o.i(listingType, "listingType");
            this.f30679c = adUnitId;
            this.f30680d = adSize;
            this.f30681e = num;
            this.f30682f = num2;
            this.f30683g = aVar;
            this.f30684h = listingType;
            this.f30685i = i11;
        }

        @Override // com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a
        public AdSize a() {
            return this.f30680d;
        }

        @Override // com.forsale.app.features.categories.listings.items.dfp.gamGeneric.a
        public String b() {
            return this.f30679c;
        }

        public final Integer c() {
            return this.f30681e;
        }

        public final Integer d() {
            return this.f30682f;
        }

        public final fj.a e() {
            return this.f30683g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (o.d(this.f30679c, bVar.f30679c) && o.d(this.f30680d, bVar.f30680d) && o.d(this.f30681e, bVar.f30681e) && o.d(this.f30682f, bVar.f30682f) && o.d(this.f30683g, bVar.f30683g) && this.f30684h == bVar.f30684h && this.f30685i == bVar.f30685i) {
                return true;
            }
            return false;
        }

        public final int f() {
            return this.f30685i;
        }

        public final ListingsTypes g() {
            return this.f30684h;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2;
            int hashCode3 = ((this.f30679c.hashCode() * 31) + this.f30680d.hashCode()) * 31;
            Integer num = this.f30681e;
            int i11 = 0;
            if (num == null) {
                hashCode = 0;
            } else {
                hashCode = num.hashCode();
            }
            int i12 = (hashCode3 + hashCode) * 31;
            Integer num2 = this.f30682f;
            if (num2 == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = num2.hashCode();
            }
            int i13 = (i12 + hashCode2) * 31;
            fj.a aVar = this.f30683g;
            if (aVar != null) {
                i11 = aVar.hashCode();
            }
            return ((((i13 + i11) * 31) + this.f30684h.hashCode()) * 31) + Integer.hashCode(this.f30685i);
        }

        public String toString() {
            String str = this.f30679c;
            AdSize adSize = this.f30680d;
            Integer num = this.f30681e;
            Integer num2 = this.f30682f;
            fj.a aVar = this.f30683g;
            ListingsTypes listingsTypes = this.f30684h;
            int i11 = this.f30685i;
            return "MPU(adUnitId=" + str + ", adSize=" + adSize + ", categoryId=" + num + ", disId=" + num2 + ", gamContentMapping=" + aVar + ", listingType=" + listingsTypes + ", index=" + i11 + ")";
        }
    }

    public /* synthetic */ a(String str, AdSize adSize, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, adSize);
    }

    public abstract AdSize a();

    public abstract String b();

    private a(String str, AdSize adSize) {
        this.f30671a = str;
        this.f30672b = adSize;
    }
}
