package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.recommendedlistings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.b0;
import androidx.lifecycle.c0;
import androidx.lifecycle.z;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.RegionsRepository;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.utils.OneShotEventHandler;
import com.google.android.gms.maps.model.PinConfig;
import g00.l;
import g00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.s;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import nb.b;
import wz.e;
/* compiled from: RecommendedListItemViewModel.kt */
/* loaded from: classes2.dex */
public final class RecommendedListItemViewModel {

    /* renamed from: a  reason: collision with root package name */
    private final ListingDetailsViewModel f27563a;

    /* renamed from: b  reason: collision with root package name */
    private final RegionsRepository f27564b;

    /* renamed from: c  reason: collision with root package name */
    private final ApplicationResourcesRepository f27565c;

    /* renamed from: d  reason: collision with root package name */
    private final b0<String> f27566d;

    /* renamed from: e  reason: collision with root package name */
    private final z<List<b>> f27567e;

    /* renamed from: f  reason: collision with root package name */
    private final LiveData<List<b>> f27568f;

    /* renamed from: g  reason: collision with root package name */
    private final OneShotEventHandler<Boolean> f27569g;

    /* compiled from: RecommendedListItemViewModel.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.recommendedlistings.RecommendedListItemViewModel$2", f = "RecommendedListItemViewModel.kt", l = {34, PinConfig.BITMAP_LENGTH_DP}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.recommendedlistings.RecommendedListItemViewModel$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27571a;

        AnonymousClass2(zz.a<? super AnonymousClass2> aVar) {
            super(2, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass2(aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f27571a;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        f.b(obj);
                        return wz.p.f75480a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f.b(obj);
            } else {
                f.b(obj);
                RegionsRepository regionsRepository = RecommendedListItemViewModel.this.f27564b;
                this.f27571a = 1;
                obj = RegionsRepository.getRegionCode$default(regionsRepository, null, this, 1, null);
                if (obj == f11) {
                    return f11;
                }
            }
            RecommendedListItemViewModel.this.f27566d.postValue((String) obj);
            ListingDetailsViewModel listingDetailsViewModel = RecommendedListItemViewModel.this.f27563a;
            this.f27571a = 2;
            if (listingDetailsViewModel.I1(this) == f11) {
                return f11;
            }
            return wz.p.f75480a;
        }

        @Override // g00.p
        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
        }
    }

    /* compiled from: RecommendedListItemViewModel.kt */
    /* loaded from: classes2.dex */
    static final class a implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f27573a;

        a(l function) {
            o.i(function, "function");
            this.f27573a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f27573a;
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
            this.f27573a.invoke(obj);
        }
    }

    public RecommendedListItemViewModel(ListingDetailsViewModel listingDetailsViewModel, RegionsRepository regionRepository, ApplicationResourcesRepository appRepo) {
        o.i(listingDetailsViewModel, "listingDetailsViewModel");
        o.i(regionRepository, "regionRepository");
        o.i(appRepo, "appRepo");
        this.f27563a = listingDetailsViewModel;
        this.f27564b = regionRepository;
        this.f27565c = appRepo;
        this.f27566d = new b0<>();
        z<List<b>> zVar = new z<>();
        this.f27567e = zVar;
        this.f27568f = zVar;
        this.f27569g = new OneShotEventHandler<>(null, 0, 3, null);
        zVar.b(listingDetailsViewModel.i1(), new a(new l<List<? extends ListingItemBrief>, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.recommendedlistings.RecommendedListItemViewModel.1
            {
                super(1);
            }

            public final void b(List<ListingItemBrief> list) {
                boolean z11;
                int y11;
                List<ListingItemBrief> list2 = list;
                if (list2 != null && !list2.isEmpty()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    z zVar2 = RecommendedListItemViewModel.this.f27567e;
                    o.f(list);
                    List<ListingItemBrief> list3 = list;
                    RecommendedListItemViewModel recommendedListItemViewModel = RecommendedListItemViewModel.this;
                    y11 = s.y(list3, 10);
                    ArrayList arrayList = new ArrayList(y11);
                    for (ListingItemBrief listingItemBrief : list3) {
                        String str = (String) recommendedListItemViewModel.f27566d.getValue();
                        if (str == null) {
                            str = "";
                        }
                        o.f(str);
                        arrayList.add(new b(listingItemBrief, str, recommendedListItemViewModel.f27565c, recommendedListItemViewModel.f27563a));
                    }
                    zVar2.setValue(arrayList);
                    return;
                }
                RecommendedListItemViewModel.this.g().i(Boolean.FALSE);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ wz.p invoke(List<? extends ListingItemBrief> list) {
                b(list);
                return wz.p.f75480a;
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(listingDetailsViewModel, null, null, new AnonymousClass2(null), 3, null);
    }

    public final LiveData<List<b>> f() {
        return this.f27568f;
    }

    public final OneShotEventHandler<Boolean> g() {
        return this.f27569g;
    }
}
