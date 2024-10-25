package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem;

import android.view.View;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.database.CategoryEntity;
import com.forsale.app.datalayer.database.DistrictEntity;
import com.forsale.app.datalayer.database.RegionEntity;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ItemStatus;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.DistrictsRepository;
import com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsViewModel;
import com.forsale.app.utils.LocaleManager;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.github.mikephil.charting.utils.Utils;
import g00.l;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.y0;
import wz.e;
import wz.p;
/* compiled from: PreviewCardItemViewModel.kt */
/* loaded from: classes2.dex */
public final class PreviewCardItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final NewListingDetailsViewModel f27867a;

    /* renamed from: b  reason: collision with root package name */
    private final ListingItemDetails f27868b;

    /* renamed from: c  reason: collision with root package name */
    private final DistrictsRepository f27869c;

    /* renamed from: d  reason: collision with root package name */
    private final ApplicationResourcesRepository f27870d;

    /* renamed from: e  reason: collision with root package name */
    private final LiveData<CategoryEntity> f27871e;

    /* renamed from: f  reason: collision with root package name */
    private final b0<String> f27872f;

    /* renamed from: g  reason: collision with root package name */
    private final LiveData<String> f27873g;

    /* renamed from: h  reason: collision with root package name */
    private final b0<String> f27874h;

    /* renamed from: i  reason: collision with root package name */
    private final LiveData<String> f27875i;

    /* renamed from: j  reason: collision with root package name */
    private final b0<String> f27876j;

    /* renamed from: k  reason: collision with root package name */
    private final LiveData<String> f27877k;

    /* renamed from: l  reason: collision with root package name */
    private final b0<String> f27878l;

    /* renamed from: m  reason: collision with root package name */
    private final LiveData<String> f27879m;

    /* renamed from: n  reason: collision with root package name */
    private final String f27880n;

    /* renamed from: o  reason: collision with root package name */
    private final b0<Boolean> f27881o;

    /* renamed from: p  reason: collision with root package name */
    private final boolean f27882p;

    /* renamed from: q  reason: collision with root package name */
    private final b0<String> f27883q;

    /* renamed from: r  reason: collision with root package name */
    private final b0<String> f27884r;

    /* renamed from: s  reason: collision with root package name */
    private final OneShotEventHandler<String> f27885s;

    /* renamed from: t  reason: collision with root package name */
    private final b0<String> f27886t;

    /* renamed from: u  reason: collision with root package name */
    private final LiveData<String> f27887u;

    /* renamed from: v  reason: collision with root package name */
    private final z<String> f27888v;

    /* compiled from: PreviewCardItemViewModel.kt */
    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27889a;

        static {
            int[] iArr = new int[ItemStatus.values().length];
            try {
                iArr[ItemStatus.DRAFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ItemStatus.QUARANTINE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f27889a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PreviewCardItemViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f27890a;

        b(l function) {
            o.i(function, "function");
            this.f27890a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f27890a;
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
            this.f27890a.invoke(obj);
        }
    }

    public PreviewCardItemViewModel(NewListingDetailsViewModel newListingDetailsViewModel, ListingItemDetails listingDetails, DistrictsRepository districtsRepository) {
        o.i(newListingDetailsViewModel, "newListingDetailsViewModel");
        o.i(listingDetails, "listingDetails");
        o.i(districtsRepository, "districtsRepository");
        this.f27867a = newListingDetailsViewModel;
        this.f27868b = listingDetails;
        this.f27869c = districtsRepository;
        this.f27870d = newListingDetailsViewModel.y1();
        this.f27871e = newListingDetailsViewModel.E1();
        b0<String> b0Var = new b0<>();
        this.f27872f = b0Var;
        this.f27873g = b0Var;
        b0<String> b0Var2 = new b0<>();
        this.f27874h = b0Var2;
        this.f27875i = b0Var2;
        b0<String> b0Var3 = new b0<>();
        this.f27876j = b0Var3;
        this.f27877k = b0Var3;
        b0<String> b0Var4 = new b0<>();
        this.f27878l = b0Var4;
        this.f27879m = b0Var4;
        this.f27880n = z();
        this.f27881o = new b0<>(Boolean.FALSE);
        this.f27882p = f();
        this.f27883q = new b0<>();
        this.f27884r = new b0<>();
        this.f27885s = new OneShotEventHandler<>(null, 0, 3, null);
        b0<String> b0Var5 = new b0<>();
        this.f27886t = b0Var5;
        this.f27887u = b0Var5;
        this.f27888v = new z<>();
        y();
        v();
        w();
        E();
    }

    private final String B(double d11) {
        return NumberFormat.getNumberInstance(new Locale(LocaleManager.f39597a.k())).format(d11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void C(RegionEntity regionEntity) {
        int i11;
        String g11;
        String g12;
        String g13;
        String g14;
        ItemStatus status = this.f27868b.getStatus();
        if (status == null) {
            i11 = -1;
        } else {
            i11 = a.f27889a[status.ordinal()];
        }
        boolean z11 = true;
        if (i11 == 1) {
            String dateCreated = this.f27868b.getDateCreated();
            if (dateCreated != null && (g14 = g(dateCreated, regionEntity.getUtcDiff(), "dd MMM. hh:mm a")) != null) {
                b0<String> b0Var = this.f27876j;
                String lowerCase = g14.toLowerCase(Locale.ROOT);
                o.h(lowerCase, "toLowerCase(...)");
                b0Var.postValue(lowerCase);
                return;
            }
            return;
        }
        String datePublished = this.f27868b.getDatePublished();
        if (datePublished != null && (g13 = g(datePublished, regionEntity.getUtcDiff(), "dd MMM. hh:mm a")) != null) {
            b0<String> b0Var2 = this.f27876j;
            String lowerCase2 = g13.toLowerCase(Locale.ROOT);
            o.h(lowerCase2, "toLowerCase(...)");
            b0Var2.postValue(lowerCase2);
        }
        String dateExpired = this.f27868b.getDateExpired();
        if (dateExpired != null && (g12 = g(dateExpired, regionEntity.getUtcDiff(), "dd MMM. hh:mm a")) != null) {
            b0<String> b0Var3 = this.f27878l;
            String lowerCase3 = g12.toLowerCase(Locale.ROOT);
            o.h(lowerCase3, "toLowerCase(...)");
            b0Var3.postValue(lowerCase3);
            b0<Boolean> b0Var4 = this.f27881o;
            if (this.f27868b.getStatus() == ItemStatus.DRAFT || this.f27868b.getStatus() == ItemStatus.QUARANTINE) {
                z11 = false;
            }
            b0Var4.postValue(Boolean.valueOf(z11));
            x();
        }
        String archived_on = this.f27868b.getArchived_on();
        if (archived_on != null && (g11 = g(archived_on, regionEntity.getUtcDiff(), "dd MMM. hh:mm a")) != null) {
            b0<String> b0Var5 = this.f27878l;
            String lowerCase4 = g11.toLowerCase(Locale.ROOT);
            o.h(lowerCase4, "toLowerCase(...)");
            b0Var5.postValue(lowerCase4);
            this.f27881o.postValue(Boolean.TRUE);
            this.f27883q.postValue(this.f27870d.getString(y0.Z5, new Object[0]));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(RegionEntity regionEntity) {
        boolean z11;
        if (this.f27868b.getPrice() == Utils.DOUBLE_EPSILON) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            this.f27872f.postValue(B(this.f27868b.getPrice()));
            b0<String> b0Var = this.f27874h;
            String lowerCase = regionEntity.getCurrency().toLowerCase(Locale.ROOT);
            o.h(lowerCase, "toLowerCase(...)");
            b0Var.postValue(lowerCase);
            return;
        }
        this.f27872f.postValue(this.f27870d.getString(y0.U8, new Object[0]));
        this.f27874h.postValue("");
    }

    private final void E() {
        this.f27888v.b(this.f27887u, new b(new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$trackCategoryDistrictName$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0010  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x002a  */
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
                    java.lang.String r1 = ""
                    if (r0 == 0) goto L2a
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r4 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.z r4 = r4.h()
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.b0 r0 = r0.i()
                    java.lang.Object r0 = r0.getValue()
                    java.lang.String r0 = (java.lang.String) r0
                    if (r0 != 0) goto L25
                    goto L26
                L25:
                    r1 = r0
                L26:
                    r4.setValue(r1)
                    goto L57
                L2a:
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.z r0 = r0.h()
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r2 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.b0 r2 = r2.i()
                    java.lang.Object r2 = r2.getValue()
                    java.lang.String r2 = (java.lang.String) r2
                    if (r2 != 0) goto L3f
                    goto L40
                L3f:
                    r1 = r2
                L40:
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r1)
                    java.lang.String r1 = " - "
                    r2.append(r1)
                    r2.append(r4)
                    java.lang.String r4 = r2.toString()
                    r0.setValue(r4)
                L57:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$trackCategoryDistrictName$1.b(java.lang.String):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
        this.f27888v.b(this.f27884r, new b(new l<String, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$trackCategoryDistrictName$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(1);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void b(java.lang.String r4) {
                /*
                    r3 = this;
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.b0 r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.c(r0)
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
                    java.lang.String r1 = ""
                    if (r0 == 0) goto L29
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.z r0 = r0.h()
                    if (r4 != 0) goto L25
                    r4 = r1
                L25:
                    r0.setValue(r4)
                    goto L53
                L29:
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r0 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.z r0 = r0.h()
                    if (r4 != 0) goto L32
                    r4 = r1
                L32:
                    com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.this
                    androidx.lifecycle.b0 r1 = com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel.c(r1)
                    java.lang.Object r1 = r1.getValue()
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    r2.append(r4)
                    java.lang.String r4 = " - "
                    r2.append(r4)
                    r2.append(r1)
                    java.lang.String r4 = r2.toString()
                    r0.setValue(r4)
                L53:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.previewcarditem.PreviewCardItemViewModel$trackCategoryDistrictName$2.b(java.lang.String):void");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(String str) {
                b(str);
                return p.f75480a;
            }
        }));
    }

    private final boolean f() {
        if (!this.f27867a.R1().y1() && this.f27868b.getStatus() != ItemStatus.DRAFT && this.f27868b.getStatus() != ItemStatus.QUARANTINE) {
            return true;
        }
        return false;
    }

    private final String g(String str, String str2, String str3) {
        return TypeExtensionsKt.n0(str, str2, false, str3, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String k(DistrictEntity districtEntity) {
        if (LocaleManager.f39597a.r()) {
            String fullPathAr = districtEntity.getFullPathAr();
            if (fullPathAr == null) {
                return null;
            }
            return TypeExtensionsKt.T0(fullPathAr, false, true, 1, null);
        }
        String fullPathEn = districtEntity.getFullPathEn();
        if (fullPathEn == null) {
            return null;
        }
        return TypeExtensionsKt.T0(fullPathEn, false, true, 1, null);
    }

    private final void v() {
        BuildersKt__Builders_commonKt.launch$default(this.f27867a, null, null, new PreviewCardItemViewModel$loadCategoryNames$1(this, null), 3, null);
    }

    private final void w() {
        ArrayList arrayList = new ArrayList();
        List<Integer> districtsIds = this.f27868b.getDistrictsIds();
        if (districtsIds != null && (!districtsIds.isEmpty())) {
            BuildersKt__Builders_commonKt.launch$default(this.f27867a, null, null, new PreviewCardItemViewModel$loadDistricts$1$1(districtsIds, this, arrayList, null), 3, null);
        }
    }

    private final void x() {
        int i11;
        String dateExpired = this.f27868b.getDateExpired();
        if (dateExpired != null) {
            b0<String> b0Var = this.f27883q;
            ApplicationResourcesRepository applicationResourcesRepository = this.f27870d;
            if (TypeExtensionsKt.O(dateExpired, "yyyy-MM-dd HH:mm:ss")) {
                i11 = y0.f70603o6;
            } else {
                i11 = y0.S8;
            }
            b0Var.postValue(applicationResourcesRepository.getString(i11, new Object[0]));
        }
    }

    private final void y() {
        BuildersKt__Builders_commonKt.launch$default(this.f27867a, null, null, new PreviewCardItemViewModel$loadItemData$1(this, null), 3, null);
    }

    private final String z() {
        int i11;
        if (this.f27867a.R1().y1()) {
            return this.f27870d.getString(y0.M6, new Object[0]);
        }
        ItemStatus status = this.f27868b.getStatus();
        if (status == null) {
            i11 = -1;
        } else {
            i11 = a.f27889a[status.ordinal()];
        }
        if (i11 != 1) {
            if (i11 != 2) {
                return this.f27870d.getString(y0.M6, new Object[0]);
            }
            return this.f27870d.getString(y0.N6, new Object[0]);
        }
        return this.f27870d.getString(y0.O6, new Object[0]);
    }

    public final boolean A(View view) {
        String valueOf;
        o.i(view, "view");
        if (LocaleManager.f39597a.r()) {
            valueOf = com.forsale.app.utils.l.a(String.valueOf(this.f27868b.getEncId()));
        } else {
            valueOf = String.valueOf(this.f27868b.getEncId());
        }
        this.f27885s.i(valueOf);
        return false;
    }

    public final z<String> h() {
        return this.f27888v;
    }

    public final b0<String> i() {
        return this.f27884r;
    }

    public final LiveData<String> j() {
        return this.f27875i;
    }

    public final LiveData<String> l() {
        return this.f27879m;
    }

    public final b0<String> m() {
        return this.f27883q;
    }

    public final b0<Boolean> n() {
        return this.f27881o;
    }

    public final ListingItemDetails o() {
        return this.f27868b;
    }

    public final NewListingDetailsViewModel p() {
        return this.f27867a;
    }

    public final LiveData<String> q() {
        return this.f27873g;
    }

    public final LiveData<String> r() {
        return this.f27877k;
    }

    public final String s() {
        return this.f27880n;
    }

    public final OneShotEventHandler<String> t() {
        return this.f27885s;
    }

    public final boolean u() {
        return this.f27882p;
    }
}
