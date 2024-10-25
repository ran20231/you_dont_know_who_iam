package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.network.entities.ExtraInfo;
import com.forsale.app.datalayer.network.entities.LocationInfo;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.datalayer.repositories.TranslationRepository;
import com.forsale.app.utils.TypeExtensionsKt;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import wz.e;
import wz.p;
/* compiled from: DistrictsItemViewModel.kt */
/* loaded from: classes2.dex */
public final class DistrictsItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final ListingItemDetails f27401a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Integer> f27402b;

    /* renamed from: c  reason: collision with root package name */
    private final LiveData<TranslationRepository.Translation> f27403c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineScope f27404d;

    /* renamed from: e  reason: collision with root package name */
    private final DistrictsRepository f27405e;

    /* renamed from: f  reason: collision with root package name */
    private final z<String> f27406f;

    /* renamed from: g  reason: collision with root package name */
    private final b0<String> f27407g;

    /* renamed from: h  reason: collision with root package name */
    private final b0<List<String>> f27408h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<List<String>> f27409i;

    /* renamed from: j  reason: collision with root package name */
    private final z<String> f27410j;

    /* compiled from: DistrictsItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27411a;

        static {
            int[] iArr = new int[TranslationRepository.Translation.values().length];
            try {
                iArr[TranslationRepository.Translation.ARABIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TranslationRepository.Translation.ENGLISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27411a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DistrictsItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f27412a;

        b(l function) {
            o.i(function, "function");
            this.f27412a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f27412a;
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
            this.f27412a.invoke(obj);
        }
    }

    public DistrictsItemViewModel(ListingItemDetails listingDetails, List<Integer> list, LiveData<TranslationRepository.Translation> translation, CoroutineScope coroutineScope, DistrictsRepository districtsRepository) {
        String str;
        LocationInfo locationInfo;
        LocationInfo locationInfo2;
        o.i(listingDetails, "listingDetails");
        o.i(translation, "translation");
        o.i(coroutineScope, "coroutineScope");
        o.i(districtsRepository, "districtsRepository");
        this.f27401a = listingDetails;
        this.f27402b = list;
        this.f27403c = translation;
        this.f27404d = coroutineScope;
        this.f27405e = districtsRepository;
        this.f27406f = new z<>();
        ExtraInfo extraInfo = listingDetails.getExtraInfo();
        List<String> list2 = null;
        if (extraInfo != null && (locationInfo2 = extraInfo.getLocationInfo()) != null) {
            str = locationInfo2.getStreetName();
        } else {
            str = null;
        }
        this.f27407g = new b0<>(str);
        ExtraInfo extraInfo2 = listingDetails.getExtraInfo();
        if (extraInfo2 != null && (locationInfo = extraInfo2.getLocationInfo()) != null) {
            list2 = locationInfo.getLandMarks();
        }
        b0<List<String>> b0Var = new b0<>(list2);
        this.f27408h = b0Var;
        this.f27409i = b0Var;
        this.f27410j = new z<>();
        i();
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(TranslationRepository.Translation translation, DistrictEntity districtEntity) {
        int i11;
        String T0;
        if (translation == null) {
            i11 = -1;
        } else {
            i11 = a.f27411a[translation.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                String fullPath = districtEntity.getFullPath();
                if (fullPath == null || (T0 = TypeExtensionsKt.T0(fullPath, false, false, 3, null)) == null) {
                    return "";
                }
            } else {
                String fullPathEn = districtEntity.getFullPathEn();
                if (fullPathEn == null || (T0 = TypeExtensionsKt.T0(fullPathEn, false, false, 3, null)) == null) {
                    return "";
                }
            }
        } else {
            String fullPathAr = districtEntity.getFullPathAr();
            if (fullPathAr == null || (T0 = TypeExtensionsKt.T0(fullPathAr, false, false, 3, null)) == null) {
                return "";
            }
        }
        return T0;
    }

    private final void i() {
        ArrayList arrayList = new ArrayList();
        List<Integer> list = this.f27402b;
        if (list != null && (!list.isEmpty())) {
            BuildersKt__Builders_commonKt.launch$default(this.f27404d, null, null, new DistrictsItemViewModel$loadDistricts$1$1(list, this, arrayList, null), 3, null);
        }
    }

    private final void j() {
        this.f27410j.b(this.f27407g, new b(new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$trackAddress$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(java.lang.String r4) {
                /*
                    r3 = this;
                    if (r4 == 0) goto Lb
                    boolean r0 = kotlin.text.k.v(r4)
                    if (r0 == 0) goto L9
                    goto Lb
                L9:
                    r0 = 0
                    goto Lc
                Lb:
                    r0 = 1
                Lc:
                    if (r0 == 0) goto L22
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r4 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.z r4 = r4.f()
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.z r0 = r0.g()
                    java.lang.Object r0 = r0.getValue()
                    r4.setValue(r0)
                    goto L49
                L22:
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.z r0 = r0.f()
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r1 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.z r1 = r1.g()
                    java.lang.Object r1 = r1.getValue()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r4)
                    java.lang.String r4 = " , "
                    r2.append(r4)
                    r2.append(r1)
                    java.lang.String r4 = r2.toString()
                    r0.setValue(r4)
                L49:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$trackAddress$1.b(java.lang.String):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
        this.f27410j.b(this.f27406f, new b(new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$trackAddress$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
            /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(java.lang.String r4) {
                /*
                    r3 = this;
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.b0 r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.c(r0)
                    java.lang.Object r0 = r0.getValue()
                    java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                    if (r0 == 0) goto L17
                    boolean r0 = kotlin.text.k.v(r0)
                    if (r0 == 0) goto L15
                    goto L17
                L15:
                    r0 = 0
                    goto L18
                L17:
                    r0 = 1
                L18:
                    if (r0 == 0) goto L24
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.z r0 = r0.f()
                    r0.setValue(r4)
                    goto L4b
                L24:
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.z r0 = r0.f()
                    com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel r1 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.this
                    androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel.c(r1)
                    java.lang.Object r1 = r1.getValue()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.String r1 = " , "
                    r2.append(r1)
                    r2.append(r4)
                    java.lang.String r4 = r2.toString()
                    r0.setValue(r4)
                L4b:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$trackAddress$2.b(java.lang.String):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(final List<DistrictEntity> list) {
        this.f27406f.b(this.f27403c, new b(new l<TranslationRepository.Translation, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.districts.DistrictsItemViewModel$translateDistrictsNames$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void b(TranslationRepository.Translation translation) {
                String t02;
                String e11;
                ArrayList arrayList = new ArrayList();
                List<DistrictEntity> list2 = list;
                if (list2 != null) {
                    DistrictsItemViewModel districtsItemViewModel = this;
                    for (DistrictEntity districtEntity : list2) {
                        e11 = districtsItemViewModel.e(translation, districtEntity);
                        arrayList.add(e11);
                    }
                }
                z<String> g11 = this.g();
                t02 = CollectionsKt___CollectionsKt.t0(arrayList, ", ", null, null, 0, null, null, 62, null);
                g11.setValue(t02);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(TranslationRepository.Translation translation) {
                b(translation);
                return p.f75480a;
            }
        }));
    }

    public final z<String> f() {
        return this.f27410j;
    }

    public final z<String> g() {
        return this.f27406f;
    }

    public final LiveData<List<String>> h() {
        return this.f27409i;
    }
}
