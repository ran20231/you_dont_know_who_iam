package com.forsale.app.features.postad.location;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.r0;
import androidx.lifecycle.z;
import com.forsale.app.base.viewmodels.BaseViewModel;
import com.forsale.app.datalayer.database.CategoryRuleSet;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.entities.ExtraInfo;
import com.forsale.app.datalayer.network.entities.ListingDetailsEntity;
import com.forsale.app.datalayer.network.entities.LocationInfo;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.LocationRepository;
import com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.ui.bottomsheets.selector.SelectorType;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.facades.map.MarkerType;
import com.forsale.app.utils.validation.PhoneDetectorKt;
import com.github.mikephil.charting.utils.Utils;
import g00.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.s;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import t9.y0;
import wz.i;
import wz.p;
/* compiled from: PostAdLocationViewModel.kt */
/* loaded from: classes2.dex */
public final class PostAdLocationViewModel extends BaseViewModel {
    public static final a C1 = new a(null);
    public static final int D1 = 8;
    private final LiveData<DistrictEntity> A0;
    private final SharedFlow<Pair<String, Boolean>> A1;
    private final b0<DistrictEntity> B0;
    private ArrayList<String> B1;
    private final LiveData<DistrictEntity> C0;
    private final b0<CategoryRuleSet.Level> D0;
    private final LiveData<CategoryRuleSet.Level> E0;
    private final b0<CategoryRuleSet.Level> F0;
    private final LiveData<CategoryRuleSet.Level> G0;
    private final b0<CategoryRuleSet.Level> H0;
    private final LiveData<CategoryRuleSet.Level> I0;
    private final b0<LocationLevels> J0;
    private final z<Boolean> K0;
    private final z<Boolean> L0;
    private final z<Boolean> M0;
    private final z<Boolean> N0;
    private final z<Boolean> O0;
    private final z<Boolean> P0;
    private final z<Boolean> Q0;
    private final z<Boolean> R0;
    private final b0<Boolean> S0;
    private final b0<Boolean> T0;
    private final z<Boolean> U0;
    private final z<Boolean> V0;
    private final b0<Pair<Double, Double>> W0;
    private final b0<String> X0;
    private final LiveData<String> Y0;
    private final b0<Pair<Double, Double>> Z0;

    /* renamed from: a1  reason: collision with root package name */
    private final LiveData<Pair<Double, Double>> f35666a1;

    /* renamed from: b1  reason: collision with root package name */
    private final b0<MarkerType> f35667b1;

    /* renamed from: c1  reason: collision with root package name */
    private final b0<MarkerType> f35668c1;

    /* renamed from: d1  reason: collision with root package name */
    private final MutableSharedFlow<p> f35669d1;

    /* renamed from: e1  reason: collision with root package name */
    private final SharedFlow<p> f35670e1;

    /* renamed from: f1  reason: collision with root package name */
    private final MutableSharedFlow<Boolean> f35671f1;

    /* renamed from: g1  reason: collision with root package name */
    private final SharedFlow<Boolean> f35672g1;

    /* renamed from: h1  reason: collision with root package name */
    private final LiveData<List<String>> f35673h1;

    /* renamed from: i1  reason: collision with root package name */
    private final b0<ArrayList<String>> f35674i1;

    /* renamed from: j1  reason: collision with root package name */
    private final LiveData<ArrayList<String>> f35675j1;

    /* renamed from: k0  reason: collision with root package name */
    private final PostAdViewModel f35676k0;

    /* renamed from: k1  reason: collision with root package name */
    private final z<Boolean> f35677k1;

    /* renamed from: l0  reason: collision with root package name */
    private final LocationRepository f35678l0;

    /* renamed from: l1  reason: collision with root package name */
    private final z<Boolean> f35679l1;

    /* renamed from: m0  reason: collision with root package name */
    private final DistrictsRepository f35680m0;

    /* renamed from: m1  reason: collision with root package name */
    private final b0<String> f35681m1;

    /* renamed from: n0  reason: collision with root package name */
    private final ProhibitedKeywordsRepository f35682n0;

    /* renamed from: n1  reason: collision with root package name */
    private final z<String> f35683n1;

    /* renamed from: o0  reason: collision with root package name */
    private final Integer f35684o0;

    /* renamed from: o1  reason: collision with root package name */
    private final MutableSharedFlow<List<String>> f35685o1;

    /* renamed from: p0  reason: collision with root package name */
    private final MutableSharedFlow<xe.b> f35686p0;

    /* renamed from: p1  reason: collision with root package name */
    private final SharedFlow<List<String>> f35687p1;

    /* renamed from: q0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35688q0;

    /* renamed from: q1  reason: collision with root package name */
    private final MutableSharedFlow<List<String>> f35689q1;

    /* renamed from: r0  reason: collision with root package name */
    private final SharedFlow<p> f35690r0;

    /* renamed from: r1  reason: collision with root package name */
    private final SharedFlow<List<String>> f35691r1;

    /* renamed from: s0  reason: collision with root package name */
    private final MutableSharedFlow<p> f35692s0;

    /* renamed from: s1  reason: collision with root package name */
    private final b0<Boolean> f35693s1;

    /* renamed from: t0  reason: collision with root package name */
    private final SharedFlow<p> f35694t0;

    /* renamed from: t1  reason: collision with root package name */
    private final LiveData<Boolean> f35695t1;

    /* renamed from: u0  reason: collision with root package name */
    private final b0<CategoryRuleSet.LocationSettings> f35696u0;

    /* renamed from: u1  reason: collision with root package name */
    private final b0<String> f35697u1;

    /* renamed from: v0  reason: collision with root package name */
    private final b0<DistrictEntity> f35698v0;

    /* renamed from: v1  reason: collision with root package name */
    private final z<Boolean> f35699v1;

    /* renamed from: w0  reason: collision with root package name */
    private final LiveData<DistrictEntity> f35700w0;

    /* renamed from: w1  reason: collision with root package name */
    private final z<String> f35701w1;

    /* renamed from: x0  reason: collision with root package name */
    private final b0<DistrictEntity> f35702x0;

    /* renamed from: x1  reason: collision with root package name */
    private final MutableSharedFlow<Pair<String, Boolean>> f35703x1;

    /* renamed from: y0  reason: collision with root package name */
    private final LiveData<DistrictEntity> f35704y0;

    /* renamed from: y1  reason: collision with root package name */
    private final SharedFlow<Pair<String, Boolean>> f35705y1;

    /* renamed from: z0  reason: collision with root package name */
    private final b0<DistrictEntity> f35706z0;

    /* renamed from: z1  reason: collision with root package name */
    private final MutableSharedFlow<Pair<String, Boolean>> f35707z1;

    /* compiled from: PostAdLocationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PostAdLocationViewModel.kt */
    /* loaded from: classes2.dex */
    public interface b {
        PostAdLocationViewModel a(PostAdViewModel postAdViewModel, Integer num);
    }

    /* compiled from: PostAdLocationViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f35711a;

        static {
            int[] iArr = new int[LocationLevels.values().length];
            try {
                iArr[LocationLevels.AREA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LocationLevels.BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LocationLevels.DISTRICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LocationLevels.REGION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f35711a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PostAdLocationViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class e implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f35712a;

        e(l function) {
            o.i(function, "function");
            this.f35712a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final wz.e<?> c() {
            return this.f35712a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f35712a.invoke(obj);
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class f extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PostAdLocationViewModel f35713a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(CoroutineExceptionHandler.Key key, PostAdLocationViewModel postAdLocationViewModel) {
            super(key);
            this.f35713a = postAdLocationViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f35713a), null, null, new PostAdLocationViewModel$setCoordinates$1$1(this.f35713a, null), 3, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0105, code lost:
        if (r0 == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public PostAdLocationViewModel(com.forsale.app.features.postad.PostAdViewModel r5, com.forsale.app.datalayer.repositories.LocationRepository r6, com.forsale.app.datalayer.repositories.DistrictsRepository r7, com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository r8, java.lang.Integer r9, com.forsale.app.datalayer.repositories.BaseRepository r10) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.<init>(com.forsale.app.features.postad.PostAdViewModel, com.forsale.app.datalayer.repositories.LocationRepository, com.forsale.app.datalayer.repositories.DistrictsRepository, com.forsale.app.datalayer.repositories.ProhibitedKeywordsRepository, java.lang.Integer, com.forsale.app.datalayer.repositories.BaseRepository):void");
    }

    private final Pair<Double, Double> A1(ListingDetailsEntity listingDetailsEntity) {
        LocationInfo locationInfo;
        ExtraInfo extraInfo = listingDetailsEntity.getExtraInfo();
        if (extraInfo == null || (locationInfo = extraInfo.getLocationInfo()) == null || locationInfo.getLat() == null || locationInfo.getLon() == null) {
            return null;
        }
        Double lat = locationInfo.getLat();
        o.f(lat);
        Double lon = locationInfo.getLon();
        o.f(lon);
        return new Pair<>(lat, lon);
    }

    private final Pair<Double, Double> B1(ListingDetailsEntity listingDetailsEntity) {
        double d11;
        if (listingDetailsEntity.getGeotagLat() != null && listingDetailsEntity.getGeotagLon() != null) {
            Float geotagLat = listingDetailsEntity.getGeotagLat();
            double d12 = Utils.DOUBLE_EPSILON;
            if (geotagLat != null) {
                d11 = geotagLat.floatValue();
            } else {
                d11 = 0.0d;
            }
            Double valueOf = Double.valueOf(d11);
            Float geotagLon = listingDetailsEntity.getGeotagLon();
            if (geotagLon != null) {
                d12 = geotagLon.floatValue();
            }
            return new Pair<>(valueOf, Double.valueOf(d12));
        }
        return null;
    }

    private final Pair<Double, Double> C1(ListingDetailsEntity listingDetailsEntity) {
        Pair<Double, Double> B1 = B1(listingDetailsEntity);
        Pair<Double, Double> A1 = A1(listingDetailsEntity);
        if (A1 != null || B1 == null) {
            if (A1 == null) {
                return this.W0.getValue();
            }
            return A1;
        }
        return B1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object C2(double r8, double r10, zz.a<? super wz.p> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof com.forsale.app.features.postad.location.PostAdLocationViewModel$retrieveAddress$1
            if (r0 == 0) goto L13
            r0 = r12
            com.forsale.app.features.postad.location.PostAdLocationViewModel$retrieveAddress$1 r0 = (com.forsale.app.features.postad.location.PostAdLocationViewModel$retrieveAddress$1) r0
            int r1 = r0.f35755d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35755d = r1
            goto L18
        L13:
            com.forsale.app.features.postad.location.PostAdLocationViewModel$retrieveAddress$1 r0 = new com.forsale.app.features.postad.location.PostAdLocationViewModel$retrieveAddress$1
            r0.<init>(r7, r12)
        L18:
            r6 = r0
            java.lang.Object r12 = r6.f35753b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.f()
            int r1 = r6.f35755d
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            java.lang.Object r8 = r6.f35752a
            com.forsale.app.features.postad.location.PostAdLocationViewModel r8 = (com.forsale.app.features.postad.location.PostAdLocationViewModel) r8
            kotlin.f.b(r12)
            goto L49
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            kotlin.f.b(r12)
            com.forsale.app.datalayer.repositories.LocationRepository r1 = r7.f35678l0
            r6.f35752a = r7
            r6.f35755d = r2
            r2 = r8
            r4 = r10
            java.lang.Object r12 = r1.retrieveAddress(r2, r4, r6)
            if (r12 != r0) goto L48
            return r0
        L48:
            r8 = r7
        L49:
            androidx.lifecycle.b0<java.lang.String> r8 = r8.X0
            java.lang.String r12 = (java.lang.String) r12
            r8.postValue(r12)
            wz.p r8 = wz.p.f75480a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.C2(double, double, zz.a):java.lang.Object");
    }

    private final DistrictEntity D1() {
        int i11;
        LocationLevels value = this.J0.getValue();
        if (value == null) {
            i11 = -1;
        } else {
            i11 = c.f35711a[value.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return null;
                    }
                    return this.f35700w0.getValue();
                }
                return this.f35704y0.getValue();
            }
            return this.C0.getValue();
        }
        return this.A0.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D2() {
        p pVar;
        DistrictEntity D12;
        DistrictEntity value = this.f35704y0.getValue();
        if (value != null && (D12 = D1()) != null) {
            PostAdViewModel.u4(this.f35676k0, value, D12, false, 4, null);
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            PostAdViewModel.u4(this.f35676k0, null, null, false, 4, null);
        }
        this.f35676k0.M4(new PostAdLocationViewModel$saveLocation$3(this, null));
    }

    public static /* synthetic */ void G2(PostAdLocationViewModel postAdLocationViewModel, double d11, double d12, DistrictEntity districtEntity, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            districtEntity = null;
        }
        postAdLocationViewModel.F2(d11, d12, districtEntity);
    }

    private final void H2() {
        Pair<Double, Double> value = this.W0.getValue();
        if (value != null) {
            G2(this, value.c().doubleValue(), value.d().doubleValue(), null, 4, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I2(DistrictEntity districtEntity) {
        double d11;
        Double geoLon;
        Double geoLat;
        double d12 = Utils.DOUBLE_EPSILON;
        if (districtEntity != null && (geoLat = districtEntity.getGeoLat()) != null) {
            d11 = TypeExtensionsKt.C(geoLat.doubleValue());
        } else {
            d11 = 0.0d;
        }
        if (districtEntity != null && (geoLon = districtEntity.getGeoLon()) != null) {
            d12 = TypeExtensionsKt.D(geoLon.doubleValue());
        }
        F2(d11, d12, districtEntity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J2(DistrictEntity districtEntity) {
        p pVar;
        ListingDetailsEntity value = this.f35676k0.p2().getValue();
        if (value != null) {
            Pair<Double, Double> C12 = C1(value);
            if (C12 != null) {
                this.W0.postValue(new Pair<>(C12.c(), C12.d()));
                F2(C12.c().doubleValue(), C12.d().doubleValue(), districtEntity);
                pVar = p.f75480a;
            } else {
                pVar = null;
            }
            if (pVar == null) {
                H2();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x011e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(com.forsale.app.datalayer.database.DistrictEntity r9, boolean r10, zz.a<? super wz.p> r11) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.K2(com.forsale.app.datalayer.database.DistrictEntity, boolean, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Object L2(PostAdLocationViewModel postAdLocationViewModel, DistrictEntity districtEntity, boolean z11, zz.a aVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return postAdLocationViewModel.K2(districtEntity, z11, aVar);
    }

    private final Integer N1(int i11) {
        DistrictEntity value;
        if (i11 == LocationLevels.DISTRICT.getLevel()) {
            DistrictEntity value2 = this.f35700w0.getValue();
            if (value2 == null) {
                return null;
            }
            return Integer.valueOf(value2.getId());
        } else if (i11 == LocationLevels.AREA.getLevel()) {
            DistrictEntity value3 = this.f35704y0.getValue();
            if (value3 == null) {
                return null;
            }
            return Integer.valueOf(value3.getId());
        } else if (i11 != LocationLevels.BLOCK.getLevel() || (value = this.A0.getValue()) == null) {
            return null;
        } else {
            return Integer.valueOf(value.getId());
        }
    }

    private final boolean N2() {
        boolean v11;
        String value = this.f35697u1.getValue();
        if (value == null) {
            value = "";
        }
        String U2 = U2(value, true, true);
        if (U2 != null) {
            v11 = s.v(U2);
            if (v11) {
                return true;
            }
            return false;
        }
        return true;
    }

    private final void O2() {
        this.f35683n1.b(this.f35681m1, new e(new l<String, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoValidation$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:12:0x003e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(java.lang.String r10) {
                /*
                    r9 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r0 = r0.x1()
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r1 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    kotlin.jvm.internal.o.f(r10)
                    r3 = 0
                    r4 = 0
                    r5 = 2
                    r6 = 0
                    r2 = r10
                    java.lang.String r1 = com.forsale.app.features.postad.location.PostAdLocationViewModel.V2(r1, r2, r3, r4, r5, r6)
                    r0.setValue(r1)
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.b0 r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.E0(r0)
                    boolean r1 = kotlin.text.k.v(r10)
                    r2 = 0
                    if (r1 != 0) goto L3f
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r3 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    r5 = 0
                    r6 = 0
                    r7 = 2
                    r8 = 0
                    r4 = r10
                    java.lang.String r10 = com.forsale.app.features.postad.location.PostAdLocationViewModel.V2(r3, r4, r5, r6, r7, r8)
                    r1 = 1
                    if (r10 == 0) goto L3b
                    boolean r10 = kotlin.text.k.v(r10)
                    if (r10 == 0) goto L39
                    goto L3b
                L39:
                    r10 = r2
                    goto L3c
                L3b:
                    r10 = r1
                L3c:
                    if (r10 == 0) goto L3f
                    r2 = r1
                L3f:
                    java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
                    r0.setValue(r10)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoValidation$1.b(java.lang.String):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
        this.f35701w1.b(this.f35697u1, new e(new l<String, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoValidation$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(String str) {
                String U2;
                PostAdLocationViewModel postAdLocationViewModel = PostAdLocationViewModel.this;
                o.f(str);
                U2 = postAdLocationViewModel.U2(str, false, true);
                PostAdLocationViewModel.this.X1().setValue(U2);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
    }

    private final void P2() {
        this.O0.b(this.J0, new e(new l<LocationLevels, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoVisibility$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
                if (r6 != false) goto L45;
             */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0075  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x007b  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.features.postad.location.LocationLevels r6) {
                /*
                    r5 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r6 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.b0 r6 = com.forsale.app.features.postad.location.PostAdLocationViewModel.y0(r6)
                    java.lang.Object r6 = r6.getValue()
                    com.forsale.app.features.postad.location.LocationLevels r6 = (com.forsale.app.features.postad.location.LocationLevels) r6
                    r0 = 0
                    r1 = 1
                    if (r6 == 0) goto L1c
                    int r6 = r6.getLevel()
                    int r6 = r6 + r1
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r6 = com.forsale.app.features.postad.location.PostAdLocationViewModel.x0(r2, r6)
                    goto L1d
                L1c:
                    r6 = r0
                L1d:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    r3 = 0
                    if (r6 == 0) goto L65
                    boolean r6 = r6.getRequired()
                    if (r6 != 0) goto L63
                    androidx.lifecycle.b0 r6 = r2.F1()
                    java.lang.Object r6 = r6.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r6 = (com.forsale.app.datalayer.database.CategoryRuleSet.LocationSettings) r6
                    if (r6 == 0) goto L42
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r6 = r6.getStreet()
                    if (r6 == 0) goto L42
                    boolean r6 = r6.getEnabled()
                    if (r6 != r1) goto L42
                    r6 = r1
                    goto L43
                L42:
                    r6 = r3
                L43:
                    if (r6 == 0) goto L63
                    androidx.lifecycle.b0 r6 = r2.F1()
                    java.lang.Object r6 = r6.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationSettings r6 = (com.forsale.app.datalayer.database.CategoryRuleSet.LocationSettings) r6
                    if (r6 == 0) goto L5f
                    com.forsale.app.datalayer.database.CategoryRuleSet$LocationExtraInfo r6 = r6.getLandmarks()
                    if (r6 == 0) goto L5f
                    boolean r6 = r6.getEnabled()
                    if (r6 != r1) goto L5f
                    r6 = r1
                    goto L60
                L5f:
                    r6 = r3
                L60:
                    if (r6 == 0) goto L63
                    goto L65
                L63:
                    r6 = r3
                    goto L66
                L65:
                    r6 = r1
                L66:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r2 = r2.t1()
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r6)
                    r2.setValue(r4)
                    if (r6 != 0) goto L7b
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r6 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    com.forsale.app.features.postad.location.PostAdLocationViewModel.w0(r6, r1, r1)
                    goto Lab
                L7b:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r6 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    java.util.ArrayList r6 = r6.Z1()
                    if (r6 == 0) goto L8c
                    boolean r2 = r6.isEmpty()
                    if (r2 == 0) goto L8a
                    goto L8c
                L8a:
                    r2 = r3
                    goto L8d
                L8c:
                    r2 = r1
                L8d:
                    r1 = r1 ^ r2
                    if (r1 == 0) goto L91
                    goto L92
                L91:
                    r6 = r0
                L92:
                    if (r6 == 0) goto Lab
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r1 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    java.lang.String[] r2 = new java.lang.String[r3]
                    java.lang.Object[] r6 = r6.toArray(r2)
                    java.lang.String[] r6 = (java.lang.String[]) r6
                    int r2 = r6.length
                    java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r2)
                    java.lang.String[] r6 = (java.lang.String[]) r6
                    com.forsale.app.features.postad.location.PostAdLocationViewModel.v0(r1, r6)
                    r1.M2(r0)
                Lab:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoVisibility$1.b(com.forsale.app.features.postad.location.LocationLevels):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LocationLevels locationLevels) {
                b(locationLevels);
                return p.f75480a;
            }
        }));
        this.f35677k1.b(this.O0, new e(new l<Boolean, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoVisibility$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(Boolean bool) {
                PostAdViewModel postAdViewModel;
                boolean z11;
                CategoryRuleSet.LocationSettings locationSettings;
                CategoryRuleSet.LocationExtraInfo landmarks;
                o.f(bool);
                boolean z12 = false;
                if (bool.booleanValue()) {
                    postAdViewModel = PostAdLocationViewModel.this.f35676k0;
                    CategoryRuleSet.RuleSet value = postAdViewModel.d2().getValue();
                    if (value != null && (locationSettings = value.getLocationSettings()) != null && (landmarks = locationSettings.getLandmarks()) != null && landmarks.getEnabled()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z12 = true;
                    }
                }
                PostAdLocationViewModel.this.y1().setValue(Boolean.valueOf(z12));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                b(bool);
                return p.f75480a;
            }
        }));
        this.f35699v1.b(this.O0, new e(new l<Boolean, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoVisibility$3

            /* JADX INFO: Access modifiers changed from: package-private */
            /* compiled from: PostAdLocationViewModel.kt */
            @d(c = "com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoVisibility$3$1", f = "PostAdLocationViewModel.kt", l = {741, 742}, m = "invokeSuspend")
            /* renamed from: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackExtraInfoVisibility$3$1  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass1 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                /* renamed from: a  reason: collision with root package name */
                int f35780a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ boolean f35781b;

                /* renamed from: c  reason: collision with root package name */
                final /* synthetic */ PostAdLocationViewModel f35782c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(boolean z11, PostAdLocationViewModel postAdLocationViewModel, zz.a<? super AnonymousClass1> aVar) {
                    super(2, aVar);
                    this.f35781b = z11;
                    this.f35782c = postAdLocationViewModel;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                    return new AnonymousClass1(this.f35781b, this.f35782c, aVar);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    Object f11;
                    MutableSharedFlow mutableSharedFlow;
                    MutableSharedFlow mutableSharedFlow2;
                    f11 = b.f();
                    int i11 = this.f35780a;
                    if (i11 != 0) {
                        if (i11 != 1 && i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f.b(obj);
                    } else {
                        f.b(obj);
                        if (!this.f35781b || this.f35782c.n1().getValue() == null || this.f35782c.e1().getValue() == null || this.f35782c.i1().getValue() == null || this.f35782c.W1().getValue() != null) {
                            mutableSharedFlow = this.f35782c.f35671f1;
                            Boolean a11 = kotlin.coroutines.jvm.internal.a.a(false);
                            this.f35780a = 2;
                            if (mutableSharedFlow.emit(a11, this) == f11) {
                                return f11;
                            }
                        } else {
                            mutableSharedFlow2 = this.f35782c.f35671f1;
                            Boolean a12 = kotlin.coroutines.jvm.internal.a.a(true);
                            this.f35780a = 1;
                            if (mutableSharedFlow2.emit(a12, this) == f11) {
                                return f11;
                            }
                        }
                    }
                    return p.f75480a;
                }

                @Override // g00.p
                public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                    return ((AnonymousClass1) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                }
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(Boolean bool) {
                PostAdViewModel postAdViewModel;
                boolean z11;
                CategoryRuleSet.LocationSettings locationSettings;
                CategoryRuleSet.LocationExtraInfo street;
                o.f(bool);
                boolean z12 = false;
                if (bool.booleanValue()) {
                    postAdViewModel = PostAdLocationViewModel.this.f35676k0;
                    CategoryRuleSet.RuleSet value = postAdViewModel.d2().getValue();
                    if (value != null && (locationSettings = value.getLocationSettings()) != null && (street = locationSettings.getStreet()) != null && street.getEnabled()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        z12 = true;
                    }
                }
                PostAdLocationViewModel.this.Y1().setValue(Boolean.valueOf(z12));
                BuildersKt__Builders_commonKt.launch$default(r0.a(PostAdLocationViewModel.this), null, null, new AnonymousClass1(z12, PostAdLocationViewModel.this, null), 3, null);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                b(bool);
                return p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer Q1(Integer num) {
        if (num == null || num.intValue() == -1) {
            DistrictEntity value = this.f35676k0.m2().getValue();
            if (value != null) {
                return Integer.valueOf(value.getId());
            }
            return null;
        }
        return num;
    }

    private final void Q2() {
        this.P0.b(this.f35704y0, new e(new l<DistrictEntity, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsValidation$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
                if (r4 == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.datalayer.database.DistrictEntity r4) {
                /*
                    r3 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r0 = r0.r1()
                    r1 = 1
                    r2 = 0
                    if (r4 == 0) goto L23
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.LiveData r4 = r4.p1()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    if (r4 == 0) goto L20
                    boolean r4 = r4.getRequired()
                    if (r4 != r1) goto L20
                    r4 = r1
                    goto L21
                L20:
                    r4 = r2
                L21:
                    if (r4 != 0) goto L3e
                L23:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.LiveData r4 = r4.p1()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    if (r4 == 0) goto L39
                    boolean r4 = r4.getRequired()
                    if (r4 != r1) goto L39
                    r4 = r1
                    goto L3a
                L39:
                    r4 = r2
                L3a:
                    if (r4 != 0) goto L3d
                    goto L3e
                L3d:
                    r1 = r2
                L3e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                    r0.setValue(r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsValidation$1.b(com.forsale.app.datalayer.database.DistrictEntity):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(DistrictEntity districtEntity) {
                b(districtEntity);
                return p.f75480a;
            }
        }));
        this.Q0.b(this.A0, new e(new l<DistrictEntity, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsValidation$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
                if (r4 == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.datalayer.database.DistrictEntity r4) {
                /*
                    r3 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r0 = r0.g1()
                    r1 = 1
                    r2 = 0
                    if (r4 == 0) goto L23
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.LiveData r4 = r4.f1()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    if (r4 == 0) goto L20
                    boolean r4 = r4.getRequired()
                    if (r4 != r1) goto L20
                    r4 = r1
                    goto L21
                L20:
                    r4 = r2
                L21:
                    if (r4 != 0) goto L3e
                L23:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.LiveData r4 = r4.f1()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    if (r4 == 0) goto L39
                    boolean r4 = r4.getRequired()
                    if (r4 != r1) goto L39
                    r4 = r1
                    goto L3a
                L39:
                    r4 = r2
                L3a:
                    if (r4 != 0) goto L3d
                    goto L3e
                L3d:
                    r1 = r2
                L3e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                    r0.setValue(r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsValidation$2.b(com.forsale.app.datalayer.database.DistrictEntity):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(DistrictEntity districtEntity) {
                b(districtEntity);
                return p.f75480a;
            }
        }));
        this.R0.b(this.C0, new e(new l<DistrictEntity, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsValidation$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
                if (r4 == false) goto L13;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.datalayer.database.DistrictEntity r4) {
                /*
                    r3 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r0 = r0.k1()
                    r1 = 1
                    r2 = 0
                    if (r4 == 0) goto L23
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.LiveData r4 = r4.j1()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    if (r4 == 0) goto L20
                    boolean r4 = r4.getRequired()
                    if (r4 != r1) goto L20
                    r4 = r1
                    goto L21
                L20:
                    r4 = r2
                L21:
                    if (r4 != 0) goto L3e
                L23:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.LiveData r4 = r4.j1()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r4 = (com.forsale.app.datalayer.database.CategoryRuleSet.Level) r4
                    if (r4 == 0) goto L39
                    boolean r4 = r4.getRequired()
                    if (r4 != r1) goto L39
                    r4 = r1
                    goto L3a
                L39:
                    r4 = r2
                L3a:
                    if (r4 != 0) goto L3d
                    goto L3e
                L3d:
                    r1 = r2
                L3e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
                    r0.setValue(r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsValidation$3.b(com.forsale.app.datalayer.database.DistrictEntity):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(DistrictEntity districtEntity) {
                b(districtEntity);
                return p.f75480a;
            }
        }));
    }

    private final void R2() {
        this.K0.b(this.E0, new e(new l<CategoryRuleSet.Level, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsVisibility$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(CategoryRuleSet.Level level) {
                boolean z11;
                z<Boolean> s12 = PostAdLocationViewModel.this.s1();
                if (level != null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                s12.setValue(Boolean.valueOf(z11));
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(CategoryRuleSet.Level level) {
                b(level);
                return p.f75480a;
            }
        }));
        this.M0.b(this.J0, new e(new l<LocationLevels, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsVisibility$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(LocationLevels locationLevels) {
                boolean z11;
                if (PostAdLocationViewModel.this.f1().getValue() != null && PostAdLocationViewModel.this.n1().getValue() != null) {
                    z<Boolean> h12 = PostAdLocationViewModel.this.h1();
                    if (locationLevels.getLevel() >= LocationLevels.DISTRICT.getLevel()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    h12.setValue(Boolean.valueOf(z11));
                    return;
                }
                PostAdLocationViewModel.this.h1().setValue(Boolean.FALSE);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LocationLevels locationLevels) {
                b(locationLevels);
                return p.f75480a;
            }
        }));
        this.N0.b(this.J0, new e(new l<LocationLevels, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackLocationLevelsVisibility$3
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            public final void b(LocationLevels locationLevels) {
                boolean z11;
                if (PostAdLocationViewModel.this.j1().getValue() != null && PostAdLocationViewModel.this.e1().getValue() != null) {
                    z<Boolean> l12 = PostAdLocationViewModel.this.l1();
                    if (locationLevels.getLevel() >= LocationLevels.AREA.getLevel()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    l12.setValue(Boolean.valueOf(z11));
                    return;
                }
                PostAdLocationViewModel.this.l1().setValue(Boolean.FALSE);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LocationLevels locationLevels) {
                b(locationLevels);
                return p.f75480a;
            }
        }));
    }

    private final void S2() {
        this.U0.b(this.J0, new e(new l<LocationLevels, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackMapVisibility$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
                if (r7 != false) goto L40;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x008c A[ADDED_TO_REGION] */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[ADDED_TO_REGION] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(com.forsale.app.features.postad.location.LocationLevels r7) {
                /*
                    r6 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r7 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.b0 r7 = com.forsale.app.features.postad.location.PostAdLocationViewModel.y0(r7)
                    java.lang.Object r7 = r7.getValue()
                    com.forsale.app.features.postad.location.LocationLevels r7 = (com.forsale.app.features.postad.location.LocationLevels) r7
                    r0 = 0
                    r1 = 1
                    if (r7 == 0) goto L1c
                    int r7 = r7.getLevel()
                    int r7 = r7 + r1
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    com.forsale.app.datalayer.database.CategoryRuleSet$Level r7 = com.forsale.app.features.postad.location.PostAdLocationViewModel.x0(r2, r7)
                    goto L1d
                L1c:
                    r7 = r0
                L1d:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    r3 = 0
                    if (r7 == 0) goto L31
                    boolean r7 = r7.getRequired()
                    if (r7 != 0) goto L2f
                    boolean r7 = com.forsale.app.features.postad.location.PostAdLocationViewModel.M0(r2)
                    if (r7 == 0) goto L2f
                    goto L31
                L2f:
                    r7 = r3
                    goto L32
                L31:
                    r7 = r1
                L32:
                    if (r7 == 0) goto L3e
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    boolean r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.N0(r2)
                    if (r2 == 0) goto L3e
                    r2 = r1
                    goto L3f
                L3e:
                    r2 = r3
                L3f:
                    if (r2 == 0) goto L43
                L41:
                    r0 = r3
                    goto L6a
                L43:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    com.forsale.app.features.postad.PostAdViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.A0(r4)
                    androidx.lifecycle.b0 r4 = r4.p2()
                    java.lang.Object r4 = r4.getValue()
                    com.forsale.app.datalayer.network.entities.ListingDetailsEntity r4 = (com.forsale.app.datalayer.network.entities.ListingDetailsEntity) r4
                    if (r4 == 0) goto L65
                    com.forsale.app.datalayer.network.entities.ExtraInfo r4 = r4.getExtraInfo()
                    if (r4 == 0) goto L65
                    com.forsale.app.datalayer.network.entities.LocationInfo r4 = r4.getLocationInfo()
                    if (r4 == 0) goto L65
                    com.forsale.app.datalayer.network.entities.Location r0 = r4.getLocation()
                L65:
                    com.forsale.app.datalayer.network.entities.Location r4 = com.forsale.app.datalayer.network.entities.Location.DISABLED
                    if (r0 != r4) goto L41
                    r0 = r1
                L6a:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r4 = r4.g2()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
                    r4.setValue(r5)
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.b0 r4 = r4.j2()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r2)
                    r4.setValue(r5)
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r4 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.b0 r4 = r4.n2()
                    if (r2 != 0) goto L90
                    if (r0 != 0) goto L90
                    r2 = r1
                    goto L91
                L90:
                    r2 = r3
                L91:
                    java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                    r4.setValue(r2)
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r2 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r2 = r2.k2()
                    if (r7 == 0) goto La3
                    if (r0 != 0) goto La3
                    goto La4
                La3:
                    r1 = r3
                La4:
                    java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
                    r2.setValue(r7)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackMapVisibility$1.b(com.forsale.app.features.postad.location.LocationLevels):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(LocationLevels locationLevels) {
                b(locationLevels);
                return p.f75480a;
            }
        }));
        this.V0.b(this.T0, new e(new l<Boolean, p>() { // from class: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackMapVisibility$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
                if (r5 == false) goto L15;
             */
            /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(java.lang.Boolean r5) {
                /*
                    r4 = this;
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r0 = r0.t1()
                    java.lang.Object r0 = r0.getValue()
                    java.lang.Boolean r1 = java.lang.Boolean.TRUE
                    boolean r0 = kotlin.jvm.internal.o.d(r0, r1)
                    r1 = 1
                    r2 = 0
                    if (r0 == 0) goto L1e
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    boolean r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.N0(r0)
                    if (r0 == 0) goto L1e
                    r0 = r1
                    goto L1f
                L1e:
                    r0 = r2
                L1f:
                    if (r0 == 0) goto L23
                L21:
                    r5 = r2
                    goto L2a
                L23:
                    boolean r5 = r5.booleanValue()
                    if (r5 != 0) goto L21
                    r5 = r1
                L2a:
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r0 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r0 = r0.k2()
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r3 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    androidx.lifecycle.z r3 = r3.t1()
                    java.lang.Object r3 = r3.getValue()
                    java.lang.Boolean r3 = (java.lang.Boolean) r3
                    if (r3 != 0) goto L40
                    r3 = r2
                    goto L44
                L40:
                    boolean r3 = r3.booleanValue()
                L44:
                    if (r3 == 0) goto L51
                    com.forsale.app.features.postad.location.PostAdLocationViewModel r3 = com.forsale.app.features.postad.location.PostAdLocationViewModel.this
                    boolean r3 = com.forsale.app.features.postad.location.PostAdLocationViewModel.M0(r3)
                    if (r3 == 0) goto L51
                    if (r5 != 0) goto L51
                    goto L52
                L51:
                    r1 = r2
                L52:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                    r0.setValue(r5)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel$trackMapVisibility$2.b(java.lang.Boolean):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                b(bool);
                return p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(double r16, double r18, com.forsale.app.datalayer.database.DistrictEntity r20, zz.a<? super wz.p> r21) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.T2(double, double, com.forsale.app.datalayer.database.DistrictEntity, zz.a):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
        if (r0 != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String U2(java.lang.String r13, boolean r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.U2(java.lang.String, boolean, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ String V2(PostAdLocationViewModel postAdLocationViewModel, String str, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        return postAdLocationViewModel.U2(str, z11, z12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
        if (r5.contains(r4) == true) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W0(java.lang.String... r9) {
        /*
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L27
            r4 = r9[r3]
            androidx.lifecycle.b0<java.util.ArrayList<java.lang.String>> r5 = r8.f35674i1
            java.lang.Object r5 = r5.getValue()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L1e
            boolean r5 = r5.contains(r4)
            r6 = 1
            if (r5 != r6) goto L1e
            goto L1f
        L1e:
            r6 = r2
        L1f:
            if (r6 != 0) goto L24
            r0.add(r4)
        L24:
            int r3 = r3 + 1
            goto L8
        L27:
            androidx.lifecycle.b0<java.util.ArrayList<java.lang.String>> r9 = r8.f35674i1
            java.lang.Object r9 = r9.getValue()
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L34
            r9.addAll(r0)
        L34:
            androidx.lifecycle.b0<java.util.ArrayList<java.lang.String>> r9 = r8.f35674i1
            java.lang.Object r1 = r9.getValue()
            r9.postValue(r1)
            kotlinx.coroutines.CoroutineScope r2 = androidx.lifecycle.r0.a(r8)
            r3 = 0
            r4 = 0
            com.forsale.app.features.postad.location.PostAdLocationViewModel$addLandMark$2$1 r5 = new com.forsale.app.features.postad.location.PostAdLocationViewModel$addLandMark$2$1
            r9 = 0
            r5.<init>(r8, r0, r9)
            r6 = 3
            r7 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.W0(java.lang.String[]):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X0(boolean r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = ""
            r1 = 1
            r2 = 0
            if (r4 == 0) goto L21
            androidx.lifecycle.b0<java.lang.String> r4 = r3.f35697u1
            java.lang.Object r4 = r4.getValue()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r4 == 0) goto L19
            boolean r4 = kotlin.text.k.v(r4)
            if (r4 == 0) goto L17
            goto L19
        L17:
            r4 = r2
            goto L1a
        L19:
            r4 = r1
        L1a:
            if (r4 != 0) goto L21
            androidx.lifecycle.b0<java.lang.String> r4 = r3.f35697u1
            r4.postValue(r0)
        L21:
            if (r5 == 0) goto L58
            androidx.lifecycle.b0<java.util.ArrayList<java.lang.String>> r4 = r3.f35674i1
            java.lang.Object r4 = r4.getValue()
            java.util.Collection r4 = (java.util.Collection) r4
            if (r4 == 0) goto L35
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L34
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 != 0) goto L58
            androidx.lifecycle.b0<java.util.ArrayList<java.lang.String>> r4 = r3.f35674i1
            java.lang.Object r4 = r4.getValue()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L53
            java.lang.String[] r5 = new java.lang.String[r2]
            java.lang.Object[] r4 = r4.toArray(r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            int r5 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String[] r4 = (java.lang.String[]) r4
            r3.B2(r4)
        L53:
            androidx.lifecycle.b0<java.lang.String> r4 = r3.f35681m1
            r4.postValue(r0)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.location.PostAdLocationViewModel.X0(boolean, boolean):void");
    }

    private final void Y0(int i11) {
        LocationLevels locationLevels = LocationLevels.DISTRICT;
        if (i11 == locationLevels.getLevel()) {
            this.f35702x0.postValue(null);
            this.J0.postValue(LocationLevels.REGION);
            I2(this.f35698v0.getValue());
            return;
        }
        LocationLevels locationLevels2 = LocationLevels.AREA;
        if (i11 == locationLevels2.getLevel()) {
            this.f35706z0.postValue(null);
            this.J0.postValue(locationLevels);
            I2(this.f35702x0.getValue());
        } else if (i11 == LocationLevels.BLOCK.getLevel()) {
            this.B0.postValue(null);
            this.J0.postValue(locationLevels2);
            I2(this.f35706z0.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CategoryRuleSet.Level Z0(int i11) {
        CategoryRuleSet.LocationSettings locationSettings;
        List<CategoryRuleSet.Level> levels;
        Object obj;
        boolean z11;
        CategoryRuleSet.RuleSet value = this.f35676k0.d2().getValue();
        if (value == null || (locationSettings = value.getLocationSettings()) == null || (levels = locationSettings.getLevels()) == null) {
            return null;
        }
        Iterator<T> it2 = levels.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((CategoryRuleSet.Level) obj).getLevel() == i11) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CategoryRuleSet.Level level = (CategoryRuleSet.Level) obj;
        if (level == null || !level.getEnabled()) {
            return null;
        }
        return level;
    }

    private final CategoryRuleSet.Level b1(LocationLevels locationLevels) {
        CategoryRuleSet.LocationSettings locationSettings;
        List<CategoryRuleSet.Level> levels;
        Object obj;
        boolean z11;
        CategoryRuleSet.RuleSet value = this.f35676k0.d2().getValue();
        if (value == null || (locationSettings = value.getLocationSettings()) == null || (levels = locationSettings.getLevels()) == null) {
            return null;
        }
        Iterator<T> it2 = levels.iterator();
        while (true) {
            if (it2.hasNext()) {
                obj = it2.next();
                if (((CategoryRuleSet.Level) obj).getLevel() == locationLevels.getLevel()) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CategoryRuleSet.Level level = (CategoryRuleSet.Level) obj;
        if (level == null || !level.getEnabled()) {
            return null;
        }
        return level;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b2(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdLocationViewModel$handleOneBlockArea$1(this, i11, null), 3, null);
    }

    private final void c2(Integer num) {
        p pVar;
        String str;
        boolean z11;
        ExtraInfo extraInfo;
        LocationInfo locationInfo;
        Integer Q1 = Q1(num);
        String str2 = null;
        if (Q1 != null) {
            d2(Q1.intValue());
            pVar = p.f75480a;
        } else {
            pVar = null;
        }
        if (pVar == null) {
            H2();
        }
        ListingDetailsEntity value = this.f35676k0.p2().getValue();
        if (value != null && (extraInfo = value.getExtraInfo()) != null && (locationInfo = extraInfo.getLocationInfo()) != null) {
            str = locationInfo.getStreetName();
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (true ^ z11) {
            str2 = str;
        }
        if (str2 != null) {
            this.f35697u1.postValue(str2);
        }
    }

    private final void d2(int i11) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdLocationViewModel$initLeafDistrict$1(this, i11, null), 3, null);
    }

    private final void e2(Integer num) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdLocationViewModel$initRegion$1(this, num, null), 3, null);
    }

    private final boolean f2(int i11) {
        if (i11 == LocationLevels.BLOCK.getLevel()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h2() {
        CategoryRuleSet.LocationSettings locationSettings;
        CategoryRuleSet.LocationExtraInfo map;
        CategoryRuleSet.RuleSet value = this.f35676k0.d2().getValue();
        if (value != null && (locationSettings = value.getLocationSettings()) != null && (map = locationSettings.getMap()) != null) {
            return map.getEnabled();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i2() {
        CategoryRuleSet.LocationSettings locationSettings;
        CategoryRuleSet.LocationExtraInfo map;
        CategoryRuleSet.RuleSet value = this.f35676k0.d2().getValue();
        if (value != null && (locationSettings = value.getLocationSettings()) != null && (map = locationSettings.getMap()) != null) {
            return map.getRequired();
        }
        return false;
    }

    private final boolean l2(LiveData<CategoryRuleSet.Level> liveData, DistrictEntity districtEntity) {
        boolean z11;
        CategoryRuleSet.Level value;
        if (liveData != null && (value = liveData.getValue()) != null && value.getRequired()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11 && districtEntity == null) {
            return true;
        }
        return false;
    }

    private final boolean m2(String str) {
        String str2;
        String value = this.f35676k0.b3().getValue();
        if (value != null) {
            str2 = StringsKt__StringsKt.r0(value, "965");
        } else {
            str2 = null;
        }
        return o.d(PhoneDetectorKt.i(str), str2);
    }

    private final boolean o2() {
        boolean z11;
        boolean z12;
        CategoryRuleSet.LocationExtraInfo landmarks;
        ArrayList<String> value = this.f35674i1.getValue();
        if (value != null && !value.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            CategoryRuleSet.LocationSettings value2 = this.f35696u0.getValue();
            if (value2 != null && (landmarks = value2.getLandmarks()) != null && landmarks.getRequired()) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                return false;
            }
        }
        return true;
    }

    private final void p2(CategoryRuleSet.Level level, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(this, new d(CoroutineExceptionHandler.Key), null, new PostAdLocationViewModel$loadLocations$2(num, this, level, null), 2, null);
    }

    private final void y2(MutableSharedFlow<Pair<String, Boolean>> mutableSharedFlow, List<String> list) {
        Object m02;
        m02 = CollectionsKt___CollectionsKt.m0(list);
        String str = (String) m02;
        if (str != null) {
            mutableSharedFlow.tryEmit(new Pair<>(str, Boolean.valueOf(m2(str))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z2(List<DistrictEntity> list, CategoryRuleSet.Level level, Integer num) {
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdLocationViewModel$postLocationsList$1(list, this, level, num, null), 3, null);
    }

    public final void A2(int i11, String phone) {
        String C;
        String value;
        String C2;
        o.i(phone, "phone");
        if (i11 != 16) {
            if (i11 == 17 && (value = this.f35681m1.getValue()) != null) {
                b0<String> b0Var = this.f35681m1;
                C2 = s.C(value, phone, "", false, 4, null);
                b0Var.postValue(C2);
                return;
            }
            return;
        }
        String value2 = this.f35697u1.getValue();
        if (value2 != null) {
            b0<String> b0Var2 = this.f35697u1;
            C = s.C(value2, phone, "", false, 4, null);
            b0Var2.postValue(C);
        }
    }

    public final void B2(String... landMark) {
        ArrayList<String> value;
        Iterator<String> it2;
        boolean z11;
        o.i(landMark, "landMark");
        ArrayList arrayList = new ArrayList();
        for (String str : landMark) {
            ArrayList<String> value2 = this.f35674i1.getValue();
            if (value2 != null) {
                z11 = value2.contains(str);
            } else {
                z11 = false;
            }
            if (z11) {
                arrayList.add(str);
            }
        }
        if (!(!arrayList.isEmpty())) {
            arrayList = null;
        }
        if (arrayList != null && (value = this.f35674i1.getValue()) != null && (it2 = value.iterator()) != null) {
            o.f(it2);
            while (it2.hasNext()) {
                String next = it2.next();
                o.h(next, "next(...)");
                if (arrayList.contains(next)) {
                    it2.remove();
                }
            }
            BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdLocationViewModel$removeLandMark$3$1(this, arrayList, null), 3, null);
        }
    }

    public final MutableSharedFlow<xe.b> E1() {
        return this.f35686p0;
    }

    public final void E2(DistrictEntity districtEntity, int i11) {
        Job launch$default;
        if (districtEntity != null) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this, null, null, new PostAdLocationViewModel$selectLocationPart$1$1(this, districtEntity, i11, null), 3, null);
            if (launch$default != null) {
                return;
            }
        }
        Y0(i11);
        p pVar = p.f75480a;
    }

    public final b0<CategoryRuleSet.LocationSettings> F1() {
        return this.f35696u0;
    }

    public final void F2(double d11, double d12, DistrictEntity districtEntity) {
        this.Z0.postValue(i.a(Double.valueOf(d11), Double.valueOf(d12)));
        this.W0.postValue(i.a(Double.valueOf(d11), Double.valueOf(d12)));
        BuildersKt__Builders_commonKt.launch$default(this, new f(CoroutineExceptionHandler.Key, this), null, new PostAdLocationViewModel$setCoordinates$2(this, d11, d12, districtEntity, null), 2, null);
    }

    public final b0<MarkerType> G1() {
        return this.f35667b1;
    }

    public final b0<MarkerType> H1() {
        return this.f35668c1;
    }

    public final z<Boolean> I1() {
        return this.f35679l1;
    }

    public final b0<String> J1() {
        return this.f35681m1;
    }

    public final SharedFlow<p> K1() {
        return this.f35670e1;
    }

    public final void M2(ArrayList<String> arrayList) {
        this.B1 = arrayList;
    }

    public final SharedFlow<Pair<String, Boolean>> O1() {
        return this.A1;
    }

    public final SharedFlow<Pair<String, Boolean>> P1() {
        return this.f35705y1;
    }

    public final LiveData<List<String>> R1() {
        return this.f35673h1;
    }

    public final SharedFlow<List<String>> S1() {
        return this.f35691r1;
    }

    public final int T1(int i11) {
        LiveData<DistrictEntity> liveData;
        DistrictEntity districtEntity = null;
        if (i11 == LocationLevels.DISTRICT.getLevel()) {
            LiveData<DistrictEntity> liveData2 = this.f35704y0;
            if (liveData2 != null) {
                districtEntity = liveData2.getValue();
            }
        } else if (i11 == LocationLevels.AREA.getLevel()) {
            LiveData<DistrictEntity> liveData3 = this.A0;
            if (liveData3 != null) {
                districtEntity = liveData3.getValue();
            }
        } else if (i11 == LocationLevels.BLOCK.getLevel() && (liveData = this.C0) != null) {
            districtEntity = liveData.getValue();
        }
        if (districtEntity != null) {
            return districtEntity.getId();
        }
        return -1;
    }

    public final SelectorType U1(int i11) {
        boolean f22 = f2(i11);
        if (f22) {
            return SelectorType.GRID;
        }
        if (!f22) {
            return SelectorType.LIST;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final SharedFlow<Boolean> V1() {
        return this.f35672g1;
    }

    public final b0<String> W1() {
        return this.f35697u1;
    }

    public final z<String> X1() {
        return this.f35701w1;
    }

    public final z<Boolean> Y1() {
        return this.f35699v1;
    }

    public final ArrayList<String> Z1() {
        return this.B1;
    }

    public final float a2() {
        int i11;
        LocationLevels value = this.J0.getValue();
        if (value == null) {
            i11 = -1;
        } else {
            i11 = c.f35711a[value.ordinal()];
        }
        if (i11 == 1 || i11 == 2 || i11 == 3 || i11 != 4) {
            return 14.0f;
        }
        return 8.0f;
    }

    public final SharedFlow<List<String>> c1() {
        return this.f35687p1;
    }

    public final LiveData<String> d1() {
        return this.Y0;
    }

    public final LiveData<DistrictEntity> e1() {
        return this.A0;
    }

    public final LiveData<CategoryRuleSet.Level> f1() {
        return this.G0;
    }

    public final z<Boolean> g1() {
        return this.Q0;
    }

    public final z<Boolean> g2() {
        return this.U0;
    }

    public final z<Boolean> h1() {
        return this.M0;
    }

    public final LiveData<DistrictEntity> i1() {
        return this.C0;
    }

    public final LiveData<CategoryRuleSet.Level> j1() {
        return this.I0;
    }

    public final b0<Boolean> j2() {
        return this.S0;
    }

    public final z<Boolean> k1() {
        return this.R0;
    }

    public final z<Boolean> k2() {
        return this.V0;
    }

    public final z<Boolean> l1() {
        return this.N0;
    }

    public final LiveData<Pair<Double, Double>> m1() {
        return this.f35666a1;
    }

    public final LiveData<DistrictEntity> n1() {
        return this.f35704y0;
    }

    public final b0<Boolean> n2() {
        return this.T0;
    }

    public final z<Boolean> o1() {
        return this.L0;
    }

    public final LiveData<CategoryRuleSet.Level> p1() {
        return this.E0;
    }

    public final DistrictsRepository q1() {
        return this.f35680m0;
    }

    public final void q2() {
        String value = this.f35681m1.getValue();
        if (value != null) {
            W0(value);
        }
        this.f35681m1.postValue("");
    }

    public final z<Boolean> r1() {
        return this.P0;
    }

    public final void r2() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdLocationViewModel$onBackClicked$1(this, null), 3, null);
    }

    public final z<Boolean> s1() {
        return this.K0;
    }

    public final void s2() {
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        ref$BooleanRef.f61774a = true;
        if (l2(this.E0, this.f35704y0.getValue()) && o.d(this.K0.getValue(), Boolean.TRUE)) {
            this.P0.setValue(Boolean.FALSE);
            ref$BooleanRef.f61774a = false;
        }
        if (l2(this.G0, this.A0.getValue()) && o.d(this.M0.getValue(), Boolean.TRUE)) {
            this.Q0.setValue(Boolean.FALSE);
            ref$BooleanRef.f61774a = false;
        }
        if (l2(this.I0, this.C0.getValue()) && o.d(this.N0.getValue(), Boolean.TRUE)) {
            this.R0.setValue(Boolean.FALSE);
            ref$BooleanRef.f61774a = false;
        }
        if (!N2() && o.d(this.f35699v1.getValue(), Boolean.TRUE)) {
            z<String> zVar = this.f35701w1;
            String value = this.f35697u1.getValue();
            if (value == null) {
                value = "";
            }
            zVar.setValue(U2(value, true, true));
            ref$BooleanRef.f61774a = false;
        }
        if (!o2() && o.d(this.f35677k1.getValue(), Boolean.TRUE)) {
            this.f35683n1.setValue(J().getString(y0.Yb, new Object[0]));
            ref$BooleanRef.f61774a = false;
        }
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdLocationViewModel$onDoneClicked$1(ref$BooleanRef, this, null), 3, null);
    }

    public final z<Boolean> t1() {
        return this.O0;
    }

    public final void t2() {
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), null, null, new PostAdLocationViewModel$onMapClick$1(this, null), 3, null);
    }

    public final SharedFlow<p> u1() {
        return this.f35690r0;
    }

    public final void u2(List<String> phonesList) {
        o.i(phonesList, "phonesList");
        y2(this.f35707z1, phonesList);
    }

    public final SharedFlow<p> v1() {
        return this.f35694t0;
    }

    public final void v2(List<String> phonesList) {
        o.i(phonesList, "phonesList");
        y2(this.f35703x1, phonesList);
    }

    public final LiveData<Boolean> w1() {
        return this.f35695t1;
    }

    public final void w2(String newProhWord) {
        o.i(newProhWord, "newProhWord");
        this.f35676k0.y1(newProhWord);
    }

    public final z<String> x1() {
        return this.f35683n1;
    }

    public final void x2(int i11) {
        CategoryRuleSet.Level Z0 = Z0(i11);
        if (Z0 != null) {
            p2(Z0, N1(i11));
        }
    }

    public final z<Boolean> y1() {
        return this.f35677k1;
    }

    public final LiveData<ArrayList<String>> z1() {
        return this.f35675j1;
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class d extends kotlin.coroutines.a implements CoroutineExceptionHandler {
        public d(CoroutineExceptionHandler.Key key) {
            super(key);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
        }
    }
}
