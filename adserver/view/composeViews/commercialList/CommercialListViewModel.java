package com.forsale.adserver.view.composeViews.commercialList;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.runtime.z;
import androidx.lifecycle.q0;
import androidx.lifecycle.r0;
import com.forsale.adserver.usecases.offersInteractors.LoadAllOffersIdsInteractor;
import com.forsale.adserver.usecases.offersInteractors.LoadOffersByIdsInteractor;
import com.forsale.adserver.view.models.AdGeneralModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
/* compiled from: CommercialListViewModel.kt */
/* loaded from: classes2.dex */
public final class CommercialListViewModel extends q0 {

    /* renamed from: j  reason: collision with root package name */
    public static final b f20997j = new b(null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f20998x = 8;

    /* renamed from: a  reason: collision with root package name */
    private final LoadOffersByIdsInteractor f20999a;

    /* renamed from: b  reason: collision with root package name */
    private final LoadAllOffersIdsInteractor f21000b;

    /* renamed from: c  reason: collision with root package name */
    private final CoroutineExceptionHandler f21001c;

    /* renamed from: d  reason: collision with root package name */
    private final CoroutineContext f21002d;

    /* renamed from: e  reason: collision with root package name */
    private final List<List<Integer>> f21003e;

    /* renamed from: f  reason: collision with root package name */
    private final MutableSharedFlow<a> f21004f;

    /* renamed from: g  reason: collision with root package name */
    private final SnapshotStateList<AdGeneralModel> f21005g;

    /* renamed from: h  reason: collision with root package name */
    private int f21006h;

    /* renamed from: i  reason: collision with root package name */
    private Job f21007i;

    /* compiled from: CommercialListViewModel.kt */
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* compiled from: CommercialListViewModel.kt */
        /* renamed from: com.forsale.adserver.view.composeViews.commercialList.CommercialListViewModel$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0233a extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0233a f21008a = new C0233a();

            private C0233a() {
                super(null);
            }
        }

        /* compiled from: CommercialListViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class b extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final b f21009a = new b();

            private b() {
                super(null);
            }
        }

        /* compiled from: CommercialListViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final c f21010a = new c();

            private c() {
                super(null);
            }
        }

        /* compiled from: CommercialListViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class d extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final d f21011a = new d();

            private d() {
                super(null);
            }
        }

        /* compiled from: CommercialListViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class e extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final e f21012a = new e();

            private e() {
                super(null);
            }
        }

        /* compiled from: CommercialListViewModel.kt */
        /* loaded from: classes2.dex */
        public static final class f extends a {

            /* renamed from: a  reason: collision with root package name */
            public static final f f21013a = new f();

            private f() {
                super(null);
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CommercialListViewModel.kt */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: CoroutineExceptionHandler.kt */
    /* loaded from: classes2.dex */
    public static final class c extends kotlin.coroutines.a implements CoroutineExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ CommercialListViewModel f21014a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(CoroutineExceptionHandler.Key key, CommercialListViewModel commercialListViewModel) {
            super(key);
            this.f21014a = commercialListViewModel;
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(CoroutineContext coroutineContext, Throwable th2) {
            x10.a.c(th2);
            BuildersKt__Builders_commonKt.launch$default(r0.a(this.f21014a), null, null, new CommercialListViewModel$coroutineExceptionHandler$1$1(this.f21014a, null), 3, null);
        }
    }

    public CommercialListViewModel(LoadOffersByIdsInteractor loadOffersByIdsInteractor, LoadAllOffersIdsInteractor loadAllOffersIdsInteractor) {
        o.i(loadOffersByIdsInteractor, "loadOffersByIdsInteractor");
        o.i(loadAllOffersIdsInteractor, "loadAllOffersIdsInteractor");
        this.f20999a = loadOffersByIdsInteractor;
        this.f21000b = loadAllOffersIdsInteractor;
        c cVar = new c(CoroutineExceptionHandler.Key, this);
        this.f21001c = cVar;
        this.f21002d = Dispatchers.getIO().plus(cVar);
        this.f21003e = new ArrayList();
        this.f21004f = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
        this.f21005g = z.f();
        this.f21006h = 1;
    }

    public final List<List<Integer>> g() {
        return this.f21003e;
    }

    public final SnapshotStateList<AdGeneralModel> h() {
        return this.f21005g;
    }

    public final MutableSharedFlow<a> j() {
        return this.f21004f;
    }

    public final int k() {
        return this.f21006h;
    }

    public final void l(List<Integer> categoryIdsList) {
        o.i(categoryIdsList, "categoryIdsList");
        this.f21006h = 1;
        this.f21005g.clear();
        this.f21003e.clear();
        BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f21002d, null, new CommercialListViewModel$loadAllOffersIds$1(this, categoryIdsList, null), 2, null);
    }

    public final void m() {
        Job launch$default;
        Job job = this.f21007i;
        boolean z11 = false;
        if (job != null && job.isActive()) {
            z11 = true;
        }
        if (!z11) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(r0.a(this), this.f21002d, null, new CommercialListViewModel$loadMoreOffers$1(this, null), 2, null);
            this.f21007i = launch$default;
        }
    }

    public final void o(int i11) {
        this.f21006h = i11;
    }
}
